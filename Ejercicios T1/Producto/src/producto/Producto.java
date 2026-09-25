/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package producto;

/**
 *
 * @author Alexis Sancho Garrido
 * @since 16.09.2026
 */
public class Producto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion de las variables
        float numero1 = 0.5f;
        long numero2;
        float resultado;
        numero2 = 178823419991L;
        
        //Computo del resultado
        resultado = numero1 * numero2;
        
        //Mostrar por pantalla el resultado
        System.out.println("El resultado de multiplicar "+numero1+" y "+numero2+" es igual a "+resultado);
        //El error estaba en meter "numero2" dentro de la cadena donde lo trata como texto literal y no como variable
    }
    
}
