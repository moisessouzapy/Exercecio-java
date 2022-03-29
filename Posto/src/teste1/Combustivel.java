//https://github.com/fit087/UFRJ_Python_102/blob/master/2aula_1rosObjetos.py
package teste1;
public class Combustivel {
    private String tipoCombustivel;
    private double valorLitro;
    private double QuantidadeCombustivel;

   
    public Combustivel(String tipo, double valor, int quantidade){
        tipoCombustivel = tipo;
        valorLitro = valor;
        QuantidadeCombustivel = quantidade;
    }
    
    public String gettipoCombustivel(){
        return this.tipoCombustivel;
    }
    
    public void settipoCombustivel(String tipo){
        tipoCombustivel = tipo;
    }
    
    public double getvalorLitro(){
        return this.valorLitro;
    }
    
    public void setvalorLitro(double valor){
        this.valorLitro = valor;
    }
    
    public void setQuantidadeCombustivel(int quantidade){
        this.QuantidadeCombustivel = quantidade;
    }
    
    public double getQuantidadeCombustivel(){
        return this.QuantidadeCombustivel;
    }
    
    public double setnovoValorCombustivel(){
        return this.QuantidadeCombustivel;
    }
    
    public void getnovoValorCombustivel(double novoValor){
        this.QuantidadeCombustivel = novoValor;
    }
    
    public double abastecerPorValor(double novoValorAbastecido){
        double litrosGastos = novoValorAbastecido / valorLitro;
        QuantidadeCombustivel -= litrosGastos;
        return litrosGastos;
    }
    
    public double abastecerPorLitro(double novoQntCombustivel){;
        QuantidadeCombustivel -= novoQntCombustivel;
        return novoQntCombustivel * valorLitro;
    }
    
    public double alterarValor(double valor){
        QuantidadeCombustivel = valor;
        return valorLitro = valor;
    }
    
    public String alterarCombustivel(String combustivel){
        return tipoCombustivel = combustivel;
    }
    
    
    public static void main(String[] args) {
        Combustivel c1 = new Combustivel("Gasolina",10, 50);
        System.out.println(c1.abastecerPorValor(60));
        System.out.println(c1.abastecerPorLitro(10));
        System.out.println(c1.alterarCombustivel("diesel"));
        System.out.println("Ainda tem na bomba "+c1.getQuantidadeCombustivel());
        
    }
}
