package org.example.polimorfismo.atv2;

public class Multiplicacao implements  OperacaoMatematica{
    @Override
    public double calcular(double a, double b) {
        return a*b;
    }
}
