/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejercicio21t5;

/**
 *
 * @author Alexis Sancho
 * @since 27 nov 2026
 */
public class CuentaClave extends Cuenta{
    private int clave;
    
    //Metodo que sobreescribe extraer(), sólo permite la extracción si hay saldo suficiente, sino no hará nada.
    @Override
    public void extraer(float c){
        if(super.getSaldo() >= c)
            super.extraer(c);
    }
    //Constructor por defecto
    public CuentaClave(){
        super();
        clave = 0;
    }
    //Constructor parametrizado
    public CuentaClave(float saldo, int clave){
        super(saldo);
        this.clave = clave;
    }
    
    //Getters y setters
    public void setClave(int c){
        clave = c;
    }
    
    public int getClave(){
        return clave;
    }
    //mostrar() y toString()
    public void mostrar(){
        super.mostrar();
        System.out.println("Clave: "+clave);
    }
    
    @Override
    public String toString(){
        return super.toString()+", Clave: "+clave;
    }
}
