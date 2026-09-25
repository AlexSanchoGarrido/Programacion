/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaentradas;
import java.util.concurrent.TimeUnit;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class PruebaEntradas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        
        System.out.println("Calculador de edad" );
        System.out.println("Introduce tu edad");
        num = entrada.nextInt();
        System.out.print("Pensando..");
        for(int i=0;i<4;i++){
            try {
                TimeUnit.SECONDS.sleep(1); // Pausa el hilo actual durante 3 segundos
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("El hilo fue interrumpido.");
            }
            System.out.print("..");
        }
        System.out.println("\n");
        
        System.out.println("Tienes "+num+" anios :)");
    }
    
}
