/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package festivalmusica;
import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 9 nov 2026
 */
public class FestivalMusica {
    
    public static void mostrarMenu(){
        //Funcion para mostrar el menu del programa
        System.out.println("""
                           -----------------------
                            MENU GESTION FESTIVAL
                           -----------------------
                           1) Distribucion de asistentes
                           2) Organizacion de horarios
                           3) Calculo de are del escenario circular
                           4) Salir del programa
                           """);
    }
    
    public static int solicitarOpcionMenu(){
        //Creo un objeto Scanner para capturar la entrada
        Scanner input = new Scanner(System.in);
        int opcion = 0;
        boolean entradaCorrecta = false; //Variable para iterar mientras exista entrada incorrecta
        while(!entradaCorrecta){    //Mientras la entrada no sea correcta
            try {
                //Capturo la parte del código que es susceptible a excepcion por error de tipo
                System.out.print("Introduzca una opcion: ");
                opcion = input.nextInt();
                entradaCorrecta = true; //La entrada ha sido correcta

            } catch (Exception InputMismatchException) {    //Muestro mensaje de error
                System.out.println("Error! Debe introducir un numero entero!");
                input.next();   //Vacio el buffer para que no entre en un bucle infinito
            }
        }
        return opcion;  //Devuelvo la opcion solicitada
    }
    
    public static int solicitarNumeroAsistentes(){
        //Creo un objeto Scanner para capturar la entrada
        Scanner input = new Scanner(System.in);
        int numAsistentes = 0;
        boolean entradaCorrecta = false;    //Variable para iterar mientras exista entrada incorrecta
        while(!entradaCorrecta){    //Mientras la entrada no sea correcta
            try {
                //Capturo la parte del código que es susceptible a excepcion por error de tipo
                System.out.print("Introduzca el numero de asistentes: ");
                numAsistentes = input.nextInt();
                entradaCorrecta = true; //La entrada ha sido correcta
            } catch (Exception InputMismatchException) {    //Muestro mensaje de error
                System.out.println("Error! Debe introducir un numero entero!");
                input.next();    //Vacio el buffer para que no entre en un bucle infinito
            }
        }
        return numAsistentes;   //Devuelvo el numero de asistentes
    }
    
    public static int solicitarDuracionActuacion(){
        //Creo un objeto Scanner para capturar la entrada
        Scanner input = new Scanner(System.in);
        int duracionActuacion = 0;
        boolean entradaCorrecta = false;    //Variable para iterar mientras exista entrada incorrecta
        while(!entradaCorrecta){    //Mientras la entrada no sea correcta
            try {
                //Capturo la parte del código que es susceptible a excepcion por error de tipo
                System.out.print("Introduzca la duracion de la actuacion (en minutos): ");
                duracionActuacion = input.nextInt();
                entradaCorrecta = true; //La entrada ha sido correcta
            } catch (Exception InputMismatchException) {    //Muestro mensaje de error
                System.out.println("Error! Debe introducir un numero entero!");
                input.next();   //Vacio el buffer para que no entre en un bucle infinito
            }
        }
        return duracionActuacion;   //Devuelvo la duracion de la actuacion
    }
    
    public static float solicitarRadioEscenario(){
        //Creo un objeto Scanner para capturar la entrada
        Scanner input = new Scanner(System.in);
        float radio = 0f;
        boolean entradaCorrecta = false;
        while(!entradaCorrecta){    //Mientras la entrada no sea correcta
            try {
                //Capturo la parte del código que es susceptible a excepcion por error de tipo
                System.out.print("Introduzca el radio del escenario (en metros): ");
                radio = input.nextFloat();
                entradaCorrecta = true; //La entrada ha sido correcta
            } catch (Exception InputMismatchException) {    //Muestro mensaje de error
                System.out.println("Error! Debe introducir un numero!");
                input.next();   //Vacio el buffer para que no entre en un bucle infinito
            }
        }
        return radio;   //Devuelvo el radio
    }
    
    public static int divisorExacto(int num){
        boolean encontrado = false;     //Variable booleana para parar al encontrarlo
        int i = 2;      //Iterador
        while(i < num && !encontrado){  //Mientras no tenga divisor exacto y no lo haya encontrado aun
            if(num % i == 0)            //Si el numero es divisor exacto
                encontrado = true;      //He encontrado el divisor
            else
                i++;                    //Aumenta si no lo ha encontrado
        }
        return i;                       //Devuelvo el primer divisor exacto
    }
    
