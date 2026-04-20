package Proj005;

public class GerenciadorFoguetes {
    public static void main(String[] args) {
        // Criando (instanciando) objetos Foguete
        Foguete foguete1 = new Foguete("Falcon Heavy", 100);
        Foguete foguete2 = new Foguete("Saturn V", 30);

        // Usando os objetos
        foguete1.lancar();
        foguete1.acelerar();
        foguete1.status();

        System.out.println(); // Linha em branco

        foguete2.lancar(); // Deve falhar por falta de combustível
        foguete2.status();
    }
}
