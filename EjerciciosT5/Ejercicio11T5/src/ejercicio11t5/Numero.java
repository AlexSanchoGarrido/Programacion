/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejercicio11t5;

/**
 *
 * @author Alexis Sancho
 * @since 26 nov 2026
 */
public class Numero {
    private float valor;
    
    public Numero(){
        this.valor = 0;
    }
    
    public Numero(float n){
        this.valor = n;
    }
    
    public void sumar(Numero n2) {
        System.out.println("El resultado de la suma de " + this.getValor() + " y " + n2.getValor() + " es " + (this.getValor() + n2.getValor()));
    }

    public void multiplicar(Numero n2) {
        System.out.println("El resultado de la multiplicacion de " + this.getValor() + " y " + n2.getValor() + " es " + this.getValor() * n2.getValor());
    }
    
    public float getValor(){
        return this.valor;
    }
    
    public void setValor(float v){
        this.valor = v;
    }
    
    @Override
    public String toString(){
        return "Valor: "+valor;
    }
}
