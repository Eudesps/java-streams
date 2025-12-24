package com.eudes.estudos_java_streams.com.eudes.ex007;

// Você tem uma lista de objetos do tipo Produto, onde cada produto possui os
// atributos nome (String), preco (double) e categoria (String).
//
// Filtre todos os produtos da categoria "Eletrônicos" com preço menor que R$ 1000,
// ordene-os pelo preço em ordem crescente e colete o resultado em uma nova lista.

import java.util.List;
import java.util.stream.Collectors;

public class Ex007 {
    public static void main(String[] args) {
        List<Produto> produtos = List.of(
                new Produto("Notebook", 4500.00, "Eletrônicos"),
                new Produto("Mouse", 120.00, "Eletrônicos"),
                new Produto("Cadeira Gamer", 950.00, "Móveis"),
                new Produto("Livro Java", 180.00, "Educação"),
                new Produto("Cafeteira", 320.00, "Eletrodomésticos"),
                new Produto("Fone de Ouvido", 250.00, "Eletrônicos")
        );

    List<Produto> produtos1 = produtos.stream()
            .filter(p -> p.getCategoria().equals("Eletrônicos"))
            .filter(p -> p.getPreco() < 1000)
            .sorted((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco()))
            .collect(Collectors.toList());

        System.out.println(produtos1);
    }
}
