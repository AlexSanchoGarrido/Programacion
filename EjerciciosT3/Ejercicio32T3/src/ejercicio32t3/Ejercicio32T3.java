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
        int anioAct, mesAct, diaAct;
        int anioNac, mesNac, diaNac;
        Scanner input = new Scanner(System.in);
        int anioSol, mesSol, diaSol;
        
        //Solicito al usuario que introduzca datos actuales
        System.out.print("Introduzca el anio actual: ");
        anioAct = input.nextInt();
        System.out.print("Introduzca el mes actual: ");
        mesAct = input.nextInt();
        System.out.print("Introduzca el dia actual: ");
        diaAct = input.nextInt();
        
        //Solicito al usuario que introduzca datos de su fecha de nacimiento
        System.out.print("introduzca su anio de nacimiento: ");
        anioNac = input.nextInt();
        System.out.print("Introduzca su mes de nacimiento: ");
        mesNac = input.nextInt();
        System.out.print("Por ultimo introduzca su dia de nacimiento: ");
        diaNac = input.nextInt();
        
        anioSol = anioAct - anioNac;
        mesSol = mesAct - mesNac;
        diaSol = diaAct - diaNac;
        //Compruebo que los meses y los dias cuadren
        //Si el mes actual es superior al mes de nacimiento, resto un año y sumo 12 meses para ajustar
        if(mesSol < 0){
            mesSol = mesSol +12;
            anioSol--;
        }
        //Si el dia actual es superior al dia de nacimiento, resto un mes y sumo 30 dias para ajustar
        if(diaSol < 0){
            diaSol = diaSol + 30;
            mesSol--;
        }
        
        System.out.println("Su edad exacta es de "+anioSol+" anios, "+mesSol+" meses y "+diaSol+" dias.");
    }

}
