package org.example.polimorfismo.atv4;

public enum Sexo {
    FEMININO("Feminino"),
    MASCULINO("Mascullino");

    private String descricao;

    Sexo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
