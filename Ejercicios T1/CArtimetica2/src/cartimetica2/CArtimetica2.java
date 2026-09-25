/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cartimetica2;

/**
 *
 * @author Alexis Sancho
 * @since 14 sept 2026
 */
public class CArtimetica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dato1; //Variable entera dato 1
        int dato2, dato3, resultado; //Dos variables enteras, dato2 y resultado
        
        dato1= 20; //Asigno valores a las variables
        dato2= 10;
        dato3=5;
        
        //Suma
        resultado = dato1 + dato2 +dato3; //Sumo el valor de dato1, dato2 y dato 3 y lo almaceno en resultado
        //Lo muestro por salida estandar
        System.out.println("Suma:");
        System.out.println(dato1 + " + " + dato2 + " + " + dato3 + " = " + resultado+"\n"); 
        
        //Resta
        resultado = dato1 - dato2 -dato3; //Resto el valor de dato1, dato2 y dato 3 y lo almaceno en resultado
        //Lo muestro por salida estandar
        System.out.println("Resta:");
        System.out.println(dato1 + " - " + dato2 + " - " + dato3 + " = " + resultado+"\n");
        
        //Multiplicacion
        resultado = dato1 * dato2 *dato3; //Multiplico el valor de dato1, dato2 y dato 3 y lo almaceno en resultado
        //Lo muestro por salida estandar
        System.out.println("Multiplicacion:");
        System.out.println(dato1 + " * " + dato2 + " * " + dato3 + " = " + resultado+"\n");
        
        //Cociente
        resultado = dato1 / dato2 / dato3; //Divido el valor de dato1, dato2 y dato 3 y lo almaceno en resultado
        //Lo muestro por salida estandar
        System.out.println("Cociente:");
        System.out.println(dato1 + " / " + dato2 + " / " + dato3 + " = " + resultado+"\n");
    }
    
}
