package com.eudes.estudos_java_streams.com.eudes;

import java.util.Arrays;
import java.util.List;

//3 - Dada a lista de números inteiros abaixo, filtre os números ímpares,
// multiplique cada um por 2 e colete os resultados em uma nova lista.
public class Ex003 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> numerosApos = numeros.stream()
                .filter(n -> n%2 != 0)
                .map(m -> m*2)
                .toList();

        System.out.println(numerosApos);
    }
}
