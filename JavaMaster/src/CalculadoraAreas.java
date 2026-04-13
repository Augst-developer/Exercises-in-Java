import java.util.Scanner;

// Interface para definir o comportamento de cálculo de área
interface Forma {
    double calcularArea();
}

// Classe Círculo
class Circulo implements Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2); // Math.PI para π e Math.pow para potência [1, 7]
    }
}

// Classe Retângulo
class Retangulo implements Forma {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}

// Classe Triângulo
class Triangulo implements Forma {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2; // Fórmula: (base * altura) / 2 [4]
    }
}

public class CalculadoraAreas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a forma: 1-Circulo, 2-Retangulo, 3-Triangulo");
        int opcao = scanner.nextInt();

        Forma forma = null;

        switch (opcao) {
            case 1:
                System.out.print("Digite o raio: ");
                double raio = scanner.nextDouble();
                forma = new Circulo(raio);
                break;
            case 2:
                System.out.print("Digite a base: ");
                double baseR = scanner.nextDouble();
                System.out.print("Digite a altura: ");
                double alturaR = scanner.nextDouble();
                forma = new Retangulo(baseR, alturaR);
                break;
            case 3:
                System.out.print("Digite a base: ");
                double baseT = scanner.nextDouble();
                System.out.print("Digite a altura: ");
                double alturaT = scanner.nextDouble();
                forma = new Triangulo(baseT, alturaT);
                break;
            default:
                System.out.println("Opção inválida.");
        }

        if (forma != null) {
            System.out.printf("A área é: %.2f\n", forma.calcularArea());
        }

        scanner.close();
    }
}
