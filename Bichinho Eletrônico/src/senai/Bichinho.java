/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package senai;

/**
 *
 * @author moise
 */
<<<<<<< HEAD
public class Bichinho {
=======
public class Bichinho1 {
>>>>>>> 3949879e85c34532588100f20c9d33830f8e8523
    private String Nome;
    private int Idade;
    private int Fome = 100;
    private int Saude = 100;
    
<<<<<<< HEAD
    public Bichinho(String nome, int idade){
=======
    public Bichinho1(String nome, int idade){
>>>>>>> 3949879e85c34532588100f20c9d33830f8e8523
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
<<<<<<< HEAD
            System.out.println("a idade dele é: "+Idade);
=======
            System.out.println("a idade dele é: "+ Idade);
>>>>>>> 3949879e85c34532588100f20c9d33830f8e8523
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
<<<<<<< HEAD
        Bichinho b1 = new Bichinho("ted",2);
        b1.setSaude(10);
        b1.setFome(10);
        b1.setNome("bob");
        b1.setIdade(10);
        b1.alimentar(20);
=======
        Bichinho1 b1 = new Bichinho1("ted",2);
        b1.setFome(50);
        b1.setSaude(60);
        b1.setNome("bob");
        b1.setIdade(10);
        b1.alimentar(10);
>>>>>>> 3949879e85c34532588100f20c9d33830f8e8523
        b1.brincar(2);
        b1.stats();
    }
}
