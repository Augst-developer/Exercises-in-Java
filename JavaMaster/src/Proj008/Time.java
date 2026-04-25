package Proj008;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nomeTime;
    private String tecnico;
    private List<Jogador> elenco;

    public Time(String nomeTime, String tecnico) {
        this.nomeTime = nomeTime;
        this.tecnico = tecnico;
        this.elenco = new ArrayList<>();
    }

    public void adicionarJogador(Jogador jogador) {
        if (elenco.size() < 25) { // Limite de elenco
            elenco.add(jogador);
        } else {
            System.out.println("Elenco cheio!");
        }
    }

    public String getNomeTime() { return nomeTime; }

    // Calcula força média do time com base nos titulares (ex: top 11)
    public double calcularForcaTime() {
        return elenco.stream()
                .mapToInt(Jogador::getForca)
                .average()
                .orElse(0.0);
    }

    public void listarElenco() {
        System.out.println("Elenco do " + nomeTime + " (Téc: " + tecnico + "):");
        elenco.forEach(System.out::println);
    }
}

