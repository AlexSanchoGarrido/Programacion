/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15t4;

import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 26 oct 2026
 */
public class Ejercicio15T4 {

    /**
     * Ejercicio 15.- Diseña un programa en JAVA que pida al usuario dos numeros
     * por teclado. Posteriormente el programa mostrará un menú que le permitirá
     * al usuario: 1.- Sumar los numeros. 2.- Restar los numeros. 3.-
     * Multiplicar los numeros. 4.- Dividir los numeros. 5.- Salir del programa.
     * Nota 1: Mientras el usuario no pulse 5, el programa no termina y el menú
     * volverá a aparecer pidiendo nuevamente que le introduzcas una opción.
     * Nota 2: Controla el caso de división entre 0 mediante la captura de
     * excepciones. Nota 3:Utiliza todos los subprogramas que se te ocurran.
     */
    public static void mostrarMenu() {
        //Muestra el menu
        System.out.println("""
                           ---------------------------------
                                         MENU
                           ---------------------------------
                             1.- Sumar los numeros.
                             2.- Restar los numeros.
                             3.- Multiplicar los numeros.
                             4.- Dividir los numeros.
                             5.- Salir del programa.
                           """);
    }

    public static void mostrarResultadoDivision(int n1, int n2) {
        //Recoge la expepcion de division /0 si da lugar
        try {
            System.out.println("El resultado de la division de " + n1 + " / " + n2 + " es " + (n1 / n2));
        } catch (Exception ArithmeticException) {
            System.out.println("Error! No es posible dividir entre 0");
        }
    }

    public static int pedirNumeroInt() {
        //Solicita un numero entero. Si no lo es, llama recursivamente
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Introduzca un numero: ");
            return input.nextInt();
        } catch (Exception MismatchException) {
            System.out.println("Error! Debe introducir un numero entero");
            return pedirNumeroInt();
        }

    }

    public static void ejecucionOperaciones(int opt, int n1, int n2) {
        //Realiza las operaciones sobre n1 y n2 en funcion de la opcion escogida
        System.out.println("--------------------------------------------------------");
        switch (opt) {
            case 1:
                System.out.println("El resultado de la suma de " + n1 + " + " + n2 + " es " + (n1 + n2));
                break;
            case 2:
                System.out.println("El resultado de la resta de " + n1 + " - " + n2 + " es " + (n1 - n2));
                break;
            case 3:
                System.out.println("El resultado de la multiplicacion de " + n1 + " * " + n2 + " es " + (n1 * n2));
                break;
            case 4:
                mostrarResultadoDivision(n1, n2);
                break;
            case 5:
                System.out.println("Fin del programa");
                break;
            default:
                System.out.println("Error! El numero introducido no corresponde a una opcion de menu");
        }
        System.out.println("--------------------------------------------------------");
    }

    public static void main(String[] args) {
        // Declaro las variables
        int option = 0;
        //Solicito al usuario que introduzca dos numeros
        int num1 = pedirNumeroInt();
        int num2 = pedirNumeroInt();
        while (option != 5) {
            //Muestro el menu
            mostrarMenu();
            //Solicito que introduzca una opcion:
            System.out.print("Seleccion de opcion - ");
            option = pedirNumeroInt();
            //Llama a la funcion que opera
            ejecucionOperaciones(option, num1, num2);
        }

    }

}
