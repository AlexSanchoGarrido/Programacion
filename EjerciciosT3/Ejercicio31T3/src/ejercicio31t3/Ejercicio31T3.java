/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio31t3;
import java.lang.Math;

/**
 *
 * @author Alexis Sancho
 * @since 9 oct 2026
 */
public class Ejercicio31T3 {

    /**
     * • Ejercicio 31.- Desarrolla un programa que genere números
        enteros aleatorios entre 1 y 100 hasta obtener 3 números
        impares.
        • Al final del programa nos mostrará los tres números
        impares generados y la cantidad de valores aleatorios que
        han sido necesarios generar hasta obtener los 3 números
        impares.
     */
    public static void main(String[] args) {
        // Declaro las variables
        int random;
        int cantidadImpares = 0;
        int cantidadGenerados = 0;
        //Mientras el impar 3 este sin asignar
        while(cantidadImpares < 3){
            //Genero un numero aleatorio
            random = (int)(Math.random()*100 +1);
            cantidadGenerados++;
            //Si es impar y el primero no esta asignado
            if(random % 2 != 0){
                System.out.println("Numero impar generado: "+random);
                cantidadImpares++;
            }
        }
        //Muestro los resultados por pantalla
        System.out.println("Cantidad de numeros generados: "+cantidadGenerados);
    }

}
