package Proj004;

public class Biblioteca {
    private final int CAPACIDADE_MAXIMA = 10;
    private ItemBiblioteca[] acervo;
    private int totalItens;

    public Biblioteca() {
        acervo = new ItemBiblioteca[CAPACIDADE_MAXIMA];
        totalItens = 0;
    }

    public void adicionarItem(ItemBiblioteca item) {
        if (totalItens < CAPACIDADE_MAXIMA) {
            acervo[totalItens] = item;
            totalItens++;
            System.out.println("Item adicionado com sucesso.");
        } else {
            System.out.println("Biblioteca cheia.");
        }
    }

    public void listarItens() {
        for (int i = 0; i < totalItens; i++) {
            acervo[i].exibirDetalhes();
        }
    }

    public ItemBiblioteca buscarItem(String titulo) {
        for (int i = 0; i < totalItens; i++) {
            if (acervo[i].getTitulo().equalsIgnoreCase(titulo)) {
                return acervo[i];
            }
        }
        return null;
    }

    public void realizarEmprestimo(String titulo) {
        ItemBiblioteca item = buscarItem(titulo);
        if (item != null) {
            item.emprestar();
        } else {
            System.out.println("Item não encontrado.");
        }
    }

    public void realizarDevolucao(String titulo) {
        ItemBiblioteca item = buscarItem(titulo);
        if (item != null) {
            item.devolver();
        } else {
            System.out.println("Item não encontrado.");
        }
    }
}

