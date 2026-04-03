package Exerc2;

public class Triangulo {

    // Atributos privados
    private double base;
    private double altura;

    // Construtor padrão
    public Triangulo() {
        // base e altura iniciam com 0
    }

    // Construtor com parâmetros
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Getters
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    // Setters
    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Calcula a área do triângulo
    public double calculaArea() {
        return (base * altura) / 2;
    }

    // Imprime dados do triângulo
    public void imprimeDados() {
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calculaArea());
        System.out.println("-------------------------");
    }
}

