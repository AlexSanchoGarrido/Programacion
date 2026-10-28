/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio18t4;

import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 28 oct 2026
 */
public class Ejercicio18T4 {

    /**
     * • Ejercicio 18.- Crea un programa que te pida tu nombre y
        a continuación te lo muestre 5 veces.
        • Utiliza un método para pedir el nombre y otro método
        que contenga un bucle para mostrar el nombre las cinco
        veces.
     */
    public static String pedirNombre(){
        //Declaro Scanner para capturar la entrada por teclado
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        return input.nextLine();
    }
    
    public static void mostrarStringCincoVeces(String nombre){
        //Muestro 5 veces el String
        for(int i = 0; i < 5; i++){
            System.out.println(nombre);
        }
    }
    
    public static void main(String[] args) {
        //Hago uso del metodo mostrarStringCincoVeces() para mostrar un string 5
        //veces, al que le paso como argumento el string que devuelve el metodo
        //pedirNombre()
        mostrarStringCincoVeces(pedirNombre());
    }

}
