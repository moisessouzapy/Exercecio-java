/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste1;

/**
 *
 * @author moise
 */
public class Retangulo {
    private double Altura;
    private double Base;
    
    public void Retangulo(double altura, double base){
        this.Altura = altura;
        this.Base = base;
    }
    
    public void setAltura(double iAltura){
        Altura = iAltura;
    }
    public void setBase(double iBase) {
        Base = iBase;
    }
    public double getAltura(){
        return this.Altura;
    }
    public double getBase(){
        return this.Base;
    }
    double calcularArea(){
        return this.Base * this.Altura;
    }
    double calcularPerimetro(){
        return this.Base*2 + this.Altura*2;
    }
    void stats(){
        System.out.println("A aréa calculada é: "+ this.calcularArea());
        System.out.println("A área do perimetro é: "+ this.calcularPerimetro());
    }
}
