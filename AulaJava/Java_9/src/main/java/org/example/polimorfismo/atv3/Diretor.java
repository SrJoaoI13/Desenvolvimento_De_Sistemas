package org.example.polimorfismo.atv3;

public class Diretor  extends  Funcionario implements Contratacao{
    private static final double PREMIO = 0.2;

    @Override
    public String toString() {
        return "Diretor{" +
                "Nome='" + Nome + '\'' +
                ", DataNascimento='" + DataNascimento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", salarioBase=" + salarioBase +
                '}';
    }

    @Override
    public void admitir(Funcionario funcionario) {

    }

    @Override
    public void demitir(Funcionario funcionario) {

    }
}
