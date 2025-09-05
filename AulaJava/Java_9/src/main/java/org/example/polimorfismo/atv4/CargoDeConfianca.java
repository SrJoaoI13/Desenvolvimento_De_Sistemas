package org.example.polimorfismo.atv4;

public abstract class CargoDeConfianca extends Funcionario {
    protected  Bonificacao bonificacao;

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

    public CargoDeConfianca(String nome, String CPf, String dataNascimento, double salariobase, Bonificacao bonificacao) {
        super(nome, CPf, dataNascimento, salariobase);
        this.bonificacao = bonificacao;

    }

}
