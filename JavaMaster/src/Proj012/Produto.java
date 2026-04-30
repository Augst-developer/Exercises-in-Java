package Proj012;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // SOBRESCRITA DO MÉTODO TOSTRING
    @Override
    public String toString() {
        return "Produto {" +
                "nome='" + nome + '\'' +
                ", preco=R$" + preco +
                ", qtd=" + quantidade +
                '}';
    }

    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 3500.00, 10);

        // Quando você imprime o objeto, o Java chama o toString() automaticamente
        System.out.println(p1);
        // Saída: Produto {nome='Notebook', preco=R$3500.0, qtd=10}
    }
}