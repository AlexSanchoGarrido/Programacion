/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio10t5;

/**
 *
 * @author Alexis Sancho
 * @since 26 nov 2026
 */
public class Ejercicio10T5 {

    /**
     * • Ejercicio 10.- Escribe un programa en JAVA, orientado a
        objetos, en el que el usuario introduzca cuatro números
        enteros y luego el programa los muestre por pantalla
        ordenados de forma creciente. (de menor a mayor)
        • Pista: Necesitarás cuatro objetos de la clase “Numero”
        con un solo atributo llamado “valor”.
     */
    
    public static void mostrarOrdenados(Numero n1, Numero n2, Numero n3, Numero n4){
        float pos1 = n1.getValor(), pos2 = n2.getValor(), pos3 = n3.getValor(), pos4 = n4.getValor(), aux =0f;
        //Hago bubble sort
        for(int i=0; i<3;i++){
            if(pos1>pos2){
                aux = pos1;
                pos1 = pos2;
                pos2 = aux;
            }
            if(pos2>pos3){
                aux = pos2;
                pos2 = pos3;
                pos3 = aux;
            }
            if(pos3>pos4){
                aux = pos3;
                pos3 = pos4;
                pos4 = aux;
            }
        }
        System.out.println("Numeros ordenados: "+pos1+" - "+pos2+" - "+pos3+" - "+pos4);
    }
    
    public static void main(String[] args) {
        // Creo 4 objetos de la clase Numero
        Numero num1 = new Numero(4f);
        Numero num2 = new Numero(14.24f);
        Numero num3 = new Numero(654.78f);
        Numero num4 = new Numero(1.78f);
        
        mostrarOrdenados(num1, num2, num3, num4);
    }

}
