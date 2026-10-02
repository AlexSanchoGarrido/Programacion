/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio17t3;
import static java.lang.Math.*;
import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 02.10.2026
 */
public class Ejercicio17T3 {

    /**
     * • Ejercicio 17.- Crea un programa que calcule la raíz
        cuadrada del número que introduzca el usuario. (Utiliza el
        método Math.sqrt() )
        • Si el usuario introduce un número negativo, debemos
        mostrarle un mensaje de error y volver a pedírselo (tantas
        veces como sea necesario).
        • Pista: Como sabes que al menos se ejecutará el bucle una vez,
        deberás utilizar un bucle do...while.
     */
    public static void main(String[] args) {
        // Declaro las variables
        double numero, resultado =0;
        Scanner input = new Scanner(System.in);
        
        //Solicito al usuario que introduzca un numero
        System.out.print("Introduzca un numero: ");
        do{
            numero = input.nextFloat();
            //Compruebo si el numero es positivo, y si lo es calculo la raiz cuadrada
            if(numero >= 0)
                resultado = sqrt(numero);
            //Si no es positivo, emito mensaje de error
            else
                System.out.println("Error, el numero introducido es negativo.\nIntroduzca de nuevo un numero: ");
            //Iteramos mientras el numero no sea positivo
        }while(numero < 0);
        
        System.out.println("La raiz cuadrada de "+numero+" es igual a "+resultado);
    }

}
