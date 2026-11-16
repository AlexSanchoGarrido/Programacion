/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaclases;

/**
 *
 * @author Alexis Sancho
 * @since 16 nov 2026
 */
public class Propietario {

    //Declaro los atributos
    private String nombre;
    private int edad;

    //Getters / setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int n) {
        edad = n;
    }

    //Otros métodos
    
    //Mostrar / toString
    public void mostrarPropietario() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
    
    @Override
    public String toString(){
        return "Nombre: "+nombre+", Edad: "+edad;
    }
}
