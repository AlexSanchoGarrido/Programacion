/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio16t5;

import java.util.Scanner;

/**
 *
 * @author kai
 */

/*
• Ejercicio 16.- Realiza un programa en JAVA, orientado a objetos, donde el usuario
introduzca el nombre y la nota de un alumno (número entero entre 0 y 10) y se
escribirá su calificación según el valor de la nota ingresada:
• 0 a 4 = Suspenso.
• 5 a 6 = Bien.
• 7 a 8 = Notable.
• 9 a 10 = Sobresaliente.
• Nota: Se le avisará al usuario de un error en caso de que la nota que nos introduzca
no esté entre 0 y 10.
• Para ello tendrás una clase Alumno con los atributos nombre y nota. En una clase
Test crea 3 objetos y los métodos que consideres necesarios (cuantos más mejor).
Intenta que el método main sea lo más pequeño posible.
 */
public class Test {

    public static String pedirNombre() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca un nombre: ");
        return input.nextLine();
    }

    public static Nota pedirNota() {
        Scanner input = new Scanner(System.in);
        boolean entradaCorrecta = false;
        float nota = 0f;
        do {
            System.out.print("Introduzca una nota: ");
            nota = input.nextFloat();
            if (nota < 0 || nota > 10) {
                System.out.println("Error! La nota debe ser >0 y <10");
            } else {
                entradaCorrecta = true;
            }
        } while (!entradaCorrecta);
        Nota nuevaNota = new Nota(nota);
        return nuevaNota;
    }

    //Prueba para git bash
    public static void main(String args[]) {
        //Creo tres objetos de la clase alumno
        System.out.println("Datos para Alumno 1: ");
        Alumno alu1 = new Alumno(pedirNombre(), pedirNota());
        System.out.println("Datos para Alumno 2: ");
        Alumno alu2 = new Alumno(pedirNombre(), pedirNota());
        System.out.println("Datos para Alumno 3: ");
        Alumno alu3 = new Alumno(pedirNombre(), pedirNota());

        //Muestro los alumnos
        alu1.mostrar();
        alu2.mostrar();
        alu3.mostrar();
    }
}
