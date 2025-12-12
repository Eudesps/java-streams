package com.eudes.estudos_java_streams.models;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DadosEpisodios(
        @JsonAlias("numero")
        Integer numeroEpisodio,
        @JsonAlias("titulo")
        String tituloEpisodio,
        @JsonAlias("duracao_minutos")
        String duracaoMinutosEpisido,
        @JsonAlias("data_lancamento_ep")
        String dataLancamento) {
}
