
import com.sun.jdi.connect.spi.Connection;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author moise
 */
public class Conexao {
    public Connection conectaBD(){
        Connection conn = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/";
        } catch (Exception erro) {
            
            JOptionPane.showConfirmDialog(null, erro.getMessage());
        }
        return conn;
    }
}
