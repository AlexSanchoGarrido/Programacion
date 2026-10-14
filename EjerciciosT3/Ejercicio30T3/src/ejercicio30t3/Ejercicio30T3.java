/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio30t3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 9 oct 2026
 */
public class Ejercicio30T3 {

    /**
     * • Ejercicio 30.- Mejora el ejercicio 29, de tal forma que si el
        usuario introduce algo que no es un número (una letra, por
        ejemplo) se le avisará del error por pantalla y se contará
        como un intento.
        • Pista: Necesitarás capturar excepciones.
     */
    public static void main(String[] args) {
        // Declaro las variables
        //Declaro random como FINAL ya que es una constante
        final int random = (int)(Math.random()*100 +1);
        int num = 0, intentos = 0;
        Scanner input = new Scanner(System.in);
        
        //Solicito que introduzca un numero entre 1 y 100
        System.out.print("Introduzca un numero entre 1 y 100: ");        
        do{
            try{ //Capturo la parte conflictiva de la entrada por teclado
               //Capturo la entrada en num
                num = input.nextInt();
                //Compruebo el caso en el que el numero introducido no este en el rango
                if(num < 1 || num > 100){
                    System.out.println("Error! El numero introducido debe ser entre 1 y 100 -inclusive-.");
                    System.out.print("Introduzca otro numero: ");
                }else{
                    //Muestro si el numero es mayor o menor
                    if(num < random)
                        System.out.print("Error! El numero a adivinar es MAYOR. Introduzca otro numero: ");
                    else if(num > random)
                        System.out.print("Error! El numero a adivinar es MENOR. Introduzca otro numero: ");
                    //Aumenta el numero de intentos
                    intentos++;
                } 
            //Caso en el que lo introducido por teclado no es un numero entero    
            }catch(InputMismatchException e){
                System.out.print("ERROR! Debe introducir un NUMERO ENTERO. Introduzca un numero: ");
                //Para "limpiar" el buffer de entrada y que Scanner no se quede con la excepcion
                input.next();
            }
            //Mientras no se adivine el numero el bucle continua
        }while(num != random);
        
        //Muestro por pantalla el resultado
        System.out.println("Ha adivinado el numero! El numero es: "+ random +" y ha empleado "+intentos+" intentos en adivinarlo.");
    }
}
