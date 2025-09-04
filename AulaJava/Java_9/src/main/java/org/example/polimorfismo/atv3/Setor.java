package org.example.polimorfismo.atv3;

public enum Setor {
    RECURSOS_HUMANOS ("Recurso Humanos"),
    FINANCEIRO ("Financeiro"),
    OPERACOES ("Operacoes");

    private String texto;

    Setor(String texto) {
        this.texto = texto;
    }
}
