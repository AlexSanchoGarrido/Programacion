/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio08t3;

import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 
 */
public class Ejercicio08T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaro las variables
        int numBilletes50, numBilletes20, numBilletes10, numBilletes5, numMonedas2, numMonedas1;
        int cantidadInicial, cantidadRestante;
        
        Scanner input = new Scanner(System.in);

        //Pido que introduzca la cantidad:
        System.out.print("Por favor, indique una cantidad de dinero: ");
        cantidadInicial = input.nextInt();
        
        //Compruebo que la cantidad no es negativa ni cero
        if(cantidadInicial <= 0)
            System.out.println(cantidadInicial+" euros no se pueden descomponer en billetes ni monedas.");
        //En el caso que sea una cantidad positiva
        else{
            cantidadRestante = cantidadInicial;

            //Calculo la cantidad de billetes y monedas de cada tipo
            numBilletes50 = cantidadRestante / 50;
            cantidadRestante = cantidadRestante % 50;

            numBilletes20 = cantidadRestante / 20;
            cantidadRestante = cantidadRestante % 20;

            numBilletes10 = cantidadRestante / 10;
            cantidadRestante = cantidadRestante % 10;

            numBilletes5 = cantidadRestante / 5;
            cantidadRestante = cantidadRestante % 5;

            numMonedas2 = cantidadRestante / 2;
            cantidadRestante = cantidadRestante % 2;

            numMonedas1 = cantidadRestante;
            
            //Muestro por pantalla el resultado
            System.out.println(cantidadInicial+" Euros se descomponen en ");
            if(numBilletes50>0)
                System.out.println(numBilletes50+" billete(s) de 50 Euros,");
            if(numBilletes20>0)
                System.out.println(numBilletes20+" billete(s) de 20 Euros");
            if(numBilletes10>0)
                System.out.println(numBilletes10+" billete(s) de 10 Euros");
            if(numBilletes5>0)
                System.out.println(numBilletes5+" billete(s) de 5 Euros");
            if(numMonedas2>0)
                System.out.println(numMonedas2+" moneda(s) de 2 Euros");
            if(numMonedas1>0)
                System.out.println(numMonedas1+" moneda(s) de 1 Euro");
        }
    }

}
