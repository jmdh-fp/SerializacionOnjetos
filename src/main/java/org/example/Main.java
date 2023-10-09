package org.example;

import org.example.model.Empleado;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crea lista de empleados
        List<Empleado> listaEmpleados = new  ArrayList<>();
        listaEmpleados.add(new Empleado("Pepe","Fernandez","78656t",23));
        listaEmpleados.add(new Empleado("María","Ortíz","7865r",19));
        listaEmpleados.add(new Empleado("Juan","Sánchez","345-7",43));

        File fichero = new File("empleados.srz");

        // Escritura/serialización de objetos
        try ( ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fichero)) ){

            for(Empleado emp : listaEmpleados){
                objectOutputStream.writeObject(emp);
            }
            System.out.println("Se han escrito los objetos empleado en fichero " + fichero.getAbsolutePath());
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra o no se puede crear el fichero para serializar");
            System.exit(-1);
        } catch (IOException e) {
            System.out.println("Error durante la la operación de escritura");
            System.exit(-1);
        }

        // Lectura
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fichero))){
            Empleado obj;
            System.out.println("Leyendo objetos serializados del fichero");
            while ( (obj = (Empleado) objectInputStream.readObject()) != null){
                System.out.println(obj.toString());
            }
        } catch (EOFException e){
            System.out.println("He llegado al final del fichero");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);

        }

    }
}