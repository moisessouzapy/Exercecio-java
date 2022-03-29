/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package senai;

/**
 *
 * @author moise
 */
public class Carro {
   private double Combustivel = 0;
   private double Consumo;
   
   public Carro(double consumo){
       this.Consumo = consumo;
       this.Combustivel = 0;
   }
   
   public void andar(double km){
       double litrosGastos = (km/this.Consumo);
       Combustivel -= litrosGastos;
}
   
   public double obterGasolina(){
       return Combustivel;
   }
   
   public void adicionarGasolina(int abastece){
       Combustivel += abastece;
   }
   
   public void stats(){
       System.out.println("Combustivel: "+Combustivel);
       System.out.println("Consumo: "+this.Consumo);
   }
   
   public static void main(String[] args){
       Carro c = new Carro(10.);          
         System.out.println("combustível: " + c.obterGasolina() );  
         System.out.println("consumo: " + c.Consumo );          
         c.adicionarGasolina(20);          
         System.out.println("combustível: " + c.obterGasolina() );          
         c.andar(50);          
         System.out.println("Andou 50km...");          
         System.out.println("combustível: " + c.obterGasolina() );
   }
}