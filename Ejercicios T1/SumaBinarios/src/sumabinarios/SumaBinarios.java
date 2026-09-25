/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumabinarios;

/**
 *
 * @author Alexis Sancho Garrido
 * @since 21.09.2026
 */
public class SumaBinarios {

    /**
     * Programa para traducir numeros a binario y realizar su suma
     */
    public static void main(String[] args) {
        int numDec1= 10;
        int numDec2 = 10;
        int numBin1=0;
        int bit4 = numDec1 / 8;
        numDec1 = numDec1 % 8;
        numBin1+=1000;
        int bit3 = numDec1 / 4;
        numDec1 = numDec1 % 4;
        numBin1+=100;
        int bit2 = numDec1 / 2;
        numDec1 = numDec1 % 2;
        numBin1+=10;
        int bit1 = numDec1 / 1;
        numBin1+=1;
        System.out.println("Numero bin 1: "+numBin1);
    }
    
}
