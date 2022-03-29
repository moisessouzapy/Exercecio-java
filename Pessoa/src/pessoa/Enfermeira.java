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
public class Enfermeira extends Pessoa{
    
    private String coren;
    private String estadoCoren;
    private char setorEnfermaria;

    public Enfermeira(String coren, String estadoCoren, char setorEnfermaria, int idCadastro, String nome, String cpf, Date dataNascimento) {
        super(idCadastro, nome, cpf, dataNascimento);
        this.coren = coren;
        this.estadoCoren = estadoCoren;
        this.setorEnfermaria = setorEnfermaria;
    }
    
    
    
}
