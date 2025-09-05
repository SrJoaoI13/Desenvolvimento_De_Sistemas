package org.example.polimorfismo.atv4;

public class Motoboy extends  Funcionario{
    private String PlacaDaMoto;

    public Motoboy(String nome, String CPF, String RG, Sexo sexo, double salarioBase, String dataNascimento, String dataAdmissao, String placaDaMoto) {
        super(nome, CPF, RG, sexo, salarioBase, dataNascimento, dataAdmissao);
        PlacaDaMoto = placaDaMoto;
    }

    public String getPlacaDaMoto() {
        return PlacaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        PlacaDaMoto = placaDaMoto;
    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "PlacaDaMoto='" + PlacaDaMoto + '\'' +
                super.toString() +
        '}';
    }
}
