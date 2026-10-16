/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajeroautomatico;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Alexis Sancho
 * @since 14 oct 2026
 */
public class CajeroAutomatico {

    static final int PIN = 1234;
    static final float MAX_RETIRADA = 500;

    /**
     * Simula un cajero con saldo inicial de 1000,00 €. Debe tolerar errores del
     * usuario (letras en vez de números) usando control de excepciones sin que
     * el programa finalice con error.
     *
     * 1. Consultar: Muestra el saldo disponible actual. 2. Ingresar: Cantidad >
     * 0. Validar con bucle si la cantidad es incorrecta o negativa. 3. Retirar:
     * Cantidad > 0 y ≤ saldo actual. Repetir con condicionales y bucles si es
     * inválido. 4. Salir: Despedida y resumen de la sesión.
     */
    public static void main(String[] args) {
        // Declaro las variables
        float saldo = 1000.00f; //Saldo del cliente
        Scanner input = new Scanner(System.in); //Objeto Scanner para capturar entrada
        int option = 0; //Variable para elegir la opcion del menu
        float cantidad = 0; //Cantidad que introduce el usuario para ingresar o retirar
        int cantidadRetiradas = 0, cantidadIngresos = 0, cantidadConsultas = 0; //Cantidad total de retiradas, ingresos y consultas
        boolean exit = false;   //Para salir de la transaccion de ingreso o retirada
        int cantidadErrores = 0;    //Muestra la cantidad de errores capturas
        int intentos = 0;   //Contador de intentos al introducir el pin
        int pin = 0;    //Pin que introduce el usuario
        
        //Solicito que introduzca el pin
        System.out.print("INTRODUZCA SU PIN: ");
        try {
            pin = input.nextInt();  //Capturo la entrada en pin
        } catch (InputMismatchException e) {    //Error en entrada del pin
            System.out.println("//////////////// Error! Debe introducir un numero.");
            input.next();   //Libero el buffer para evitar el bucle
        }
        do {

            if (pin != PIN) {   //Comprueba si el pin introducido es correcto
                intentos++; //Aumento el numero de intentos
                System.out.println("PIN INCORRECTO. INTENTOS RESTANTES: " + (3 - intentos));
                System.out.print("INTRODUZCA SU PIN: ");
                try {
                    pin = input.nextInt();  // Para introducir el resto de intentos si falla la primera
                } catch (InputMismatchException e) {    //Capturo que no sea un numero
                    System.out.println("//////////////// Error! Debe introducir un numero.");
                    input.next();
                }
            } else {    //El caso en el que el pin es correcto
                //Muestro el menu
                System.out.println("""  
                                             MENU
                                --------------------------------
                                1. Consulta del saldo disponible.
                                2. Ingresar dinero.
                                3. Retirar dinero.
                                4. Salir.
                                --------------------------------""");
                //Solicito que introduzca una opcion
                System.out.print("Introduzca una opcion: ");
                try {
                    option = input.nextInt();   //Operacion potencialmente conflictiva

                    switch (option) {   //Switch para los casos de la opcion introducida
                        case 1: //Caso de consulta de saldo
                            System.out.println("---------------------------------------------");
                            System.out.println("/       SALDO DISPONIBLE: " + saldo + "         /");
                            System.out.println("---------------------------------------------");
                            cantidadConsultas++;    //Aumento la cantidad de consultas
                            break;
                        case 2:
                        case 3:
                            exit = false;   //Reinicializo la variable para que funcione si hay varias operaciones
                            do {    //Bucle para los casos en el que la entrada de la cantidad sea erronea
                                if (option == 2) {  //Caso de ingreso
                                    System.out.print("Introduzca cantidad a ingresar: ");
                                } else if (option == 3) {   //Caso de retirada
                                    System.out.print("Introduzca cantidad a retirar: ");
                                }
                                try {
                                    cantidad = input.nextFloat();   //operacion potencialmente conflictiva para introducir cantidad
                                    if (cantidad <= 0) {    //Cantidad no puede ser menor que cero
                                        System.out.println("////////////////Error! La cantidad a ingresar debe ser mayor que 0!");
                                    } else if (cantidad > saldo && option == 3) {   //En el caso de retirada superior a saldo
                                        System.out.println("////////////////Error! La cantidad debe ser menor o igual al saldo existente!");
                                    } else if (cantidad > MAX_RETIRADA && option == 3) {    //En el caso de retirada superior a maximo de retirada
                                        System.out.println("////////////////Error! Cantidad maxima por retirada de 500 euros!");
                                    } else {
                                        if (option == 2) {  //Realiza el ingreso
                                            saldo += cantidad;  //Suma la cantidad al salto
                                            cantidadIngresos++; //Aumenta la cantidad de ingresos
                                            exit = true;    //Salida del bucle para volver a menu
                                            System.out.println("""
                                                        ---------------------------------------------
                                                        /       INGRESO REALIZADO CON EXITO         /
                                                        ---------------------------------------------
                                                       """);
                                        } else if (option == 3) {   //Realiza la retirada
                                            saldo -= cantidad;  //Resta la cantidad al saldo
                                            cantidadRetiradas++;    //Aumenta la cantidad de retiradas
                                            exit = true;    //Salida del bucle para volver al menu
                                            System.out.println("""
                                                        ---------------------------------------------
                                                        /       RETIRO REALIZADO CON EXITO         /
                                                        ---------------------------------------------
                                                       """);
                                        }
                                    }
                                } catch (InputMismatchException e) {    //Captura la excepcion de que no se introduzca numero
                                    System.out.println("////////////////Error! El valor introducido debe ser un numero");
                                    input.next();   //Libero el buffer del Scanner
                                    cantidadErrores++;  //Aumento el contador de operaciones erroneas
                                }
                            } while (!exit);
                            break;
                        case 4: //Caso de salida del menu
                            System.out.println("Hasta la proxima!");
                            break;
                        default:    //La opcion del menu es un numero pero no esta dentro del dominio de opciones
                            System.out.println("Opcion no valida!");
                    }
                } catch (InputMismatchException e) {    //Captura la excepcion de que no se introduzca numero
                    System.out.println("////////////////Error! El valor introducido debe ser un numero");
                    input.next();   //Libero el buffer de Scanner
                    cantidadErrores++;  //Aumento el contador de operaciones erroneas
                }
            }

        } while (option != 4 && intentos < 2);  //Sale si la opcion es 4 o el numero de intentos de pin se ha superado

        if (intentos == 2) {    //En el caso que se hayan sobrepasado el numero de intentos para pin
            System.out.println("//////////////// LIMITE DE INTENTOS SUPERADO.");
        }
        if (pin == PIN) {   //Solo muestra resumen de sesion si se ha introducido bien el pin
            System.out.println("""
                            -----------------------------------------------------------
                                            RESUMEN DE LA SESION                          
                           """);
            System.out.println("    SALDO FINAL: " + saldo + " | INGRESOS: " + cantidadIngresos + " | RETIRADAS: " + cantidadRetiradas);
            System.out.println("    Entradas erroneas interceptadas: " + cantidadErrores);
            System.out.println("    Operaciones validas: " + (cantidadConsultas + cantidadIngresos + cantidadRetiradas));
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Modificacion para subir a github
}
