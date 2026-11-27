/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14t5;
import java.util.Scanner;

/**
 *
 * @author kai
 */
public class Ejercicio14T5 {

    /**
     * • Ejercicio 14.- Realiza un programa que, utilizando bucles,
        imprima la tabla de multiplicar de un número que elija el
        usuario.
        • Utiliza el constructor por defecto. Luego llama a un método
        que asignará al atributo “valor” de la clase “Numero” el
        número que elija el usuario.
        • Realiza el ejercicio a tu gusto, con los métodos que
        consideres necesarios (cuantos más mejor). Intenta que el
        método main sea pequeño.
     */
    
    public static int pedirValor(){
        Scanner input = new Scanner(System.in);
        System.out.print("Introduza un numero: ");
        return input.nextInt();
    }
    
    public static void main(String[] args) {
        // Creo un objeto de tipo Numero
        Numero num1 = new Numero();
        
        //Asigno al numero su valor que le pido al usuario
        num1.asignarValorANumero(pedirValor());
        
        //Llamo al metodo que muestra la tabla de multiplicar
        num1.mostrarTablaMultiplicar();
    }
    
}
