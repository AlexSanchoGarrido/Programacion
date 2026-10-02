/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio15t3;
import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 02.10.2026
 */
public class Ejercicio15T3 {

    /**
     * • Ejercicio 15.- Escribe un programa en JAVA que, utilizando bucles, 
     * imprima la tabla de multiplicar de un número que elija el usuario.
        • Ejemplo:

        Introduzca un numero para calcular su tabla de multiplicar: 8

        8 x 0 = 0
        8 x 1 = 8
        8 x 2 = 16
        8 x 3 = 24 ...
     */
    public static void main(String[] args) {
        // Declaro las variables
        int i, numero;
        Scanner input = new Scanner(System.in);
        
        //Solicito que introduzca el numero para la tabla de multiplicar
        System.out.print("Introduzca un numero: ");
        numero = input.nextInt();
        
        for(i = 0; i < 11; i++){
            System.out.println(numero+" x "+i+" = "+numero*i);
        }
    }

}
