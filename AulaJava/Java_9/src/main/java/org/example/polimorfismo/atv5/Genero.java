package org.example.polimorfismo.atv5;

public enum Genero {
    FEMININO("Feminino"),
    MASCULINO("Mascullino");

    private String descricao;

    Genero(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
