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
    public double Altura;
    public double Base;
    
    public void setAltura(double Altura){
        Altura = Altura;
    }
    
    public void setBase(double Base){
        Base = Base;
    }
    
    public double getAltura(){
        return Altura;
    }
    
    public double getBase(){
        return Base;
    }
    
    public double CalcularArea(){
        return this.Altura * this.Base;
    }
    
    public double CalcularPerimetro(){
        return this.Altura *2 + this.Base * 2;
    }
    
    public void stats(){
        System.out.println(this.CalcularArea()+"area calculada");
        System.out.println(this.CalcularPerimetro()+"perimetro calculado");
    }
}
