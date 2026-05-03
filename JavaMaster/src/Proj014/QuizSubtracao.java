package Proj014;

import java.util.Scanner;
import java.util.Random;

public class QuizSubtracao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int acertos = 0;

        int totalPerguntas = 10; // Define quantas perguntas o quiz terá

        System.out.println("--- JOGO DE SUBTRAÇÃO ---");

        for (int i = 1; i <= totalPerguntas; i++) {
            // Gera dois números aleatórios entre 0 e 20
            int num1 = random.nextInt(21);
            int num2 = random.nextInt(21);

            // Garante que o primeiro número é maior para evitar resultados negativos
            // se preferir, pode remover essas 3 linhas
            if (num1 < num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }

            int respostaCorreta = num1 - num2;

            System.out.print("Pergunta " + i + ": " + num1 + " - " + num2 + " = ? ");
            int respostaUsuario = scanner.nextInt();

            if (respostaUsuario == respostaCorreta) {
                System.out.println("Correto! ✅");
                acertos++;
            } else {
                System.out.println("Errado! ❌ A resposta era: " + respostaCorreta);
            }
            System.out.println("-------------------------");
        }

        // Exibe o resultado final
        System.out.println("Jogo encerrado.");
        System.out.println("Você acertou " + acertos + " de " + totalPerguntas + " perguntas.");

        scanner.close();
    }
}
