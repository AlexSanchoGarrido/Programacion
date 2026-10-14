/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio23t3;
import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 9 oct 2026
 */
public class Ejercicio23T3 {

    /**
     * • Ejercicio 23.- Realiza un algoritmo que imprima todos los
        números existentes entre el número 1 y otro introducido
        por el usuario.
        • Controla que el usuario te meta un número mayor que 1 y,
        sino, avísale del error y vuélveselo a pedir las veces que
        hagan falta. (hasta que introduzca un número mayor que 1)
     */
    public static void main(String[] args) {
        // Declaro las variables
        int num;
        Scanner input = new Scanner(System.in);
        int i;
        
        //Solicito que introduzca un numero
        System.out.print("Introduzca un numero: ");
        do{
            //Asigno la entrada del teclado a la variable num
            num = input.nextInt();
            //Compruebo que el numero es <1 para mostrar error por pantalla
            if(num < 2)
                System.out.print("Error. Introduzca un numero mayor que 1: ");
        }while(num < 2);
        //Muestro por pantalla los numeros entre 1 y num
        System.out.println("Numeros entre 1 y "+num+":");
        for(i=2; i < num; i++)
            System.out.println(i);
    }

}
