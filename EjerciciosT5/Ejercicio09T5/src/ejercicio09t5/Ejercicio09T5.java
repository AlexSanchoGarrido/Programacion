/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09t5;

/**
 *
 * @author Alexis Sancho
 * @since 26 nov 2026
 */
public class Ejercicio09T5 {

    /**
     * • Ejercicio 09.- Realiza un programa en JAVA, ORIENTADO A OBJETOS, que
     * lea tres números e imprima por pantalla el mayor de ellos. • Realiza el
     * ejercicio a tu gusto, con los métodos que consideres necesarios (cuantos
     * más mejor). • Pista: Necesitarás crear 3 objetos de una clase “Numero”
     * con un atributo llamado “valor”.
     */
    public static float mayor(Numero num1, Numero num2, Numero num3) {
        float n1 = num1.getValor();
        float n2 = num2.getValor();
        float n3 = num3.getValor();
        float mayor = n1;
        if (n2 > mayor) {
            mayor = n2;
        }
        if (n3 > mayor) {
            mayor = n3;
        }
        return mayor;
    }

    public static void main(String[] args) {
        //Declaro 3 objetos de la clase Numero
        Numero num1 = new Numero(10.3f);
        Numero num2 = new Numero(3f);
        Numero num3 = new Numero(14.6f);
        float numMayor = 0;

        //Compruebo cual es el mayor de los 3
        numMayor = mayor(num1, num2, num3);
        System.out.println("El numero mayor es:" + numMayor);
    }

}
