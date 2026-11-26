/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11t5;

import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 26 nov 2026
 */
public class Test {

    /**
     * • Ejercicio 11.- Realiza un programa en JAVA, ORIENTADO A OBJETOS, en el
     * que le solicites al usuario 2 números y, si el primer número introducido
     * es mayor que 10, se multipliquen, y en caso contrario que se sumen. Se le
     * mostrará al usuario la operación realizada y su resultado. • Necesitarás
     * una clase “Numero” (con un único atributo llamado “valor”), y una clase
     * Test. En esta última crea dos objetos con el constructor por defecto.
     * Luego, le pides al usuario los valores y se los asignas a los objetos. •
     * En la clase Test también habrá un método para sumar, otro para
     * multiplicar y otro para pedir los valores al usuario.
     */

    public static float pedirNumero() {
        //Creo un objeto de tipo Scanner para capturar la entrada
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        return input.nextFloat();
    }

    public static void sumar(Numero n1, Numero n2) {
        System.out.println("El resultado de la suma de " + n1.getValor() + " y " + n2.getValor() + " es " + n1.getValor() + n2.getValor());
    }

    public static void multiplicar(Numero n1, Numero n2) {
        System.out.println("El resultado de la multiplicacion de " + n1.getValor() + " y " + n2.getValor() + " es " + n1.getValor() * n2.getValor());
    }

    public static void main(String[] args) {
        // Creo dos objetos de tipo numero
        Numero num1 = new Numero();
        Numero num2 = new Numero();

        //Solicito al usuario que les de valor, y se lo paso al metodo setValor de Numero
        System.out.println("PRIMER NUMERO:");
        num1.setValor(pedirNumero());
        System.out.println("SEGUNDO NUMERO:");
        num2.setValor(pedirNumero());

        //Opero dependiendo del valor
        if (num1.getValor() > 10) {
            multiplicar(num1, num2);
        } else {
            sumar(num1, num2);
        }
    }
}
