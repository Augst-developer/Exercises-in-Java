import java.util.Scanner;

public class CalculadoraVolume {

    // 1. Volume do Cubo (Lado^3)
    public double calcularVolume(double lado) {
        return Math.pow(lado, 3);
    }

    // 2. Volume da Esfera (4/3 * PI * R^3)
    // Usamos um identificador extra (boolean) para diferenciar da sobrecarga de 1 parâmetro
    public double calcularVolumeEsfera(double raio) {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }

    // 3. Volume do Cilindro (PI * R^2 * Altura)
    public double calcularVolume(double raio, double altura) {
        return Math.PI * Math.pow(raio, 2) * altura;
    }

    // 4. Volume do Paralelepípedo (Comprimento * Largura * Altura)
    public double calcularVolume(double c, double l, double a) {
        return c * l * a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculadoraVolume calc = new CalculadoraVolume();

        System.out.println("--- Calculadora de Volume ---");

        // Exemplo Cubo
        System.out.print("Digite o lado do cubo: ");
        double lado = scanner.nextDouble();
        System.out.printf("Volume do Cubo: %.2f\n\n", calc.calcularVolume(lado));

        // Exemplo Esfera
        System.out.print("Digite o raio da esfera: ");
        double raioEsfera = scanner.nextDouble();
        System.out.printf("Volume da Esfera: %.2f\n\n", calc.calcularVolumeEsfera(raioEsfera));

        // Exemplo Cilindro
        System.out.print("Digite o raio da base do cilindro: ");
        double raioCil = scanner.nextDouble();
        System.out.print("Digite a altura do cilindro: ");
        double altCil = scanner.nextDouble();
        System.out.printf("Volume do Cilindro: %.2f\n\n", calc.calcularVolume(raioCil, altCil));

        // Exemplo Paralelepípedo
        System.out.print("Digite o comprimento, largura e altura: ");
        double c = scanner.nextDouble();
        double l = scanner.nextDouble();
        double a = scanner.nextDouble();
        System.out.printf("Volume do Paralelepípedo: %.2f\n", calc.calcularVolume(c, l, a));

        scanner.close();
    }
}
