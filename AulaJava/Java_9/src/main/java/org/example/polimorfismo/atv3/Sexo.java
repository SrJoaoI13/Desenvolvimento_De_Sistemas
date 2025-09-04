package org.example.polimorfismo.atv3;

public enum Sexo {
    MASCULINO ("Masculino", "M"),
    FEMININO ("Feminino", "F");

    private String texto;
    private String caracter;

    Sexo(String texto, String caracter) {
        this.texto = texto;
        this.caracter = caracter;
    }
}
