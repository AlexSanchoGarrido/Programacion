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
public class Alumno {
    private String nombre;
    private Nota nota;

    //Constructor por defecto
    public Alumno(){
        this.nombre = "";
        this.nota = new Nota();
    }
    
    //Constructor parametrizado
    public Alumno(String nombre, Nota nota){
        this.nombre = nombre;
        this.nota = nota;
    }
    
    public String getNombre() {
        return nombre;
    }

    //Getters y setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(Nota nota) {
        this.nota = nota;
    }

    public Nota getNota() {
        return nota;
    }
    
    public void mostrar(){
        System.out.println("Nombre: "+this.getNombre()+", Nota: "+this.getNota());
    }
    
    @Override
    public String toString(){
        return "Nombre: "+this.getNombre()+this.getNota();
    }
}
