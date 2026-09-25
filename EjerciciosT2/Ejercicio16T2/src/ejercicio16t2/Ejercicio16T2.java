/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16t2;

/**
 *
 * @author Alexis Sancho Garrido
 * @since 18.09.2026
 */
public class Ejercicio16T2 {

    /**
     * • Ejercicio 16.- Suponemos que llevas en tu cartera 130
        euros en billetes de 50 euros y de 10 euros. Realiza un
        programa que sea capaz de decirte cuantos billetes de
        cada.

        • Muestra por pantalla el resultado de la siguiente forma:
        130 euros hacen un total de: 2 billetes de 50 euros y 3 billetes de
        10 euros.
     */
    public static void main(String[] args) {
        //Declaro las variables
        int cantidadInicial = 130;
        int numBilletes50, numBilletes10, cantidadRestante;
        
        //Calculo la cantidad de billetes de 50, y el resto lo divido entre el valor de los billetes de 10
        numBilletes50 = cantidadInicial / 50;
        cantidadRestante = cantidadInicial % 50;
        numBilletes10 = cantidadRestante / 10;
        //Muestro el resultado por pantalla
        System.out.println(cantidadInicial+" euros hacen un total de: "+numBilletes50+" billetes de 50 euros"
                + " y "+numBilletes10+" billetes de 10 euros.");
    }
    
}
