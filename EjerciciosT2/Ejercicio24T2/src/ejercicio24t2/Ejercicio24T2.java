/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24t2;
import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 23.09.2026
 */
public class Ejercicio24T2 {

    /**
     * • Ejercicio 24.- Escribe un programa en JAVA en el que le pidas al usuario las notas
        de las 6 asignaturas del Ciclo de DAM y te calcule la nota media del curso.
        • Muestra por pantalla el resultado de la siguiente forma:

        Por favor, introduzca la nota de Programación: X.X
        Introduzca la nota de Lenguajes de Marcas: X
        Introduzca la nota de Bases de Datos: X.X
        Introduzca la nota de Entornos de Desarrollo: X
        Introduzca la nota de Sistemas Informáticos: X

        Por último, introduzca la nota de Formación y Orientación Laboral: X.X

        Su nota media del curso es de: X.X
     */
    public static void main(String[] args) {
        //Declaro las variables para las notas
        float sumasNotas = 0, media;
        int cantidadAsignaturas =0;
        Scanner input = new Scanner(System.in);
        System.out.print("Por favor, introduzca la nota de Programacion: ");
        sumasNotas += input.nextFloat();
        cantidadAsignaturas++;
        System.out.print("Introduzca la nota de Lenguaje de Marcas: ");
        sumasNotas += input.nextFloat();
        cantidadAsignaturas++;
        System.out.print("Introduzca la nota de Bases de Datos: ");
        sumasNotas += input.nextFloat();
        cantidadAsignaturas++;
        System.out.print("Introduzca la nota de Entornos de Desarrollo: ");
        sumasNotas += input.nextFloat();
        cantidadAsignaturas++;
        System.out.print("Introduzca la nota de Sistemas Informaticos: ");
        sumasNotas += input.nextFloat();
        cantidadAsignaturas++;
        System.out.print("Por ultimo, introduzca la nota de Formacion y Orientacion Laboral: ");
        sumasNotas += input.nextFloat();
        cantidadAsignaturas++;

        //Calculo la media:
        media = sumasNotas / cantidadAsignaturas;

        //Muestro el resultado:
        System.out.println("Su nota media del curso es de: "+media);
    }
    
}
