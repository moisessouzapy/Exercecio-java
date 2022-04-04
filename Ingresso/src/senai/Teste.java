/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package senai;

/**
 *
 * @author moise
 */
public class Teste {
    public static void main(String[] args){
        Ingresso ingresso = new Ingresso();
        Normal normal = new Normal();
        CamaroteInferior camaroteinferior = new CamaroteInferior();
        CamaroteSuperior camarotesuperior = new CamaroteSuperior();
        Vip vip = new Vip();
        ingresso.setValorIngresso(50);
        vip.setAdicional(7);
        camaroteinferior.setlocalIngresso("terreo");
        camarotesuperior.setvalorAdicional(5);
        normal.setValorIngresso(70);
        normal.ingressoNormal(normal.getValorIngresso());
        System.out.println("Ingresso Vip: "+vip.ingressoVip(ingresso.getValorIngresso()));
        System.out.println("Ingresso Vip Camarote Inferior: "+vip.ingressoVip(ingresso.getValorIngresso()));
        camaroteinferior.imprimeLocalizacao(camaroteinferior.getlocalIngresso());
        camarotesuperior.setvalorAdicional(35);
        camarotesuperior.setValorIngresso(70);
        System.out.println("Ingresso Vip Camarote Superior: "+ camarotesuperior.valorIngressoAdd(vip.getAdicional()));
    }
}
