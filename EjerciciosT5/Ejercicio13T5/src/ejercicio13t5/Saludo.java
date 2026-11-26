/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejercicio13t5;

/**
 *
 * @author Alexis Sancho
 * @since 26 nov 2026
 */
public class Saludo {
    private String saludo;
    
    public void saludar5veces(){
        for(int i=0;i<5;i++)
            saludar();
    }
    
    public void saludar(){
        System.out.println(saludo);
    }
    
    public Saludo(){
        saludo = "Hello World!";
    }
    
    public Saludo(String s){
        saludo = s;
    }
    
    public String getSaludo(){
        return saludo;
    }
    
    public void setSaludo(String s){
        saludo = s;
    }
}
