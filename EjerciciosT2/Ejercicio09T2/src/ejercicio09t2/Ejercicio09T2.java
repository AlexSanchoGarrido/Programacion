/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09t2;

/**
 *
 * @author Alexis Sancho Garrido
 * @since 18.09.2026
 */
public class Ejercicio09T2 {

    /**
            * Ejercicio 09.- Realiza un programa que calcule la
       longitud de una circunferencia de radio 3,55 metros. Para
       ello utiliza la constante PI.

       • Muestra por pantalla el resultado de la siguiente forma:
       La longitud de una circunferencia cuyo radio vale 3 sería
       igual a: xxx metros.
     */
    //Declaracion de la constante PI
    final static float PI = 3.14f;
    
    public static void main(String[] args) {
        //Declaro las variables
        float radio = 3.55f;
        float longitud;
        //Calculo la longitud
        longitud = 2*PI*radio;
        //Muestro por pantalla el resultado
        System.out.println("La longitud de una circunferencia cuyo radio vale "+radio+" seria igual a: "+longitud+" metros.");
    }
    
}
