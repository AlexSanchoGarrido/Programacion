/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01t4;

import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 16 oct 2026
 */
public class Ejercicio01T4 {

    /**
     * • Ejercicio 01.- Realiza un programa en JAVA en el cual se le pide al
     * usuario (en el main) un número por teclado. Luego se llamará a un método
     * que pasándole número introducido por el usuario, nos dirá si el número
     * introducido es positivo o negativo. • Muestra por pantalla el resultado
     * de la siguiente forma:
     *
     * Por favor, introduzca un numero: xxx El número introducido es positivo o
     * negativo
     */
    public static void positivoNegativo(float n) {
        System.out.print("El numero introducido es ");
        if (n > 0) {    //Caso en el que es positivo
            System.out.println("positivo.");
        } else if (n < 0) { //Caso en el que es negativo
            System.out.println("negativo. ");
        } else {    //Caso en el que es cero
            System.out.println("cero.");
        }
    }

    public static void main(String[] args) {
        //Declaro las variables
        float num = 0f;
        Scanner input = new Scanner(System.in);
        //Solicito que introduzca un numero
        System.out.print("Introduzca un numero: ");
        num = input.nextFloat();
        //Invoco al metodo estatico
        positivoNegativo(num);
    }

}
