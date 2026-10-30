/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio27t4;


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 30 oct 2026
 */
public class Ejercicio27T4 {

    /**
     * • Ejercicio 27.- Escribe un programa que simule el
        lanzamiento de una moneda. Le pediremos al usuario
        que pida “cara” o “cruz” y generaremos aleatoriamente
        un resultado. Luego le mostraremos al usuario el
        resultado y le daremos la Enhorabuena si ha acertado o
        le diremos que ha perdido y otra vez le pediremos que
        elija “cara” o “cruz” y tiraremos la moneda de nuevo, así
        hasta que acierte.
     */
    
    public static void mostrarCabecera() {
        System.out.println("""
                           ----------------------------------------
                           Bienvenido al juego ADIVINAR CARA O CRUZ
                           ----------------------------------------
                            """);
    }
    
    //Este metodo devuelve el String "cara" o "cruz", en minusculas para evitar fallos
    public static String solicitarCaraOCruz(){
        Scanner input = new Scanner(System.in);
        boolean entradaCorrecta = false;
        String entrada;
        do{
            System.out.print("Introduzca CARA o CRUZ! ");
            entrada = input.nextLine().toLowerCase();
            if(!entrada.equals("cara") && !entrada.equals("cruz")){
                System.out.println("Error! Debe introducir \"Cara\" o \"Cruz\"");
            }else
                entradaCorrecta = true;
        }while(!entradaCorrecta);
        
        return entrada;
    }
    
    //El metodo devuelve de forma aleatoria el String con "cara" o "cruz" en minus
    public static String generarCaraOCruz(){
        //Declaro la variable que devuelvo
        String result;
        //Creo un int con Math.random() entre 0 y 1
        int random = (int)Math.floor(Math.random()*(1-0+1)+0);
        if(random == 0)
            result = "cara";
        else
            result = "cruz";
        return result;
    }
    
    //Metodo para mostrar la cabecera del juego actual
    public static void mostrarCabeceraJuegoActual(int intento){
        System.out.println("-------------------------------------------");
        System.out.println("    ADIVINAR CARA O CRUZ - INTENTO "+intento);
    }
    
    //Metodo que comprueba si se ha acertado e informa en el caso de fallo, devuelve booleano
    public static boolean comprobacionAciertoCaraOCruz(String entrada, String resultadoGenerado){
        //Variable booleana a devolver
        boolean acierto;
        //Muestra el "lanzamiento" generado
        System.out.println("Se lanza la moneda y el resultado es");
        System.out.println("            ! "+resultadoGenerado.toUpperCase()+" !");
        acierto = entrada.equals(resultadoGenerado);
        //Informo si no hay acierto
        if(!acierto){
           System.out.println("Ha fallado! Vuelva a intentarlo!"); 
        }
        //Devuelvo true si acierta, false si falla
        return acierto;
    }
    
    public static void main(String[] args) {
        //Declaro las variables
        boolean acierto = false;
        String entrada;
        String resultadoGenerado;
        int intento = 1;
        //Muestro la cabecera del juego
        mostrarCabecera();
        do{
            //Muestro la cabecera de cada intento
            mostrarCabeceraJuegoActual(intento);
            //Solicito la entrada de "Cara" o "Cruz"
            entrada = solicitarCaraOCruz();
            //Almaceno el resultado generado aleatoriamente de "Cara" o "Cruz"
            resultadoGenerado = generarCaraOCruz();
            //Compruebo si se ha acertado
            acierto = comprobacionAciertoCaraOCruz(entrada, resultadoGenerado);
            //Muestra mensaje de acierto
            if(acierto)
                System.out.println("ENHORABUENA! Ha acertado! Fin del programa!");
            //Incremento los intentos para mostrar en la cabecera de cada juego
            intento++;
        //Itera mientras no se acierte
        }while(!acierto);
    }

}
