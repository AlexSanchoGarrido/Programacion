/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio16t4;

/**
 *
 * @author Alexis Sancho
 * @since 26 oct 2026
 */
public class Ejercicio16T4 {

    /**
     * • Ejercicio 16.- Crea un programa en JAVA que calcule las siguientes operaciones y
        muestre su resultado:
        • Raíz cuadrada de 64.
        • 8 elevado al cubo.
        • Exponencial de 2.
        • Logaritmo de 2,71828.
        • Menor valor entre 2 y 3.
        • Valor absoluto de -4,5.
        • Redondeando -4,5 con ROUND.
        • Seno de 45 grados.
        • IMPORTANTE: Cada operación se realizará en un subprograma.
     */
    public static void raizCuadrada(double n){
        System.out.println("La raiz cuadrada de "+n+" es: "+Math.sqrt(n));
    }
    
    public static void elevadoAlcubo(double n){
        System.out.println(n+" elevado al cubo es: "+Math.pow(n, 3));
    }
    
    public static void exponencial(double n){
        System.out.println("El exponencial de "+n+" es: "+Math.exp(n));
    }
    
    public static void logaritmo(double n){
        System.out.println("El logaritmo de "+n+" es: "+Math.log(n));
    }
    
    public static void menorEntreNyM(double n1, double n2){
        System.out.println("El numero mentro entre "+n1+" y "+n2+" es: "+Math.min(n1, n2));
    }
    
    public static void valorAbsoluto(double n){
        System.out.println("El valor absoluto de "+n+" es: "+Math.abs(n));
    }
    
    public static void redondeo(double n){
        System.out.println("El resultado de redondear "+n+" es: "+Math.round(n));
    }
    
    public static void seno(double n){
        System.out.println("El seno de "+n+" es "+Math.sin(n));
    }
    
    public static void main(String[] args) {
        raizCuadrada(64);
        elevadoAlcubo(8);
        exponencial(2);
        logaritmo(2.71828);
        menorEntreNyM(2, 3);
        valorAbsoluto(-4.5);
        seno(45);
    }

}
