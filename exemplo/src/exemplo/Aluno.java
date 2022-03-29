/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo;

/**
 *
 * @author SENAI
 */
public class Aluno {
    private int matricula;
    String nome;
    private int anoNascimento;
    private String email;
    private int telefone;
    protected Double desconto;

    public Aluno(int matricula, String nome, int anoNascimento, String email, int telefone) {
        this.matricula = matricula;
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.email = email;
        this.telefone = telefone;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }
    
    

    
    
    
}
