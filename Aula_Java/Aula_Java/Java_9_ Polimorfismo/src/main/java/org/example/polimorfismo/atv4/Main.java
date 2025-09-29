package org.example.polimorfismo.atv4;

public class Main {
    public static void main(String[] args) {
        Motoboy motoboy1 = new Motoboy("Joao","852.963.741-87","20.582.147-41",Sexo.MASCULINO,
                1000,"20/02/200","20/00/0000","S234-H67G");

        Gerente gerente = new Gerente("Joao","852.963.741-87","20.582.147-41",Sexo.MASCULINO,
                1000,"20/02/0222","82/521/222");

        Diretor diretor1 = new Diretor("Joao","852.963.741-87","20.582.147-41",Sexo.MASCULINO,
                1000,"20/02/0222","82/521/222");

        System.out.println(motoboy1.toString());
        System.out.println(gerente.toString());
        System.out.println(diretor1.toString());


        diretor1.admitir(motoboy1);
    }
}
