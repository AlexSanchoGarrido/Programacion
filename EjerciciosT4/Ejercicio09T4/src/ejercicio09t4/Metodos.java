/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio09t4;

import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 21 oct 2026
 */
public class Metodos {

    public static float pedirNumero() {
        //Creo el Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        return input.nextFloat();
    }

    public static float devuelveMenor(float n1, float n2, float n3) {
        float menor = n1;
        //Calculo el menor de los tres
        if (n2 < menor) {
            menor = n2;
        }
        if (n3 < menor) {
            menor = n3;
        }
        //Devuelvo el menor
        return menor;
    }
}
