/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25t2;
import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 25.09.2026
 */
public class Ejercicio25T2 {

    /**
     * • Ejercicio 25.- Realiza un programa en JAVA en el que le pidas por
        pantalla 3 números al usuario y le dé como resultado la suma y el
        producto de estos.
        • Muestra por pantalla el resultado de la siguiente forma:
        Por favor, introduzca el primer número: XXX
        Por favor, introduzca el segundo número: XX
        Por favor, introduzca el tercer número: XXX
        La suma de los números introducidos es: XXX
        El producto de los números introducidos es: XXXXX
     */
    public static void main(String[] args) {
        // Declaro las variables
        float num1, num2, num3, suma, producto;
        Scanner input = new Scanner(System.in);
        
        //Pido que introduzca los datos:
        System.out.print("Por favor, introduzca el primer numero: ");
        num1 = input.nextFloat();
        System.out.print("Por favor, introduzca el segundo numero: ");
        num2 = input.nextFloat();
        System.out.print("Por favor, introduzca el tercer numero: ");
        num3 = input.nextFloat();
        
        //Calculo suma y producto
        suma = num1 + num2 + num3;
        producto = num1 * num2 * num3;
        
        //Muestro el restulado por pantalla:
        System.out.println("La suma de los números introducidos es: "+suma);
        System.out.println("El producto de los números introducidos es: "+producto);
    }
    
}
