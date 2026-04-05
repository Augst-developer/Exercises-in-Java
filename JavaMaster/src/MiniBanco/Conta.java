package MiniBanco;

// Classe que representa uma conta bancária
public class Conta {

    // Atributos básicos de uma conta
    private String dono;
    private double saldo;

    // Construtor da classe (inicializa uma conta)
    public Conta(String dono, double saldoInicial) {
        this.dono = dono;
        this.saldo = saldoInicial;
    }

    // Método para depositar dinheiro
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado. Novo saldo: " + saldo);
        } else {
            System.out.println("Valor inválido!");
        }
    }

    // Método para sacar dinheiro
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado. Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    // Método para transferir para outra conta
    public void transferir(Conta destino, double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            destino.depositar(valor); // reaproveitando método
            System.out.println("Transferência realizada com sucesso.");
        } else {
            System.out.println("Não foi possível transferir.");
        }
    }

    // Método para exibir informações da conta
    public void exibirDados() {
        System.out.println("Dono: " + dono);
        System.out.println("Saldo: " + saldo);
    }
}

