/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09t4;

/**
 *
 * @author Alexis Sancho
 * @since 21 oct 2026
 */
public class Ejercicio09T4 {

    /**
     * • Ejercicio 09.- Escribir un algoritmo en JAVA que pida tres números
     * (utiliza un método) y se los pase a otro método que los imprima por
     * pantalla el menor de ellos. ESTOS MÉTODOS ESTARÁN EN UNA CLASE DISTINTA
     * DEL MISMO PAQUETE.
     */
    public static void main(String[] args) {
        //Declaro las variables
        float num1, num2, num3;

        //Llamo al metodo estatico de la clase Metodos para solicitar
        //que introduzca las variables
        num1 = Metodos.pedirNumero();
        num2 = Metodos.pedirNumero();
        num3 = Metodos.pedirNumero();

        //Llamo al metodo estatico de la clase Metodos para calcular el menor
        //y lo muestro
        System.out.println("El numero menor es: " + Metodos.devuelveMenor(num1, num2, num3));

    }

}
