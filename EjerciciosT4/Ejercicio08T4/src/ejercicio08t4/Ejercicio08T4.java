/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08t4;

import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 16 oct 2026
 */
public class Ejercicio08T4 {

    /**
     * • Ejercicio 08.- Realiza un programa que dado un importe en euros (en el
     * main) se los pase a un método que nos indique número óptimo de billetes
     * de 50, 20, 10 y 5, así como la cantidad sobrante en monedas de 2 y de 1
     * euro. En caso de que NO haya billetes/monedas de algún tipo NO se
     * mostrarán. • Por ejemplo:
     *
     * Por favor, indique una cantidad de dinero: 232
     *
     * 232 Euros se descomponen en:
     *
     * Billetes de 50: 4 Billetes de 20: 1 Billetes de 10: 1 Monedas de 2 euros:
     * 1
     */
    public static void desgloseDinero(int cant) {
        //Calculo la cantidad de billetes y monedas de cada tipo
        int numBilletes50, numBilletes20, numBilletes10, numBilletes5, numMonedas2, numMonedas1;
        int cantidadRestante = cant;

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
        System.out.println(cant + " Euros se descomponen en ");
        if (numBilletes50 > 0) {
            System.out.println(numBilletes50 + " billete(s) de 50 Euros,");
        }
        if (numBilletes20 > 0) {
            System.out.println(numBilletes20 + " billete(s) de 20 Euros");
        }
        if (numBilletes10 > 0) {
            System.out.println(numBilletes10 + " billete(s) de 10 Euros");
        }
        if (numBilletes5 > 0) {
            System.out.println(numBilletes5 + " billete(s) de 5 Euros");
        }
        if (numMonedas2 > 0) {
            System.out.println(numMonedas2 + " moneda(s) de 2 Euros");
        }
        if (numMonedas1 > 0) {
            System.out.println(numMonedas1 + " moneda(s) de 1 Euro");
        }
    }

    public static void main(String[] args) {
        //Declaro las variables
        int cantidad;
        Scanner input = new Scanner(System.in);
        //Solicito que introduzca la cantidad
        System.out.print("Introduzca una cantidad de dinero: ");
        cantidad = input.nextInt();

        //Llamo al metodo estatico desgloseDinero de la clase Metodos
        desgloseDinero(cantidad);

    }

}
