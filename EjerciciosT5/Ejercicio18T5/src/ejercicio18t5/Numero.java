/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio18t5;

/**
 *
 * @author Alexis Sancho
 * @since 26 nov 2026
 */
public class Numero {

    private int valor;

    //Constructor por defecto
    public Numero() {
        this.valor = 0;
    }

    //Constructor parametrizado
    public Numero(int n) {
        this.valor = n;
    }

    public void sumar(Numero n2) {
        System.out.println("El resultado de la suma de " + this.getValor() + " y " + n2.getValor() + " es " + (this.getValor() + n2.getValor()));
    }

    public void multiplicar(Numero n2) {
        System.out.println("El resultado de la multiplicacion de " + this.getValor() + " y " + n2.getValor() + " es " + this.getValor() * n2.getValor());
    }

    public void restar(Numero n2) {
        System.out.println("El resultado de la resta de " + this.getValor() + " y " + n2.getValor() + " es " + (this.getValor() - n2.getValor()));
    }

    public void dividir(Numero n2) {
        System.out.println("El resultado de la division de " + this.getValor() + " y " + n2.getValor() + " es " + this.getValor() / n2.getValor());
    }

    //Setters y getters
    public int getValor() {
        return this.valor;
    }

    public void setValor(int v) {
        this.valor = v;
    }

    @Override
    public String toString() {
        return "Valor: " + valor;
    }
}
