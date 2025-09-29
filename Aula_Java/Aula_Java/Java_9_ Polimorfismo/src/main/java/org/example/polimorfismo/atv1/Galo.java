package org.example.polimorfismo.atv1;

public class Galo implements Animal{
    @Override
    public String emitirsom() {
        return "cocoricar";
    }

    @Override
    public String comer() {
        return "milho";
    }
}
