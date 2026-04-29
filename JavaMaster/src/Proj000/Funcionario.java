public class Funcionario {
//AULA 6 - Exercício 1


    // Atributos
    private int cracha;
    private float salario;
    private String cargo;

    // Construtor sem parâmetros
    public Funcionario() {
        this.cargo = "Assistente";
    }

    // Construtor com parâmetros
    public Funcionario(int c, float s, String car) {
        this.cracha = c;
        this.salario = s;
        this.cargo = car;
    }

    // Método que calcula aumento por porcentagem
    public void calculaAumento(float porcentagem) {
        float aumento = salario * (porcentagem / 100);
        salario += aumento;
    }

    // Método que calcula aumento por tempo (R$150 por ano)
    public void calculaAumento(int tempo) {
        float aumento = tempo * 150;
        salario += aumento;
    }

    // Método para mostrar dados
    public void mostrarDados() {
        System.out.println("Crachá: " + cracha);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Cargo: " + cargo);
        System.out.println("---------------------------");
    }

    // Classe principal para testar
    public static void main(String[] args) {

        // Usando construtor sem parâmetros
        Funcionario f1 = new Funcionario();
        f1.mostrarDados();

        // Usando construtor com parâmetros
        Funcionario f2 = new Funcionario(123, 2000, "Programador");
        f2.mostrarDados();

        // Aplicando aumento por porcentagem
        f2.calculaAumento(15f); //15 → é int | 15.0 → é double | 15f ou 15.0f → é float |
        System.out.println("Após aumento de 15%:");
        f2.mostrarDados();

        // Aplicando aumento por tempo
        f2.calculaAumento(2); // 2 anos
        System.out.println("Após aumento por tempo (2 anos):");
        f2.mostrarDados();
    }
}