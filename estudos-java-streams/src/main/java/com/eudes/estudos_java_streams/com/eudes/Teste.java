package com.eudes.estudos_java_streams.com.eudes;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Teste {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate hoje = LocalDate.now();

        LocalDate aniversarioEudes = LocalDate.of(2002, 8,29);
        System.out.println("Data de anversáiro: " + aniversarioEudes.format(formatter));

        Period periodo = Period.between(aniversarioEudes,hoje);
        System.out.println(periodo.getYears());
    }
}
