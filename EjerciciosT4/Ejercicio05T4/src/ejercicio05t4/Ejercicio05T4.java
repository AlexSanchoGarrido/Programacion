/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05t4;

import Metodos.Metodos;
import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 16 oct 2026
 */
public class Ejercicio05T4 {

    /**
     * • Ejercicio 05.- Implementa un algoritmo en JAVA que le pida al usuario
     * un número por teclado (en el main). Ese número se lo pasaremos a un
     * método que nos dirá si el número introducido es par o impar. ESTE MÉTODO
     * ESTARÁ EN UNA CLASE DISTINTA DE OTRO PAQUETE.
     */
    public static void main(String[] args) {
        //Declaro las variables
        int num = 0;
        Scanner input = new Scanner(System.in);

        //Solicito al usuario que introduzca el numero
        System.out.print("Introduzca un numero: ");
        num = input.nextInt();

        //Llamo al metodo estatico de la clase metodos
        Metodos.parImpar(num);
    }

}
