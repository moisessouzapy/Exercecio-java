/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package senai;

import java.util.Scanner;

/**
 *
 * @author moise
 */
public class Teste {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int valor;
        Imovel imovel = new Imovel("rua a", 400);
        Novo novo = new Novo("rua", 400, 200);
        Velho velho = new Velho("rua a", 400, 150);
        System.out.println("Digite 1 para novo ou 2 para velho");
        valor = sc.nextInt();
        if(valor == 1){
            System.out.println(novo.Adicional());
        }else if(valor == 2){
            System.out.println(velho.Desconto());    
        }else{
            System.out.println("Opção invalida");
        }
    }
}
