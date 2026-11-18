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

/*diseña una clase Coche que contenga los siguientes atributos privados:
• marca (de tipo cadena)
• modelo (de tipo cadena)
• ruedas (objeto de tipo Rueda)
• La clase Coche contendrá los siguientes métodos públicos:
• establecerMarca
• establecerModelo.
• obtenerMarca.
• obtenerModelo.
• establecerRueda.
• obtenerRueda.*/
public class Coche {

    private String marca;
    private String modelo;
    private Rueda rueda;

    //No hago getters ni setters, son estos metodos publicos
    public void establecerMarca(String m) {
        marca = m;
    }

    public String obtenerMarca() {
        return marca;
    }

    public void establecerModelo(String m) {
        modelo = m;
    }

    public String obtenerModelo() {
        return modelo;
    }

    public void establecerRueda(Rueda r) {
        rueda = r;
    }

    public Rueda obtenerRueda() {
        return rueda;
    }

    //Creo mostrar coche y toString()
    public void mostrarCoche() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Rueda:\n   " + rueda);
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Rueda:\n   " + rueda;
    }
}
