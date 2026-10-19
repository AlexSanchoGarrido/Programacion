/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02t4;

import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 16 oct 2026
 */
public class Ejercicio02T4 {

    /**
     * • Ejercicio 02.- Realiza un programa en el que le solicites en el main al
     * usuario 2 números y, si el primer número introducido es mayor que 10, se
     * llamará a un método que los multiplicará y mostrará el resultado, y en
     * caso contrario se llamará a un método que los sume. ESTOS DOS MÉTODOS
     * ESTARÁN EN UNA CLASE DISTINTA EN EL MISMO PAQUETE. Muestra al usuario la
     * operación realizada y el resultado. • Muestra por pantalla el resultado
     * de la siguiente forma: Por favor, introduzca un numero: xxx Ahora,
     * introduzca un segundo numero: xxx La operación que se realizó es suma o
     * producto y el resultado es xxx
     */
    public static void main(String[] args) {
        // Declaro las variables
        float num1 = 0f, num2 = 0f;
        Scanner input = new Scanner(System.in);

        //Solicito que introduzca los numeros
        System.out.print("Introduzca un numero: ");
        num1 = input.nextFloat();
        System.out.print("Introduzca un segundo numero: ");
        num2 = input.nextFloat();

        //Si es mayor que diez, suma; sino multiplica
        if (num1 > 10) {
            Operaciones.suma(num1, num2);   //Invoco al metodo estatico suma de la clase Operaciones
        } else {
            Operaciones.multiplicacion(num1, num2); //Invoco al metodo estatico multiplicacion de la clase Operaciones
        }
    }

}
