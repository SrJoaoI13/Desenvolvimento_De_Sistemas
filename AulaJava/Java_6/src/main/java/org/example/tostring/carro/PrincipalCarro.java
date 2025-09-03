
package org.example;

public class PrincipalCarro {

    public static void main(String[] args) {
        Carro carro1 = new  Carro("UTMI-0528","Vermelho escarlate",8,8000,110,10);
        ClienteCarro Cl1 = new ClienteCarro("Jose",521,"582.369.471-45","Rua das Putas Safadas, 66","71985452536");

        System.out.printf("Carro: " +carro1.toString() +"\n");

        System.out.printf("Cliente: " +Cl1.toString());
    }
}
