package Proj004;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        int opcao;

        do {
            System.out.println("\n===== MENU BIBLIOTECA =====");
            System.out.println("1 - Adicionar Livro");
            System.out.println("2 - Adicionar Revista");
            System.out.println("3 - Listar Itens");
            System.out.println("4 - Buscar Item");
            System.out.println("5 - Emprestar Item");
            System.out.println("6 - Devolver Item");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {

                case 1:
                    System.out.print("Título: ");
                    String tituloLivro = sc.nextLine();

                    System.out.print("Autor: ");
                    String autorLivro = sc.nextLine();

                    System.out.print("Ano: ");
                    int anoLivro = sc.nextInt();

                    System.out.print("Número de páginas: ");
                    int paginas = sc.nextInt();
                    sc.nextLine();

                    Livro livro = new Livro(tituloLivro, autorLivro, anoLivro, paginas);
                    biblioteca.adicionarItem(livro);
                    break;

                case 2:
                    System.out.print("Título: ");
                    String tituloRevista = sc.nextLine();

                    System.out.print("Autor: ");
                    String autorRevista = sc.nextLine();

                    System.out.print("Ano: ");
                    int anoRevista = sc.nextInt();

                    System.out.print("Edição: ");
                    int edicao = sc.nextInt();
                    sc.nextLine();

                    Revista revista = new Revista(tituloRevista, autorRevista, anoRevista, edicao);
                    biblioteca.adicionarItem(revista);
                    break;

                case 3:
                    biblioteca.listarItens();
                    break;

                case 4:
                    System.out.print("Digite o título: ");
                    String busca = sc.nextLine();

                    ItemBiblioteca item = biblioteca.buscarItem(busca);
                    if (item != null) {
                        item.exibirDetalhes();
                    } else {
                        System.out.println("Item não encontrado.");
                    }
                    break;

                case 5:
                    System.out.print("Título para empréstimo: ");
                    String emp = sc.nextLine();
                    biblioteca.realizarEmprestimo(emp);
                    break;

                case 6:
                    System.out.print("Título para devolução: ");
                    String dev = sc.nextLine();
                    biblioteca.realizarDevolucao(dev);
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}


