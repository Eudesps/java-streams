package com.eudes.estudos_java_streams.com.eudes;

import java.util.Arrays;
import java.util.List;

//4 - Dada a lista de strings abaixo, remova as duplicatas (palavras que aparecem mais de uma vez)
// e imprima o resultado.
public class Ex004 {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("apple", "banana", "apple", "orange", "banana");

        List<String> palavrasUnicas = palavras.stream()
                .distinct()
                .toList();

        System.out.println(palavrasUnicas);
    }
}
