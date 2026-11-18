/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01t5;

/**
 *
 * @author Alexis Sancho
 * @since 18 nov 2026
 */

/*Para probar el funcionamiento de la clase Coche, crea otra clase llamada
Test (dentro del mismo paquete) que contenga el método main donde se
creen dos objetos de la clase Coche: miCoche y cochePadre. Luego realiza
las siguientes operaciones:
• Establece el modelo, marca y color, primero en el objeto miCoche y luego en cochePadre.
• Arranca miCoche y luego arranca cochePadre.
• Acelera 5 veces miCoche.
• Frena 2 veces miCoche.
• Acelera 3 veces cochePadre.
• Apaga cochePadre.
• Muestra el estado de miCoche y luego el estado de cochePadre.*/
public class Test {

    public static void main(String[] args) {
        // Creo dos objetos de clase coche
        Coche miCoche = new Coche();
        Coche cochePadre = new Coche();

        //Establece el modelo, marca y color, primero en el objeto miCoche y luego en cochePadre
        miCoche.setColor("Rojo");
        miCoche.setMarca("Renault");
        miCoche.setModelo("Megane");

        cochePadre.setColor("Azul");
        cochePadre.setMarca("Peugeot");
        cochePadre.setModelo("305");

        //Arranco miCoche y cochePadre.
        miCoche.arrancarCoche();
        cochePadre.arrancarCoche();

        //Acelero 5 veces miCoche.
        for (int i = 0; i < 5; i++) {
            miCoche.acelerarCoche();
        }

        //Freno 2 veces miCoche
        for (int i = 0; i < 2; i++) {
            miCoche.frenarCoche();
        }

        //Acelero 3 veces cochePadre
        for (int i = 0; i < 3; i++) {
            cochePadre.acelerarCoche();
        }

        //Apago cochePadre
        cochePadre.apagarCoche();

        //Muestro el estado de miCoche y de cochePadre
        System.out.println("Estado de miCoche: ");
        miCoche.obtenerEstado();
        System.out.println("Estado de cochePadre: ");
        cochePadre.obtenerEstado();
    }
}
