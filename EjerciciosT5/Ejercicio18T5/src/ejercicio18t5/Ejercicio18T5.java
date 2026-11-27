/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18t5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 27 nov 2026
 */
public class Ejercicio18T5 {

    /**
     * • Ejercicio 18.- Realizar un programa orientado a objetos, que pida al
     * usuario dos números por teclado (serán el atributo de dos objetos
     * distintos). Posteriormente el programa mostrará un menú que le permitirá
     * al usuario: 1.- Sumar los números. 2.- Restar los números. 3.-
     * Multiplicar los números. 4.- Dividir los números. 5.- Salir del programa.
     * • Nota1: Mientras el usuario no pulse 5, el programa no termina y el menú
     * volverá a aparecer pidiendo nuevamente que le introduzcas una opción. •
     * Nota 2: Controla el caso de división entre 0 mediante la captura de
     * excepciones. • Nota 3: Crea una clase “Numero”, con un solo atributo
     * llamado valor, que se inicializará en el constructor con el valor que te
     * introduzca el usuario.
     */
    public static void mostrarMenu(Numero n1, Numero n2) {
        System.out.println("--------------MENU--------------");
        System.out.println("1.- Sumar " + n1.getValor() + " + " + n2.getValor());
        System.out.println("2.- Restar " + n1.getValor() + " - " + n2.getValor());
        System.out.println("3.- Multiplicar " + n1.getValor() + " * " + n2.getValor());
        System.out.println("4.- Dividir " + n1.getValor() + " / " + n2.getValor());
        System.out.println("5.- Salir del programa");
    }

    public static int pedirOpcion() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca una opcion: ");
        return input.nextInt();
    }

    public static void menu(Numero n1, Numero n2) {
        int option = 0;
        do {
            try {
                mostrarMenu(n1, n2);
                option = pedirOpcion();
                switch (option) {
                    case 1:
                        n1.sumar(n2);
                        break;
                    case 2:
                        n1.restar(n2);
                        break;
                    case 3:
                        n1.multiplicar(n2);
                        break;
                    case 4:
                        n1.dividir(n2);
                    case 5:
                        System.out.println("Fin del programa! Hasta la proxima!");
                        break;
                    default:
                        System.out.println("Error! Opcion no valida! Opciones: 1-5");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error! Debe introducir un numero");
            } catch (ArithmeticException e){
                System.out.println("Error! No es posible dividir entre 0");
            }
        } while (option != 5);
    }

    public static int pedirNumero() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        return input.nextInt();
    }

    public static void main(String[] args) {
        //Creo dos objetos de tipo 
        Numero num1 = new Numero(pedirNumero());
        Numero num2 = new Numero(pedirNumero());

        menu(num1, num2);
    }

}
