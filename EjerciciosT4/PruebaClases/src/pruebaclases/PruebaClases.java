/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaclases;

/**
 *
 * @author Alexis Sancho
 * @since 16 nov 2026
 */
public class PruebaClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crearemos unos propietarios
        Propietario p1 = new Propietario();
        p1.setEdad(15);
        p1.setNombre("Sergio");
        
        Propietario p2 = new Propietario();
        p2.setEdad(30);
        p2.setNombre("Alvaro");

        //Vamos a trabajar con la clase Bicicleta
        Bicicleta bici1 = new Bicicleta();
        bici1.setAnios(11);
        bici1.setMarca("Orbea");
        bici1.setTalla("L");
        bici1.setColor("Roja");
        bici1.setPropietario(p1);
        
        Bicicleta bici2 = new Bicicleta();
        bici2.setAnios(5);
        bici2.setMarca("Merida");
        bici2.setTalla("XL");
        bici2.setColor("Azul");
        bici2.setPropietario(p2);
        
        //Mostrar bicicletas
        System.out.println("Mostrar bici1 con mostrar:");
        bici1.mostrarBicicleta();
        System.out.println("Mostrar bici1 con toString");
        System.out.println(bici1.toString());
        bici1.mostrarAntiguedad();
        
        System.out.println("La bicicleta bici2 es:");
        bici1.mostrarBicicleta();
        System.out.println("Mostrar bici2 con toString");
        System.out.println(bici2.toString());
        bici1.mostrarAntiguedad();
        
        //Mostrar el color de la bicicleta
        System.out.println("Color de la bici1: "+bici1.getColor());
        
        //Cambiar la talla de bici 2
        bici2.setTalla("M");
    }

}
