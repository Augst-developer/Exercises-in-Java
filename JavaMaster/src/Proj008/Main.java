package Proj008;

public class Main {
    public static void main(String[] args) {
        // Criando Jogadores
        Jogador j1 = new Jogador("Alisson", "Goleiro", 30, 88);
        Jogador j2 = new Jogador("Neymar", "Atacante", 31, 92);
        Jogador j3 = new Jogador("Casemiro", "Volante", 31, 89);

        Jogador j4 = new Jogador("Messi", "Atacante", 36, 94);
        Jogador j5 = new Jogador("Di Maria", "Meia", 35, 87);

        // Criando Times
        Time timeA = new Time("Brasil", "Anceloti");
        timeA.adicionarJogador(j1);
        timeA.adicionarJogador(j2);
        timeA.adicionarJogador(j3);

        Time timeB = new Time("Argentina", "Scaloni");
        timeB.adicionarJogador(j4);
        timeB.adicionarJogador(j5);

        // Simulando Partida
        Partida finalJogo = new Partida(timeA, timeB);
        finalJogo.simularJogo();
        finalJogo.exibirResultado();
    }
}

