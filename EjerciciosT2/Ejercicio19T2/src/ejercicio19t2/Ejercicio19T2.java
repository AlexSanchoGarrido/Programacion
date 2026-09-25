/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19t2;

/**
 *
 * @author Alexis Sancho Garrido
 * @since 18.09.2026
 */
public class Ejercicio19T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 3, b = 6, c;
        c = a / b;
        System.out.println("El valor de c es: " + c );
        System.out.println("---------------------------");
        
        c = a % b;
        System.out.println("El valor de c es: " + c );
        System.out.println("---------------------------");
        
        a++;
        System.out.println("El valor de a es: " + a );
        System.out.println("---------------------------");
        
        ++a;
        System.out.println("El valor de a es: " + a );
        System.out.println("---------------------------");
        
        c = ++a + b++;
        System.out.println("El valor de a es: " + a );
        System.out.println("El valor de b es: " + b );
        System.out.println("El valor de c es: " + c );
        System.out.println("---------------------------");
        
        c = ++a + ++b;
        System.out.println("El valor de a es: " + a );
        System.out.println("El valor de b es: " + b );
        System.out.println("El valor de c es: " + c );
    }
    
}
