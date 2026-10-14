/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio25t3;

/**
 *
 * @author Alexis Sancho
 * @since 9 oct 2026
 */
public class Ejercicio25T3 {

    /**
     * • Ejercicio 25.- Escribe un programa en JAVA que te diga la
        suma total de los números pares existentes entre el
        número 17 y el número 139.
     */
    public static void main(String[] args) {
        //Declaro las variables
        int sum = 0;
        int i;
        
        //Recorro desde 17 hasta 138
        for(i=18; i < 139; i++){
            //Si es par, aumento la variable sum el valor de i
            if(i % 2 == 0)
                sum+=i;
        }
        //Muestro por pantalla el resultado
        System.out.println("La suma total de numeros pares entre 17 y 139 es: "+sum);
        
    }

}
