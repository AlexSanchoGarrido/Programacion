/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio16t5;

/**
 *
 * @author kai
 */

/*
• Ejercicio 16.- Realiza un programa en JAVA, orientado a objetos, donde el usuario
introduzca el nombre y la nota de un alumno (número entero entre 0 y 10) y se
escribirá su calificación según el valor de la nota ingresada:
• 0 a 4 = Suspenso.
• 5 a 6 = Bien.
• 7 a 8 = Notable.
• 9 a 10 = Sobresaliente.
• Nota: Se le avisará al usuario de un error en caso de que la nota que nos introduzca
no esté entre 0 y 10.
• Para ello tendrás una clase Alumno con los atributos nombre y nota. En una clase
Test crea 3 objetos y los métodos que consideres necesarios (cuantos más mejor).
Intenta que el método main sea lo más pequeño posible.
 */
public class Nota {

    private float valor;

    //Constructor por defecto
    public Nota() {
        this.valor = 0;
    }

    //Constructor parametrizado
    public Nota(float valor) {
        this.valor = valor;
    }

    //Metodo para obtener calificacion
    public String getCalificacion() {
        String calificacion = "";
        if (this.getValor() < 5) {
            calificacion = "Suspenso";
        } else if (this.getValor() < 7) {
            calificacion = "Bien";
        } else if (this.getValor() < 9) {
            calificacion = "Notable";
        } else {
            calificacion = "Sobresaliente";
        }
        return calificacion;
    }

    //Setters y getters
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    void mostrar(){
        System.out.println("Nota: "+this.getValor());
    }
    
    @Override
    public String toString(){
        return "Nota: "+this.getValor();
    }
}
