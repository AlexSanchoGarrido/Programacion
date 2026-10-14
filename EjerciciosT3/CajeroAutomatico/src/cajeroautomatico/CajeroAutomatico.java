/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package cajeroautomatico;
import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 14 oct 2026
 */
public class CajeroAutomatico {

    /**
     * Simula un cajero con saldo inicial de 1000,00 €. Debe
        tolerar errores del usuario (letras en vez de números)
        usando control de excepciones sin que el programa
        finalice con error.
        * 
        * 1. Consultar: Muestra el saldo disponible actual.
        2. Ingresar: Cantidad > 0. Validar con bucle si la cantidad es
        incorrecta o negativa.
        3. Retirar: Cantidad > 0 y ≤ saldo actual. Repetir con
        condicionales y bucles si es inválido.
        4. Salir: Despedida y resumen de la sesión.
     */
    public static void main(String[] args) {
        // Declaro las variables
        float saldo = 1000.00f;
        Scanner input = new Scanner(System.in);
        int option = 0;
        float cantidad = 0;
        int cantidadRetiradas = 0, cantidadIngresos = 0;
        boolean exit = false;
        
        do{
            System.out.println("""
                                             MENU
                                --------------------------------
                                1. Consulta del saldo disponible.
                                2. Ingresar dinero.
                                3. Retirar dinero.
                                4. Salir.
                                --------------------------------""");
                               
            System.out.print("Introduzca una opcion: ");
            option = input.nextInt();
            
            switch(option){
                case 1:
                    System.out.println("---------------------------------------------");
                    System.out.println("/       SALDO DISPONIBLE: "+saldo+"         /");
                    System.out.println("---------------------------------------------");
                    break;
                case 2:
                    do{
                        System.out.print("Introduzca cantidad a ingresar: ");
                        cantidad = input.nextFloat();
                        if(cantidad <= 0)
                            System.out.println("Error! La cantidad a ingresar debe ser mayor que 0!");
                        else{
                            saldo += cantidad;
                            cantidadIngresos++;
                            System.out.println("""
                                                ---------------------------------------------
                                                /       INGRESO REALIZADO CON EXITO         /
                                                ---------------------------------------------
                                               """);  
                        }
                    }while(cantidad <= 0);
                    break;
                case 3:
                    do{
                        System.out.print("Introduzca cantidad a retirar: ");
                        cantidad = input.nextFloat();
                        if(cantidad <= 0)
                            System.out.println("Error! La cantidad a ingresar debe ser mayor que 0!");
                        else if(cantidad > saldo)
                            System.out.println("Error! La cantidad debe ser menor o igual al saldo existente!");
                        else{
                            saldo -= cantidad;
                            cantidadRetiradas++;
                            exit = true;
                            System.out.println("""
                                                ---------------------------------------------
                                                /       RETIRO REALIZADO CON EXITO         /
                                                ---------------------------------------------
                                               """);  
                        }
                    }while(!exit);
                    break;
                case 4:
                    System.out.println("Hasta la proxima!");
            }
            
        }while(option != 4);
        
        System.out.println("""
                            -------------------------------------------------------
                                            RESUMEN DE LA SESION                          
                           """);  
        System.out.println("    SALDO FINAL: "+saldo+" | INGRESOS: "+cantidadIngresos+" | RETIRADAS: "+cantidadRetiradas);
        System.out.println("-------------------------------------------------------");
    }

}
