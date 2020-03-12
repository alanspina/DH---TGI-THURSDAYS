package com.company;

public class EmpleadoGeneral extends Empleado {

    public EmpleadoGeneral(String nombre, String edad, Double sueldo) {
        super(nombre, edad, sueldo);
    }

    @Override
    public void cobrarSueldo() {
        super.cobrarSueldo();
    }
}
