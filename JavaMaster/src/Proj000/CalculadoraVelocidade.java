import java.util.Scanner;

public class CalculadoraVelocidade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Calculadora de Velocidade Média ---");


        System.out.print("Digite a distância total percorrida (km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite o tempo total gasto (horas): ");
        double tempo = scanner.nextDouble();

        // Verifica se o tempo é válido para evitar divisão por zero
        if (tempo > 0) {
            // Fórmula da Velocidade Média: Vm = Δs / Δt
            double velocidadeMedia = distancia / tempo;

            // Exibe o resultado formatado
            System.out.printf("A velocidade média foi: %.2f km/h%n", velocidadeMedia);
        } else {
            System.out.println("O tempo deve ser maior que zero.");
        }

        scanner.close();
    }
}