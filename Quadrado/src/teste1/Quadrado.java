/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste1;

/**
 *
 * @author moise
 */
public class Quadrado {
     private int lado;
     
    public void Quadrado(int lado){
        this.lado = lado;
    }
    
    public void setLado(int ilado){
        this.lado = ilado;
    }
    
    public int getLado(){
        return this.lado;
    }
    
    public double calculcarArea(){
        return this.lado * this.lado;
    }
    void stats(){
        System.out.println("a area é: "+ this.lado*2);
    }
}
