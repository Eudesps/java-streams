package com.eudes.estudos_java_streams.models;

import com.fasterxml.jackson.annotation.JsonAlias;

public class Episodios {
    @JsonAlias("numero")
    private Integer numeroEpisodio;
    @JsonAlias("titulo")
    private String tituloEpisodio;
    @JsonAlias("duracao_minutos")
    private String duracaoMinutosEpisido;

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

    @Override
    public String toString() {
        return "Episodios{" +
                "numeroEpisodio=" + numeroEpisodio +
                ", tituloEpisodio='" + tituloEpisodio + '\'' +
                ", duracaoMinutosEpisido='" + duracaoMinutosEpisido + '\'' +
                '}';
    }
}
