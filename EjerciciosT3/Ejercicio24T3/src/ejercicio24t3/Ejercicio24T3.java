/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio24t3;
import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 9 oct 2026
 */
public class Ejercicio24T3 {

    /**
     * • Ejercicio 24.- Crea un programa en JAVA que que imprima todos
        los números múltiplos de 3 que existen entre el número 1 y otro
        número introducido por el usuario.
        • Controla que el usuario te meta un número mayor que 0 y, sino,
        avísale del error y vuélveselo al pedir las veces que hagan falta.
        • Por último infórmale al usuario del total de números mostrados.
     */
    public static void main(String[] args) {
        // Declaro las variables
        int num;
        Scanner input = new Scanner(System.in);
        int i, multiplosTres = 0;
        
        //Solicito que introduzca un numero
        System.out.print("Introduzca un numero: ");
        do{
            //Asigno la entrada del teclado a la variable num
            num = input.nextInt();
            //Compruebo que el numero es <1 para mostrar error por pantalla
            if(num < 1)
                System.out.print("Error. Introduzca un numero mayor que 1: ");
        }while(num < 1);
        //Muestro por pantalla los numeros multiplos de 3 entre 1 y num
        System.out.println("Numeros multiplos de 3 entre 1 y "+num+":");
        //Empiezo en 3 (ya que no hay multiplo antes si es entre 1 y num) y voy mostrando sus multiplos sumando 3
        for(i = 3;i < num; i+=3){
            System.out.println(i);
            //Aumento la variable que cuenta el numero de multiplos
            multiplosTres++;
        }
        //Muestro el numero total de multiplos
        System.out.println("Total de numeros mostrados: "+multiplosTres);
    }

}
