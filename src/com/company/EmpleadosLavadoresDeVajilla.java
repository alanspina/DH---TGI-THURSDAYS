package com.company;

public class EmpleadosLavadoresDeVajilla extends Empleado {
    private Double descuentoPorRotura;

    public EmpleadosLavadoresDeVajilla(String nombre, String edad, Double sueldo, Double descuentoPorRotura) {
        super(nombre, edad, sueldo);
        this.descuentoPorRotura = descuentoPorRotura;
    }

    @Override
    public void cobrarSueldo() {
        super.cobrarSueldo();
    }

    public void romperVajilla(){
        //todo explicar como lo hace
    }
}
