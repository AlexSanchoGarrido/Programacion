/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio19t5;

import java.util.Scanner;

/**
 *
 * @author Alexis Sancho
 * @since 27 nov 2026
 */

/*
• Ejercicio 19.- Desarrolle una aplicación en Java que determine el sueldo bruto para
cada uno de los tres empleados de una empresa. La empresa paga la tarifa normal
en las primeras 40 horas de trabajo de cada empleado, y paga tarifa y media en
todas las horas trabajadas que excedan de 40.
• El programa creará 3 objetos (uno para cada empleado) y se le pedirá al usuario
que rellene la información para cada empleado en el constructor.
• Por cada empleado se almacenará su nombre, el número de horas que trabajó, y la
tarifa que cobra por una hora de trabajo.
• Para probar la clase Empleado, crea una clase Test con un método que determine
y muestre el sueldo bruto de cada empleado.
• Ejemplo:
Pepe trabajó 42 horas, cobra 20 euros la hora por lo que le corresponde un sueldo de 860 euros.
 */
public class Test {

    public static String pedirNombre() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca un nombre: ");
        return input.nextLine();
    }

    public static float pedirHorasTrabajadas() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca horas trabajadas: ");
        return input.nextFloat();
    }

    public static float pedirTarifa() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca tarifa: ");
        return input.nextFloat();
    }

    public static void mostrarSueldoBruto(Empleado e) {
        System.out.println(e.getNombre() + " trabajó " + e.getHorasTrabajadas() + " horas, cobra " + e.getTarifa() + 
                " euros la hora por lo que le corresponde un sueldo bruto de "+e.sueldoBruto()+" euros.");
    }

    public static void main(String[] args) {
        //Creo tres objetos de la clase Empleado
        System.out.println("Empleado 1: ");
        Empleado emp1 = new Empleado(pedirNombre(), pedirHorasTrabajadas(), pedirTarifa());
        System.out.println("Empleado 2: ");
        Empleado emp2 = new Empleado(pedirNombre(), pedirHorasTrabajadas(), pedirTarifa());
        System.out.println("Empleado 3: ");
        Empleado emp3 = new Empleado(pedirNombre(), pedirHorasTrabajadas(), pedirTarifa());

        //Pepe trabajó 42 horas, cobra 20 euros la hora por lo que le corresponde un sueldo de 860 euros.
        //Muestro por pantalla los datos de cada empleado y su sueldo bruto
        mostrarSueldoBruto(emp1);
        mostrarSueldoBruto(emp2);
        mostrarSueldoBruto(emp3);

    }
}
