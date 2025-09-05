package org.example.polimorfismo.atv4;

public class Gerente extends CargoDeConfianca implements Contratacao{
    public Gerente(String nome, String CPf, String dataNascimento, double salariobase) {
        // no proprio super vc ja chama a bonificacao para gerente sem bota na instaciacao
        super(nome, CPf, dataNascimento, salariobase, Bonificacao.GERENTE);
    }

    @Override
    public String toString() {
        return "Gerente {" +
                "bonificacao: " + bonificacao +
                ", nome: '" + nome + '\'' +
                ", CPf: '" + CPf + '\'' +
                ", DataNascimento: '" + DataNascimento + '\'' +
                ", Salariobase: " + Salariobase +
                ", SalarioFinal: " + obterSalarioFinal() +
                '}';
    }

    @Override
    public double obterSalarioFinal() {
        return super.Salariobase * Bonificacao.GERENTE.getValor();
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("\nAdimitindo funcionario: " + funcionario.getNome());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("\nDemitindo funcionario: " + funcionario.getNome());
    }



}

