/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03t3;
import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 28.09.2026
 */
public class Ejercicio03T3 {

    /**
     * • Ejercicio 03.- Diseña un programa en JAVA que lea tres números e
        imprima por pantalla el mayor de ellos.
        • Muestra por pantalla el resultado de la siguiente forma:
        Por favor, introduzca el primer numero: xxx
        Ahora, introduzca un segundo numero: xxx
        Por último, introduzca un tercer numero: xxx
        El número mayor de los introducidos es el xxx
     */
    public static void main(String[] args) {
        // Declaro las variables 
        float numeroMayor, nuevoNumero;      
        Scanner input = new Scanner(System.in);
        
        //Pido al usuario que introduzca el primer numero
        System.out.print("Introduzca el primer numero:");  
        numeroMayor = input.nextFloat();
        //Pido al usuario que introduza el segundo numero
        System.out.print("Introduzca el primer numero:");  
        nuevoNumero = input.nextFloat();
        if(nuevoNumero > numeroMayor)
            numeroMayor = nuevoNumero;
        //Pido al usuario que introduzca el tercer numero
        System.out.print("Introduzca el tercer numero:");
        nuevoNumero = input.nextFloat();
        if(nuevoNumero > numeroMayor)
            numeroMayor = nuevoNumero;
        
        //Muestro los resultados
        System.out.println("El numero mayor de los introducidos es el: "+ numeroMayor);
    }
    
}
