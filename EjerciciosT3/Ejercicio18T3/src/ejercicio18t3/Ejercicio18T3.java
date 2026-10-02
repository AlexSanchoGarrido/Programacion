/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio18t3;

import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 02.10.2026
 */
public class Ejercicio18T3 {

    /**
     * • Ejercicio 18.- Realiza un programa que le pida una contraseña al
        usuario. Si la escribe bien le dará la enhorabuena, pero si la escribe
        mal 3 veces le dará un mensaje de error de acceso.
        • Pista: Como sabes que al menos se ejecutará el bucle una vez,
        deberás utilizar un bucle do...while.
        • Comprime el proyecto con el nombre de ejercicio18.zip (o ejercicio18.rar) y
        súbelo a tu carpeta de Google Drive, dentro de una carpeta llamada
        Tema03.
     */
    
    static final int PASS = 8462;
    
    public static void main(String[] args) {
        // Declaro las variables
        int pass, i=0;
        boolean exit = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca una contrasenia: ");
        do{
            pass = input.nextInt();
            if(pass == PASS){
                System.out.println("Enhorabuena! Esa es la contrasenia");
                exit = true;
            }else if(i==2){
                System.out.println("ERROR! Contrasenia incorrecta 3 veces");
                exit = true;
            }else{
                System.out.println("Contrasenia incorrecta, introduzcala de nuevo: ");
            }
            i++;
        }while(!exit);
    }

}
