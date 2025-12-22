package com.eudes.estudos_java_streams.com.eudes;

import java.time.LocalDate;
import java.time.Period;

public class Teste {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();

        LocalDate aniversarioEudes = LocalDate.of(2002, 8,29);

        Period periodo = Period.between(aniversarioEudes,hoje);
        System.out.println(periodo.getYears());
    }
}
