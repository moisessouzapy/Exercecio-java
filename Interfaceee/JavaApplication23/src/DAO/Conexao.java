/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import VIEW.Funcionario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author moise
 */
public class Conexao {
    public static Connection conect(){
        Connection conexao = null;
        String url;
        try {
            url = "jdbc:mysql://localhost:3306/login?user=root&password=0204";
            conexao = DriverManager.getConnection(url);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    return conexao;
    }
    
    /*public boolean salvar(Funcionario funcionario){
        try{ 
        String inserir;
        inserir = "insert into tbfuncionarios values('" + funcionario.getNome() + "','" + funcionario.getCargo() + "','" + funcionario.getSenha() + "','" + funcionario.getCpf() +")";
        st.executeUpdate(inserir);
        return true;
        } catch (SQLException ex){
            return false;
        }
    }


}*/
}