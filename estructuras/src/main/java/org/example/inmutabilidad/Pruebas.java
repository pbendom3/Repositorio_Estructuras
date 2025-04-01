package org.example.inmutabilidad;

public class Pruebas {

    public static void main(String[] args) {


        Arbitro arbitro_comprao = new Arbitro();
        arbitro_comprao.getLista().add("Pito Regalao");
        System.out.println(arbitro_comprao);


    }


}
