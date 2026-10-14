/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio28t3;
import java.lang.Math;
/**
 *
 * @author Alexis Sancho
 * @since 9 oct 2026
 */
public class Ejercicio28T3 {

    /**
     * • Ejercicio 28.- Realiza un programa que genere un número
        aleatorio (utiliza Math.random() ) entre 1 y 100, que lo muestre
        por pantalla e indique si es par o impar.
        • Pistas: El método Math.random() devuelve un double aleatorio entre 0 y el 1,
        sin incluir el 1 (o sea, desde el 0 y el 0,99999). Ejemplo: double aleatorio =
        Math.random();
        • Si quisiéramos un aleatorio entre 0 y 4 (exclusivo) bastará con multiplicar por 4.
        Ejemplo: double aleatorio = (Math.random())*4;
        • Si quisiéramos un aleatorio entre 1 y 4 (exclusivo) bastará con multiplicar por 4
        y sumar 1. Ejemplo: double aleatorio = (Math.random())*4+1;
     */
    public static void main(String[] args) {
        // Declaro la variable
        int random;
        //Realizo un casteo explicito (truncado) del resultado de Math.random()*100 +1
        random = (int)(Math.random()*100 +1);
        System.out.print("El numero aleatorio generado es: "+random+" y es un numero ");
        if(random % 2 == 0)
            System.out.println("par.");
        else
            System.out.println("impar.");
    }

}
