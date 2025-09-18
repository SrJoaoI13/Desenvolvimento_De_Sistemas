package org.example.polimorfismo.atv4;

public abstract class CargoDeConfianca extends Funcionario{
    protected Bonificacao bonificacao;

    public CargoDeConfianca(String nome, String CPF, String RG, Sexo sexo, double salarioBase, String dataNascimento, String dataAdmissao, Bonificacao bonificacao) {
        super(nome, CPF, RG, sexo, salarioBase, dataNascimento, dataAdmissao);
        this.bonificacao = bonificacao;
    }
}
