/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04t2;

/**
 *
 * @author Alexis Sancho Garrido
 * @since 16.09.2026
 */
public class Ejercicio04T2 {
    
    /*
    Realiza un programa en JAVA que escriba
por pantalla el nombre de una asignatura, la nota del
primer examen, la nota del segundo examen y la nota
media de la asignatura. Para ello deberás, previamente,
almacenar las notas en variables que sean del tipo más
óptimo posible (aprovechando la memoria).
    */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaro las variables
        float nota1, nota2, media;
        
        //Inicializo las variables con las notas y calculo la media
        nota1 = 8.4f;
        nota2 = 9.8f;
        media = (nota1 + nota2) / 2;
        
        //Muestro por pantalla el resultado del calculo de la media
        System.out.println("Notas y media de la asignatura de PROGRAMACION 1:");
        System.out.println("Nota del primer examen: "+nota1);
        System.out.println("Nota del segundo examen: "+nota2);
        System.out.println("Nota media de la asignatura: "+media);
    }
    
}
