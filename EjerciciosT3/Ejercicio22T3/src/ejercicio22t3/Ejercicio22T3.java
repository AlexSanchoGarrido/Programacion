/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio22t3;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 7 oct 2026
 */
public class Ejercicio22T3 {

    /**
     * • Ejercicio 22.- Crea un programa que calcule sume dos
        números que introduzca el usuario.
        • En caso de que el usuario introduzca una letra en vez de un
        número, debemos capturar la excepción y mostrarle un
        mensaje de error.
     */
    public static void main(String[] args) {
        // Declaro las variables
        float num1=0, num2=0;
        Scanner input = new Scanner(System.in);
        
        //Solicito al usuario que introduzca los dos numeros:
        System.out.print("Introduzca el primer numero: ");
        try{ //Posible conflicto con la entrada del tipo de dato
            num1 = input.nextFloat();
            System.out.print("Introduzca el segundo numero: ");
            num2 = input.nextFloat();
            //Muestro por pantalla el resultado
            System.out.println("El resultado de la suma es:"+ (num1+num2));
        }catch(InputMismatchException e){ //Capturo si el dato introducido no es un numero
            System.out.println("Error!! Los datos introducidos deben ser numeros");
        }
    }

}
