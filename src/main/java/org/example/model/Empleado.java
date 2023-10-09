package org.example.model;

import java.io.Serializable;

public class Empleado implements Serializable {
    long serialID = 1L;
    private String nombre;
    private String apellido;
    private String nomina;
    private int edad;

    public Empleado(String nombre, String apellido, String nomina, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nomina = nomina;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNomina() {
        return nomina;
    }

    public void setNomina(String nomina) {
        this.nomina = nomina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "serialID=" + serialID +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nomina='" + nomina + '\'' +
                ", edad=" + edad +
                '}';
    }
}
