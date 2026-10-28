/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio20t4;

import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 28 oct 2026
 */
public class Ejercicio20T4 {

    /**
     * • Ejercicio 20.- Realiza un programa que le haga un examen al usuario, preguntándole cuál
        es la capital de España y quién descubrió América.
        • Le dirá si ha respondido correctamente o no, cual sería la respuesta correcta, y por último
        le dirá su nota (Un 0, un 5 o un 10)
        • Ejemplo de ejecución:

        EXAMEN DE CULTURA GENERAL

        1a PREGUNTA: ¿Cuál es la capital de España?: Madrid

        Muy bien, respuesta correcta.

        2a PREGUNTA: ¿Quién descubrió América?: Napoleón Bonaparte
        No es correcto. La respuesta correcta sería Colón

        NOTA DEL EXAMEN: 5

        • Nota: Las 2 soluciones (Madrid y Colón) guárdalas como constantes. Además,
        procura hacer cada pregunta en un método distinto.
     */
    static final String solucionCuestion1 = "Madrid";
    static final String solucionCuestion2 = "Colon";
    
    public static boolean primeraCuestion(){
        Scanner input = new Scanner(System.in);
        System.out.println("1ra PREGUNTA: Cual es la capital de Espania?");
        return input.nextLine().equalsIgnoreCase(solucionCuestion1);
    }
    
    public static boolean segundaCuestion(){
        Scanner input = new Scanner(System.in);
        System.out.println("2da PREGUNTA: Quien descubrio America?");
        return input.nextLine().equalsIgnoreCase(solucionCuestion2);
    }
    
    public static void main(String[] args) {
        //Declaro las variables
        int nota;
        boolean aciertaPrimera = false, aciertaSegunda = false;
        //Compruebo si acierta la primera y la segunda pregunta, y lo almaceno en variables
        aciertaPrimera = primeraCuestion();
        aciertaSegunda = segundaCuestion();
        //Si acierta ambas
        if(aciertaPrimera && aciertaSegunda){
            nota = 10;
        //Si solo acierta una
        }else if(aciertaPrimera || aciertaSegunda){
            nota = 5;
        //Si no acierta ninguna
        }else{
            nota = 0;
        }
        System.out.println("NOTA DEL EXAMEN: "+nota);
    }

}
