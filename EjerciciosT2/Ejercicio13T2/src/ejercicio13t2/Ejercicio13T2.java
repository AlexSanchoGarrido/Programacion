/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13t2;

/**
 *
 * @author Alexis Sancho Garrido
 * @since 18.09.2026
 */
public class Ejercicio13T2 {

    /**
     * • Ejercicio 13.-
        “¿Recuerdas la prueba de agilidad mental de los dos vasos? El vaso A tiene líquido azul y B líquido rojo. ¿Como pasarías
        el liquido de un vaso a otro de forma que el vaso A se quede con líquido rojo y el B con líquido azul.?”
        • Realiza un programa en el que tengas dos variables de tipo entero, num1 que
        contiene un 1 y num2 que contiene un 2. ¿Cómo pasarías el contenido de una
        variable a otra de forma que num1 contenga el 2 y num2 contenga el 1?
        • Muestra por pantalla el resultado de la siguiente forma:
        La variable num1 contiene el valor 1 y la variable num2 contiene el valor 2.
        Ahora, la variable num1 contiene el valor 2 y la variable num2 contiene el valor 1.
     */
    public static void main(String[] args) {
        //Declaro e inicializo las variables
        int num1 = 1;
        int num2 = 2;
        int aux;
        
        //Muestro por pantalla el contenido inicial
        System.out.println("La variable num1 contiene el valor "+num1+" y la variable num2 contiene el valor "+num2);
        //Intercambio el valor de las variables haciendo uso de aux
        aux = num1;
        num1 = num2;
        num2 = aux;
        //Muestro por pantalla el contenido final
        System.out.println("Ahora, la variable num1 contiene el valor "+num1+" y la variable num2 contiene el valor "+num2);
    }
    
}
