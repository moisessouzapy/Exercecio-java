/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste1;

/**
 *
 * @author moise
 */
public class contacorrente1 {
    public static void main(String[] args){
        ContaCorrente c1 = new ContaCorrente();
        c1.ContaCorrente(222, "moises", 0);
        c1.Deposito();
        c1.Sacar();
        c1.stats();
    }
}
