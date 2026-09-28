/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio05t3;
import java.util.Scanner;
/**
 *
 * @author Alexis Sancho
 * @since 28.09.2026
 */
public class Ejercicio05T3 {

    /**
     * • Ejercicio 05.- Implementa un algoritmo en JAVA que le pida
        al usuario un número por teclado. Posteriormente, el
        programa le dirá al usuario si el número introducido es par
        o impar.
     */
    public static void main(String[] args) {
        // Declaro las variables
        float numero;
        Scanner input = new Scanner(System.in);
        
        //Solicito el numero por entrada estandar
        System.out.print("Introduzca un numero:");
        numero = input.nextFloat();
        
        //Compruebo si es par
        if (numero %2 == 0) 
            //Caso en el que es par
            System.out.println("El numero es par.");
        else
            //Caso en el que es impar
            System.out.println("El numero es impar.");
    }

}
