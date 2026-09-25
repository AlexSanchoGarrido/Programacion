/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32t2;
import java.util.Scanner;

/**
 *
 * @author Alexis Sancho Garrido
 * @since 25.09.2026
 */
public class Ejercicio32T2 {

    /**
     * • Ejercicio 32.- Realiza un programa que dado un importe en
        euros nos indique número óptimo de billetes de 50, 20, 10 y
        5, así como la cantidad sobrante en monedas de 2 y de 1
        euro.

        • Por ejemplo:

        Por favor, indique una cantidad de dinero: 232

        232 Euros se descomponen en 4 billetes de 50, 1 billetes de 20, 1 billetes de

        10, 0 billetes de 5, 1 monedas de 2 euros y 0 monedas de 1 euro.
     */
    public static void main(String[] args) {
        //Declaro las variables
        int numBilletes50, numBilletes20, numBilletes10, numBilletes5, numMonedas2, numMonedas1;
        int cantidadInicial, cantidadRestante;
        Scanner input = new Scanner(System.in);
        
        //Pido que introduzca la cantidad:
        System.out.print("Por favor, indique una cantidad de dinero: ");
        cantidadInicial = input.nextInt();
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
        System.out.println(cantidadInicial+" Euros se descomponen en "+numBilletes50+" billete(s) de 50 Euros,\n"
                            +numBilletes20+" billete(s) de 20 Euros, "+numBilletes10+" billete(s) de 10 Euros,\n"
                            +numBilletes5+" billete(s) de 5 Euros, "+numMonedas2+" moneda(s) de 2 Euros\n"
                            +"y "+numMonedas1+" moneda(s) de 1 Euro.");
    }
    
}
