import java.util.Scanner;

public class CirculosUsuario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x1: ");
        float x1 = sc.nextFloat();

        System.out.print("y1: ");
        float y1 = sc.nextFloat();

        System.out.print("raio 1: ");
        float r1 = sc.nextFloat();

        System.out.print("x2: ");
        float x2 = sc.nextFloat();

        System.out.print("y2: ");
        float y2 = sc.nextFloat();

        System.out.print("raio 2: ");
        float r2 = sc.nextFloat();

        boolean resultado = circulosSobrepostos(x1, y1, r1, x2, y2, r2);

        System.out.println("Os círculos se sobrepõem? " + resultado);

        sc.close();
    }

    public static boolean circulosSobrepostos(float x1, float y1, float r1,
                                              float x2, float y2, float r2) {

        // Diferença entre as coordenadas
        float dx = x2 - x1;
        float dy = y2 - y1;

        // Distância entre os centros com Pitágoras
        float distancia = (float) Math.sqrt(dx * dx + dy * dy);

        // Retorna se a soma dos raios cobre a distância
        return (r1 + r2) >= distancia;
    }
}
