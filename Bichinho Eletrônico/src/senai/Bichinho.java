/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package senai;

/**
 *
 * @author moise
 */
public class Bichinho {
    private String Nome;
    private int Idade;
    private int Fome = 100;
    private int Saude = 100;
    
    public Bichinho(String nome, int idade){
        Nome = nome;
        Idade = idade;
    }
    public String getNome(){
        return this.Nome;
    }
    public void setNome(String nome){
        Nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public int getFome() {
        return Fome;
    }

    public void setFome(int Fome) {
        this.Fome = Fome;
    }

    public int getSaude() {
        return Saude;
    }

    public void setSaude(int saude) {
        this.Saude = saude;
    }
    
    public String getHumor(){
        if(this.getFome() >= 70 && this.getSaude() >=70){
        return "Está de bom humor";    
}else if(this.getFome() >=50 && this.getSaude()>=50){
      return "não está bem";  
    }else if(this.getFome()>= 30 && this.getSaude()>=30){
        return "Está mal";
    }else{
        return "Está muito mal";
    }
}
    public void stats(){

            System.out.println("a idade dele é: "+Idade);

            System.out.println("a idade dele é: "+ Idade);

            System.out.println("o nome é: "+Nome);
            System.out.println("a fome é de: "+Fome);
            System.out.println("a saúde é de: "+Saude);
            System.out.println(getHumor());
        }
    
    public void alimentar(int comida){
        int total = comida + Fome;
        Fome = total;
    }
    
    public void brincar(int brincar){
        int total = brincar + Saude;
        Saude = total;
    }
    public static void main(String[] args) {

        Bichinho b1 = new Bichinho("ted",2);
        b1.setFome(90);
        b1.setSaude(70);
        b1.setNome("bob");
        b1.setIdade(10);
        b1.alimentar(10);

        b1.brincar(2);
        b1.stats();
    }
}
