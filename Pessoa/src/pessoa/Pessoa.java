/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

import java.util.Date;

/**
 *
 * @author SENAI
 */
public class Pessoa {
    int idCadastro;
    String nome;
    String cpf;
    Date dataNascimento;

    public Pessoa(int idCadastro, String nome, String cpf, Date dataNascimento) {
        this.idCadastro = idCadastro;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
