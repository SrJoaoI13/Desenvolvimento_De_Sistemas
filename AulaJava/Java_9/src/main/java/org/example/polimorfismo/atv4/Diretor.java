package org.example.polimorfismo.atv4;

public class Diretor extends CargoDeConfianca implements Contratacao{
    private final double PREMIO = 0.1;

    public Diretor(String nome, String CPF, String RG, Sexo sexo, double salarioBase, String dataNascimento, String dataAdmissao, Bonificacao bonificacao) {
        super(nome, CPF, RG, sexo, salarioBase, dataNascimento, dataAdmissao, bonificacao);
    }

    @Override
    public void demitir(Funcionario funcionario) {

    }

    @Override
    public void admitir(Funcionario funcionario) {

    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public String toString() {
        return "Diretor {" +
                "PREMIO: " + PREMIO +
                ", bonificacao: " + bonificacao +
                super.toString() +
                '}';
    }

    @Override
    public double obterSalarioFinal(Funcionario funcionario) {
        return super.(SalarioBase*PREMIO);
    }
}
