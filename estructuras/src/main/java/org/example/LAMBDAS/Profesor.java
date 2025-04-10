package org.example.LAMBDAS;

import lombok.Getter;

@Getter
public class Profesor {

    private String nombre;

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", asignatura='" + asignatura + '\'' +
                ", edad=" + edad +
                '}';
    }

    private String asignatura;
    private int edad;

    public Profesor(String nombre, String asignatura, int edad){
        this.nombre=nombre;
        this.asignatura=asignatura;
        this.edad=edad;
    }


}
