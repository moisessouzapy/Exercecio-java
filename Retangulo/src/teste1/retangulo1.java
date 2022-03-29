/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste1;

import java.util.Scanner;

/**
 *
 * @author moise
 */
public class retangulo1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Retangulo r1 = new Retangulo();
        r1.setBase(4);
        r1.setAltura(2);
        r1.calcularArea();
        r1.stats();
        
    }
}
