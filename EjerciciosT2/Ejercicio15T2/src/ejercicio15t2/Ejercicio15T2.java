/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15t2;

/**
 *
 * @author Alexis Sancho Garrido
 * @since 18.09.2026
 */
public class Ejercicio15T2 {

    /**
     * Ejercicio 15.- Realiza un programa en el que tengas una
        variable entera llamada tiempo que contiene un tiempo
        en segundos igual a 10000 (diez mil). Queremos conocer
        ese tiempo, pero expresado en horas, minutos y
        segundos.
        • Muestra por pantalla el resultado de la siguiente forma:
        10.000 segundos hacen un total de: xxx horas, xxx
        minutos y xxx segundos.
     */
    public static void main(String[] args) {
        // Declaro las variables
        int tiempoEnSegundos = 10000;
        int tiempoEnMinutos, tiempoEnHoras, restoEnMinutos, restoEnSegundos;
        
        //Calculo el tiempo en horas, el resultado entero de la division de los segundos entre 3600
        //El modulo de la misma operacion devuelve el tiempo en minutos
        tiempoEnHoras = tiempoEnSegundos/3600;
        restoEnMinutos = tiempoEnSegundos%3600;
        
        //Calculo el tiempo en minutos, que es el resultado entero de dividir el módulo de la operacion anterior (minutosRestantes)
        //entre 60, y si calculo el modulo son los segundos
        tiempoEnMinutos = restoEnMinutos /60;
        restoEnSegundos = restoEnMinutos %60;
        System.out.println("10.000 segundos hacen un total de: "+tiempoEnHoras+" horas, "+tiempoEnMinutos+" minutos y "+restoEnSegundos+" segundos.");
    }
    
}
