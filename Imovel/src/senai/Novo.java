/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package senai;

/**
 *
 * @author moise
 */
public class Novo extends Imovel {
    double Adicional;
    
    public Novo(String endereco, double preco, double adicional) {
        super(endereco, preco);
        this.Adicional = adicional;
    }
    
    public double Adicional(){
       return Preco + Adicional; 
    }
}
