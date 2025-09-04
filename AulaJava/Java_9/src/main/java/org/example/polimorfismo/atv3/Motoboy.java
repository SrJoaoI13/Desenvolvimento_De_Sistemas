package org.example.polimorfismo.atv3;

public class Motoboy extends Funcionario{
    private String CarteiraDeHabilitacao;

    public Motoboy(String carteiraDeHabilitacao) {
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
        return "Motoboy{" +
                "CarteiraDeHabilitacao='" + CarteiraDeHabilitacao + '\'' +
                ", Nome='" + Nome + '\'' +
                ", DataNascimento='" + DataNascimento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
