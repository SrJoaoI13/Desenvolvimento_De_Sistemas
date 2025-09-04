package org.example.polimorfismo.atv3;

public enum Setor {
    RECURSOS_HUMANOS ("Recurso Humanos"),
    FINANCEIRO ("Financeiro"),
    OPERACOES ("Operacoes");

    private String Setmenusculo;

    Setor(String setmenusculo) {
        Setmenusculo = setmenusculo;
    }

    public String getSetmenusculo() {
        return Setmenusculo;
    }

    public void setSetmenusculo(String setmenusculo) {
        Setmenusculo = setmenusculo;
    }
}
