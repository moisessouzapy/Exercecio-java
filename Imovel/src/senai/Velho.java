/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package senai;

/**
 *
 * @author moise
 */
public class Velho extends Imovel {
  double Desconto;
  
    public Velho(String endereco, double preco, double desconto) {
        super(endereco, preco);
        this.Desconto = desconto;
    }
    
    public double Desconto(){
        return Preco - Desconto;
    }
}
