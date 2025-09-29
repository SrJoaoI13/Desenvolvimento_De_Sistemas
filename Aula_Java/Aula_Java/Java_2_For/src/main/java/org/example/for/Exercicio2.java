package org.example;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        final int CONST = 2;
        double media = 0;
        Scanner ler = new Scanner(System.in);
        double[] notas = new double[CONST];


            for (int i = 0; i < CONST; i++) {
                do{
                System.out.println("Digite a " + (i + 1) + " Nota: ");
                notas[i] = ler.nextDouble();
                media = notas[i] + notas[i] / CONST;
            }while (notas[i] < 0 || notas[i] > 10);
            }



        System.out.println("\nExibindo as notas");
        for (double nota : notas){
            System.out.println("Nota: " +nota);
        }



        System.out.println("Media: " +media);

    }
}
