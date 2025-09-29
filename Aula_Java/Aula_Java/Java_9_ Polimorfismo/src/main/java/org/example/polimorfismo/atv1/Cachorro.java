package org.example.polimorfismo.atv1;

public class Cachorro implements  Animal{

    @Override
    public String emitirsom() {
        return "Auau";
    }

    @Override
    public String comer() {
        return "racao";
    }
}
