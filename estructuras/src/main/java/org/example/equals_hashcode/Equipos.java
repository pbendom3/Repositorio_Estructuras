package org.example.equals_hashcode;

import java.util.Objects;

public class Equipos {

    private String nombre_equipo;
    private int numero;

    public Equipos(String nombre_equipo,int numero){
        this.nombre_equipo=nombre_equipo;
        this.numero=numero;
    }

    @Override
    public String toString() {
        return "Equipos{" +
                "nombre_equipo='" + nombre_equipo + '\'' +
                ", numero=" + numero +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Equipos equipos = (Equipos) o;
//        //  equipo.equals(equipo4);
//        return Objects.equals(nombre_equipo, equipos.nombre_equipo);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(nombre_equipo);
//    }
}
