/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23t2;
//Importamos la clase Scanner para capturar la entrada
import java.util.Scanner;

/**
 *
 * @author Alexis Sanco
 * @since 23.09.2026
 */
public class Ejercicio23T2 {

    /**
     * • Ejercicio 23.- Realiza un programa en JAVA en el que le
        preguntes al usuario por el precio de un producto y cuantas
        unidades quiere comprar y el programa le calculará el total
        de la compra.
        • Muestra por pantalla el resultado de la siguiente forma:
        Por favor, introduzca el precio del modelo de ordenador que desea comprar: XXXX.XX

        ¿Cuántas unidades quiere llevarse? XX

        El precio total de su compra es de: XXXX.XX Euros.
     */
    public static void main(String[] args) {
        //Declaro las variables
        float precio, total;
        int unidades;
        Scanner input = new Scanner(System.in);
        
        //Pido al usuario introducir los datos
        System.out.print("Por favor, introduzca el precio del modelo de ordenador que desea comprar: ");
        precio = input.nextFloat();
        System.out.print("Cuantas unidades quiere llevarse? ");
        unidades = input.nextInt();
        
        //Calculo el total
        total = precio*unidades;
        //Muestro por pantalla el resultado
        System.out.println("El precio total de su compra es de: "+ total +" Euros.");
        
    }
    
}
