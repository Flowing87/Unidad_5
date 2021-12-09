/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad3;

/**
 *
 * @author andre
 */
public class Usuarios  {

    private String Nombre;
    private String Apellidos;
    private int Edad;
// Se genera constructor inicializando variables
    public Usuarios(String Nombre, String Apellidos, int Edad) {
super(); // Se accede a atributos de java class
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Edad = Edad;

    }
    
    public int compareTo(Usuarios u) {

        int devuelve = Apellidos.compareTo(u.getApellidos());
        return devuelve;

    }

    public String getNombre() {

        return Nombre;

    }

    public void setNombre(String nombre) {

        this.Nombre = nombre;

    }

    public String getApellidos() {

        return Apellidos;

    }

    public void setApellidos(String apellidos) {

        this.Apellidos = apellidos;

    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    
    
    
}
