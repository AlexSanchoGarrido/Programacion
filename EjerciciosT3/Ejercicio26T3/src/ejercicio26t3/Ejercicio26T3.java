/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio26t3;

/**
 *
 * @author Alexis Sancho
 * @since 9 oct 2026
 */
public class Ejercicio26T3 {

    /**
     * • Ejercicio 26.- Diseña un programa en JAVA que te diga la
        suma total de los números impares existentes entre el 111
        y el 222.
     */
    public static void main(String[] args) {
        //Declaro las variables
        int i;
        int sum=0;
        
        //Recorro desde 112 hasta 221
        for(i=112; i < 222; i++){
            if(i % 2 != 0){
                sum+=i;
            }
        }
        //Muestro por pantalla el resultado
        System.out.println("La suma total de numeros impares entre 111 y 222 es: "+sum);
        
    }

}
