package MiniBanco;

// Classe principal com o método main para testar o sistema
public class BancoMain {
    public static void main(String[] args) {

        // Criando duas contas usando o construtor
        Conta conta1 = new Conta("Bob", 200);
        Conta conta2 = new Conta("Maria", 500);

        // Mostrando dados
        conta1.exibirDados();
        conta2.exibirDados();

        // Operações
        conta1.depositar(100);     // Bob deposita 100
        conta1.sacar(50);          // Bob saca 50
        conta1.transferir(conta2, 80); // Bob transfere 80 para Maria

        // Exibindo resultado final
        System.out.println("\nApós operações:");
        conta1.exibirDados();
        conta2.exibirDados();
    }
}
