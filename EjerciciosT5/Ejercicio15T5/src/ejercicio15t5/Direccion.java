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
• Ejercicio 15.- Diseña una clase Dirección con los atributos calle, número, piso y ciudad. A
continuación, diseña una clase Empleado con los atributos nombre (de tipo String), salario (de tipo
int) y dirección (de tipo Dirección).
• Para probar la funcionalidad de las clases creadas crea una clase Test donde crees 3 direcciones y
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
public class Direccion {
    private String calle;
    private int numero;
    private int piso;
    private String ciudad;
    
    //Constructor por defecto
    public Direccion(){
        calle = "";
        numero = 0;
        piso = 0;
        ciudad = "";
    }
    
    //Constructor parametrizado
    public Direccion(String calle, int numero, int piso, String ciudad){
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.ciudad = ciudad;
    }
    
    //Setters y getters
    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    public int getPiso() {
        return piso;
    }

    public String getCiudad() {
        return ciudad;
    }
    
    @Override
    public String toString(){
        return "Calle: "+this.calle+", Numero: "+this.numero+", Piso: "+this.piso+", Ciudad: "+this.ciudad;
    }
    
    public void mostrar(){
        System.out.println("Calle: "+this.calle+", Numero: "+this.numero+", Piso: "+this.piso+", Ciudad: "+this.ciudad);
    }
}
