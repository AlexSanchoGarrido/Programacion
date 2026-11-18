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

/*Para probar el funcionamiento de la clase Curso, crea otra clase llamada Test
(dentro del mismo paquete) que contenga el método main, donde se creen dos
objetos de la clase Curso: curso1 y curso2. Luego realiza las siguientes operaciones:
• Establece el nombre y el número de horas, primero en el objeto curso1 y luego en curso2.
• Muestra los datos de los 2 cursos creados.
• Por último, muestra el número de cursos creados almacenados en el atributo estático de clase
numeroDeClientes.*/
public class Test {
    public static void main (String[] args){
        //Creo dos objetos de la clase curso
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        
        //Incremento el numero de cursos creados
        Curso.sumarCursos(2);
        
        //Establezco el nombre y el número de horas, primero en el objeto curso1 y luego en curso2
        curso1.establecerNombreyHoras("Electricista", 300);
        curso2.establecerNombreyHoras("Jardineria", 450);
        
        //Muestro los datos de los 2 cursos creados
        curso1.mostrarCurso();
        curso2.mostrarCurso();
        
        //Muestro el número de cursos creados almacenados en el atributo estático de clase numeroDeClientes
        Curso.verNumeroCursos();
    }

}
