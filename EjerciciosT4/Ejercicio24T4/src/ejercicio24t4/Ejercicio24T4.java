/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio24t4;

import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 30 oct 2026
 */
public class Ejercicio24T4 {

    /**
     * • Ejercicio 24.- Escribe un programa que contenga un
        método donde le pidamos al usuario su nombre, otro
        método donde le pidamos su edad y otro método
        llamado mayorDeEdad, que reciba la edad como entero
        por parámetro y muestre un mensaje por pantalla de si el
        usuario llamado XXX es mayor de edad o no.
     */
    
    public static String pedirNombre(){
        //Declaro un objeto de la clase Scanner para capturar la entrada
        Scanner input = new Scanner(System.in);
        //Solicito que introduzca su nombre
        System.out.print("Introduzca su nombre: ");
        //Devuelvo lo que introduce el usuario
        return input.nextLine();
    }
    
    public static int pedirEdad(){
        //Declaro un objeto de la clase Scanner para capturar la entrada
        Scanner input = new Scanner(System.in);
        //Inicializo la edad a -1 para que el bucle funcione y no de error al 
        //solicitarse dentro de un try-catch
        int edad = -1;
        do{
            //Solicito que introduzca su edad
            System.out.print("Introduzca su edad: ");
            try{
                //Capturo la instrucción sensible que solicita un INT
                edad = input.nextInt();
                //Si la edad es menor que 0 muestro error
                if(edad < 0)
                    System.out.println("Error! La edad debe ser positiva");
            }catch(Exception InputMismatchException){
                //Muestro error si no coindice con el tipo solicitado
                System.out.println("Error! Debe introducir un numero entero para la edad");
                //Limpio el buffer
                input.nextLine();
            }
        //Ocurre mientras la edad no sea positiva
        }while(edad < 0);
        //Devuelvo la edad
        return edad;
    }
    
    public static void mostrarMayorDeEdad(String nombre, int edad){
        //Si la edad es => a 18 años es mayor de edad
        if(edad > 17)
            System.out.println("El usuario llamado "+nombre+" es mayor de edad.");
        else
            System.out.println("El usuario llamado "+nombre+" NO es mayor de edad.");
    }
    
    public static void main(String[] args) {
        //Llamo al metodo para solicitar el nombre
        String nombre = pedirNombre();
        //Llamo al metodo para solicitar la edad
        int edad = pedirEdad();
        //Llamo al metodo para comprobar si X (x: nombre) es mayor de edad o no
        mostrarMayorDeEdad(nombre, edad);
    }

}
