/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22t2;
import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 23.09.2026
 */
public class Ejercicio22T2 {

    /**
     * Ejercicio 22.- Diseña un programa que solicite al usuario
        el tamaño del lado de un triángulo equilátero, y calcule
        su perímetro y su área.
        • Muestra por pantalla el resultado de la siguiente forma:
        Por favor, introduzca la medida de un lado: XXXXX
        El área de un triángulo de lado: xxx es: xxx
        El perímetro de un triángulo de lado: xxx es: xxx
     */
    public static void main(String[] args) {
        //Declaro las variables
        int lado, altura, perimetro, area;
        Scanner input = new Scanner(System.in);
        
        //Pido el input de los datos
        System.out.print("Por favor, introduzca la medida de un lado: ");
        lado = input.nextInt();
        System.out.print("Por favor, introduzca la medida de la altura: ");
        altura = input.nextInt();
        
        //Calculo perimetro y area
        perimetro = 3 * lado;
        area = lado * altura / 2;
        
        //Muestro el resultado por pantalla
        System.out.println("El area de un triangulo de lado "+lado+" y altura "+altura+" es "+area);
        System.out.println("El perimetro de un triangulo de lado "+lado+" es "+perimetro);
    }
    
}
