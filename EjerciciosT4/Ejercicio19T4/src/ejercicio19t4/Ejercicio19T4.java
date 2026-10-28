/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio19t4;

import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 28 oct 2026
 */
public class Ejercicio19T4 {

    /**
     * • Ejercicio 19.- Escribe un programa que lea un día de la
        semana que introduzca el usuario (Lunes, Martes,
        Miércoles, Jueves, Viernes, Sábado o Domingo) y, según
        sea su valor, escriba en pantalla su posición en la
        semana.
        • Ejemplo de ejecución:

        Por favor, introduzca un día de la semana: Miércoles

        El Miércoles es el tercer día de la semana
     */
    
    public static String pedirDiaSemana(){
        //Declaro el objeto Scanner para capturar la entrada
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca un dia de la semana: ");
        //Devuelvo la cadena de texto introducida
        return input.nextLine();
    }
    
    public static void mostrarPosicionDiaSemana(String diaSemana){
        //Variable posicion para solo hacer un sout
        String posicion = "";
        //Paso el string introducido todo a minusculas
        String diaSemanaMinus = diaSemana.toLowerCase();
        switch(diaSemanaMinus){
            case "lunes":
                posicion = "primer";
                break;
            case "martes":
                posicion = "segundo";
                break;
            case "miercoles":
                posicion = "tercer";
                break;
            case "jueves":
                posicion = "cuarto";
                break;
            case "viernes":
                posicion = "quinto";
                break;
            case "sabado":
                posicion = "sexto";
                break;
            case "domingo":
                posicion = "septimo";
                break;
            default://Error, el texto introducido no es un dia de la semana
                System.out.println("Error! Debe introducir el nombre de un dia de la semana");
        }//Muestro los resultados
        System.out.println("El "+diaSemana+" es el "+posicion+" dia de la semana");
    }
    
    public static void main(String[] args) {
        // Hago uso del metodo mostrarPosicionDiaSemana() que informa al usuario
        //de la posicion del dia de la semana que se pasa como string en argumentos
        //a este metodo le envio pedirDiaSemana() que pide y devuelve String
        mostrarPosicionDiaSemana(pedirDiaSemana());
    }

}
