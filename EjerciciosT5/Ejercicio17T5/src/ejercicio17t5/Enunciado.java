/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio17t5;

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
public class Enunciado {

    private String pregunta;
    private String respuesta;

    //Constructor por defecto
    public Enunciado() {
        pregunta = "";
        respuesta = "";
    }

    //Constructor parametrizado
    public Enunciado(String pregunta, String respuesta){
        this.pregunta = pregunta;
        this.respuesta = respuesta;
                
    }
    
    public boolean esRespuestaCorrecta(String respuesta){
        return respuesta.equalsIgnoreCase(this.respuesta);
    }
    
    //Getters y setters
    public String getPregunta() {
        return pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public String toString() {
        return "Pregunta: " + pregunta + ", Respuesta: " + respuesta;
    }

    public void mostrar() {
        System.out.println("Pregunta: " + pregunta + ", Respuesta: " + respuesta);
    }

}
