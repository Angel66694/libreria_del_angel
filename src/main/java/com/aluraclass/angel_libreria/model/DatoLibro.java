package com.aluraclass.angel_libreria.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatoLibro(
        @JsonAlias("title") String titulo,
        @JsonAlias("authors") String autor,
        @JsonAlias("languages") String idioma,
        @JsonAlias("download_count") Integer numeroDeDescargas
) {
    @Override
    public String toString() {
        return "DatoLibro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", idioma='" + idioma + '\'' +
                ", numeroDeDescargas=" + numeroDeDescargas +
                '}';
    }
}
