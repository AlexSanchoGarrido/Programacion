/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08t5;

import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 23 nov 2026
 */

/*
    Ejercicio 08.- Realiza un programa en JAVA, orientado a
        objetos, en el que crees una clase llamada Numero que
        contendrá un único atributo privado, llamado valor, de tipo
        entero.
        • Para probar el funcionamiento de la clase Numero, crea una
        nueva clase llamada Test donde le pidas al usuario un
        número por teclado. Luego, crea un objeto, siendo el
        número introducido por el usuario el valor del atributo valor.
        Posteriormente, le pasarás el objeto a un método que le dirá
        al usuario si el número introducido es par o impar.
 */
public class Test {

    public static int pedirNumero() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        return input.nextInt();
    }
    
    public static void esPar(Numero num){
        if(num.getValor() % 2 == 0)
            System.out.println(num.getValor()+" es un numero par.");
        else
            System.out.println(num.getValor()+" es un numero impar.");
    }

    public static void main(String[] args) {
        // Creo el objeto pidiendole al usuario que introduzca el numero
        Numero num = new Numero(pedirNumero());
        esPar(num);
        
    }
}
