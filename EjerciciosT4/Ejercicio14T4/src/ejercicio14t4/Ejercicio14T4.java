/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14t4;

import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 26 oct 2026
 */
public class Ejercicio14T4 {

    /**
     * • Ejercicio 14.- Crea un programa en JAVA que que imprima todos los
     * números múltiplos de 3 que existen entre el número 1 y otro número
     * introducido por el usuario. • Controla que el usuario te meta un número
     * mayor que 0 y, sino, avísale del error y vuélveselo al pedir las veces
     * que hagan falta. • Por último infórmale al usuario del total de números
     * mostrados. • Crea un método para pedir el dato al usuario, otro para
     * comprobar que es mayor que 0 y otro para hacer los cálculos y mostrar el
     * resultado.
     */
    public static int pedirNumero() {
        //Declaro un objeto scanner para capturar la entrada
        Scanner input = new Scanner(System.in);
        int num = 0;
        System.out.print("Introduzca un numero: ");
        return input.nextInt();
    }

    public static boolean esMayorQueCero(int n) {
        return n > 0;
    }

    public static void mostrarMultTresDe1aN(int n) {
        System.out.println("Los numeros multiplos de 3 entre 1 y " + n + " son:");
        int numerosMostrados = 0;
        for (int i = 0; i < n; i = i + 3) {
            System.out.println(i + " - ");
            numerosMostrados++;
        }
        System.out.println("La cantidad de numeros mostrados es: "+numerosMostrados);
    }

    public static void main(String[] args) {
        // Declaro las variables
        int num = 0;
        boolean esMayorQueCero = false;
        
        do{
            //Llamo a la funcion pedir numero
            num = pedirNumero();
            //Compruebo si el numero es mayor que cero
            esMayorQueCero = esMayorQueCero(num);
            if(!esMayorQueCero) //Si no es mayor que cero, informo al usuario
                System.out.println("El numero a introducir debe ser positivo");
        }while(!esMayorQueCero);
        
        mostrarMultTresDe1aN(num);
    }

}
