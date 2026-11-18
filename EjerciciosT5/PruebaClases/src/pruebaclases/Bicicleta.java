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
public class Bicicleta {

    //Atributos de la clase
    private String marca;
    private String color;
    private String talla;
    private int anios;
    private Propietario propietario;

    //Getters/Setters
    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public String getTalla() {
        return talla;
    }

    public int getAnios() {
        return anios;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario p) {
        propietario = p;
    }

    //Otros metodos
    public void mostrarAntiguedad() {
        if (anios > 10) {
            System.out.println("La bicicleta es antigua.");
        } else {
            System.out.println("La bicicleta es nueva.");
        }
    }

    public void mostrarBicicleta() {
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("Talla: " + talla);
        System.out.println("Anios: " + anios);
        System.out.println("Datos del propietario: ");
        propietario.mostrarPropietario();
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ", Color: " + color + ", Talla: " + talla + ", Anios: " + anios + ", Propietario: " + propietario.toString();
    }
}
