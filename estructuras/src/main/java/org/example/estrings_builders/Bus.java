package org.example.estrings_builders;

import java.util.Random;

public class Bus {

    public static final int TAM = 97;

    public static void main(String[] args) throws InterruptedException {

        int a = 0; // POSICIÓN INICIAL DEL AUTOBÚS
        int b = 0;
        Random aleatorio = new Random();

        System.out.println("\n<<<<<<<<<< CARRERA DE AUTOBUSES >>>>>>>>>>");
        System.out.println("       MARC MARQUEZ vs PECCO BAGNAIA");
        System.out.println("                 Fight!!!");
        Thread.sleep(3000);

        while (a < TAM && b < TAM) {

            int turno = aleatorio.nextInt(2)+1;

            if (turno==1){
                a++; // avanzamos
            }else{
                b++;
            }

            limpiarPantalla();

            if (a<TAM && b<TAM) {
                System.out.println(dibujarCarrera(a,b));
                Thread.sleep(70);
            }

        }

        if (a>=TAM){
            System.out.println("\033[32m"+ "HA GANADO MARCCCCC!!" + "\033[0m");
        }else{
            System.out.println("\033[32m"+ "HA GANADO PECCOOO!!" + "\033[0m");
        }

    }

    public static String dibujarCarrera(int n1, int n2) {

        StringBuilder sb = new StringBuilder();

        sb.append("-".repeat(117)).append("\n");
        sb.append(" ".repeat(n1)).append("_______________  ").append(" ".repeat(100 - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|  MARC MARQUEZ   |)").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append("-".repeat(117)).append("\n");
        sb.append(" ".repeat(n2)).append("_______________  ").append(" ".repeat(100 - n2)).append("|\n");
        sb.append(" ".repeat(n2)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n2)).append("|\n");
        sb.append(" ".repeat(n2)).append("|   PECCO BAGNAIA |)").append(" ".repeat(TAM - n2)).append("|\n");
        sb.append(" ".repeat(n2)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n2)).append("|\n");
        sb.append("_".repeat(117));

        return sb.toString();
    }

    public static void limpiarPantalla() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }

}