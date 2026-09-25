/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26t2;

import java.util.Scanner;

/**
 *
 * @author Alexis Sancho Garrido
 * @since 25.09.206
 */
public class Ejercicio26T2 {

    /**
     * • Ejercicio 26.- Desarrolla un programa en el que le pidas al usuario
        un número de 4 cifras y muestre por pantalla cada una de las cifras
        que lo forman.
        • Muestra por pantalla el resultado de la siguiente forma:
        Por favor, introduzca un número de 4 cifras: XYZW

        La primera cifra es: X
        La segunda cifra es: Y
        La tercera cifra es: Z
        La cuarta cifra es: W
     */
    public static void main(String[] args) {
        // Declaro las variables
        int numero;
        Scanner input = new Scanner(System.in);
        
        //Solicito que introduzca el numero
        System.out.print("Por favor, introduzca un numero de 4 cifras: ");
        numero = input.nextInt();
        
        //Muestro los resultados:
        System.out.println("La primera cifra es: "+numero/1000);
        numero = numero %1000;
        System.out.println("La segunda cifra es: "+numero/100);
        numero = numero %100;
        System.out.println("La tercera tercera es: "+numero/10);
        numero = numero %10;
        System.out.println("La cuarta cifra es: "+numero);
    }
    
}
