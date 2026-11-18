/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01t5;

/**
 *
 * @author Alexis Sancho
 * @since 16 nov 2026
 */

/*Ejercicio 01.- Diseña una clase Coche que contenga los
    siguientes atributos privados:
    • marca (de tipo cadena)
    • modelo (de tipo cadena)
    • color (de tipo cadena)
    • velocidad (de tipo entero)
    • motorEncendido (de tipo booleano inicializado a false)
    * 
    * • Además contendrá los siguientes métodos públicos:
        • establecerMarca.
        • establecerModelo.
        • establecerColor.
        • arrancarCoche (pone motorEncendido a true y velocidad a 10)
        • apagarCoche (pone motorEncendido a false y velocidad a 0)
        • acelerarCoche (aumenta en 20 la velocidad)
        • frenarCoche (disminuye 6 la velocidad)
        • obtenerEstado (muestra el valor de los atributos)

 */
public class Coche {

    //Atributos de la clase
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;
    private boolean motorEncendido = false;

    // Getters / Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String m) {
        marca = m;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String m) {
        modelo = m;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        color = c;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int v) {
        velocidad = v;
    }

    public boolean getMotorEncendido() {
        return motorEncendido;
    }

    public void setMotorEncendido(boolean m) {
        motorEncendido = m;
    }

    public void establecerMarca(String m) {
        marca = m;
    }

    public void establecerModelo(String m) {
        modelo = m;
    }

    public void establecerColor(String c) {
        color = c;
    }

    //arrancarCoche (pone motorEncendido a true y velocidad a 10)
    public void arrancarCoche() {
        motorEncendido = true;
        velocidad = 10;
    }

    // apagarCoche (pone motorEncendido a false y velocidad a 0)
    public void apagarCoche() {
        motorEncendido = false;
        velocidad = 0;
    }

    // acelerarCoche (aumenta en 20 la velocidad)
    public void acelerarCoche() {
        velocidad += 20;
    }

    // frenarCoche (disminuye 6 la velocidad)
    public void frenarCoche() {
        velocidad -= 6;
    }

    // obtenerEstado (muestra el valor de los atributos)
    public void obtenerEstado() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("MotorEncendido: " + motorEncendido);
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Color: " + color + ", Velocidad: " + velocidad + ", MotorEncendido: " + motorEncendido;
    }
}
