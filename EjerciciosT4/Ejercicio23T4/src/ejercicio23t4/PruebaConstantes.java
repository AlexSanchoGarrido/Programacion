/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejercicio23t4;

/**
 *
 * @author Alexis Sancho
 * @since 30 oct 2026
 */
    /*
    • Ejercicio 23.- Crea una clase llamada Constantes que
        contenga, únicamente, la declaración de 3 constantes
        estáticas (public final static double):
        • VELOCIDADLUZ
        • CONSTANTEUNIVERSALGRAVITACION
        • CONSTANTEPLANCK
        • Dentro del mismo paquete, crea otra clase llamada
        PruebaConstantes que en su método main imprima por
        pantalla el valor de las 3 constantes declaradas.
    */

public class PruebaConstantes {
    public static void main(String[] args){
        System.out.println("Valor de la velocidad de la luz:");
        System.out.println(Constantes.VELOCIDADLUZ+" m/s");
        System.out.println("Valor de la constante universal de gravitacion:");
        System.out.println(Constantes.CONSTANTEUNIVERSALGRAVITACION+" m^3/kg*s^2");
        System.out.println("Valor de la constante de Plank:");
        System.out.println(Constantes.CONSTANTEPLANCK+" J*s");
    }
}
