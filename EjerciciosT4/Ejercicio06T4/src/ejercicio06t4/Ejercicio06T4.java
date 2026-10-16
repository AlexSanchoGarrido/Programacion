/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06t4;

import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 16 oct 2026
 */
public class Ejercicio06T4 {

    /**
     * • Ejercicio 06.- Crea un programa en JAVA en donde el usuario introduzca
     * la nota de un alumno (número entero entre 0 y 10) en el main, y se le
     * pasará a un método que escribirá su calificación según el valor de la
     * nota ingresada: • 0 a 4 = Suspenso. • 5 a 6 = Bien. • 7 a 8 = Notable. •
     * 9 a 10 = Sobresaliente. • Nota: Se le avisará al usuario de un error en
     * caso de que la nota que nos introduzca no esté entre 0 y 10.
     */
    public static void mostrarCalificacion(int n) {
        if (-1 < n && n < 5) {
            System.out.println("Su calificacion es: Suspenso.");
        } else if (n < 7) {
            System.out.println("Su calificacion es: Bien.");
        } else if (n < 9) {
            System.out.println("Su calificacion es: Notable.");
        } else if (n < 11) {
            System.out.println("Su calificacion es: Sobresaliente");
        } else {
            System.out.println("La nota introducida debe estar entre 0 y 10");
        }
    }

    public static void main(String[] args) {
        //Declaro las variables
        int nota = 0;
        Scanner input = new Scanner(System.in);

        //Solicito que introduzca la nota
        System.out.print("Introduzca la nota: ");
        nota = input.nextInt();

        //Llamo al metodo estatico de la clase Metodos
        mostrarCalificacion(nota);
    }

}
