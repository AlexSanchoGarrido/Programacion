/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio06t3;
import java.util.Scanner;
/**
 *
 * @author Alexis Sancho
 * @since 28.09.2026
 */
public class Ejercicio06T3 {

    /**
     * • Ejercicio 06.- Crea un programa en JAVA en donde el usuario
        introduzca la nota de un alumno (número entero entre 0 y 10) y se
        escribirá su calificación según el valor de la nota ingresada:
        • 0 a 4 = Suspenso.
        • 5 a 6 = Bien.
        • 7 a 8 = Notable.
        • 9 a 10 = Sobresaliente.
        • Nota: Se le avisará al usuario de un error en caso de que la nota que
        nos introduzca no esté entre 0 y 10.
     */
    public static void main(String[] args) {
        // Declaro las variables
        float nota;
        Scanner input = new Scanner(System.in);
        
        //Solicito introducir la nota:
        System.out.print("Introduzca la nota: ");
        nota = input.nextFloat();
        
        if( 0 <= nota && nota < 5 )
            System.out.println("Su calificacion es: suspenso");
        else if( 5 <= nota && nota < 7 )
            System.out.println("Su calificacion es: bien");
        else if( 7 <= nota && nota < 9 )
            System.out.println("Su calificacion es: notable");
        else if( 9 <= nota && nota <= 10 )
            System.out.println("Su calificacion es: suspenso");
        else
            System.out.println("La nota debe encontrarse entre 0 y 10");
        
    }

}
