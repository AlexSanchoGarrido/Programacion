/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio27t3;

import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 9 oct 2026
 */
public class Ejercicio27T3 {

    /**
     * • Ejercicio 27.- Diseña un programa en JAVA que pida al usuario dos números por teclado. Posteriormente el programa mostrará un menú que le permitirá al usuario:
        • 1.- Sumar los números.
        • 2.- Restar los números.
        • 3.- Multiplicar los números.
        • 4.- Dividir los números.
        • 5.- Salir del programa.
        • Nota1: Mientras el usuario no pulse 5, el programa no termina y el menú volverá a
        aparecer pidiendo nuevamente que le introduzcas una opción.
        • Nota 2: Controla el caso de división entre 0 mediante la captura de excepciones.
     */
    public static void main(String[] args) {
        // Declaro las variables
        int menu = 0;
        int num1, num2;
        Scanner input = new Scanner(System.in);
        
        // Solicito al usuario introducir los numeros 
        System.out.print("Introduzca el primer numero: ");
        num1 = input.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        num2 = input.nextInt();
        
        //Creo el switch case con bucle do while para el menu y las opciones
        do{
            //Muestro el menu
            System.out.println("""
                               1.- Sumar los numeros.
                               2.- Restar los numeros.
                               3.- Multiplicar los numeros.
                               4.- Dividir los numeros.
                               5.- Salir del programa.
                               """);
            //Solicito que introduzca una opcion para el menu
            System.out.print("Introduzca una opcion: ");
            menu = input.nextInt();
            
            switch(menu){
                case 1: //Caso de suma
                    System.out.println("El resultado de "+num1+" + "+num2+" es: "+(num1+num2));
                    System.out.println("---------------------------------------------");
                    break;
                case 2: //Caso de resta
                    System.out.println("El resultado de "+num1+" - "+num2+" es: "+(num1-num2));
                    System.out.println("---------------------------------------------");
                    break;
                case 3: //Caso de multiplicacion
                    System.out.println("El resultado de "+num1+" * "+num2+" es: "+(num1*num2));
                    System.out.println("---------------------------------------------");
                    break;
                case 4: //Caso de division
                    //Atrapo la operacion conflictiva de num/0
                    try{
                        System.out.println("El resultado de "+num1+" / "+num2+" es: "+(num1/num2));
                        System.out.println("---------------------------------------------");
                    //Muestro mensaje de error si ocurre num/0
                    }catch(ArithmeticException e){ 
                        System.out.println("Error! Imposible dividir entre 0");
                        System.out.println("---------------------------------------------");
                    }
                    break;
                case 5: //Caso fin de programa
                    System.out.println("Fin del programa.");
                    System.out.println("---------------------------------------------");
                    break;
                default: //No existe opcion
                    System.out.println("Error. La opcion introducida no existe");
                    System.out.println("---------------------------------------------");
            }
        }while(menu != 5);
    }

}
