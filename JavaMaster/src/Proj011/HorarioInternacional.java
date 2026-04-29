package Proj011;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class HorarioInternacional {
    public static void main(String[] args) {
        // Mapa de locais e seus respectivos IDs de Fuso Horário
        Map<String, String> fusoHorarios = new HashMap<>();
        fusoHorarios.put("Brasil (Brasília)", "America/Sao_Paulo");
        fusoHorarios.put("Portugal (Lisboa)", "Europe/Lisbon");
        fusoHorarios.put("Reino Unido (Londres)", "Europe/London");
        fusoHorarios.put("EUA (Nova York)", "America/New_York");
        fusoHorarios.put("Japão (Tóquio)", "Asia/Tokyo");
        fusoHorarios.put("Austrália (Sydney)", "Australia/Sydney");

        // Formato da hora
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("--- Horário Atual em Diferentes Países ---");

        // Itera sobre o mapa e mostra o horário
        fusoHorarios.forEach((local, zoneId) -> {
            LocalTime horaLocal = LocalTime.now(ZoneId.of(zoneId));
            System.out.printf("%-20s: %s%n", local, horaLocal.format(formatador));
        });
    }
}

