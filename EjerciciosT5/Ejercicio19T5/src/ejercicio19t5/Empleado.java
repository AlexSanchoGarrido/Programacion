/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio19t5;

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
public class Empleado {

    private String nombre;
    private float horasTrabajadas;
    private float tarifa;

    //Constructor por defecto
    public Empleado() {
        nombre = "";
        horasTrabajadas = 0f;
        tarifa = 0f;
    }
    
    public float sueldoBruto(){
        //Calculo las horas extra
        float horasExtra = horasTrabajadas -40;
        //Si tiene horas extra
        if(horasExtra > 0)
            //Cobra las primeras 40 horas a la tarifa normal, las horas extra a 1.5*tarifa
            return 40f*tarifa + horasExtra*tarifa*1.5f;
        else    //En el caso en el que no haya dado horas extra
            return horasTrabajadas*tarifa;
    }

    //Constructor parametrizado
    public Empleado(String nombre, float horasTrabajadas, float tarifa) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifa = tarifa;
    }

    //Setters y getters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setHorasTrabajadas(float horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public float getHorasTrabajadas() {
        return this.horasTrabajadas;
    }

    public void setTarifa(float tarifa) {
        this.tarifa = tarifa;
    }

    public float getTarifa() {
        return this.tarifa;
    }

    //Mostrar y toString
    public void mostrar(){
        System.out.println("Nombre: "+this.getNombre()+", Horas Trabajadas: "+this.getHorasTrabajadas()+", Tarifa: "+this.getTarifa());
    }
}
