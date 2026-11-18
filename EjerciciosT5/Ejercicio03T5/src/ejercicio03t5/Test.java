/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03t5;

/**
 *
 * @author Alexis Sancho
 * @since 18 nov 2026
 */
public class Test {

    /*Para probar el funcionamiento de las clases creadas, crea otra clase
llamada Test (dentro del mismo paquete) que contenga el método
main, donde:
• Se creen 2 objetos de la clase Rueda: rueda1 y rueda2.
• Establece el material y el tamaño, primero en el objeto rueda1 y luego en rueda2.
• Muestra los datos (material y tamaño) de las dos ruedas creados.
• Crea 3 objetos de la clase Coche: coche1, coche2 y coche3.
• Establece la marca y el modelo de los 3 coches.
• Establece las ruedas1 para el coche1 y el coche2, y ruedas2 para el coche3.
• Muestra los datos de los coches creados (marca, modelo, material de su rueda y
tamaño de su rueda.*/
    public static void main(String[] args) {
        //Creo 2 objetos de la clase Rueda
        Rueda rueda1 = new Rueda();
        Rueda rueda2 = new Rueda();

        //Establezco el material y el tamaño en ambas ruedas
        rueda1.establecerMaterial("Caucho natural");
        rueda1.establecerPulgadas(30);
        rueda2.establecerMaterial("Caucho sintetico");
        rueda2.establecerPulgadas(36);

        //Muestro los datos de las dos ruedas:
        System.out.println("Datos sobre rueda1: ");
        rueda1.mostrarRueda();
        rueda2.mostrarRueda();

        //Creo tres objetos de la clase coche
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        Coche coche3 = new Coche();

        //Establezco la marca y modelo de los 3 coches
        coche1.establecerMarca("Renault");
        coche1.establecerModelo("Scenic");
        coche2.establecerMarca("Opel");
        coche2.establecerModelo("Astra");
        coche3.establecerMarca("Dacia");
        coche3.establecerModelo("Duster");

        //Establezco las ruedas1 para el coche1 y el coche2, y ruedas2 para el coche3
        coche1.establecerRueda(rueda1);
        coche2.establecerRueda(rueda1);
        coche3.establecerRueda(rueda2);

        //Muestro los datos de los coches creados (marca, modelo, material de su rueda y tamaño de su rueda
        System.out.println("Datos del coche 1: ");
        coche1.mostrarCoche();
        System.out.println("Datos del coche 2: ");
        coche2.mostrarCoche();
        System.out.println("Datos del coche 3: ");
        coche3.mostrarCoche();
    }
}
