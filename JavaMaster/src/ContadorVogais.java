public class ContadorVogais {

    public static void main(String[] args) {
        String texto = "Programacao Java";
        int quantidade = contarVogais(texto);

        System.out.println("Quantidade de vogais: " + quantidade);
    }

    public static int contarVogais(String texto) {
        int contador = 0;

        // Percorre cada caractere da string
        for (int i = 0; i < texto.length(); i++) {
            char c = Character.toLowerCase(texto.charAt(i)); //explicação no final do código


            // Verifica se é uma das vogais sem acento
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }

        return contador; // retorna total encontrado
    }
}

/*
    entendendo está linha: 	char c = Character.toLowerCase(texto.charAt(i));

    texto.charAt(i)
    Pega o caractere que está na posição i da string.

    Exemplo: se texto = "Java"
    texto.charAt(0) → 'J'
    texto.charAt(1) → 'a'


    Character.toLowerCase(...)
    Converte o caractere passado para minúsculo.

    Isso é útil porque podemos ter 'A' ou 'a', 'E' ou 'e', etc.
*/