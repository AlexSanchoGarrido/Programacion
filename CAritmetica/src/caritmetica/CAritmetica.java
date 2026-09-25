/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caritmetica;

/**
 *
 * @author Alexis Sancho Garrido
 * @since 14 sept 2026
 */
public class CAritmetica {

    public static void main(String[] args) {
        int dato1; //Variable entera dato 1
        int dato2, resultado; //Dos variables enteras, dato2 y resultado
        
        dato1= 20; //Asigno valores a las variables
        dato2= 10;
        
        //Suma
        resultado = dato1 + dato2; //Sumo el valor de dato1 y dato2 y lo almaceno en resultado
        System.out.println(dato1 + " + " + dato2 + " = " + resultado); //Lo muestro por salida estandar
        
        //resta
        resultado = dato1 - dato2; //Resto el valor de dato1 y dato2 y lo almaceno en resultado
        System.out.println(dato1 + " - " + dato2 + " = " + resultado); //Lo muestro por salida estandar
        
        //Producto
        resultado = dato1 * dato2; //Multiplico el valor de dato1 y dato2 y lo almaceno en resultado
        System.out.println(dato1 + " * " + dato2 + " = " + resultado); //Lo muestro por salida estandar
        
        //Cociente
        resultado = dato1 / dato2; //Divido el valor de dato1 y dato2 y lo almaceno en resultado
        System.out.println(dato1 + " / " + dato2 + " = " + resultado); //Lo muestro por salida estandar
    }
    
}
