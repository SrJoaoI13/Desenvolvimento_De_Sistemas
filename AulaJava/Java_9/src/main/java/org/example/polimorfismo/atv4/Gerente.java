package org.example.polimorfismo.atv4;

public class Gerente extends CargoDeConfianca{

    public Gerente(String nome, String CPF, String RG, Sexo sexo, double salarioBase, String dataNascimento, String dataAdmissao) {
        super(nome, CPF, RG, sexo, salarioBase, dataNascimento, dataAdmissao, Bonificacao.GERENTE);
    }
    @Override
    public String toString() {
        return "Gerente{" +
                "bonificacao=" + bonificacao +
                super.toString()+
                '}';
    }

    @Override
    public double obterSalarioFinal(Funcionario funcionario) {
        return super.SalarioBase*Bonificacao.GERENTE.getValor();
    }
}
