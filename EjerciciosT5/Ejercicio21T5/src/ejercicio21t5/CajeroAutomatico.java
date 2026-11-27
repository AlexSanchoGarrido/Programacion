/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21t5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 27 nov 2026
 */
public class CajeroAutomatico {

    /**
     * • Ejercicio 20.- Se pretende desarrollar una aplicación que simule el
     * funcionamiento de un cajero automático. existirá una clase con el método
     * main encargada de la captura y presentación de datos, y de la gestión de
     * la cuenta. Al iniciarse la aplicación se mostrará el siguiente menú:
     *
     * 1.- Crear cuenta vacía. 2.- Crear cuenta con saldo inicial. 3.- Ingresar
     * dinero. 4.- Sacar dinero. 5.-Ver saldo. 6.- Salir.
     *
     * • La opción 1 crea un objeto Cuenta con saldo 0, la opción 2 solicita una
     * cantidad y crea un objeto Cuenta con este saldo inicial. En la opción 3
     * se solicita una cantidad y la ingresa en el objeto creado en las opciones
     * 1 o 2 (debe haber pasado antes por estas opciones), mientras que en la
     * opción 4 se solicita una cantidad y la extrae del objeto creado en las
     * opciones 1 o 2 (también debe haber pasado antes por estas opciones).
     * Finalmente, la opción 5 muestra el saldo, mientras que la 6 finaliza el
     * programa. • El menú vuelve a presentarse en pantalla mientras no se elija
     * la opción de salir.
     */
    public static void mostrarMenu() {
        System.out.println("""
                           -------------------------------------
                            1.- Crear cuenta vacia. 
                            2.- Crear cuenta con saldo inicial.
                            3.- Ingresar dinero. 
                            4.- Sacar dinero. 
                            5.-Ver saldo. 
                            6.- Salir.
                           """);
    }

    public static int pedirOpcion() {
        Scanner input = new Scanner(System.in);
        //Solicito al usuario que introduzca una opcion
        System.out.print("Introduzca una opcion: ");
        return input.nextInt();
    }

    public static float pedirCantidad() {
        Scanner input = new Scanner(System.in);
        //Solicito al usuario que introduzca un saldo inicial
        System.out.print("Introduzca una cantidad: ");
        return input.nextFloat();
    }
    
    public static int pedirClave(){
        Scanner input = new Scanner(System.in);
        //Solicito al usuario que introduzca una clave
        System.out.print("Introduzca una clave: ");
        return input.nextInt();
    }

    public static void menu() {
        CuentaClave c = null;
        int option = 0;
        do {
            mostrarMenu();
            try {
                option = pedirOpcion();
                switch (option) {
                    case 1: //Crear cuenta vacía
                        if (c == null) {
                            c = new CuentaClave(0, pedirClave());
                        } else {
                            System.out.println("Error! Ya ha creado una cuenta");
                        }
                        break;
                    case 2: //Crear cuenta con saldo inicial
                        if (c == null) {
                            System.out.print("Saldo inicial - ");
                            c = new CuentaClave(pedirCantidad(), pedirClave());
                        } else {
                            System.out.println("Error! Ya ha creado una cuenta");
                        }
                        break;
                    case 3: //  Ingresar dinero
                        if(c != null){
                            System.out.print("Ingresar dinero - ");
                            c.ingresar(pedirCantidad());
                        }
                        break;
                    case 4: //  Sacar dinero
                        if (c != null) {
                            System.out.print("Sacar dinero - ");
                            c.extraer(pedirCantidad());
                        }
                        break;
                    case 5:
                        if(c != null){
                            System.out.println("Saldo de la cuenta: "+c.getSaldo());
                        }
                        break;
                    case 6:
                        System.out.println("Fin del programa. Hasta la proxima.");
                        break;
                    default:
                        System.out.println("Error opcion no valida. Opciones 1-6.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error! Debe introducir un numero");
            }
        } while (option != 6);
    }

    public static void main(String[] args) {
        menu();
    }

}
