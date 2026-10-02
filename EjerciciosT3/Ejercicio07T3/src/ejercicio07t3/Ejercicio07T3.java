/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio07t3;
import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 30.09.2026
 */
public class Ejercicio07T3 {

    /**
     * Ejercicio 07.- Realiza un programa en JAVA en el que tenga
        cabida, sin modificar, el siguiente trozo de código:
     */
    public static void main(String[] args) {
        // Declaracion de las variables
        int diasemana;
        boolean laborable = true;
        Scanner input = new Scanner(System.in);
        
        //Solicito que introduzcan un dia de la semana
        System.out.println("""
                           Introduce el numero correspondiente al dia de la semana:
                           1 Lunes
                           2 Martes
                           3 Miercoles
                           4 Jueves
                           5 Viernes
                           6 Sabado
                           7 Domingo""");
        diasemana = input.nextInt();        
        
        switch (diasemana) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                laborable = true;
                break;
            case 6:
            case 7:
                laborable = false;
        }
        if(laborable)
            System.out.println("El dia introducido SI es laborable.");
        else
            System.out.println("El dia introducido NO es laborable.");
        
    }

}
