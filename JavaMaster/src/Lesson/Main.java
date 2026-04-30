package Lesson;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("José Augusto", "111.111.111-11");
        Cliente cliente2 = new Cliente("Maria Silva", "222.222.222-22");
        Cliente cliente3 = new Cliente("Carlos Souza", "333.333.333-33");

        Conta conta = new Conta(1001, 12345, cliente1);
        ContaCorrente contaCorrente = new ContaCorrente(1002, 23456, cliente2, 500.00);
        ContaPoupanca contaPoupanca = new ContaPoupanca(1003, 34567, cliente3);

        System.out.println("=== Informações iniciais ===");
        System.out.println(conta);
        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);

        System.out.println("\n=== Depósitos ===");

        if (conta.depositar(300)) {
            System.out.println("Depósito realizado com sucesso");
        } else {
            System.out.println("Depósito não realizado");
        }

        if (contaCorrente.depositar(1000)) {
            System.out.println("Depósito realizado com sucesso");
        } else {
            System.out.println("Depósito não realizado");
        }

        if (contaPoupanca.depositar(700)) {
            System.out.println("Depósito realizado com sucesso");
        } else {
            System.out.println("Depósito não realizado");
        }

        if (conta.depositar(-50)) {
            System.out.println("Depósito realizado com sucesso");
        } else {
            System.out.println("Depósito não realizado");
        }

        System.out.println("\n=== Informações após depósitos ===");
        System.out.println(conta);
        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);

        System.out.println("\n=== Saques válidos ===");

        if (contaCorrente.sacar(200)) {
            System.out.println("Saque da conta corrente realizado com sucesso");
        } else {
            System.out.println("Saque da conta corrente não realizado");
        }

        if (contaPoupanca.sacar(300)) {
            System.out.println("Saque da conta poupança realizado com sucesso");
        } else {
            System.out.println("Saque da conta poupança não realizado");
        }

        System.out.println("\n=== Informações após saques ===");
        System.out.println(conta);
        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);

        System.out.println("\n=== Saques acima do limite ===");

        if (contaCorrente.sacar(2000)) {
            System.out.println("Saque da conta corrente realizado com sucesso");
        } else {
            System.out.println("Saque da conta corrente não realizado");
        }

        if (contaPoupanca.sacar(1000)) {
            System.out.println("Saque da conta poupança realizado com sucesso");
        } else {
            System.out.println("Saque da conta poupança não realizado");
        }

        System.out.println("\n=== Informações finais ===");
        System.out.println(conta);
        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);
    }
}
