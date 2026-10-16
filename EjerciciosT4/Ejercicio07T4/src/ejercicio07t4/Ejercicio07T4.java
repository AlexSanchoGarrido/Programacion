/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07t4;

import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 16 oct 2026
 */
public class Ejercicio07T4 {

    /**
     * • Ejercicio 07.- Escribe un programa en JAVA en el que el usuario
     * introduzca cuatro números enteros (en el main), y que se los pase a un
     * método que los muestre por pantalla ordenados de forma creciente (de
     * menor a mayor). • En el caso de que veas que hay un conjunto de
     * sentencias que se repiten,
     *
     * UTILIZA BUCLES • Muestra por pantalla el resultado de la siguiente forma:
     *
     * Por favor, introduzca el primer numero: 8 Ahora, introduzca un segundo
     * numero: 5 Introduzca el tercer numero: 9
     *
     * Por último, introduzca un cuarto numero: 1 El orden de los números
     * introducidos es el 1 - 5 - 8 - 9
     */
    public static void bubbleSort(float n1, float n2, float n3, float n4) {
        //Declaro las posiciones y las inicializo con los valores de los datos introducidos
        float pos1 = n1, pos2 = n2, pos3 = n3, pos4 = n4, aux;
        //Repito mientras no este ordenado
        while (pos1 > pos2 || pos2 > pos3 || pos3 > pos4) {
            if (pos1 > pos2) { //Si la pos1 > pos2, intercambio
                aux = pos1;
                pos1 = pos2;
                pos2 = aux;
            }
            if (pos2 > pos3) {  //Si la pos2 > pos3, intercambio
                aux = pos2;
                pos2 = pos3;
                pos3 = aux;
            }
            if (pos3 > pos4) {  //Si la pos3 > pos4, intercambio
                aux = pos3;
                pos3 = pos4;
                pos4 = aux;
            }
        }
        //Muestro por pantalla el resultado
        System.out.println("El orden de los numeros introducidos es: " + pos1 + " - " + pos2 + " - " + pos3 + " - " + pos4);
    }

    public static void main(String[] args) {
        //Declaro las variables
        float num1 = 0f, num2 = 0f, num3 = 0f, num4 = 0f;
        Scanner input = new Scanner(System.in);

        //Solicito al usuario que introduzca los numeros
        System.out.print("Introduzca el primer numero: ");
        num1 = input.nextFloat();
        System.out.print("Introduzca el segundo numero: ");
        num2 = input.nextFloat();
        System.out.print("Introduzca el tercer numero: ");
        num3 = input.nextFloat();
        System.out.print("Introduzca el cuarto numero: ");
        num4 = input.nextFloat();

        //Llamo al metodo estatico bubbleSort de la clase Ordenacion
        bubbleSort(num1, num2, num3, num4);

    }

}
