package Proj007;

// Superclasse
class Forma {
    public void desenhar() {
        System.out.println("Desenhando uma forma genérica.");
    }
}

// Subclasse 1
class Circulo extends Forma {
    @Override
    public void desenhar() {
        System.out.println("Desenhando um Círculo.");
    }
}

// Subclasse 2
class Quadrado extends Forma {
    @Override
    public void desenhar() {
        System.out.println("Desenhando um Quadrado.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Polimorfismo: tipo da referência é Forma, tipo do objeto é diferente
        Forma minhaForma1 = new Circulo();
        Forma minhaForma2 = new Quadrado();

        // O mesmo método age de formas diferentes
        minhaForma1.desenhar(); // Saída: Desenhando um Círculo.
        minhaForma2.desenhar(); // Saída: Desenhando um Quadrado.
    }
}

