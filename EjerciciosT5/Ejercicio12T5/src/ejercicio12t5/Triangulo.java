/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejercicio12t5;

/**
 *
 * @author Alexis Sancho
 * @since 26 nov 2026
 */
public class Triangulo {
    private float cateto1;
    private float cateto2;

    //Constructor por defecto
    public Triangulo(){
        cateto1 = 0f;
        cateto2 = 0f;
    }
    
    //Constructor parametrizado
    public Triangulo (float c1, float c2){
        cateto1 = c1;
        cateto2 = c2;
    }
    
    public float hipotenusa(){
        return (float)Math.sqrt(Math.pow(this.getCateto1(), 2) + Math.pow(this.getCateto2(), 2));
    }
    
    public void mostrarHipotenusa() {
        System.out.println("La hipotenusa del triangulo de lados " + this.getCateto1() + " y " + this.getCateto2() + " es " + this.hipotenusa());
    }
    
    //Getters y setters
    public float getCateto1() {
        return cateto1;
    }

    public void setCateto1(float cateto1) {
        this.cateto1 = cateto1;
    }

    public void setCateto2(float cateto2) {
        this.cateto2 = cateto2;
    }

    public float getCateto2() {
        return cateto2;
    }
}
