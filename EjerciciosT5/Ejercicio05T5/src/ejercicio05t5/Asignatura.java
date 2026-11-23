/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejercicio05t5;

/**
 *
 * @author Alexis Sancho
 * @since 18 nov 2026
 */
/*• Ejercicio 05.- Realiza un programa en JAVA en el que le pidas al usuario las notas de las 6 asignaturas del
Ciclo de DAM y te calcule la nota media del curso.
• o Asignatura 1: Cada una de las asignaturas serán un objeto cuyos atributos serán el nombre y la nota.
• o Asignatura 2: Crea un constructor con el que puedas asignar directamente el nombre de la asignatura al crear el
objeto. En cambio, el atributo nota, será el usuario quien lo introduzca mediante un método al que se le
pase la nota como argumento.
• o Asignatura 3: Crea otro método que reciba las 6 notas como argumentos y devuelva la nota media (return)
• o Ejemplo de ejecución:

Por favor, introduzca la nota de Programación: 6,5
Introduzca la nota de Lenguajes de Marcas: 7,5
Introduzca la nota de Bases de Datos: 7,5
Introduzca la nota de Entornos de Desarrollo: 8
Introduzca la nota de Sistemas Informáticos: 6,5

Por último, introduzca la nota de Formación y Orientación Laboral: 6

Su nota media del curso es de: 7*/
public class Asignatura {
    private String nombre;
    private float nota;
    
    // Constructor al que le pasamos el nombre
    public Asignatura(String n){
        this.nombre = n;
        this.nota = 0.0f;
    }
    
    //Metodo para media
    public static float obtenerMedia(float n1, float n2, float n3, float n4, float n5, float n6, float n7){
        float numAsignaturas = 7;
        return (n1+n2+n3+n4+n5+n6+n7)/numAsignaturas;
    }
    
    public void ponerNota(float n){
        setNota(n);
    }

    //Setters y getters
    public String getNombre() {
        return nombre;
    }

    public float getNota() {
        return nota;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public void setNota(float n) {
        nota = n;
    }
    
    
}
