package Proj004;

public class Revista extends ItemBiblioteca {
    private int edicao;

    public Revista(String titulo, String autor, int anoPublicacao, int edicao) {
        super(titulo, autor, anoPublicacao);
        this.edicao = edicao;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Edição: " + edicao);
        System.out.println("------------------------");
    }
}

