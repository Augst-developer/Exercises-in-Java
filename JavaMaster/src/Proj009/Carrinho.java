package Proj009;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> itens;

    public Carrinho() {
        this.itens = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        itens.add(produto);
        System.out.println(produto.getNome() + " adicionado ao carrinho.");
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto p : itens) {
            total += p.getPreco();
        }
        return total;
    }

    public void exibirItens() {
        System.out.println("--- Itens no Carrinho ---");
        for (Produto p : itens) {
            System.out.println(p);
        }
        System.out.println("Total: R$ " + calcularTotal());
    }
}