package Proj010;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner para ler a entrada do teclado
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da tabuada desejada: ");
        int numero = scanner.nextInt();

        // Criando uma instância da classe CalculadorTabuada
        CalculadorTabuada calc = new CalculadorTabuada();

        // Chamando o método para imprimir a tabuada
        calc.imprimirTabuada(numero);

        // Fechando o scanner
        scanner.close();
    }
}
