/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13t4;

import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 26 oct 2026
 */
public class Ejercicio13T4 {

    /**
     * • Ejercicio 13.- Realiza un algoritmo que imprima todos los números
     * existentes entre el número 1 y otro introducido por el usuario. •
     * Controla que el usuario te meta un número mayor que 1 y, sino, avísale
     * del error y vuélveselo a pedir las veces que hagan falta. (hasta que
     * introduzca un número mayor que 1) • Crea un método para pedir el número
     * al usuario, otro de tipo booleano para comprobar que el número es mayor
     * que 1 y otro para mostrar el resultado.
     */
    public static int pedirNumero() {
        //Creo un objeto Scanner para solicitar entrada de teclado
        Scanner input = new Scanner(System.in);
        //Solicito al usuario que introduzca un numero
        System.out.print("Introduzca un numero: ");
        //Devuelvo el numero introducido
        return input.nextInt();
    }

    public static boolean esMayorQueUno(int n) {
        return n > 1;
    }

    public static void mostrarNumerosUnoN(int n) {
        System.out.println("Los numeros entre 1 y " + n + " son:");
        //Muestro los numeros entre 1 y N
        for (int i = 2; i < n; i++) {
            System.out.print(i + " - ");
        }
    }

    public static void main(String[] args) {
        // Declaro las variables
        int num = 0;

        num = pedirNumero();
        while (!esMayorQueUno(num)) {
            System.out.println("Error! El numero introducido debe ser mayor que uno");
            num = pedirNumero();
        }
        //Metodo para mostrar los resultados entre el numero 1 y N
        mostrarNumerosUnoN(num);

    }

}
