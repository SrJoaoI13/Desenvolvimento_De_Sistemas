package org.example.polimorfismo.atv2;

public class Main {
    public static void main(String[] args) {
         Soma soma1 = new Soma();
         Multiplicacao multiplicacao1 = new Multiplicacao();
         Subtracao subtracao = new Subtracao();
         Divisao divisao = new Divisao();

        System.out.println("Soma: " + soma1.calcular(85,8));
        System.out.println("Multiplicacao: " + multiplicacao1.calcular(4,4));
        System.out.println("Subtracao: " +subtracao.calcular(8,8));
        System.out.println("Divisao: " + divisao.calcular(0,8));

    }
}
