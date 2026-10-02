/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio11t3;

/**
 *
 * @author Alexis Sancho
 * @since 02.10.2026
 */
public class Ejercicio11T3 {

    /**
     * • Ejercicio 11.- Crea un programa en JAVA que, utilizando
        bucles, muestre por pantalla el mensaje "Hola" seis veces
        acompañado por un numero que se incrementa cada vez.
        • Muestra por pantalla el resultado de la siguiente forma:
        - Hola1 – Hola2 – Hola3 – Hola4 – Hola5 – Hola6 -
     */
    public static void main(String[] args) {
        // Declaro las variables
        int i;
        //Itero seis veces y muestro Hola + el valor de i
        for(i=1; i<7; i++)
            System.out.print(" - Hola "+i);
        //Para el ultimo guion
        System.out.println(" -");
    }

}
