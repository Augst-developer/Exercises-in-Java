package Proj004;

public class ItemBiblioteca {
    protected String titulo;
    protected String autor;
    protected int anoPublicacao;
    protected boolean disponivel;

    public ItemBiblioteca(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + anoPublicacao);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Item emprestado com sucesso.");
        } else {
            System.out.println("Item já está emprestado.");
        }
    }

    public void devolver() {
        disponivel = true;
        System.out.println("Item devolvido com sucesso.");
    }

    public String getTitulo() {
        return titulo;
    }
}

