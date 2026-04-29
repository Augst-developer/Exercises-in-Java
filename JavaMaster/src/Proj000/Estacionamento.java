import java.util.Scanner;

public class Estacionamento {

    // Tamanho máximo dos vetores
    static final int MAX = 100;

    // Vetores de dados
    static String[] placas = new String[MAX];
    static int[] tipos = new int[MAX];
    static int[] horaEntrada = new int[MAX];
    static boolean[] ocupados = new boolean[MAX];

    // Vetores de tarifas
    static double[] tarifa3h = new double[3];
    static double[] tarifaAdicional = new double[3];

    // Relatórios
    static int totalEntradas = 0, totalSaidas = 0;
    static int somaTempos = 0;
    static double totalArrecadado = 0;

    // Relatório por tipo
    static int[] qtdTipo = new int[3];
    static double[] somaValoresTipo = new double[3];

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao;

        do {
            exibirMenu();
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1: cadastrarTarifas(); break;
                case 2: registrarEntrada(); break;
                case 3: registrarSaida(); break;
                case 4: relatorioDiario(); break;
                case 5: relatorioPorTipo(); break;
                case 6: System.out.println("Encerrando sistema..."); break;
                default: System.out.println("Opção inválida.\n");
            }

        } while (opcao != 6);

        sc.close();
    }

    // -- MÉTODOS --

    public static void exibirMenu() {
        System.out.println("=== SISTEMA DE CONTROLE DE ESTACIONAMENTO ===");
        System.out.println("1. Cadastrar Tarifas");
        System.out.println("2. Registrar Entrada de Veículo");
        System.out.println("3. Registrar Saída de Veículo");
        System.out.println("4. Gerar Relatório diário");
        System.out.println("5. Gerar Relatório por tipo de veículo");
        System.out.println("6. Sair");
        System.out.print("Selecione uma opção: ");
    }

    public static void cadastrarTarifas() {
        System.out.println("\n--- Cadastro de Tarifas ---");

        for (int i = 0; i < 3; i++) {
            String tipo = (i == 0 ? "Carro Pequeno" : i == 1 ? "Carro Grande" : "Moto");

            System.out.println("Tarifas para " + tipo + ":");

            System.out.print("Valor das primeiras 3 horas: ");
            tarifa3h[i] = sc.nextDouble();

            System.out.print("Valor da hora adicional: ");
            tarifaAdicional[i] = sc.nextDouble();

            System.out.println();
        }
    }

    public static void registrarEntrada() {
        System.out.println("\n--- Registrar Entrada ---");

        System.out.print("Placa do veículo: ");
        String placa = sc.nextLine().trim();

        if (placa.equals("")) {
            System.out.println("Placa inválida.\n");
            return;
        }

        System.out.println("Tipo do veículo: 1=Pequeno | 2=Grande | 3=Moto");
        int tipo = sc.nextInt();

        if (tipo < 1 || tipo > 3) {
            System.out.println("Tipo inválido.\n");
            return;
        }

        System.out.print("Hora de entrada (0–23): ");
        int entrada = sc.nextInt();

        // busca vaga livre
        int pos = encontrarVaga();

        if (pos == -1) {
            System.out.println("Estacionamento cheio!\n");
            return;
        }

        placas[pos] = placa;
        tipos[pos] = tipo;
        horaEntrada[pos] = entrada;
        ocupados[pos] = true;

        totalEntradas++;
        System.out.println("Entrada registrada com sucesso!\n");
    }

    public static int encontrarVaga() {
        for (int i = 0; i < MAX; i++) {
            if (!ocupados[i]) return i;
        }
        return -1;
    }

    public static void registrarSaida() {
        System.out.println("\n--- Registrar Saída ---");

        System.out.print("Informe a placa: ");
        String placaSaida = sc.nextLine().trim();

        int indice = buscarPlaca(placaSaida);

        if (indice == -1) {
            System.out.println("Veículo não encontrado.\n");
            return;
        }

        System.out.print("Hora de saída: ");
        int saida = sc.nextInt();

        int entrada = horaEntrada[indice];

        if (saida < entrada) {
            System.out.println("Hora de saída inválida.\n");
            return;
        }

        int tempo = saida - entrada;
        int tipo = tipos[indice] - 1;

        double valorOriginal = calcularValor(tempo, tipo);

        System.out.println("Forma de pagamento: 1=Dinheiro | 2=PIX");
        int forma = sc.nextInt();

        double desconto = (forma == 2 ? valorOriginal * 0.05 : 0);
        double valorFinal = valorOriginal - desconto;

        registrarNoRelatorio(tipo, tempo, valorFinal);

        ocupados[indice] = false;

        emitirRecibo(placaSaida, tipo, tempo, valorOriginal, desconto, valorFinal);
    }

    public static int buscarPlaca(String placa) {
        for (int i = 0; i < MAX; i++) {
            if (ocupados[i] && placas[i].equalsIgnoreCase(placa)) {
                return i;
            }
        }
        return -1;
    }

    public static double calcularValor(int tempo, int tipo) {
        if (tempo <= 3) {
            return tarifa3h[tipo];
        } else {
            return tarifa3h[tipo] + (tempo - 3) * tarifaAdicional[tipo];
        }
    }

    public static void registrarNoRelatorio(int tipo, int tempo, double valorFinal) {
        somaTempos += tempo;
        totalArrecadado += valorFinal;
        qtdTipo[tipo]++;
        somaValoresTipo[tipo] += valorFinal;
        totalSaidas++;
    }

    public static void emitirRecibo(String placa, int tipo, int tempo,
                                    double valorOriginal, double desconto, double valorFinal) {

        System.out.println("\n--- Recibo ---");
        System.out.println("Placa: " + placa);
        System.out.println("Tipo: " + (tipo == 0 ? "Carro Pequeno" : tipo == 1 ? "Carro Grande" : "Moto"));
        System.out.println("Tempo permanência: " + tempo + "h");
        System.out.println("Valor original: R$ " + valorOriginal);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Valor final pago: R$ " + valorFinal + "\n");
    }

    public static void relatorioDiario() {
        System.out.println("\n--- Relatório Diário ---");
        System.out.println("Total de entradas: " + totalEntradas);
        System.out.println("Total de saídas: " + totalSaidas);

        if (totalSaidas > 0) {
            System.out.println("Tempo médio: " + (somaTempos / totalSaidas) + "h");
        } else {
            System.out.println("Tempo médio: 0h");
        }

        System.out.println("Valor arrecadado: R$ " + totalArrecadado + "\n");
    }

    public static void relatorioPorTipo() {
        System.out.println("\n--- Relatório por Tipo ---");
        System.out.println("Carros Pequenos: " + qtdTipo[0]);
        System.out.println("Carros Grandes: " + qtdTipo[1]);
        System.out.println("Motos: " + qtdTipo[2]);

        int mais = 0;
        if (qtdTipo[1] > qtdTipo[mais]) mais = 1;
        if (qtdTipo[2] > qtdTipo[mais]) mais = 2;

        System.out.println("Tipo mais frequente: " +
                (mais == 0 ? "Carro Pequeno" : mais == 1 ? "Carro Grande" : "Moto"));

        for (int i = 0; i < 3; i++) {
            double media = (qtdTipo[i] > 0 ? somaValoresTipo[i] / qtdTipo[i] : 0);
            System.out.println("Média valores " +
                    (i == 0 ? "Pequenos" : i == 1 ? "Grandes" : "Motos") +
                    ": R$ " + media);
        }

        System.out.println();
    }
}