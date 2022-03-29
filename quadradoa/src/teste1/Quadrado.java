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
    
    public void Quadrado(int ilado){
       lado = ilado;
    }
    
    public void setlado(int lado1){
        lado = lado1;
    }
    
    public int getlado(){
        return this.lado;
    }
    
    public int somaarea(){
        return lado * lado;
    }
    
    public static void main(String[] args){
        Quadrado q1 = new Quadrado();
        q1.setlado(2);
        System.out.println(q1.somaarea());
    }
}
