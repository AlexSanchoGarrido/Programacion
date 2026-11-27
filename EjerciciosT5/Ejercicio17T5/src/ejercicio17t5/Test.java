/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio17t5;

import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 27 nov 2026
 */

/*
• Ejercicio 17.- Realiza un programa, orientado a objetos, que le
haga un examen al usuario, haciéndole 4 preguntas (por ejemplo:
¿cuál es la capital de España?, ¿quién descubrió América?...) Le dirá
si ha respondido correctamente o no, cual sería la respuesta
correcta, y por último le dirá su nota (Cada pregunta acertada vale
2,5).
• La clase Enunciado tendrá dos atributos de tipo String, pregunta y
respuesta.
• Tendrás una clase Test donde crearás 4 objetos e implementarás los
métodos necesarios para preguntar al usuario, y para darle la nota
del examen.*/
public class Test {

    public static String obtenerRespuesta(Enunciado e){
        Scanner input = new Scanner(System.in);
        System.out.println(e.getPregunta());
        System.out.print("Introduzca una respuesta: ");
        return input.nextLine();
    }
    
    public static float hacerPreguntas(Enunciado e1, Enunciado e2, Enunciado e3, Enunciado e4){
        float nota = 0f;
        if(e1.esRespuestaCorrecta(obtenerRespuesta(e1))){
            nota+=2.5;
        }
        if(e2.esRespuestaCorrecta(obtenerRespuesta(e2))){
            nota+=2.5;
        }
        if(e3.esRespuestaCorrecta(obtenerRespuesta(e3))){
            nota+=2.5;
        }
        if(e4.esRespuestaCorrecta(obtenerRespuesta(e4))){
            nota+=2.5;
        }
        return nota;
    }
    
    public static void mostrarResultado(float nota){
        System.out.println("La nota final es: "+nota);
    }
    
    public static void main(String[] args) {
        // Creo los objetos de tipo Enunciado
        Enunciado e1 = new Enunciado("Cual es la capital de España","Madrid");
        Enunciado e2 = new Enunciado("Quien descubrio america?","Colon");
        Enunciado e3 = new Enunciado("Cuantas provincias existen en España?","50");
        Enunciado e4 = new Enunciado("Cual es la capital de Extremadura","Merida");
        float nota = 0;
        
        nota = hacerPreguntas(e1, e2, e3, e4);
        
        mostrarResultado(nota);
        
    }
}
