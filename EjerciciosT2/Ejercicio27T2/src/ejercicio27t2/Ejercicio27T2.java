/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27t2;
import java.util.Scanner;

/**
 *
 * @author Alexis Sancho Garrido
 * @since 25.09.2026
 */
public class Ejercicio27T2 {

    /**
     * • Ejercicio 27.- Escribe un programa en JAVA para calcular
        el cuadrado y el cubo de un número entero introducido
        por teclado y que muestre los resultados.
        • Muestra por pantalla el resultado de la siguiente forma:

        Por favor, introduzca un número: XXX

        El doble de XXX es: XXXXXX

        El cubo de XXX es: XXXXXXXX
     */
    public static void main(String[] args) {
        //Declaro las variables
        int numeroEntero;
        Scanner input = new Scanner(System.in);
        //Pido que introduzca el numero
        System.out.print("Por favor, introduzca un numero entero: ");
        numeroEntero = input.nextInt();
        //Muestro por pantalla el resultado
        System.out.println("El doble de "+numeroEntero+" es: "+numeroEntero*2);
        System.out.println("El cubo de "+numeroEntero+" es: "+numeroEntero*numeroEntero);
    }
    
}
