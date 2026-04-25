package Proj008;

public class Jogador {
    private String nome;
    private String posicao;
    private int idade;
    private int forca; // 0 a 100

    public Jogador(String nome, String posicao, int idade, int forca) {
        this.nome = nome;
        this.posicao = posicao;
        this.idade = idade;
        this.forca = forca;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public int getForca() { return forca; }
    public String getPosicao() { return posicao; }

    @Override
    public String toString() {
        return "Jogador{" + "nome='" + nome + '\'' + ", pos='" + posicao + '\'' + ", forca=" + forca + '}';
    }
}

