/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package senai;

/**
 *
 * @author moise
 */
public class Imovel {
    public String Endereço;
    public double Preco;
    
    public Imovel(String endereco, double preco){
       this.Endereço = endereco;
       this.Preco = preco;
    }

    public String getEndereço() {
        return Endereço;
    }

    public void setEndereço(String Endereço) {
        this.Endereço = Endereço;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double Preco) {
        this.Preco = Preco;
    }
    
}
