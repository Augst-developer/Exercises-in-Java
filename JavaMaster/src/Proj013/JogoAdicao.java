package Proj013;

import java.util.Scanner;
import java.util.Random;

public class JogoAdicao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int totalPerguntas = 10; // Define quantas perguntas o jogo terá
        int acertos = 0;
        int maxNumero = 10; // Define o valor máximo dos números (0-10)

        System.out.println("--- Jogo de Adição ---");
        System.out.println("Responda " + totalPerguntas + " perguntas.");

        for (int i = 1; i <= totalPerguntas; i++) {
            // Gera dois números aleatórios
            int num1 = random.nextInt(maxNumero + 1);
            int num2 = random.nextInt(maxNumero + 1);
            int respostaCorreta = num1 + num2;

            System.out.print("\nPergunta " + i + ": Quanto é " + num1 + " + " + num2 + "? ");

            // Lê a resposta do usuário
            int respostaUsuario = scanner.nextInt();

            // Verifica a resposta
            if (respostaUsuario == respostaCorreta) {
                System.out.println("Correto! Parabéns.");
                acertos++;
            } else {
                System.out.println("Errado. A resposta era " + respostaCorreta + ".");
            }
        }

        System.out.println("\n--- Fim do Jogo ---");
        System.out.println("Você acertou " + acertos + " de " + totalPerguntas + " perguntas.");

        scanner.close();
    }
}
