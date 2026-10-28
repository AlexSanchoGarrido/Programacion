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
        //Creo un objeto Scanner para capturar la entrada del usuario
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca una letra: ");
        char letraIntroducida = input.nextLine().charAt(0);
        //Esas funciones del objeto input de la clase Scanner devuelven
        //el primer char introducido por teclado. Con este bucle compruebo 
        //que sea una letra de a-z y sino sigue pidiendo entrada.
        if((int)letraIntroducida < 97 || (int)letraIntroducida > 122){
            System.out.println("El caracter introducido no es una letra.");
            System.out.print("Ingrese de nuevo un caracter: ");
            letraIntroducida = input.nextLine().charAt(0);
        }
        return letraIntroducida;
    }

    public static boolean aciertaLetra(int asciiLetraIn, int asciiLetraAl) {
        return asciiLetraIn == asciiLetraAl;
    }

    public static void mostrarMayorOMenor(int asciiLetraIn, int asciiLetraAl) {
        //Muestro en función de la diferencia de posicion entre los caracteres ASCII
        if (asciiLetraIn > asciiLetraAl) {
            System.out.println("Letra erronea! - La letra a adivinar se encuentra antes en el abecedario.");
        } else {
            System.out.println("Letra erronea! - La letra a adivinar se encuentra despues en el abecedario.");
        }
    }

    public static void mostrarResultados(char asciiLetraAl, int intentos) {
        System.out.println("--------------------------------------");
        System.out.println("ENHORABUENA! Ha ganada el juego!");
        System.out.println("La letra a adivinar era \"" + asciiLetraAl + "\" y le ha tomado una cantidad de " + intentos + " intentos adivinarlo.");
        System.out.println("--------------------------------------");
    }

    public static void mostrarCabecera() {
        System.out.println("""
                           --------------------------------------
                           Bienvenido al juego ADIVINAR UNA LETRA
                           --------------------------------------
                            """);
    }

    public static void main(String[] args) {
        //
        Random numRandom = new Random();
        //En la funcion nextInt() el primer argumento implica el origen inclusive
        //y el segundo el fin exclusive
        int asciiLetraAleatoria = numRandom.nextInt(97, 123);
        //Variables para la letra introducida, sun numero ASCII y los intentos
        char letraIntroducida;
        int asciiLetraIntroducida;
        int intentos = 1;
        //Funcion para mostrar la cabecera del juego
        mostrarCabecera();
        //Solicito introducir la letra por primera vez
        letraIntroducida = pedirLetra();
        asciiLetraIntroducida = (int) letraIntroducida;
        //Mientras no se acierte la letra (comprobado en el metodo aciertaLetra()
        //seguimos iterando
        while (!aciertaLetra(asciiLetraIntroducida, asciiLetraAleatoria)) {
            //Funcion mostrarMayorOMenor() que informa al usuario sobre su situacion
            mostrarMayorOMenor(asciiLetraIntroducida, asciiLetraAleatoria);
            //Volvemos a solicitar otra letra y a traducirla a ASCII
            letraIntroducida = pedirLetra();
            asciiLetraIntroducida = (int) letraIntroducida;
            //Aumentamos los intentos para mostrarlos al final del programa
            intentos++;
        }
        mostrarResultados((char) asciiLetraAleatoria, intentos);
    }

}
