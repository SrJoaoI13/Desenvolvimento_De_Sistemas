package org.example;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("=== Cardeneta ===");
        System.out.println("");

        System.out.println("Digite o nome do Aluno: ");
        String aluno = ler.nextLine();

        System.out.println("Inform a nota do primeira unidade: ");
        double nota1 = ler.nextDouble();

        System.out.println("Inform a nota do segunda unidade: ");
        double nota2 = ler.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media < 7.0){
            System.out.println("");
            System.out.println("=== Resultado ===");
            System.out.println("Aluno: " +aluno);
            System.out.println("Status: Reprovado");
            System.out.println("Media: " +media);
        }else{
            System.out.println("");
            System.out.println("=== Resultado ===");
            System.out.println("Aluno: " +aluno);
            System.out.println("Status: Aprovado");
            System.out.println("Media: " +media);
        }
    }
}
