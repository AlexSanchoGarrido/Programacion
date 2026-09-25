/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21t2;

import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 23.09.2026
 */
public class Ejercicio21T2 {

    /**
     * • Ejercicio 21.- Implementa un programa que solicite al
        usuario una cantidad en segundos y la convierta a días,
        horas, minutos y segundos.
        • Muestra por pantalla el resultado de la siguiente forma:
        Por favor, introduzca un número de segundos:
        XXXXXXX

        xxx segundos hacen un total de : xxx días, xxx horas, xxx minutos y
        xxx segundos.
     */
    public static void main(String[] args) {
        // Declaro las variables
        int tiempoEnSegundos;
        int tiempoEnMinutos, tiempoEnHoras, tiempoEnDias, segundosRestantes;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Por favor, introduzca un numero de segundos: ");
        tiempoEnSegundos = input.nextInt();
        
        //Calculo el tiempo en horas, el resultado entero de la division de los segundos entre 3600
        //El modulo de la misma operacion devuelve el tiempo en minutos
        tiempoEnDias = tiempoEnSegundos/86400;
        segundosRestantes = tiempoEnSegundos%86400;
        
        //Calculo las horas con los segundos restantes:
        tiempoEnHoras = segundosRestantes / 3600;
        segundosRestantes = segundosRestantes % 3600;
        
        //Calculo el tiempo en minutos, que es el resultado entero de dividir el módulo de la operacion anterior (minutosRestantes)
        //entre 60, y si calculo el modulo son los segundos
        tiempoEnMinutos = segundosRestantes /60;
        segundosRestantes = segundosRestantes %60;
        System.out.println(tiempoEnSegundos+" segundos hacen un total de: "+tiempoEnDias+" dias, "+tiempoEnHoras+
                " horas, "+tiempoEnMinutos+" minutos y\n "+segundosRestantes+" segundos");
    }
    
}
