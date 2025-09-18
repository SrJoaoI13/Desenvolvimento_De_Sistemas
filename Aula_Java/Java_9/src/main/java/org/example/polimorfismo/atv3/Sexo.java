package org.example.polimorfismo.atv3;

public enum Sexo {
    MASCULINO ("Masculino"),
    FEMININO ("Feminino");

    private String Smenusculo;

    Sexo(String smenusculo) {
        Smenusculo = smenusculo;
    }

    public String getSmenusculo() {
        return Smenusculo;
    }

    public void setSmenusculo(String smenusculo) {
        Smenusculo = smenusculo;
    }
}
