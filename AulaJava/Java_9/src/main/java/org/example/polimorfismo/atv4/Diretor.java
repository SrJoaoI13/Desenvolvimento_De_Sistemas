package org.example.polimorfismo.atv4;

public class Diretor extends CargoDeConfianca implements Contratacao{
    private final double PREMIO = 1.1;

    public Diretor(String nome, String CPF, String RG, Sexo sexo, double salarioBase, String dataNascimento, String dataAdmissao) {
        super(nome, CPF, RG, sexo, salarioBase, dataNascimento, dataAdmissao, Bonificacao.GERENTE);
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


    public double obterSalarioFinal(Funcionario funcionario) {

        double salarioBase = funcionario.getSalarioBase();

        double SalarioBonificacao = salarioBase * Bonificacao.DIRETOR.getValor();

        double BonificacaoPREMIO = SalarioBonificacao * PREMIO;

        double juncao = SalarioBonificacao + BonificacaoPREMIO;

        double salarioFinal = juncao - salarioBase;
        return salarioFinal;
    }

    @Override
    public String toString() {
        return "Diretor {" +
                "PREMIO: " + PREMIO +
                ", bonificacao: " + bonificacao +
                super.toString() +
                ", Salario Final: "+ obterSalarioFinal +
        '}';
    }
}
