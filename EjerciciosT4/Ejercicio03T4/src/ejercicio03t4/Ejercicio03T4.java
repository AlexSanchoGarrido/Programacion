/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03t4;

import Metodos.Metodos;
import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 16 oct 2026
 */
public class Ejercicio03T4 {

    /**
     * • Ejercicio 03.- Diseña un programa en JAVA que lea tres números en el
     * main y se los pase a un método que imprimirá por pantalla el mayor de
     * ellos. ESTE MÉTODO ESTARÁ EN UNA CLASE DISTINTA DE OTRO PAQUETE. •
     * Muestra por pantalla el resultado de la siguiente forma: Por favor,
     * introduzca el primer numero: xxx Ahora, introduzca un segundo numero: xxx
     * Por último, introduzca un tercer numero: xxx El número mayor de los
     * introducidos es el xxx
     */
    public static void main(String[] args) {
        // Declaro las variables
        float num1 = 0, num2 = 0, num3 = 0;
        Scanner input = new Scanner(System.in);

        //Solicito que introduzca los numeros
        System.out.print("Por favor, introduzca el primer numero: ");
        num1 = input.nextFloat();
        System.out.print("Ahora, introduzca un segundo numero: ");
        num2 = input.nextFloat();
        System.out.print("Por ultimo, introduzca un tercer numero: ");
        num3 = input.nextFloat();

        //Llamo al metodo estatico de la clase Metodos en el paquete Metodos
        Metodos.mostrarMayor(num1, num2, num3);
    }

}
