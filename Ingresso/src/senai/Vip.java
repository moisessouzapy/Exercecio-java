/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package senai;

/**
 *
 * @author moise
 */
public class Vip extends Ingresso{
    public double Adicional;
    
    public double getAdicional(){
        return this.Adicional;
    }
    
    public void setAdicional(double novoAdicional){
        this.Adicional = novoAdicional;
    }
    
    public double ingressoVip(double valoringresso){
        this.valorIngresso = valoringresso;
        return (this.Adicional*this.valorIngresso)+this.valorIngresso;
    }
}
