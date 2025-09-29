package org.example;

public class PrincipalPET {
    public static void main(String[] args) {
        PET pet1 = new PET("Carlos",28,"Canino","Medio","Onivoro");
        PET pet2 = new PET("Dela",8,"Felino","Grande","Onivoro");

        System.out.printf("Dados do pet 1: " + pet1.toString() +"\n");
        System.out.printf("Dados do pet 2: " +pet2.toString() +"\n");
    }
}
