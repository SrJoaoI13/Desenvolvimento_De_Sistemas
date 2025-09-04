package org.example.polimorfismo.atv4;

import org.example.polimorfismo.atv3.Funcionario;

public class Gerente extends CargoDeConfianca implements Contratacao{
    public Gerente(String nome, String CPf, String dataNascimento, double salariobase, Bonificacao bonificacao) {
        super(nome, CPf, dataNascimento, salariobase, bonificacao);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", CPf='" + CPf + '\'' +
                ", DataNascimento='" + DataNascimento + '\'' +
                ", Salariobase=" + Salariobase +
                '}';
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("\nAdimitindo funcionario: " + funcionario.Nome);
    }

    @Override
    public void demitir(org.example.polimorfismo.atv4.Funcionario funcionario) {
        System.out.println("\nDemitindo funcionario: " + funcionario.Nome);
    }
}
