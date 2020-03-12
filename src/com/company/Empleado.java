package com.company;

import javax.lang.model.element.NestingKind;

public abstract class Empleado {
    private String Nombre;
    private String Edad;
    private Double Sueldo;

    public Empleado(String nombre, String edad, Double sueldo) {
        Nombre = nombre;
        Edad = edad;
        Sueldo = sueldo;
    }

    public void cobrarSueldo(){
        //todo escribir como
    }

}
