package org.example.polimorfismo.atv3;

public class Diretor  extends  Funcionario implements Contratacao{
    private static final double PREMIO = 0.2;

    public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
    }
    
    public double getSalarioFinal() {

        return salarioBase + (salarioBase * PREMIO);
    }

    @Override
    public void admitir(Funcionario funcionario) {

    }

    @Override
    public void demitir(Funcionario funcionario) {

    }

    @Override
    public String toString() {
        return "\nDiretor {" +
                "Nome: '" + Nome + '\'' +
                ", Data de Nascimento: '" + DataNascimento + '\'' +
                ", sexo: " + sexo +
                ", setor: " + setor +
                ", salario Base: " + salarioBase +
                "\nPrêmio: " + (PREMIO * 100) + "%" +
                "\nSalário Final: " + getSalarioFinal() +
                '}';
    }

}




