package Proj008;

import java.util.Random;

public class Partida {
    private Time timeCasa;
    private Time timeVisitante;
    private int golsCasa;
    private int golsVisitante;

    public Partida(Time timeCasa, Time timeVisitante) {
        this.timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;
    }

    public void simularJogo() {
        Random rand = new Random();
        double forcaCasa = timeCasa.calcularForcaTime();
        double forcaVisitante = timeVisitante.calcularForcaTime();

        // Lógica simples: força do time + fator sorte
        this.golsCasa = (int) ((forcaCasa / 20) + rand.nextInt(4));
        this.golsVisitante = (int) ((forcaVisitante / 20) + rand.nextInt(3));

        // Vantagem campo
        this.golsCasa += rand.nextInt(2);
    }

    public void exibirResultado() {
        System.out.println("\n--- Resultado Final ---");
        System.out.println(timeCasa.getNomeTime() + " " + golsCasa + " x " + golsVisitante + " " + timeVisitante.getNomeTime());
        if (golsCasa > golsVisitante) System.out.println("Vencedor: " + timeCasa.getNomeTime());
        else if (golsVisitante > golsCasa) System.out.println("Vencedor: " + timeVisitante.getNomeTime());
        else System.out.println("Empate!");
    }
}

