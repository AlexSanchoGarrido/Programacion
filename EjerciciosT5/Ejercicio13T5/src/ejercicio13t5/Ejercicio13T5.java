/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio13t5;

/**
 *
 * @author Alexis Sancho
 * @since 26 nov 2026
 */
public class Ejercicio13T5 {

    /**
     * • Ejercicio 13.- Crea un programa JAVA orientado a
        objetos que, utilizando bucles, escriba "Hola, que tal"
        cinco veces. Para ello tendrás una clase “Saludo” con un
        atributo “frase” de tipo String.
        • Realiza el ejercicio a tu gusto, con los métodos que
        consideres necesarios (cuantos más mejor). Intenta que
        el método main sea pequeño.
     */
    public static void main(String[] args) {
        // Creo un objeto de la clase saludo
        Saludo s = new Saludo("Hola, que tal");
        s.saludar5veces();
    }

}
