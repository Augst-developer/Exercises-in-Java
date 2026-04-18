package Proj004;

public class Livro extends ItemBiblioteca {
    private int numeroPaginas;

    public Livro(String titulo, String autor, int anoPublicacao, int numeroPaginas) {
        super(titulo, autor, anoPublicacao);
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Número de páginas: " + numeroPaginas);
        System.out.println("------------------------");
    }
}

