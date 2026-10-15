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
        float saldo = 1000.00f;
        Scanner input = new Scanner(System.in);
        int option = 0;
        float cantidad = 0;
        int cantidadRetiradas = 0, cantidadIngresos = 0;
        boolean exit = false;
        int cantidadErrores = 0;
        int intentos = 0;
        int pin = 0;

        System.out.print("INTRODUZCA SU PIN: ");
        try {
            pin = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("//////////////// Error! Debe introducir un numero.");
            input.next();
        }
        do {

            if (pin != PIN) {
                intentos++;
                System.out.println("PIN INCORRECTO. INTENTOS RESTANTES: " + (3 - intentos));
                System.out.print("INTRODUZCA SU PIN: ");
                try {
                    pin = input.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("//////////////// Error! Debe introducir un numero.");
                    input.next();
                }
            } else {
                System.out.println("""
                                             MENU
                                --------------------------------
                                1. Consulta del saldo disponible.
                                2. Ingresar dinero.
                                3. Retirar dinero.
                                4. Salir.
                                --------------------------------""");

                System.out.print("Introduzca una opcion: ");
                try {
                    option = input.nextInt();

                    switch (option) {
                        case 1:
                            System.out.println("---------------------------------------------");
                            System.out.println("/       SALDO DISPONIBLE: " + saldo + "         /");
                            System.out.println("---------------------------------------------");
                            break;
                        case 2:
                        case 3:
                            exit = false;
                            intentos = 0;
                            do {
                                if (option == 2) {
                                    System.out.print("Introduzca cantidad a ingresar: ");
                                } else if (option == 3) {
                                    System.out.print("Introduzca cantidad a retirar: ");
                                }
                                try {
                                    cantidad = input.nextFloat();
                                    if (cantidad <= 0) {
                                        System.out.println("////////////////Error! La cantidad a ingresar debe ser mayor que 0!");
                                    } else if (cantidad > saldo && option == 3) {
                                        System.out.println("////////////////Error! La cantidad debe ser menor o igual al saldo existente!");
                                    } else if (cantidad > MAX_RETIRADA && option == 3) {
                                        System.out.println("////////////////Error! Cantidad maxima por retirada de 500 euros!");
                                    } else {
                                        if (option == 2) {
                                            saldo += cantidad;
                                            cantidadIngresos++;
                                            exit = true;
                                            System.out.println("""
                                                        ---------------------------------------------
                                                        /       INGRESO REALIZADO CON EXITO         /
                                                        ---------------------------------------------
                                                       """);
                                        } else if (option == 3) {
                                            saldo -= cantidad;
                                            cantidadRetiradas++;
                                            exit = true;
                                            System.out.println("""
                                                        ---------------------------------------------
                                                        /       RETIRO REALIZADO CON EXITO         /
                                                        ---------------------------------------------
                                                       """);
                                        }
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("////////////////Error! El valor introducido debe ser un numero");
                                    input.next();
                                    cantidadErrores++;
                                }
                            } while (!exit && intentos < 3);
                            break;
                        case 4:
                            System.out.println("Hasta la proxima!");
                            break;
                        default:
                            System.out.println("Opcion no valida!");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("////////////////Error! El valor introducido debe ser un numero");
                    input.next();
                    cantidadErrores++;
                }
            }

        } while (option != 4 && intentos < 2);

        if (intentos == 2) {
            System.out.println("//////////////// LIMITE DE INTENTOS SUPERADO.");
        }

        System.out.println("""
                            -------------------------------------------------------
                                            RESUMEN DE LA SESION                          
                           """);
        System.out.println("    SALDO FINAL: " + saldo + " | INGRESOS: " + cantidadIngresos + " | RETIRADAS: " + cantidadRetiradas);
        System.out.println("    Entradas erroneas interceptadas: " + cantidadErrores);
        System.out.println("-------------------------------------------------------");
    }
    //Modificacion para subir a github
}
