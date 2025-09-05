package org.example.polimorfismo.atv4;

public enum Bonificacao {
    // botando 0 desconta
    // botando 1 adiciona
    GERENTE(1.2),
    DIRETOR(1.4);

    private double valor;

    Bonificacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
