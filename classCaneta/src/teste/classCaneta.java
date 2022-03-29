package teste;
public class classCaneta {
    public static void main(String[] args){
        Caneta c1 = new Caneta();
        Caneta c2 = new Caneta();
        c1.carga = 50;
        c1.ponta = 0.5;
        c1.cor = "branco";
        c1.destampar();
        c1.stats();
        c1.rabiscar();
        
        c2.stats();
    } 
}
