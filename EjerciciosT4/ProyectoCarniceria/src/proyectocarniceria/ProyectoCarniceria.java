/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package proyectocarniceria;

import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 4 nov 2026
 */
public class ProyectoCarniceria {
    
    static final String TICKET_COMPRA = "compra";
    static final String TICKET_RECOGIDA = "recogida";
    static final int MAX_TICKET = 100;
    static final int MIN_TICKET = 1;

    public static void mostrarMenu(){
        //Muestro las opciones del menu
        System.out.println("""
                           ----------------------------
                           MENU:
                           1) Comprar
                           2) Recoger
                           3) Generar lote de tickets
                           4) Salir
                           """);
    }
    
    public static void generarTicket(String tipoTicket){
        //Uso la formula: Math.random()*(MAX-MIN+1)+MIN, hago Math.floor() para
        //truncarlo, y finalmente lo casteo explicitamente a int
        int rand = (int)Math.floor(Math.random()*(MAX_TICKET-MIN_TICKET+1)+MIN_TICKET);
        String ticket = "";
        //Compruebo si el tipoTicket es compra o recogida, y en el string concateno el prefijo
        //junto con el numero entre 1 y 100 generado
        if(tipoTicket.equals(TICKET_COMPRA))
            ticket = "C"+rand;
        else if(tipoTicket.equals(TICKET_RECOGIDA))
            ticket = "R"+rand;
        System.out.println(ticket); //Muestro el ticket generado
    }
    
    public static int solicitarEleccionMenu(){
        //Creo un objeto de tipo Scanner para capturar la entrada
        Scanner input = new Scanner(System.in);
        //Declaro una variable de tipo int para devolver la opcion escogida
        int opcion = 0;
        //Declaro una variable de tipo boolean para iterar mientras no se introduzca
        //una entrada correcta -numero entero-.
        boolean entradaCorrecta = false;
        //Solicito al usuario que introduzca una opcion
        do{
            //Solicito que introduzca una opcion
            System.out.print("Introduzca una opcion: ");
            try {   //Capturo la parte que potencialmente genera excepciones
                //que seria si no fuese un tipo entero
                opcion = input.nextInt();   //Recogo la entrada
                entradaCorrecta = true; //Si la entrada es correcta, true
            } catch (Exception InputMismatchException) {    //Muestro error si no se introduce entero
                System.out.println("Error! Debe introducir un numero entero.");
                //Limpio el buffer de la entrada
                input.nextLine();
            }
        }while(!entradaCorrecta);   //Mientras la entrada no sea correcta
        return opcion;  //Devuelvo la opcion 
    }
    
    public static String pedirTipoTicket(){
        //Creo un objeto de tipo Scanner para capturar la entrada
        Scanner input = new Scanner(System.in);
        //Declaro una variable de tipo String para almacenar el resultado
        String tipoTicket = "";
        //Declaro una variable de tipo boolean para iterar mientras no se introduzca
        //una entrada correcta -"comprar" o recoger"-.
        boolean entradaCorrecta = false;
        //Solicito al usuario que introduzca el tipo de ticket que necesita
        System.out.print("Introduzca tipo de ticket (\"Comprar\" o \"Recoger\"): ");
        do{
            tipoTicket = input.nextLine();
            if(tipoTicket.equalsIgnoreCase("comprar")){
                tipoTicket = TICKET_COMPRA; //Tipo ticket de compra
                entradaCorrecta = true; //La entrada es correcta
            }else if(tipoTicket.equalsIgnoreCase("recoger")){
                tipoTicket = TICKET_RECOGIDA;   //Tipo ticket de recogida
                entradaCorrecta = true; //La entrada es correcta
            }
            if(!entradaCorrecta)    //Muestro error si lo introducido no es correcto
                System.out.println("Error! Debe introducir \"comprar\" o \"recoger\"");
        }while(!entradaCorrecta);   //Itero mientras la entrada no sea correcta
        return tipoTicket;  //Devuelvo el tipo de ticket -"compra" o "recogida"-.
    }
    
    public static int pedirCantidadTicketsPar(){
        //Creo un objeto de tipo Scanner para capturar la entrada
        Scanner input = new Scanner(System.in);
        //Declaro una variable de tipo boolean para iterar mientras no se introduzca
        //una entrada correcta -numero entero par-.
        boolean entradaCorrecta = false;
        //Declaro una variable int para la cantidad de tickets
        int cantidadTickets = 0;
        do{
            //Solicito que introduzca la cantidad de tickets -par-.
            System.out.print("Introduzca una cantidad par de tickets: ");
            try{ //Capturo la parte sensible de provocar una excepcion,
                //que es el caso en el que introduce algo distinto a un entero
                cantidadTickets = input.nextInt();
                if(cantidadTickets % 2 != 0)    //Si la cantidad de tickets es impar, muestro error
                    System.out.println("Error! Debe introducir un numero par.");
                else    //En el caso de que sea un entero par, entrada correcta
                    entradaCorrecta = true;
            }catch(Exception InputMismatchException){   //Muestro mensaje si no introduce un entero
                System.out.println("Error! Debe introducir un numero entero par.");
                //Libero el buffer para seguir iterando
                input.nextLine();
            }
        }while(!entradaCorrecta);   //Ocurre mientras la entrada no sea correcta
        return cantidadTickets;     //Devuelvo la cantidad de tickets
    }
    
    public static void generarLoteTickets(String tipoTicket, int cantidadTickets){
        //Muestro por pantalla las opciones que ha elegido el usuario
        System.out.println("Ha solicitado "+cantidadTickets+" tickets de tipo "+tipoTicket+": ");
        //Itero tantas veces como ha elegido
        for(int i=0; i < cantidadTickets; i++){
            //Llamo al metodo generarTicket() con el tipoTicket que ha introducido
            generarTicket(tipoTicket);
        }
    }
    
    public static void opcionLoteTickets(){
        //Solicito el tipo de ticket, asegurando que es "compra" o "recogida" exclusivamente
        String tipoTicket = pedirTipoTicket();
        //Solicito la cantidad de tickes del lote, asegurando que es entero y par
        int cantidadTickets = pedirCantidadTicketsPar();
        //Genero la cantidad de tickets del tipo seleccionado y cantidad elegida
        generarLoteTickets(tipoTicket, cantidadTickets);
        
    }
    
    public static void ejecutarFuncionesMenu(int opcion){
        //En funcion del valor de la opcion tiene lugar una funcionalidad
        switch(opcion){
            case 1:
                //Genera un ticket del tipo compra
                generarTicket(TICKET_COMPRA);
                break;
            case 2:
                //Genera un ticket del tipo recogida
                generarTicket(TICKET_RECOGIDA);
                break;
            case 3:
                //Genera un lote de tickets de compra o de recogida
                opcionLoteTickets();
                break;
            case 4:
                //Fin del programa, mensaje de despedida
                System.out.println("Fin del programa! Hasta la proxima.");
                break;
            default:
                //Opcion no registrada en el menu, mensaje de error
                System.out.println("Error! Opcion no valida para el menu.");
        }
    }
    
    public static void main(String[] args) {
        //Declaro una variable int para las opciones del menu
        int opcion = 0;
        do{ //Itero mientras no se seleccione la opcion 4
            //Llamo a la funcion para mostrar las opciones del menu
            mostrarMenu();
            //LLamo a solicitEleccionMenu() que comprueba que la opcion sea un entero
            opcion = solicitarEleccionMenu();
            //LLamo a la funcion para ejecutar las opciones del menu
            ejecutarFuncionesMenu(opcion);
        }while(opcion != 4);
        
    }

}