    public static void distribuirAsistentesEnGrupos(){
        //Solicito que introduzca el numero de asistentes
        int numAsistentes = solicitarNumeroAsistentes();
        //Calculo el primer divisor exacto con la funcion divisorExacto()
        int numPersonasPorGrupos = divisorExacto(numAsistentes);
        //Caso en el que no haya encontrado un divisor exacto
        if(numAsistentes == numPersonasPorGrupos)       //Muestro mensaje de error
            System.out.println("No se han podido obtener grupos con el mismo numero de personas. Solo es posible 1 grupo de "+numPersonasPorGrupos+" personas.");
        else{   //Muestro por pantalla las personas que debe haber por cada grupo para que sean todos iguales
            System.out.println("Para "+numAsistentes+" asistentes se organizaran grupos de "+numPersonasPorGrupos+" personas.");
        }
    }
    
    public static void mostrarMenorAMayor(int dur1, int dur2, int dur3){
        //Variable booleana para parar de iterar si está ordenado
        boolean ordenado = false;
        int i = 0;  //Variable iterador
        int primero = dur1, segundo = dur2, tercero = dur3, aux;    //Variables locales para trabajar con ellas
        while(i < 2 && !ordenado){  //Mientras no se hayan realizado N-1 vueltas (N: cantidad datos entrada) y no este ordenado
            if(primero < segundo && segundo < tercero)  //Si esta ordenado paro
                ordenado = true;
            else{   //Si no esta ordenado, ordeno las posiciones necesarias
                if(primero > segundo){
                    aux = primero;
                    primero = segundo;
                    segundo = aux;
                }
                if(segundo > tercero){
                    aux = segundo;
                    segundo = tercero;
                    tercero = aux;
                }
            }
            i++;    //Itero para continuar
        }
        //Muestro por pantalla las duraciones de las actuaciones ordenadas
        System.out.println("Duraciones de las actuaciones de menor a mayor: "+primero+", "+segundo+", "+tercero+".");
    }
    
    public static void organizacionHorarios(){
        //Solicito que introduzca la duracion de la primera actuacion
        System.out.println("Datos para la primera actuacion. ");
        int duracionActuacion1 = solicitarDuracionActuacion();
        //Solicito que introduzca la duracion de la segunda actuacion
        System.out.println("Datos para la segunda actuacion. ");
        int duracionActuacion2 = solicitarDuracionActuacion();
        //Solicito que introduzca la duracion de la tercera actuacion
        System.out.println("Datos para la tercera actuacion. ");
        int duracionActuacion3 = solicitarDuracionActuacion();
        //Hago uso del metodo mostrarMenorAMayor() para mostrarlos ordenados
        mostrarMenorAMayor(duracionActuacion1, duracionActuacion2, duracionActuacion3);
    }
    
    public static double calculoArea(float radio){
        //Devuelve el resultado de PI*radio^2, de tipo double
        return Math.PI * (Math.pow(radio, 2));
    }
    
    public static void calcularAreaEscenario(){
        //Solicito el radio del escecnario
        float radio = solicitarRadioEscenario();
        //Calculo el area, y el double devuelto por calculoArea() lo casteo a float
        float area = (float)calculoArea(radio);
        System.out.println("La superficie del escenario es de: "+area+" m^2.");
    }
    
    public static void ejecutarMenu(){
        int option = 0;                         //Incializo la opcion con un valor invalido para el menu
        do{
            mostrarMenu();                      //Muestro las opciones del menu
            option = solicitarOpcionMenu();
            switch(option){
                case 1:
                    distribuirAsistentesEnGrupos(); //Caso para funcion de distribucion de asistentes
                    break;
                case 2:
                    organizacionHorarios();     //Caso para la organización de los horarios
                    break;
                case 3:
                    calcularAreaEscenario();    //Caso para calculo del area
                    break;
                case 4:                         //Caso para fin de programa y despedida
                    System.out.println("Fin del programa! Hasta la proxima!");
                    break;
                default:                        //Caso en el que la opcion no es valida, muestro error
                    System.out.println("Error! Introduzca una opcion valida para el menu (1-4)");
            }
        }while(option != 4);                    //Mientras el usuario no seleccione "4"
    }
    
    public static void main(String[] args) {
        ejecutarMenu();                         //Ejecuta el menu del programa
    }

}
