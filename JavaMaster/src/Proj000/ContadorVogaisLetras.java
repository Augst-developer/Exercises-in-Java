import java.util.Scanner;

public class ContadorVogaisLetras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase ou palavra: ");
        String texto = scanner.nextLine();

        int totalLetras = 0;
        int totalVogais = 0;

        // Converte para minúsculo para facilitar a verificação
        String textoMinusculo = texto.toLowerCase();

        for (int i = 0; i < textoMinusculo.length(); i++) {
            char c = textoMinusculo.charAt(i);

            // Verifica se é uma letra (ignora números e símbolos)
            if (c >= 'a' && c <= 'z') {
                totalLetras++;

                // Verifica se a letra é uma vogal
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    totalVogais++;
                }
            }
        }

        System.out.println("---------------------------------");
        System.out.println("Texto original: " + texto);
        System.out.println("Total de letras: " + totalLetras);
        System.out.println("Total de vogais: " + totalVogais);
        System.out.println("---------------------------------");

        scanner.close();
    }
}
