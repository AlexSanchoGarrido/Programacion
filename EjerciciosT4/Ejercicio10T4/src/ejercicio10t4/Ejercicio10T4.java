/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10t4;

import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 21 oct 2026
 */
public class Ejercicio10T4 {

    /**
     * • Ejercicio 10.- Escribe un programa en JAVA que, utilizando bucles,
     * imprima la tabla de multiplicar de un número que elija el usuario. El
     * número se pedirá en un método y la tabla de multiplicar se escribirá en
     * otro.
     */
    public static void mostrarTablaMultiplicar(int num) {
        System.out.println("La tabla de multiplicar de " + num + ":");
        for (int i = 0; i < 11; i++) {
            System.out.println(num + "x" + i + " = " + (num * i));
        }
    }

    public static int pedirNumero() {
        //Declaro el scanner
        Scanner input = new Scanner(System.in);
        //Solicito que introduzca el numero y lo devuelvo
        System.out.print("Introduzca un numero: ");
        return input.nextInt();
    }

    public static void main(String[] args) {
        //Hago uso del metodo pedirNumero para solicitar un numero
        //y el resultado lo envio al metodo para mostar la tabla de multiplicar
        mostrarTablaMultiplicar(pedirNumero());
    }

}
