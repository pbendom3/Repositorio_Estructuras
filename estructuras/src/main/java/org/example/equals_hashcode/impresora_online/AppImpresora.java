package org.example.equals_hashcode.impresora_online;

import java.util.LinkedHashSet;
import java.util.Set;

public class AppImpresora {

    private static final String ID_PC = "PC1234";
    static LinkedHashSet<Peticion> colaPeticiones = new LinkedHashSet<>();

    public static void main(String[] args) {

        anyadirDocumento("prueba.pdf");
        anyadirDocumento("prueba.txt");
        anyadirDocumento("expediente.pdf");
        anyadirDocumento("notas.pdf");
        anyadirDocumento("expediente.pdf");
        imprimirDocumento();
        System.out.println(colaPeticiones);
        System.out.println("Quedan " + getNumPeticiones() + " peticiones en la cola.");
        verTodo();
        imprimirTodo();

    }

    public static void anyadirDocumento(String nombre_archivo){

        if (nombre_archivo.endsWith(".pdf")){
            if(colaPeticiones.add(new Peticion(ID_PC,nombre_archivo))){
                System.out.println("Archivo " + nombre_archivo +  " añadido a la cola de impresión");
            }else{
                System.out.println("El archivo " + nombre_archivo + " ya existe en la cola de impresión");
            }
        }else{
            System.out.println("El archivo " +  nombre_archivo +  " no tiene el formato correcto.");
        }

    }

    public static void imprimirDocumento(){

        System.out.println("Imprimiendo... " + colaPeticiones.getFirst().getNombre_archivo());
        colaPeticiones.removeFirst();

    }

    public static int getNumPeticiones(){
        return colaPeticiones.size();
    }

    public static void verTodo(){

        System.out.println("Cola impresión: " + colaPeticiones);

    }

    public static void imprimirTodo(){

        while(!colaPeticiones.isEmpty()){
            imprimirDocumento();
        }

        System.out.println("La cola ha finalizado.");

    }
}
