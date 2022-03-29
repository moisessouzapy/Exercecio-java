
import exemplo.Aluno;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author SENAI
 */
public class AlunosVip extends Aluno{
    
    public AlunosVip(int matricula, String nome, int anoNascimento, String email, int telefone) {
        super(matricula, nome, anoNascimento, email, telefone);
    }

    public Double getDesconto() {
        return desconto;
    }
    
    public static void main (String []args){
        AlunosVip a = new AlunosVip(13321234, "joão", 1999, "joao@gmail.com", 999638273);
        a.desconto = 4.7;
    }
    
}
