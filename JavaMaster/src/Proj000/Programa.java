import java.util.HashMap;

public class Programa {

    public static void main(String[] args){
        int[] v = {1, 2, 3, 4, 5, 1, 2, 4, 5, 7};

        imprimirNaoDuplicados(v);
    }

    private static void imprimirNaoDuplicados(int[] v){
        HashMap<Integer, Integer> mapa = new HashMap<>();

        // Contar ocorrências
        for(int n : v){
            mapa.put(n, mapa.getOrDefault(n, 0) + 1);
        }

        // Imprimir somente os que aparecem 1 vez
        for(int n : mapa.keySet()){
            if(mapa.get(n) == 1){
                System.out.println(n);
            }
        }
    }
}
