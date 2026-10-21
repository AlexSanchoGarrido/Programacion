/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12t4;

import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 21 oct 2026
 */
public class Ejercicio12T4 {

    /**
     * • Ejercicio 12.- Realiza un programa que le pida una contraseña al
     * usuario. Si la escribe bien le dará la enhorabuena, pero si la escribe
     * mal 3 veces le dará un mensaje de error de acceso. • La petición de
     * contraseña la haremos en un método, la comprobación de la contraseña la
     * haremos en otro método de tipo booleano, y el resultado de la
     * comprobación la haremos desde otro método.
     */
    final static int PASS = 1234;

    public static int pideContrasenia() {
        //Declaro el scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce una contrasenia: ");
        return input.nextInt();

    }

    public static boolean esCorrectaContrasenia(int pass) {
        return pass == PASS;
    }

    public static void esContrasenia() {
        int intentos = 0;
        while (intentos < 3 || !esCorrectaContrasenia(pideContrasenia())) {
            System.out.println("Error! Contrasenia incorrecta");
        }
    }

    public static void main(String[] args) {
        //
        esContrasenia();
    }

}
