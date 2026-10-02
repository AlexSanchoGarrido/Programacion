/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio13t3;

/**
 *
 * @author Alexis Sancho
 * @since 02.10.2026
 */
public class Ejercicio13T3 {

    /**
     * • Ejercicio 13.- Crea un algoritmo en JAVA que, utilizando un
        bucle while, imprima los números pares que existen entre el
        número 11 y el número 133.
     */
    public static void main(String[] args) {
        // Declaro las variables
        int i = 11;
        //El bucle comienza en el numero 11 y termina en el 133
        while(i<134){
            //Compruebo que es par
            if(i%2 == 0)
                System.out.println(i);
            //incremento el iterador
            i++;
        }
    }

}
