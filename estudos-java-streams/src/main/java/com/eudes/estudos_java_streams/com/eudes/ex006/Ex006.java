package com.eudes.estudos_java_streams.com.eudes.ex006;

import java.util.Arrays;
import java.util.List;

//6 - Dado um objeto Pessoa com os campos nome e idade, filtre as pessoas com mais de 18 anos,
// extraia os nomes e imprima-os em ordem alfabética. A classe Pessoa está definida abaixo.
public class Ex006 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Maria", 12);
        Pessoa p2 = new Pessoa("Pedro", 25);
        Pessoa p3 = new Pessoa("Eudes", 19);
        Pessoa p4 = new Pessoa("José", 6);
        Pessoa p5 = new Pessoa("Samantha", 13);

        List<Pessoa> pessoas = Arrays.asList(p1,p2,p3,p4,p5);
        //System.out.println(pessoas);

        pessoas.stream()
                .filter(p -> p.getIdade() > 18)
                .map(Pessoa::getNome) //Para cada objeto Pessoa que passou no filtro, pegue apenas o resultado do método getNome
                .sorted()
                .forEach(System.out::println);
    }
}
