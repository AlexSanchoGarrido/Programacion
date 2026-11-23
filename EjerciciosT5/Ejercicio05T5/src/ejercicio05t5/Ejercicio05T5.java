/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05t5;

import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 18 nov 2026
 */
public class Ejercicio05T5 {

    /**
     * • Ejercicio 05.- Realiza un programa en JAVA en el que le pidas al
     * usuario las notas de las 6 asignaturas del Ciclo de DAM y te calcule la
     * nota media del curso. • o Nota 1: Cada una de las asignaturas serán un
     * objeto cuyos atributos serán el nombre y la nota. • o Nota 2: Crea un
     * constructor con el que puedas asignar directamente el nombre de la
     * asignatura al crear el objeto. En cambio, el atributo nota, será el
     * usuario quien lo introduzca mediante un método al que se le pase la nota
     * como argumento. • o Nota 3: Crea otro método que reciba las 6 notas como
     * argumentos y devuelva la nota media (return) • o Ejemplo de ejecución:
     *
     * Por favor, introduzca la nota de Programación: 6,5 Introduzca la nota de
     * Lenguajes de Marcas: 7,5 Introduzca la nota de Bases de Datos: 7,5
     * Introduzca la nota de Entornos de Desarrollo: 8 Introduzca la nota de
     * Sistemas Informáticos: 6,5
     *
     * Por último, introduzca la nota de Formación y Orientación Laboral: 6
     *
     * Su nota media del curso es de: 7
     */
    public static float pedirNota() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca una nota: ");
        return input.nextFloat();
    }
    
    public static void main(String[] args) {
        // Creo los objetos de las asignaturas
        Asignatura PROG = new Asignatura("Programacion");
        Asignatura LMSGI = new Asignatura("Lenguaje de Marcas");
        Asignatura BD = new Asignatura("Bases de Datos");
        Asignatura ED = new Asignatura("Entornos de Desarrollo");
        Asignatura SI = new Asignatura("Sistemas Informaticos");
        Asignatura ING = new Asignatura("Ingles");
        Asignatura IPE = new Asignatura("Itinerario Personal para la Empleabilidad");
        
        //Pido las notas de todas las asignaturas y se las asigno
        System.out.println("Nota de " + PROG.getNombre());
        PROG.ponerNota(pedirNota());
        
        System.out.println("Nota de " + LMSGI.getNombre());
        LMSGI.ponerNota(pedirNota());
        
        System.out.println("Nota de " + BD.getNombre());
        BD.ponerNota(pedirNota());
        
        System.out.println("Nota de " + ED.getNombre());
        ED.ponerNota(pedirNota());
        
        System.out.println("Nota de " + SI.getNombre());
        SI.ponerNota(pedirNota());
        
        System.out.println("Nota de " + ING.getNombre());
        ING.ponerNota(pedirNota());
        
        System.out.println("Nota de " + IPE.getNombre());
        IPE.ponerNota(pedirNota());

        //Calculo la media de todas las notas
        System.out.println("La nota media es: " + Asignatura.obtenerMedia(PROG.getNota(), LMSGI.getNota(), 
                BD.getNota(), ED.getNota(), SI.getNota(), ING.getNota(), IPE.getNota()));
        
    }
    
}
