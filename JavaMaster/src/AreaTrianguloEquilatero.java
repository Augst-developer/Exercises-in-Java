import java.util.Scanner;
import java.util.Locale;

// Calcular a área de um triângulo equilátero (onde todos os lados são iguais).

public class AreaTrianguloEquilatero {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do lado do triângulo equilátero: ");
        double lado = scanner.nextDouble();

        // Parte sem a raiz: L² / 4
        double coeficiente = Math.pow(lado, 2) / 4;

        System.out.println("Como deseja o resultado?");
        System.out.println("1 - Forma com raiz (ex: 9√3)");
        System.out.println("2 - Resultado completo (valor numérico)");
        System.out.print("Escolha: ");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            // Forma simbólica
            System.out.printf("A área do triângulo equilátero é: %.2f√3%n", coeficiente);
        } else if (opcao == 2) {
            // Forma numérica completa
            double area = coeficiente * Math.sqrt(3);
            System.out.printf("A área do triângulo equilátero com lado %.2f é: %.4f%n", lado, area);
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}