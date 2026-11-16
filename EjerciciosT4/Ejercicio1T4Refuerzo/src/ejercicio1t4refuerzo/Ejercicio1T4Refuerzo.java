/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio1t4refuerzo;

import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 16 nov 2026
 */
public class Ejercicio1T4Refuerzo {

    /**
     * Ejercicio 1.- Escribe un programa que verifique si una palabra es un
     * palíndromo, es decir, si se lee igual de izquierda a derecha que de
     * derecha a izquierda. • Crea un método para pedir la palabra al usuario y
     * otro que devuelva si la palabra es un palíndromo o no. • Ejemplo de
     * ejecución: Por favor, introduzca una palabra: anilina La palabra
     * introducida es un palíndromo.

     */
    public static void main(String[] args) {
        // Declaro las variables
        System.out.println("COMPROBADOR DE PALINDROMOS:");
        System.out.println("Introduzca una palabra");
        Scanner input = new Scanner(System.in);
        String entrada;
        boolean sonIguales = true;
        int i = 0;
        int j;
        int longitudPalabra;
        do{
            entrada = input.nextLine();
            if(entrada.isEmpty())
                System.out.println("Error! Debe introducir una palabra NO vacia");
            else{
                longitudPalabra = entrada.length();
                j = --longitudPalabra;
                while(i < longitudPalabra/2 && sonIguales){
                    if(entrada.charAt(i) != entrada.charAt(j))
                        sonIguales = false;
                    i++;
                    j--;
                }
            }
        }while(entrada.isEmpty());
        if(sonIguales)
            System.out.println("La palabra SI es un PALINDROMO");
        else
            System.out.println("La palabra NO es un PALINDROMO");
    }

}
