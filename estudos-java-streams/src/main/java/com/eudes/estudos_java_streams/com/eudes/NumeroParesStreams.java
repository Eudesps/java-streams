package com.eudes.estudos_java_streams.com.eudes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//1 - Dada a lista de números inteiros abaixo, filtre apenas os números pares e imprima-os.
public class NumeroParesStreams {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> novosNumeros = numeros.stream().filter(p -> p%2 == 0).toList();

        System.out.println(novosNumeros);
    }
}
