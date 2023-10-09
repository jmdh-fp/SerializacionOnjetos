package org.example.model;

import java.io.Serializable;

public class Empleado implements Serializable {
    private static final long serialVersionUID  = 1L;
    private String nombre;
    private String apellido;
    private String nomina;
    private int edad;
    private transient String domicilio;  // Este atributo no se serializará
                                         // Cuando se lea se le asignará su valor por defecto (null en este caso)

    public Empleado(String nombre, String apellido, String nomina, int edad, String domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nomina = nomina;
        this.edad = edad;
        this.domicilio = domicilio;
    }



    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
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
                "serialID=" + serialVersionUID +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nomina='" + nomina + '\'' +
                ", edad=" + edad +
                '}';
    }
}
