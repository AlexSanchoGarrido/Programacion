/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejercicio08t5;

/**
 *
 * @author Alexis Sancho
 * @since 23 nov 2026
 */

/*
    Ejercicio 08.- Realiza un programa en JAVA, orientado a
        objetos, en el que crees una clase llamada Numero que
        contendrá un único atributo privado, llamado valor, de tipo
        entero.
        • Para probar el funcionamiento de la clase Numero, crea una
        nueva clase llamada Test donde le pidas al usuario un
        número por teclado. Luego, crea un objeto, siendo el
        número introducido por el usuario el valor del atributo valor.
        Posteriormente, le pasarás el objeto a un método que le dirá
        al usuario si el número introducido es par o impar.
*/
public class Numero {
    private int valor;
    
    //Constructor
    public Numero(int v){
        this.valor = v;
    }
    //Getters y setters
    public int getValor(){
        return this.valor;
    }
    
    public void setValor(int v){
        this.valor = v;
    }

}
