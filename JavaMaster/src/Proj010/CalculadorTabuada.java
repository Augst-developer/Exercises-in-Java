package Proj010;

public class CalculadorTabuada {

    // Método que recebe o número e imprime a tabuada até 20
    public void imprimirTabuada(int numero) {
        System.out.println("--- Tabuada do " + numero + " (até 20) ---");
        for (int i = 1; i <= 20; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        System.out.println("--------------------------------");
    }
}

