package Proj009;

public class LojaOnline {
    public static void main(String[] args) {
        // Criando produtos
        Produto p1 = new Produto("Notebook", 3500.00);
        Produto p2 = new Produto("Mouse", 50.00);
        Produto p3 = new Produto("Teclado", 150.00);

        // Criando carrinho e adicionando itens
        Carrinho meuCarrinho = new Carrinho();
        meuCarrinho.adicionarProduto(p1);
        meuCarrinho.adicionarProduto(p2);
        meuCarrinho.adicionarProduto(p3);

        // Exibindo resultado
        System.out.println();
        meuCarrinho.exibirItens();
    }
}

