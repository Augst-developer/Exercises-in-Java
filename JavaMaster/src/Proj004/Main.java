package Proj004;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Java Básico", "João Silva", 2020, 300);
        Revista revista1 = new Revista("Tech Hoje", "Maria Souza", 2023, 15);

        biblioteca.adicionarItem(livro1);
        biblioteca.adicionarItem(revista1);

        System.out.println("\n--- LISTA ---");
        biblioteca.listarItens();

        System.out.println("\n--- EMPRÉSTIMO ---");
        biblioteca.realizarEmprestimo("Java Básico");

        System.out.println("\n--- LISTA ---");
        biblioteca.listarItens();

        System.out.println("\n--- DEVOLUÇÃO ---");
        biblioteca.realizarDevolucao("Java Básico");

        System.out.println("\n--- LISTA ---");
        biblioteca.listarItens();
    }
}

