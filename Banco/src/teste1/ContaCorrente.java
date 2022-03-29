package teste1;

import java.util.Scanner;

public class ContaCorrente {
    Scanner sc = new Scanner(System.in);
    private int nConta;
    private String Nome;
    private double saldo = 0;
    
    public void ContaCorrente(int conta, String nome, double saldo){
    this.nConta = conta;
    this.Nome = nome;
    this.saldo = saldo;
    }
    
    public int getnConta(){
        return this.nConta;
    }
    public String getNome(){
        return this.Nome;
    }
    
    public void setnConta(int iconta){
        this.nConta = iconta;
    }
    public void setNome(String nome){
        this.Nome = nome;
    }
    void Deposito(){
        System.out.println("Quanto deseja depositar?");
        double novoValor = sc.nextDouble();
        if(novoValor <= 0){
            System.out.println("Não podemos depositar esse valor");
        }else{
            saldo += novoValor;
            System.out.println("Valor depositado");
        }
    }
    void Sacar(){
        System.out.println("Quanto deseja sacar?");
        double saque = sc.nextDouble();
        if(saque > saldo){
            System.out.println("Não pode sacar esse valor");
        }else{
            saldo -= saque;
            System.out.println("valor sacado.\nValor restante:"+ saldo);
        }
    }
    void stats(){
        System.out.println("Olá "+ Nome + " da conta "+ nConta+ "\nValor em conta: "+ saldo);
    }
}
