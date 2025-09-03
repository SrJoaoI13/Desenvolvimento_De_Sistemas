package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Morta", 285);
        Cliente cliente2 = new Cliente("Dela", 885);

        System.out.printf(cliente1.toString() +"\n");
        System.out.printf(cliente2.toString() +"\n");

    }
}