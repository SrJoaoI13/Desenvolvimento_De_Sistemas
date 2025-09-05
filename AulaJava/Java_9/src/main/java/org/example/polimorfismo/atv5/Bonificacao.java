package org.example.polimorfismo.atv5;

public enum Bonificacao {
    // botando o 1 na frente a cresta do valor que tem
    // botando o 0 na frente a retira do valor que tem
    GERENTE(1.3),
    DIRETOR(1.4);

    private double valor;

    Bonificacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
