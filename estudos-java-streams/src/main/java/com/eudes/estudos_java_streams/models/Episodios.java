package com.eudes.estudos_java_streams.models;

import java.time.LocalDate;

public class Episodios {
    private Integer numeroEpisodio;
    private String tituloEpisodio;
    private String duracaoMinutosEpisido;
    private LocalDate dataLancamento;

    public Integer getNumeroEpisodio() {
        return numeroEpisodio;
    }

    public void setNumeroEpisodio(Integer numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

    public String getTituloEpisodio() {
        return tituloEpisodio;
    }

    public void setTituloEpisodio(String tituloEpisodio) {
        this.tituloEpisodio = tituloEpisodio;
    }

    public String getDuracaoMinutosEpisido() {
        return duracaoMinutosEpisido;
    }

    public void setDuracaoMinutosEpisido(String duracaoMinutosEpisido) {
        this.duracaoMinutosEpisido = duracaoMinutosEpisido;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    @Override
    public String toString() {
        return "Episodios{" +
                "numeroEpisodio=" + numeroEpisodio +
                ", tituloEpisodio='" + tituloEpisodio + '\'' +
                ", duracaoMinutosEpisido='" + duracaoMinutosEpisido + '\'' +
                ", dataLancamento=" + dataLancamento +
                '}';
    }
}
