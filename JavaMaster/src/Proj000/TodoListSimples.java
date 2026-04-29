import java.util.ArrayList;
import java.util.Scanner;

public class TodoListSimples {

    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        System.out.println("--- Simples To-Do List ---");

        // Loop principal para manter o programa rodando
        while (opcao != 0) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Remover Tarefa");
            System.out.println("0. Sair");
            System.out.print("Opção: ");

            // Tratamento básico de erro para leitura de inteiro
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha
            } else {
                System.out.println("Opção inválida! Digite um número.");
                scanner.nextLine();
                continue;
            }

            // Estrutura de decisão para as ações
            switch (opcao) {
                case 1:
                    System.out.print("Digite a tarefa: ");
                    String novaTarefa = scanner.nextLine();
                    tarefas.add(novaTarefa);
                    System.out.println("Tarefa adicionada!");
                    break;
                case 2:
                    System.out.println("\n--- Lista de Tarefas ---");
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa cadastrada.");
                    } else {
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println((i + 1) + ". " + tarefas.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.print("Digite o número da tarefa a remover: ");
                    int indice = scanner.nextInt() - 1;
                    if (indice >= 0 && indice < tarefas.size()) {
                        tarefas.remove(indice);
                        System.out.println("Tarefa removida!");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }
}
