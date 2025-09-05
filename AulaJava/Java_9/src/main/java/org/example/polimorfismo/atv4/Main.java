package org.example.polimorfismo.atv4;

public class Main {
    public static void main(String[] args) {
        Motoboy motoboy1 = new Motoboy("pedro","258.147.369-52","20/20/2000",4181,"");
        Gerente gerente1 = new Gerente("Joao","471.258.963-15","20/20/2000",4818);

        System.out.println(motoboy1.toString());
        System.out.println(gerente1.toString());

        gerente1.admitir(motoboy1);
    }
}
