/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejercicio12t5;

import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 26 nov 2026
 */
public class Test {
    /**
     * • Ejercicio 12.- Escribe un programa en JAVA orientado a objetos, en
        el que se le pida al usuario que introduzca la longitud de los catetos
        de un triángulo rectángulo y que posteriormente el programa
        calcule la longitud de la hipotenusa.
        • Para ello necesitarás una clase Triangulo con 2 atributos: cateto1,
        cateto2.
        • En una clase Test crearás un objeto de la clase Triangulo donde el
        tamaño de los catetos se los pedirás al usuario para pasárselos al
        constructor. En esta clase también tendrás un método que calcule
        la hipotenusa y otro método se encargará de mostrar los resultados
        por la pantalla.
     */
    
    public static float hipotenusa(Triangulo t){
        return (float)Math.sqrt(Math.pow(t.getCateto1(), 2) + Math.pow(t.getCateto2(), 2));
    }
    
    public static void mostrarResultados(Triangulo t1, float hip){
        System.out.println("La hipotenusa de un triangulo de lados "+t1.getCateto1()+" y "+t1.getCateto2()+" es "+hip);
    }
    
    public static void main(String[] args) {
        // Declaro las variables
        float c1, c2, hip;
        Scanner input = new Scanner(System.in);
        
        //Solicito al usuario los datos de los catetos
        System.out.print("Introduzca el valor del cateto 1: ");
        c1 = input.nextFloat();
        System.out.print("Introduzca el valor del cateto 2: ");
        c2 = input.nextFloat();
        
        //Creo el objeto de la clase Triangulo con el constructor parametrizado
        Triangulo t1 = new Triangulo(c1, c2);
        
        //Calculo la hipotenusa
        hip = hipotenusa(t1);
        
        //Mostrar resultados
        mostrarResultados(t1, hip);
    }
}
