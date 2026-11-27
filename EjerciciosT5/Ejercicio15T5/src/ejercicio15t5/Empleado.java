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
diseña una clase Empleado con los atributos nombre (de tipo String), salario (de tipo
int) y dirección (de tipo Dirección).
 */
public class Empleado {

    private String nombre;
    private int salario;
    private Direccion direccion;

    //Constructor por defecto
    public Empleado() {
        nombre = "";
        salario = 0;
        direccion = new Direccion();
    }
    
    //Constructor parametrizado
    public Empleado(String nombre, int salario, Direccion direccion){
        this.nombre = nombre;
        this.salario = salario;
        this.direccion = direccion;
    }

    //Setters y getters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalario() {
        return salario;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    @Override
    public String toString(){
        return "Nombre: "+this.nombre+", Salario: "+this.salario+", Direccion: "+this.direccion;
    }
    
    public void mostrar(){
        System.out.println("Nombre: "+this.nombre+", Salario: "+this.salario);
        System.out.println("Direccion: ");
        this.direccion.mostrar();
    }
}
