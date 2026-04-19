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
