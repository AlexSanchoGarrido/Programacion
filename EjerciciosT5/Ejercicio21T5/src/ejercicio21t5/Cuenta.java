/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio21t5;

/**
 *
 * @author Alexis Sancho
 * @since 27 nov 2026
 */

/*
    Cuenta, que gestione las operaciones sobre la cuenta.
     * Además de los constructores y campos que se estimen necesarios, la clase
     * contará con los métodos: void ingresar (float c) //Agrega alsaldo de la
     * cuesta la cantidad recibida. void extraer(float c) //Descuenta del saldo
     * la cantidad recibida. Tras la llamada a este método, elsaldo podrá quedar
     * en negativo. float getSaldo() //Devuelve elsaldo actual • 
 */
public class Cuenta {

    private float saldo;
    
    //Metodos de la clase
    //Agrega la cantidad recibida al saldo de la cuenta
    void ingresar (float c){
        saldo+=c;
    }
    
    //Resta la cantidad recibida del saldo de la cuenta
    void extraer(float c){
        saldo-=c;
    }

    //Constructor por defecto
    public Cuenta() {
        saldo = 0;
    }

    //Constructor parametrizado
    public Cuenta(float s) {
        saldo = s;
    }

    //Getters y setters
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float s) {
        saldo = s;
    }

    //mostrar() y toString()
    public void mostrar(){
        System.out.println("Saldo: "+saldo);
    }
    
    @Override
    public String toString(){
        return "Saldo: "+saldo;
    }
}
