/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio26t4;

import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 30 oct 2026
 */
public class Ejercicio26T4 {

    /**
     * • Ejercicio 26.- Escribe un programa que contenga un método
        llamado esPrimo que reciba un número entero como
        parámetro y devuelva un booleano que indique si se trata de
        un número primo o no.
        • Pista: Para comprobar que se trata de un número primo, hay
        que comprobar que no tiene divisores distintos de la unidad
        y del propio número. Se irá comprobando si tiene algún
        divisor a partir del 2 en adelante y si se encuentra algún
        divisor cuyo resto sea 0 ya sabremos que ese número no es
        primo.
     */
    
    public static int pedirNumero(){
        //Creo un objeto de la clase Scanner para capturar la entrada
        Scanner input = new Scanner(System.in);
        //Numero entero a devolver
        int num = 0;
        //Variable booleana para iterar hasta que la entrada sea un numero entero
        boolean entradaCorrecta = false;
        do{
            try{
                //Capturo la parte potencialmente problematica "input.nextInt()"
                //Solicito al usuario que introduzca un numero entero
                System.out.print("Introduzca un numero entero: ");
                num = input.nextInt();
                //Si es correcta la entrada, salimos del bucle
                entradaCorrecta = true;
            //Muestro error si captura otra cosa que no sea un numero entero por la entrada
            }catch (Exception InputMismatchException){
                System.out.println("Error! Debe introducir un numero entero");
                //Vacio el buffer para evitar bucle infinito
                input.nextLine();
            }
        //mientras la entrada no sea correcta
        }while(!entradaCorrecta);
        //Devuelvo el numero entero
        return num;
    }
    
    public static boolean esNumeroPrimo(int num){
        //Variable para iterar, 1 sabemos que siempre es divisor asi que empezamos en 2
        //Además, en el caso que num==1 o num==2 no entra en el bucle y funciona igual
        int i = 2;
        //Variable booleana para indicar si he encontrado un divisor de num
        boolean tieneDivisor = false;
        //Mientras i sea menor que num (excluido num, porque es divisor de si mismo)
        //y mientras no tenga divisor (!tieneDivisor)
        while(i<num && !tieneDivisor){
            //Si el resto de la division de num / i es 0, es que i es divisor de num
            if(num % i == 0)
                //Cambiamos el valor de tiene divisor a true
                tieneDivisor = true;
            i++;
        }
        //Si no ha encontrado divisor, sigue inicializado a false. Si lo tiene, es que no es primo
        //entonces devuelvo la negación para indicar que no es primo (!tieneDivisor).
        //(El metodo indica si ES PRIMO y la logica del metodo indica si TIENE DIVISOR, como son
        //cosas opuestas devuelvo !tieneDivisor porque aunque sea contraintutivo demostrar lo contrario
        //es más facil entender la logica de la iteracion, porque una supuesta variable "NoTieneDivisor = false"
        //es mas compleja de entender en un vistazo rápido
        return !tieneDivisor;
    }
    
    public static void main(String[] args) {
        // Declaro las variables
        //Llamo a la funcion pedirNumero() que solicita un entero e itera mientras no se introduzca
        //un numero entero
        int numero = pedirNumero();
        //Llamo al metodo esNumeroPrimo con numero como argumento que me devuelve si num es primo
        if(esNumeroPrimo(numero))
            System.out.println("El numero "+numero+" SI es un numero primo.");
        else
            System.out.println("El numero "+numero+" NO es un numero primo.");
        
    }

}
