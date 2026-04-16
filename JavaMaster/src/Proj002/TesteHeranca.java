package Proj002;

public class TesteHeranca {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro("Rex");
        System.out.println("Testando os métodos do objeto '" + meuCachorro.nome + "':\n");
        System.out.print("Chamando método de Animal: ");
        meuCachorro.respirar();
        System.out.print("Chamando método de Mamifero: ");
        meuCachorro.mamar();
        System.out.print("Chamando método de Cachorro: ");
        meuCachorro.latir();
        System.out.println("\n--- Testando métodos da classe Object ---\n");
        System.out.println("Resultado de toString(): " + meuCachorro.toString());
        System.out.println("Imprimindo o objeto diretamente: " + meuCachorro);
        Cachorro outroCachorro = new Cachorro("Totó");
        System.out.println("\nComparando 'Rex' com 'Totó' usando equals(): " + meuCachorro.equals(outroCachorro));
    }
}
