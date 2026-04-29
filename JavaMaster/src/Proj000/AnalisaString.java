public class AnalisaString {
    public static void main(String[] args){

        String[] entrada = new String[] { "hello, world", "java", "12345", "atividade", "..." };
        int n = 6;
        String[] resultado = filtrarStrings(entrada, n);
        for (var str : resultado) {
            System.out.println(str);
        }
    }


    public static String[] filtrarStrings(String[] entrada, int n){
        //retornar um novo array contendo apenas as strings que possuem pelo menos N caracteres.

        int cont = 0;
        for(int i = 0; i < entrada.length; i++){
            if(entrada[i].length() >= n){
                cont++;
            }
        }
        String[] resultado = new String[cont];
        int j = 0;

        for(int i = 0; i < entrada.length; i++){
            if(entrada[i].length() >= n){
                resultado[j] = entrada[i];
                j++;
            }
        }
        return resultado;
    }

}