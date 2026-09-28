/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01t3;

import java.util.Scanner;

/**
 *
 * @author Alexis Sancho Garrido
 * @since 28.09.2026
 */
public class Ejercicio01T3 {

    /**
     * • Ejercicio 01.- Implementa un algoritmo en JAVA que le pida al usuario un número por teclado. 
     *  Posteriormente el programa le dirá al usuario
        si el número introducido es positivo o negativo.
        • Muestra por pantalla el resultado de la siguiente forma:
        Por favor, introduzca un numero: xxx
        El número introducido es positivo o negativo
     */
    public static void main(String[] args) {
        // Declaro las variables
        float numero;
        Scanner input = new Scanner(System.in);
        
        //Solicitud de introducir un numero
        System.out.print("Introduzca un numero: ");
        numero = input.nextFloat();
        
        //Comprobaciones de signo y muestra por pantalla
        if(numero > 0)
            System.out.println("El numero introducido es positivo");
        else if(numero < 0)
            System.out.println("El numero introducido es negativo");
        else
            System.out.println("El numero es 0");
    }
    
}
