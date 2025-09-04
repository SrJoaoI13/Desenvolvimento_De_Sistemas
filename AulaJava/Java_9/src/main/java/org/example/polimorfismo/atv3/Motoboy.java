package org.example.polimorfismo.atv3;

public class Motoboy extends Funcionario{
    private String CarteiraDeHabilitacao;

    public Motoboy(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase, String carteiraDeHabilitacao) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
        CarteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return CarteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        CarteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public String toString() {
        return "Motoboy {" +
                "CarteiraDeHabilitacao: '" + CarteiraDeHabilitacao + '\'' +
                ", Nome: '" + Nome + '\'' +
                ", Data de Nascimento: '" + DataNascimento + '\'' +
                ", Sexo: " + sexo.getSmenusculo() +
                ", Setor: " + setor.getSetmenusculo() +
                ", Salario base:" + salarioBase +
                '}';
    }           
}
