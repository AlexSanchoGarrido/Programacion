/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio25t4;

import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 30 oct 2026
 */
public class Ejercicio25T4 {

    /**
     * • Ejercicio 25.- Escribe un programa que contenga un
        método que calcule la potencia de un número (a)
        elevado a un número (b) que se le pasan como
        párametros.
        • Controla la excepción de que el número 0 elevado a un
        número negativo es infinito.
     */
    
    public static void muestraPotencia(float base, float exponente){
        //Muestro el resultado de la potencia haciendo uso del meotodo pow() de la clase Math
        System.out.println("El resultado de la potencia "+base+"^"+exponente+" es: "+Math.pow(base, exponente));
    }
    
    public static void main(String[] args) {
        //Declaro las variables
        float base = 0;
        float exponente = 0;
        //Variable para iterar dentro del try-catch del expontente
        //En la base no hace falta porque ya itera mientras sea 0
        boolean errorEntrada = true;
        //Creo un objeto de tipo Scanner para capturar la entrada
        Scanner input = new Scanner(System.in);
        do{
            //Solicito que introduzca la base
            System.out.print("Introduzca la base: ");
            try{
                base = input.nextFloat();
                //Muestro error en el caso de que sea 0
                if(base == 0)
                    System.out.println("Error! El la base debe ser distinta de 0");
            }catch(Exception InputMismatchException){
                System.out.println("Error! Debe introducir un numero");
                input.nextLine();
            }
        //Mientras la base sea 0, sigo pidiendo y comprobando
        }while(base == 0);
        
        do{
            try{//Capturo la entrada por si introduce algo distinto a un numero
                //solicito que introduzca el exponente
                System.out.print("Introduzca el exponente: ");
                exponente = input.nextFloat();
                errorEntrada = false;
            }catch (Exception InputMismatchException){
                //Muestro mensaje de error
                System.out.println("Error! Debe introducir un numero");
                input.nextLine();
            }
        }while(errorEntrada);
        //Llamo al metodo estatico de la clase para mostrar la potencia de base elevado a exponente
        muestraPotencia(base, exponente);
    }

}
