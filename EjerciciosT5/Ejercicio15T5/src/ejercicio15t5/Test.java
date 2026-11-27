/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15t5;

/**
 *
 * @author kai
 */
/*
 Para probar la funcionalidad de las clases creadas crea una clase Test donde crees 3 direcciones y
        luego crea tres empleados, asignándoles una de las direcciones anteriormente creadas. Por último,
        crea un método que muestre los datos de cada empleado creado:
        EMPLEADO 1:
        Nombre: XXX
        Salario: XXX
        Dirección:
        Calle:XXX
        Número: XXX
        Puerta: XXX
        Ciudad: XXX
        EMPLEADO 2:
        Nombre: ..............
 */
public class Test {

    public static void main(String[] args) {
        //Creo tres objetos de la clase Direccion
        Direccion dir1 = new Direccion("Calle de la Amapola", 24, 2, "Plasencia");
        Direccion dir2 = new Direccion("Calle de la Rosa", 3, 1, "Carcaboso");
        Direccion dir3 = new Direccion("Calle de la Margarita", 54, 7, "Riolobos");

        //Creo tres objetos de la clase Empleado
        Empleado emp1 = new Empleado("Juan", 1100, dir1);
        Empleado emp2 = new Empleado("Pepe", 1600, dir2);
        Empleado emp3 = new Empleado("Luis", 600, dir3);

        //Muestro los tres objetos
        emp1.mostrar();
        emp2.mostrar();
        emp3.mostrar();
    }
}
