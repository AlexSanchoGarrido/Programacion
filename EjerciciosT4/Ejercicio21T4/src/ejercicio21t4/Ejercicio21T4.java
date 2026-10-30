/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio21t4;

import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 29 oct 2026
 */
public class Ejercicio21T4 {

    /**
     * • Ejercicio 21.- Desarrolla un programa que, a partir de dos
        números que nos introduzca el usuario, muestre en pantalla
        la suma total de todos los números pares comprendidos
        entre ambos.
        • Utiliza 2 métodos distintos para pedir los datos al usuario, ya
        que en el segundo método deberás comprobar que el
        usuario te mete un número mayor que el primero (y sino se
        lo vuelves a pedir)
        • Utiliza también otro método que muestre el resultado a
        partir de los números recibidos.
     */
    
    public static int pideNumeroUno(){
        //Declaro e incializo un objeto Scanner para capturar la entrada
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca un primer numero: ");
        return input.nextInt();
    }
    
    public static int pideNumeroDos(int num1){
        //Declaro e incializo un objeto Scanner para capturar la entrada
        Scanner input = new Scanner(System.in);
        int num2;
        do{
            System.out.print("Introduzca un segundo numero: ");
            num2 = input.nextInt();
            if(num2 <= num1)    //En el caso en que num2 <= num1, muestro error
                System.out.println("Error! El segundo numero debe ser mayor que el primero introducido");
        }while(num2 <= num1); //Mientras que num2 <= num1
        return num2;
    }
    
    public static void muestraNumerosParesEntre(int num1, int num2){
        System.out.println("Los numeros pares entre "+num1+" y "+num2+" son:");
        for(int i = ++num1; i < num2; i++){
            if(i % 2 == 0)
                System.out.println(i+" - ");
        }
    }
    
    public static void main(String[] args) {
        //Declaro las variables
        int num1, num2;
        num1 = pideNumeroUno();
        num2 = pideNumeroDos(num1);
        //Llamo al metodo para mostrar numeros pares entre num1 y num2
        muestraNumerosParesEntre(num1, num2);
    }

}
