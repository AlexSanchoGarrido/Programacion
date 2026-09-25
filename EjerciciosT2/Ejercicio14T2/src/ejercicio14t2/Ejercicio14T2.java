/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14t2;

/**
 *
 * @author Alexis Sancho Garrido
 * @since 18.09.2026
 */
public class Ejercicio14T2 {

    /**
     * Ejercicio 14.- Realiza un programa que calcule el área de
        una circunferencia de radio 5,2 centímetros. Para ello
        utiliza la constante PI.

        • Muestra por pantalla el resultado de igual forma que el
        ejercicio anterior.
     */
    final static float PI = 3.14f;
    
    public static void main(String[] args) {
        //Declaro e inicializo las variables
        float radio = 5.2f;
        float area;
        //Calculo el area
        area = PI * radio * radio;
        //Muestro por pantalla el resultado 
        System.out.println("El area de una circunferencia cuyo radio vale "+radio+" seria igual a: "+area+" centimetros.");
    }
    
}
