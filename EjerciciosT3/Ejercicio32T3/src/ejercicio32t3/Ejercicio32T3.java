/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio32t3;

import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 9 oct 2026
 */
public class Ejercicio32T3 {

    /**
     * • Ejercicio 32.- Realiza un programa que calcule la edad de una persona, solicitando la fecha actual y la fecha de su nacimiento.
        • Ejemplo de ejecución:

        Introduzca el año actual: XXXX
        Introduzca el mes actual: XX
        Introduzca el día actual: XX

        Ahora, introduzca su año de nacimiento: XXXX
        Introduzca su mes de nacimiento: XX
        Por último introduzca su día de nacimiento: XX
        Su edad exacta es de XX años, XX meses y XX días.
     */
    public static void main(String[] args) {
        //Declaro las variables
        int anio_act, mes_act, dia_act;
        int anio_nac, mes_nac, dia_nac;
        Scanner input = new Scanner(System.in);
        int anio_sol, mes_sol, dia_sol;
        
        //Solicito al usuario que introduzca datos actuales
        System.out.print("Introduzca el anio actual: ");
        anio_act = input.nextInt();
        System.out.print("Introduzca el mes actual: ");
        mes_act = input.nextInt();
        System.out.print("Introduzca el dia actual: ");
        dia_act = input.nextInt();
        
        //Solicito al usuario que introduzca datos de su fecha de nacimiento
        System.out.print("introduzca su anio de nacimiento: ");
        anio_nac = input.nextInt();
        System.out.print("Introduzca su mes de nacimiento: ");
        mes_nac = input.nextInt();
        System.out.print("Por ultimo introduzca su dia de nacimiento: ");
        dia_nac = input.nextInt();
        
        anio_sol = anio_act - anio_nac;
        mes_sol = mes_act - mes_nac;
        dia_sol = dia_act - dia_nac;
        //Compruebo que los meses y los dias cuadren
        //Si el mes actual es superior al mes de nacimiento, resto un año y sumo 12 meses para ajustar
        if(mes_sol < 0){
            mes_sol = mes_sol +12;
            anio_sol--;
        }
        //Si el dia actual es superior al dia de nacimiento, resto un mes y sumo 30 dias para ajustar
        if(dia_sol < 0){
            dia_sol = dia_sol + 30;
            mes_sol--;
        }
        
        System.out.println("Su edad exacta es de "+anio_sol+" anios, "+mes_sol+" meses y "+dia_sol+" dias.");
    }

}
