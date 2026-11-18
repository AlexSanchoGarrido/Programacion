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

/*• Ejercicio 03.- Diseña una clase Rueda que contenga los
siguientes atributos privados:
• material (de tipo cadena)
• pulgadas (de tipo entero)
• La clase Rueda contendrá los siguientes métodos públicos:
• establecerMaterial
• establecerPulgadas.
• obtenerMaterial.
• obtenerPulgadas.*/
public class Rueda {

    private String material;
    private int pulgadas;

    //Metodos publicos
    public void establecerMaterial(String m) {
        material = m;
    }

    public String obtenerMaterial() {
        return material;
    }

    public void establecerPulgadas(int p) {
        pulgadas = p;
    }

    public int obtenerPulgadas() {
        return pulgadas;
    }

    //Mostrar rueda y toString()
    public void mostrarRueda() {
        System.out.println("Material: " + material);
        System.out.println("Pulgadas: " + pulgadas);
    }

    @Override
    public String toString() {
        return "Material: " + material + ", Pulgadas: " + pulgadas;
    }

    //Getters / setters
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String m) {
        material = m;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int p) {
        pulgadas = p;
    }
}
