/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infox.dal;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author moise
 */
public class ModuloConexao {

    public static Connection conector() {
        Connection conexao = null;
        try {
            String url = "jdbc:mysql://localhost:3306/dbinfox?user=root&password=0204";
            conexao = DriverManager.getConnection(url);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        return conexao;
    }
}
