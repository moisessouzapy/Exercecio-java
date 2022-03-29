/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste1;

import java.util.Scanner;

/**
 Faça uma classe que simule uma TV. O usuario deve ser capaz de informar o numero do canal e aumentar ou diminuir o volume. Certifique-se que o número do canal e o volume permacerão dentro de faixas válidas(0 a 100). Depois faça o teste da classe. @author moise
 */
public class Controle {
    Scanner sc = new Scanner(System.in);
    private int canal = 0;
    private int volume = 0;
    private int novoCanal = 0;
    
    public void Controle(int canal, int volume){
        this.canal = canal;
        this.volume = volume;
    }
    
    public int Aumentar(int i){
        if(i <100){
            volume += i;
        }
        return 0;  
    }
    public int Diminuir(int j){
        if (j >0){
            volume -=j;
        }
        return 0;
    }
    
    public void Stats(){
        System.out.println("Você está no canal: "+this.canal);
        System.out.println("O volume está em: "+this.volume);
    }

}
