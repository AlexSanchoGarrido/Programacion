/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio16t3;

/**
 *
 * @author Alexis Sancho
 * @since 02.10.2026
 */
public class Ejercicio16T3 {

    /**
     * • Ejercicio 16.- Crea un programa que imprima los números
        impares que existen entre los números 20 y el 160.
        Además, al final, nos dirá cuantos impares ha imprimido en
        total por pantalla.
        • Ejemplo:
        Los números impares existentes entre el número 20 y el 160 son: 21

        – 23 – 25 – 27 – 29 – 31 - ...

        La cantidad de números impares impresos han sido: XXX
     */
    public static void main(String[] args) {
        // Declaro las variables
        int i;
        int cantidadImpares = 0;
        System.out.println("Los numeros impares existentes entre el numero 20 y el 60 son: ");
        //Itero desde el numero 20 al 160
        for(i=20; i < 161; i++){
            //Compruebo si es impar
            if(i % 2 != 0){
                System.out.print("- "+i);
                //Aumento la variable que contiene la cantidad de numeros impares
                cantidadImpares++;
            
            }
        }
        System.out.println("\nLa cantidad de numeros impares impresos han sido: "+cantidadImpares);
    }

}
