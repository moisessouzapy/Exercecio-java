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
public class Rica extends Pessoa2{
    private double dinheiro;

    public Rica(String nome, int idade, double dinheiro) {
        super(nome, idade);
        this.dinheiro = dinheiro;
    }
    
    public void fazCompras(){
        System.out.println("Estourei o limite do cartão! kkk brinks");
    }
}
