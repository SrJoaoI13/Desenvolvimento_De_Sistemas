package org.example.polimorfismo.atv3;

public class Diretor  extends  Funcionario implements Contratacao{
    private  final double PREMIO = 0.2;

    public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Adimitindo funcionario: " + funcionario.Nome);
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitindo funcionario: " + funcionario.Nome);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    /* @Override
     public double getSalarioFinal() {
         return (salarioBase*PREMIO);
     }*/

    @Override
    public double getSalarioFinal() {
        return super.salarioBase + (super.salarioBase * this.PREMIO);
    }

    @Override
    public String toString() {
        return "\nDiretor {" +
                "Nome: '" + Nome + '\'' +
                ", Data de Nascimento: '" + DataNascimento + '\'' +
                ", sexo: " + sexo.getSmenusculo() +
                ", setor: " + setor.getSetmenusculo() +
                ", salario Base: " + salarioBase +
                "\nPrêmio: " + (PREMIO * 100) + "%" +
                "\nSalário Final: " + getSalarioFinal() +
                '}';
    }

}




