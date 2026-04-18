package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;


public record DadosSerie(@JsonAlias({"Title", "title"}) String titulo,
                         @JsonAlias("TotalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao,
                         @JsonProperty("imdbVotes") String votos) {


}
