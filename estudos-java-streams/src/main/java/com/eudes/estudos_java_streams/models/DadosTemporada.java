package com.eudes.estudos_java_streams.models;

import java.time.LocalDate;
import java.util.List;

public record DadosTemporada(Integer numeroTemporada, List<Episodios> episodios, LocalDate dataLancamento) {
}
