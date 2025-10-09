package com.example.Atv_Casa.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
public enum UnidadeFederativa {
    BAHIA("Bahia","BA"),
    SAO_PAULO("São Paulo","SP"),
    RIO_DE_JANEIRO("Rio De Janeiro","RJ"),;

    private String nome;

    private String Sigla;

}
