/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio29t3;
import java.lang.Math;
import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 9 oct 2026
 */
public class Ejercicio29T3 {

    /**
     * • Ejercicio 29.- Escribe un programa que juegue con el usuario a adivinar un número. El ordenador debe generar un número
        entero aleatorio entre 1 y 100, y el usuario tiene que intentar
        adivinarlo.
        • Para ello, cada vez que el usuario introduce un valor el ordenador
        debe decirle al usuario si el número que tiene que adivinar es
        mayor o menor que el que ha introducido.
        • Cuando consiga adivinarlo debe indicárselo e imprimir en pantalla
        el número de veces que el usuario ha intentado adivinar el
        número.
     */
    public static void main(String[] args) {
        // Declaro las variables
        //Declaro random como FINAL ya que es una constante
        final int RANDOM = (int)(Math.random()*100 +1);
        int num, intentos = 0;
        Scanner input = new Scanner(System.in);
        
        //Solicito que introduzca un numero entre 1 y 100
        System.out.print("Introduzca un numero entre 1 y 100: ");        
        do{
            //Capturo la entrada en num
            num = input.nextInt();
            //Compruebo el caso en el que el numero introducido no este en el rango
            if(num < 1 || num > 100){
                System.out.println("Error! El numero introducido debe ser entre 1 y 100 -inclusive-.");
                System.out.print("Introduzca otro numero: ");
            }else{
                //Muestro si el numero es mayor o menor
                if(num < RANDOM)
                    System.out.print("Error! El numero a adivinar es MAYOR. Introduzca otro numero: ");
                else if(num > RANDOM)
                    System.out.print("Error! El numero a adivinar es MENOR. Introduzca otro numero: ");
                //Aumenta el numero de intentos
                intentos++;
            }
            //Mientras no se adivine el numero el bucle continua
        }while(num != RANDOM);
        
        //Muestro por pantalla el resultado
        System.out.println("Ha adivinado el numero! El numero es: "+ RANDOM +" y ha empleado "+intentos+" intentos en adivinarlo.");
    }

}
