/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejercicio14t5;

/**
 *
 * @author Alexis Sancho
 * @since 26 nov 2026
 */
public class Numero {
    private int valor;
    
    public Numero(){
        this.valor = 0;
    }
    
    public Numero(int n){
        this.valor = n;
    }
    
    public void asignarValorANumero(int v){
        this.valor = v;
    }
    
    public void mostrarTablaMultiplicar(){
        System.out.println("La tabla de multiplicar de "+this.getValor()+" es: ");
        for(int i=0; i< 11; i++){
            System.out.println(this.getValor()+" * "+i+" = "+this.getValor()*i);
        }
    }
    
    public int getValor(){
        return this.valor;
    }
    
    public void setValor(int v){
        this.valor = v;
    }
    
    @Override
    public String toString(){
        return "Valor: "+valor;
    }
}
