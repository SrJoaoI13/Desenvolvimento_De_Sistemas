package org.example.polimorfismo.atv3;

public class Main {
    public static void main(String[] args) {
        Motoboy motoboy1 = new Motoboy("Paulo","20/05/1985", Sexo.MASCULINO, Setor.FINANCEIRO,8421,"A");
        Diretor diretor1 = new Diretor("Miranda","15/05/1987",Sexo.FEMININO,Setor.FINANCEIRO,854721);

        System.out.println(motoboy1.toString());
    }
}
