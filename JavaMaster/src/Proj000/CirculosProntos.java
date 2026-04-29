public class CirculosProntos {

    public static void main(String[] args) {
        // Valores definidos pelo sistema
        float x1 = 2, y1 = 3, r1 = 4;
        float x2 = 6, y2 = 7, r2 = 3;

        boolean resultado = circulosSobrepostos(x1, y1, r1, x2, y2, r2);

        System.out.println("Os círculos se sobrepõem? " + resultado);
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