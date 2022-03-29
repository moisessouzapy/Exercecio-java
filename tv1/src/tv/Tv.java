/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tv;

/**
 *
 * @author SENAI
 */
public class Tv {
    
    private int canal;
    private int volume;
    
    public Tv(int canal, int volume){
        this.canal = canal;
        this.volume = volume;
    }
    
    public int getCanal(){
        return canal;
    }
    
    public int getVolume(){
        return volume;
    }
    
    public void setCanal(int canal){
        if(canal > 0 && canal <= 100){
            this.canal = canal;
        }
    }
    
    public void aumentaVolume(){
        if(volume < 100){
            volume += 1;
        }
    }
    
    public void diminuiVolume(){
        if(volume > 0){
            volume -= 1;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tv tvSala = new Tv(10, 15);
        tvSala.setCanal(5);
        tvSala.aumentaVolume();
        tvSala.aumentaVolume();
        tvSala.diminuiVolume();
        System.out.println(tvSala.getCanal());
        System.out.println(tvSala.getVolume());
    }
    
}
