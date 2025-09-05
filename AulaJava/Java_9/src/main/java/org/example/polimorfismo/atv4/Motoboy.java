package org.example.polimorfismo.atv4;

public  class Motoboy extends Funcionario{
    private String placaDaMoto;

    public Motoboy(String nome, String CPf, String dataNascimento, double salariobase, String placaDaMoto) {
        super(nome, CPf, dataNascimento, salariobase);
        this.placaDaMoto = placaDaMoto;
    }

    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }

    @Override
    public String toString() {
        return "Motoboy {" +
                "placa Da Moto: '" + placaDaMoto + '\'' +
                ", Nome: '" + nome + '\'' +
                ", CPF: '" + CPf + '\'' +
                ", Data de Nascimento: '" + DataNascimento + '\'' +
                ", Salario base: " + Salariobase +
                ", Salario Final: " + this.obterSalarioFinal() +
                '}';
    }

    @Override
    public double obterSalarioFinal() {
        return super.Salariobase;
    }
}
