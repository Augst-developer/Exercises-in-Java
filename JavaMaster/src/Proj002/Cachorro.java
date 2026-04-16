package Proj002;

public class Cachorro extends Mamifero {
    public Cachorro(String nome) {
        super(nome);
    }
    public void latir() {
        System.out.println(this.nome + " está latindo: Au! Au! Au!");
    }
    @Override
    public String toString() {
        return "Cachorro[nome=" + this.nome + "]";
    }
}
