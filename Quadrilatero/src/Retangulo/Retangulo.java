/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Retangulo;

import Quadrilatero.Quadrilatero;

/**
 *
 * @author moise
 */
public class Retangulo implements Quadrilatero {
   float Lado;
   float Altura;
   
   public Retangulo(float lado, float altura){
       this.Lado = lado;
       this.Altura = altura;
   }

    @Override
    public float calcularArea() {
        return this.Lado * this.Altura;
    }

    @Override
    public float calcularPerimetro() {
       return this.Lado*2 + this.Altura*2;
    }
   
}
