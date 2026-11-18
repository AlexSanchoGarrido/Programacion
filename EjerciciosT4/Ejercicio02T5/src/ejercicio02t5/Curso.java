/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02t5;

/**
 *
 * @author Alexis Sancho
 * @since 18 nov 2026
 */

/*Diseña una clase Curso que contenga los siguientes atributos
privados:
• nombre (de tipo cadena)
• numeroHoras (de tipo entero)
• Además dispondrá de un atributo estático llamado numeroDeCursos de tipo
entero que lo utilizaremos para contar los objetos que vamos creando.
• La clase Curso contendrá los siguientes métodos públicos:
• establecerNombreyHoras.
• obtenerNombre.
• obtenerHoras.*/

/*Además, la clase Curso, dispondrá de dos métodos estáticos (para trabajar con el
atributo estático):
• sumarCursos
• verNumeroCursos*/
public class Curso {

    private static int numeroDeCursos = 0;

    private String nombre;
    private int numeroHoras;

    public void establecerNombreyHoras(String n, int numH){
        nombre = n;
        numeroHoras = numH;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public int obtenerHoras(){
        return numeroHoras;
    }
    
    public static void sumarCursos(int n){
        numeroDeCursos+= n;
    }
    
    public static void verNumeroCursos(){
        System.out.println("El numero de cursos es: "+numeroDeCursos);
    }
    
    //Mostrar curso y toString()
    public void mostrarCurso() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Numero de horas: " + numeroHoras);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Numero de horas: " + numeroHoras;
    }

    //Getters y setters
    public void setNomnbre(String n) {
        nombre = n;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNumeroHoras(int n) {
        numeroHoras = n;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public static void setNumeroDeCursos(int n) {
        numeroDeCursos = n;
    }

    public static int getNumeroDeCursos() {
        return numeroDeCursos;
    }
}
