/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04t3;

import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 28.09.2026
 */
public class Ejercicio04T3 {

    /**
     * • Ejercicio 04.- Escribir un algoritmo en JAVA que pida tres
        números e imprima por pantalla el menor de ellos.
     */
    public static void main(String[] args) {
        // Declaro las variables 
        float numeroMenor, nuevoNumero;
        Scanner input = new Scanner(System.in);
        
        //Pido al usuario que introduzca el primer numero
        numeroMenor = input.nextFloat();
        //Pido al usuario que introduza el segundo numero
        nuevoNumero = input.nextFloat();
        //compruebo si el numero es mas pequeño que el menor
        if(nuevoNumero < numeroMenor)
            numeroMenor = nuevoNumero;
        //Pido al usuario que introduzca el tercer numero
        nuevoNumero = input.nextFloat();
        //compruebo si el numero es mas pequeño que el menor
        if(nuevoNumero < numeroMenor)
            numeroMenor = nuevoNumero;
        
        //Muestro los resultados
        System.out.println("El numero mayor de los introducidos es el: "+ numeroMenor);
    }
    
}
