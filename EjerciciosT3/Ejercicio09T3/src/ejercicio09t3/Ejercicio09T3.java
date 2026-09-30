/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio09t3;

import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 
 */
public class Ejercicio09T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaro las variables
        int num1, num2, num3, num4;
        int aux;
        Scanner input = new Scanner(System.in);
        
        //Pido al usuario que introduzca los numeros:
        System.out.print("Introduzca el primer numero: ");
        num1 = input.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        num2 = input.nextInt();
        System.out.print("Introduzca el tercer numero: ");
        num3 = input.nextInt();
        System.out.print("Introduzca el cuarto numero: ");
        num4 = input.nextInt();
        
        //Con 4 posiciones tengo que hacer 3 iteraciones maximo para ordenarlos
        //Uso una variable auxiliar para intercambiar los valores entre variables
        if(num1>num2){
            aux = num1;
            num1 = num2;
            num2 = aux;
        }if(num2>num3){
            aux = num2;
            num2 = num3;
            num3 = aux;
        }if(num3>num4){
            aux = num3;
            num3 = num4;
            num4 = aux;
        }
        
        //Compruebo si esta ordenado, sino iteracion 2
        if(num1 > num2 || num2 > num3 || num3 > num4){
            if(num1>num2){
            aux = num1;
            num1 = num2;
            num2 = aux;
            }if(num2>num3){
                aux = num2;
                num2 = num3;
                num3 = aux;
            }if(num3>num4){
                aux = num3;
                num3 = num4;
                num4 = aux;
            }
        }
        
        //Compruebo si esta ordenado, sino iteracion 3
        if(num1 > num2 || num2 > num3 || num3 > num4){
            if(num1>num2){
            aux = num1;
            num1 = num2;
            num2 = aux;
            }if(num2>num3){
                aux = num2;
                num2 = num3;
                num3 = aux;
            }if(num3>num4){
                aux = num3;
                num3 = num4;
                num4 = aux;
            }
        }
            
        System.out.println("El orden de los numeros introducidos es "+num1+" - "+num2+" - "+num3+" - "+num4);
            
    }

}
