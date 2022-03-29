/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package senai;

/**
 *
 * @author moise
 */
public class CamaroteSuperior extends Vip {
    public double valorAdicional;
    
    public double getvalorAdicional(){
        return this.valorAdicional;
    }
    
    public void setvalorAdicional(double valor){
        this.valorAdicional = valor;
    }
    
    public double valorIngressoAdd(double valor){
        valor = this.valorAdicional;
        double valorAdd = (this.valorAdicional*this.valorIngresso)+this.valorIngresso;
        return valorAdd;
    }
}
