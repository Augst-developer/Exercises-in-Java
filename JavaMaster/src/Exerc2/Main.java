package Exerc2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------------------------------------------------------
        // 1º Objeto → usando construtor com parâmetros
        // ---------------------------------------------------------
        Triangulo t1 = new Triangulo(10, 5);
        System.out.println("Triângulo 1 (com parâmetros):");
        t1.imprimeDados();

        // ---------------------------------------------------------
        // 2º Objeto → usando construtor padrão + entrada do usuário
        // ---------------------------------------------------------
        Triangulo t2 = new Triangulo();

        System.out.print("Digite a base do triângulo 2: ");
        double base = sc.nextDouble();

        System.out.print("Digite a altura do triângulo 2: ");
        double altura = sc.nextDouble();

        t2.setBase(base);
        t2.setAltura(altura);

        System.out.println("\nTriângulo 2 (valores inseridos pelo usuário):");
        t2.imprimeDados();

        sc.close();
    }
}

