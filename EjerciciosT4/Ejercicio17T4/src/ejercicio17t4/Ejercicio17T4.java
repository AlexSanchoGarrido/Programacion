/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17t4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 26 oct 2026
 */
public class Ejercicio17T4 {

    /**
     * • Ejercicio 17.- Escribe un programa que juegue con el usuario a adivinar
     * una letra minúscula. El ordenador debe generar una letra aleatoria entre
     * a y z, y el usuario tiene que intentar adivinarla. • Para ello, cada vez
     * que el usuario introduce un valor el ordenador debe decirle al usuario si
     * la letra que tiene que adivinar está antes o después en el alfabeto. •
     * Cuando consiga adivinarlo debe indicárselo e imprimir en pantalla el
     * número de intentos que el usuario ha necesitado para adivinar el número.
     * Recuerda utilizar subprogramas. • Pistas: • El códigoASCII de la a es el
     * 97, y el de la z es el 122. • Para capturar el char que introduzca el
     * usuario, utiliza: char letra=entrada.nextLine().charAt(0);
     */
    public static char pedirLetra() {
        Scanner input = new Scanner(System.in);
        try {
            return input.nextLine().charAt(0);
        } catch (Exception MismatchException) {
            System.out.println("Error! Debe introducir una letra!");
            return pedirLetra();
        }

    }

    public static void main(String[] args) {
        //
        Random numRandom = new Random();
        //En la funcion nextInt() el primer argumento implica el origen inclusive
        //y el segundo el fin exclusive
        int asciiLetraAleatoria = numRandom.nextInt(97, 123);
        char letraIntroducida;
        System.out.println("Bienvenido al juego ADIVINAR UNA LETRA");
        letraIntroducida = pedirLetra();
    }

}
