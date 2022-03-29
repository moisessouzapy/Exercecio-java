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
public class Paciente extends Pessoa{
    private boolean internado;
    private char setor;
    private short leito;
    private String diagnostico;

    public Paciente(boolean internado, char setor, short leito, String diagnostico, int idCadastro, String nome, String cpf, Date dataNascimento) {
        super(idCadastro, nome, cpf, dataNascimento);
        this.internado = internado;
        this.setor = setor;
        this.leito = leito;
        this.diagnostico = diagnostico;
    }

    
}
