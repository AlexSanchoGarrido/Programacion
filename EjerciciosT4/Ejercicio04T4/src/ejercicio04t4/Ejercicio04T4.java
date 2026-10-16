/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04t4;

import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 16 oct 2026
 */
public class Ejercicio04T4 {

    /**
     * • Ejercicio 04.- Escribir un algoritmo en JAVA que pida tres números (en
     * el main) y se los pase a un método que los imprima por pantalla el menor
     * de ellos. ESTE MÉTODO ESTARÁ EN UNA CLASE DISTINTA DEL MISMO PAQUETE.
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

        //Llamo al metodo estatico de la clase
        Metodos.mostrarMenor(num1, num2, num3);

    }

}
