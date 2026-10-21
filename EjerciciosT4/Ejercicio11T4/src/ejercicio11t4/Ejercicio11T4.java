/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11t4;

import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 21 oct 2026
 */
public class Ejercicio11T4 {

    /**
     * • Ejercicio 11.- Crea un programa que calcule la raíz cuadrada del número
     * que introduzca el usuario. (Utiliza el método Math.sqrt() ) • Si el
     * usuario introduce un número negativo, debemos mostrarle un mensaje de
     * error y volver a pedírselo (tantas veces como sea necesario). • La
     * petición del número lo haremos en un método, el cálculo de la raíz
     * cuadrada en otro, y mostraremos el resultado en otro método.
     */
    public static float pedirNumero() {
        //Declaro el Scanner
        Scanner input = new Scanner(System.in);
        float num = 0;
        //Solicito que introduzca el numero y lo devuelvo
        System.out.print("Introduzca un numero: ");
        num = input.nextFloat();
        while (num < 0) {
            System.out.print("Error! El numero introducido debe ser positivo\nIntroduzca el numero de nuevo: ");
            num = input.nextFloat();
        }
        return num;
    }

    public static float calcularRaiz(float num) {
        return (float) Math.sqrt(num);
    }

    public static void mostrarResultado(float num) {
        System.out.println("La raiz cuadrada del numero introducido es: " + num);
    }

    public static void main(String[] args) {
        //Hago la peticion del numero en el metodo pedirNumero(), el resultado
        //lo introduzco como argumento en la llamada a calcularRaiz(), y la raiz
        //que me devuelve la mando a mostrar el resultado
        mostrarResultado(calcularRaiz(pedirNumero()));
    }

}
