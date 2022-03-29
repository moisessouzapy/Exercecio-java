/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa2;

/**
 *
 * @author SENAI
 */
public class Pobre extends Pessoa2{
    
    public Pobre(String nome, int idade) {
        super(nome, idade);
    }
    
    public void trabalha(){
        System.out.println("sou proletariado");
    }
    
}
