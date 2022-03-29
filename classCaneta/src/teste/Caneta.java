package teste;
public class Caneta {
    String modelo;
    String cor;
    double ponta;
    int carga;
    boolean tampada;
    void stats() {
        System.out.println("A cor da caneta é: "+ this.cor);
        System.out.println("A ponta da caneta é: "+ this.ponta);
        System.out.println("A caneta está tampada?"+ this.tampada);
        System.out.println("A carga é de: "+ this.carga);
        System.out.println("O modelo é: "+ this.modelo);
    }
    void tampar(){
        this.tampada = true;
    }
    
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("não posso rabiscar");
        }else if(this.carga == 0){
            System.out.println("sem tinta");
        }else{
            System.out.println("Estou rabiscando");
        }
    }
    
    void destampar(){
        this.tampada = false;
    }
}
    
