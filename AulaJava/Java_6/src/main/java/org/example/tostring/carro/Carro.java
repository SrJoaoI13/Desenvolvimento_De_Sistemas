package org.example;

public class Carro {
    private String Placa;
    private String Cor;
    private int NumerodePassageiros;
    private double Capacidadedotanque;
    private double Velocidademaxima;
    private double Cosumomedio;

    public Carro(String placa, String cor, int numerodePassageiros, double capacidadedotanque, double velocidademaxima, double cosumomedio) {
        Placa = placa;
        Cor = cor;
        NumerodePassageiros = numerodePassageiros;
        Capacidadedotanque = capacidadedotanque;
        Velocidademaxima = velocidademaxima;
        Cosumomedio = cosumomedio;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        Cor = cor;
    }

    public int getNumerodePassageiros() {
        return NumerodePassageiros;
    }

    public void setNumerodePassageiros(int numerodePassageiros) {
        NumerodePassageiros = numerodePassageiros;
    }

    public double getCapacidadedotanque() {
        return Capacidadedotanque;
    }

    public void setCapacidadedotanque(double capacidadedotanque) {
        Capacidadedotanque = capacidadedotanque;
    }

    public double getVelocidademaxima() {
        return Velocidademaxima;
    }

    public void setVelocidademaxima(double velocidademaxima) {
        Velocidademaxima = velocidademaxima;
    }

    public double getCosumomedio() {
        return Cosumomedio;
    }

    public void setCosumomedio(double cosumomedio) {
        Cosumomedio = cosumomedio;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "Placa= '" + Placa + '\'' +
                ", Cor= '" + Cor + '\'' +
                ", Numero de Passageiros= " + NumerodePassageiros +
                ", Capacidade do tanque= " + Capacidadedotanque +" Litros"+
                ", Velocidademaxima= " + Velocidademaxima +" KM" +
                ", Cosumo medio= " + Cosumomedio +" Litros" +
                '}';
    }
}
