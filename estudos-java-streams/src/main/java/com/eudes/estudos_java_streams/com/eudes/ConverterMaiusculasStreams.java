package com.eudes.estudos_java_streams.com.eudes;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

//2 - Dada a lista de strings abaixo, converta todas para letras maiúsculas e imprima-as.
public class ConverterMaiusculasStreams {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "stream", "lambda");
        List<String> palavtrasMaiusculas = palavras.stream().map(m -> m.toUpperCase(Locale.ROOT)).toList();

        System.out.println(palavtrasMaiusculas);

    }
}
