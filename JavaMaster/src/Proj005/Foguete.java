package Proj005;

class Foguete {
    private String nome;
    private int velocidade;
    private int combustivel;

    // Construtor: usado para criar o objeto
    public Foguete(String nome, int combustivelInicial) {
        this.nome = nome;
        this.velocidade = 0; // Inicia parado
        this.combustivel = combustivelInicial;
    }

    // Método para lançar o foguete
    public void lancar() {
        if (this.combustivel > 50) {
            System.out.println("🚀 Foguete " + nome + " lançado! Partindo para o espaço.");
            this.combustivel -= 50;
            this.velocidade = 1000;
        } else {
            System.out.println("❌ Foguete " + nome + " não tem combustível suficiente para lançar.");
        }
    }

    // Método para aumentar a velocidade
    public void acelerar() {
        if (this.velocidade > 0) {
            this.velocidade += 500;
            this.combustivel -= 10;
            System.out.println("💨 Foguete " + nome + " acelerando. Velocidade atual: " + velocidade + " km/h.");
        } else {
            System.out.println("⚠️ O foguete " + nome + " precisa ser lançado primeiro.");
        }
    }

    // Método para mostrar o status do foguete
    public void status() {
        System.out.println("--- Status do " + nome + " ---");
        System.out.println("Velocidade: " + velocidade + " km/h");
        System.out.println("Combustível: " + combustivel + "%");
    }
}
