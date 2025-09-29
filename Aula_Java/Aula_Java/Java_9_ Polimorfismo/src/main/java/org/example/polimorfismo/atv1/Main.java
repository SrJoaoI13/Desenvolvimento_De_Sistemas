package org.example.polimorfismo.atv1;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        Gato gato1 = new Gato();
        Galo galo1 = new Galo();
        Pato pato1 = new Pato();

        System.out.println("Som do cachoro: " + cachorro1.emitirsom()+ " Come: "  + cachorro1.comer());
        System.out.println("Som do gato: " + gato1.emitirsom() + " Come: " + gato1.comer());
        System.out.println("Som do galo: " + galo1.emitirsom() + " Come: " + galo1.comer());
        System.out.println("Som do pato: " + pato1.emitirsom() + " Come: " + pato1.comer());
    }
}
