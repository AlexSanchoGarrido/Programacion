/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio21t3;
import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 7 oct 2026
 */
public class Ejercicio21T3 {

    /**
     * • Ejercicio 21.- Crea un programa que calcule el resultado de
        dividir los números que introduzca el usuario.
        • En caso de que el usuario introduzca un número divisor
        igual a 0, debemos capturar la excepción y mostrarle un
        mensaje de error al usuario.
     */
    public static void main(String[] args) {
        //Declaro las variables
        int num1, num2;
        Scanner input = new Scanner(System.in);
        
        //Solicito que introduzca dos numeros
        System.out.print("Introduce el primer numero: ");
        num1 = input.nextInt();
        System.out.print("Introduce el segundo numero: ");
        num2 = input.nextInt();
        
        //Como una division entre 0 puede dar error la capturo
        try{
            System.out.println("El resultado es: "+ num1/num2);
        }catch(ArithmeticException e){  //Excepcion de division de entero entre 0
            System.out.println("Error! El divisor no puede ser 0");
        }
    }

}
