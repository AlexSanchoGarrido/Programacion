/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02t3;
import java.util.Scanner;

/**
 *
 * @author Alexis Sancho Garrido
 * @since 28.09.2026
 */
public class Ejercicio02T3 {

    /**
     * • Ejercicio 02.- Realiza un programa en el que le solicites al usuario 2 números y, 
     * si el primer número introducido es mayor que 10, se
        multipliquen, y en caso contrario que se sumen. Muestra al usuario la
        operación realizada y el resultado.
        • Muestra por pantalla el resultado de la siguiente forma:
        Por favor, introduzca un numero: xxx
        Ahora, introduzca un segundo numero: xxx

        La operación que se realizó es suma o producto y el resultado es xxx
     */
    public static void main(String[] args) {
        // Declaro las variables
        float num1, num2;
        Scanner input = new Scanner(System.in);
        
        //Solicito introducir los numeros y los almaceno en las variables
        System.out.print("Por favor, introduzca un numero: ");
        num1 = input.nextFloat();
        System.out.print("Por favor, introduzca un segundo numero: ");
        num2 = input.nextFloat();
        
        //Compruebo si num1 es mayor de 10
        if(num1 > 10)
            //Muestro por pantalla el resultado
            System.out.println("La operacion que se realizo es producto y el resultado es "+ (num1*num2));
        else
            //Muestro por pantalla el resultado
            System.out.println("La operacion que se realizo es suma y el resultado es "+ (num1+num2));
    }
    
}
