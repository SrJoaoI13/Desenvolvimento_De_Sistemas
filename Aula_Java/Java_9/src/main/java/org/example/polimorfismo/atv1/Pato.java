package org.example.polimorfismo.atv1;

public class Pato implements Animal{
    @Override
    public String emitirsom() {
        return "grasnar";
    }

    @Override
    public String comer() {
        return "mato";
    }
}
