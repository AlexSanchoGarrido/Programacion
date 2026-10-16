/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04t4;

/**
 *
 * @author Alexis Sancho
 * @since 16 oct 2026
 */
public class Metodos {

    public static void mostrarMenor(float n1, float n2, float n3) {
        float menor = n1;
        //Calculo el menor de los tres
        if (n2 < menor) {
            menor = n2;
        }
        if (n3 < menor) {
            menor = n3;
        }
        //Muestro el resultado
        System.out.println("El numero menor de los introducidos es el: " + menor);
    }
}
