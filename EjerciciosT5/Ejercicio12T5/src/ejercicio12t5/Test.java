/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12t5;

import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 26 nov 2026
 */
public class Test {

    /**
     * • Ejercicio 12.- Escribe un programa en JAVA orientado a objetos, en el
     * que se le pida al usuario que introduzca la longitud de los catetos de un
     * triángulo rectángulo y que posteriormente el programa calcule la longitud
     * de la hipotenusa. • Para ello necesitarás una clase Triangulo con 2
     * atributos: cateto1, cateto2. • En una clase Test crearás un objeto de la
     * clase Triangulo donde el tamaño de los catetos se los pedirás al usuario
     * para pasárselos al constructor. En esta clase también tendrás un método
     * que calcule la hipotenusa y otro método se encargará de mostrar los
     * resultados por la pantalla.
     */
    public static Float pedirValor() {
        //Creo un objeto de la clase Scanner para capturar la entrada
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca el valor: ");
        return input.nextFloat();
    }

    public static void main(String[] args) {
        // Declaro las variables
        float c1 = 0f, c2 = 0f;

        //Solicito al usuario los datos de los catetos
        for (int i = 1; i < 3; i++) {
            System.out.print("Cateto " + i+" - ");
            if (i == 1) {
                c1 = pedirValor();
            } else {
                c2 = pedirValor();
            }
        }

        //Creo el objeto de la clase Triangulo con el constructor parametrizado
        Triangulo t1 = new Triangulo(c1, c2);

        //Mostrar resultados
        t1.mostrarHipotenusa();
    }
}
