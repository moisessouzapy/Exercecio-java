/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package senai;

/**
 *
 * @author moise
 */
public class CamaroteInferior extends Vip {
    String localIngresso;
    
    public String getlocalIngresso(){
        return this.localIngresso;
    }
    
    public void setlocalIngresso(String local){
        this.localIngresso = local;
    }
    
    public String acessaLocalizacao(){
        return this.localIngresso;
    }
    
    public void imprimeLocalizacao(String local){
        local = this.localIngresso;
        System.out.println("local: "+local);
    }
}
