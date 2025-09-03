package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa(1,"Morta","7198645217",
                "mortamorta852@gmail.com",Sexo.MASCULINO,
                new Endereco("Rua da camelias","85"
                        ,"T","45621-852","Salvador",UF.BAHIA));

        System.out.println(pessoa1.toString());
    }
}