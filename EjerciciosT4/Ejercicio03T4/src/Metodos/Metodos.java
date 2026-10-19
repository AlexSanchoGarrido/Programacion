/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

/**
 *
 * @author alumno
 */
public class Metodos {

    public static void mostrarMayor(float n1, float n2, float n3) {
        float mayor = n1;
        //Calculo el mayor de los tres
        if (n2 > mayor) {
            mayor = n2;
        }
        if (n3 > mayor) {
            mayor = n3;
        }
        //Muestro el resultado
        System.out.println("El numero mayor de los introducidos es el: " + mayor);
    }

}
