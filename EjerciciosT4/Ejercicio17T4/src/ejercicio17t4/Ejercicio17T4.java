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
        System.out.print("Introduzca una letra: ");
        return input.nextLine().charAt(0);
    }

    public static boolean aciertaLetra(int asciiLetraIn, int asciiLetraAl) {
        return asciiLetraIn == asciiLetraAl;
    }

    public static void mostrarMayorOMenor(int asciiLetraIn, int asciiLetraAl) {
        if (asciiLetraIn > asciiLetraAl) {
            System.out.println("Letra erronea! La letra a adivinar se encuentra antes en el abecedario.");
        } else {
            System.out.println("Letra erronea! La letra a adivinar se encuentra despues en el abecedario.");
        }
    }

    public static void mostrarResultados(char asciiLetraAl, int intentos) {
        System.out.println("ENHORABUENA! Ha ganada el juego!");
        System.out.println("La letra a adivinar era \"" + asciiLetraAl + "\" y le ha tomado una cantidad de " + intentos + " intentos adivinarlo.");
    }

    public static void main(String[] args) {
        //
        Random numRandom = new Random();
        //En la funcion nextInt() el primer argumento implica el origen inclusive
        //y el segundo el fin exclusive
        int asciiLetraAleatoria = numRandom.nextInt(97, 123);
        char letraIntroducida;
        int asciiLetraIntroducida;
        int intentos = 1;
        System.out.println("""
                           --------------------------------------
                           Bienvenido al juego ADIVINAR UNA LETRA
                           --------------------------------------
                            """);
        letraIntroducida = pedirLetra();
        asciiLetraIntroducida = (int) letraIntroducida;
        while (!aciertaLetra(asciiLetraIntroducida, asciiLetraAleatoria)) {
            mostrarMayorOMenor(asciiLetraIntroducida, asciiLetraAleatoria);
            System.out.print("Letra erronea!");
            letraIntroducida = pedirLetra();
            asciiLetraIntroducida = (int) letraIntroducida;
            intentos++;
        }
        mostrarResultados((char) asciiLetraAleatoria, intentos);
    }

}
