package com.eudes.estudos_java_streams.models;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public record DadosTemporada(@JsonAlias("temporada") Integer numeroTemporada,
                             @JsonAlias("episodios") List<DadosEpisodios> episodios,
                             @JsonAlias("data_lancamento") String dataLancamento) {
}
