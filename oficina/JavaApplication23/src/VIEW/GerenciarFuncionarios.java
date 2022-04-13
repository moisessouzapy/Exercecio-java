/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
/*import DAO.Conexao;*/
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author junio
 */
public class GerenciarFuncionarios extends javax.swing.JFrame {
    public GerenciarFuncionarios() {
        initComponents();
    }

    /**insert into tbfuncionarios(nome, cargo, senha, cpf)
values('cleber', 'mecanico', '1234', '124.512.125.00');
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblVoltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblFuncionario = new javax.swing.JTextField();
        lblCargo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblSenha = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        lblCpf = new javax.swing.JTextField();
        lblAdicionar = new javax.swing.JButton();
        lblEditar = new javax.swing.JButton();
        lblDeletar = new javax.swing.JButton();
        lblLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciar Funcionários");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Sistema de Gerenciamento de Funcionários");

        lblVoltar.setText("Voltar");
        lblVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblVoltarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome do Funcionário");

        jLabel3.setText("Cargo do Funcionário");

        lblFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblFuncionarioActionPerformed(evt);
            }
        });

        jLabel4.setText("Senha");

        jLabel5.setText("CPF");

        lblAdicionar.setText("Adicionar");
        lblAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblAdicionarActionPerformed(evt);
            }
        });

        lblEditar.setText("Editar");
        lblEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblEditarActionPerformed(evt);
            }
        });

        lblDeletar.setText("Deletar");
        lblDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblDeletarActionPerformed(evt);
            }
        });

        lblLimpar.setText("Limpar Campos");
        lblLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblLimparActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Cargo", "Senha", "Cpf"
            }
        ));
        jScrollPane1.setViewportView(tabela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblVoltar)
                        .addGap(127, 127, 127)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblFuncionario)
                            .addComponent(lblCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSenha)
                            .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(145, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAdicionar)
                        .addGap(18, 18, 18)
                        .addComponent(lblEditar)
                        .addGap(18, 18, 18)
                        .addComponent(lblDeletar)
                        .addGap(18, 18, 18)
                        .addComponent(lblLimpar)))
                .addGap(189, 189, 189))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblVoltar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCargo)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdicionar)
                    .addComponent(lblEditar)
                    .addComponent(lblDeletar)
                    .addComponent(lblLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblVoltarActionPerformed

    private void lblDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblDeletarActionPerformed
      
    }//GEN-LAST:event_lblDeletarActionPerformed

    private void lblAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblAdicionarActionPerformed
        DefaultTableModel dtmTabela = (DefaultTableModel) tabela.getModel();
        Object[] dados = {lblFuncionario.getText(),lblFuncionario.getText(),lblSenha.getText(),lblCpf.getText()};
        dtmTabela.addRow(dados);
        try {
            Connection con;
            Statement st;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?user=root&password=0204");
            st = con.createStatement();
            st.executeUpdate("insert into tbfuncionarios values('" + lblFuncionario.getText() + "','" + lblCargo.getText() + "','" + lblSenha.getText() + "','"+ lblCpf.getText()+"')");
            JOptionPane.showMessageDialog(null,"Inseridos");
            limparCampos();;
            lblFuncionario.requestFocus();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        /*Funcionario funcionario = new Funcionario();
    Conexao dao = new Conexao();
    boolean stats;
    
    funcionario = new Funcionario();
    funcionario.setNome(lblFuncionario.getText());
    funcionario.setCargo(lblCargo.getText());
    funcionario.setSenha(lblSenha.getText());
    funcionario.setCpf(lblCpf.getText());
    dao = new Conexao();
    stats = dao.inserir(funcionario);
    if(stats==false){
        JOptionPane.showMessageDialog(null,"erro ao tentar inculuir o funcionário");
    }else{
        JOptionPane.showMessageDialog(null,"Dados inclúidos com sucesso");
    }*/
    }//GEN-LAST:event_lblAdicionarActionPerformed

    private void lblFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblFuncionarioActionPerformed

    private void limparCampos(){
            lblFuncionario.setText("");
            lblCargo.setText("");
            lblSenha.setText("");
            lblCpf.setText("");
            lblFuncionario.requestFocus();
    }
    private void lblLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblLimparActionPerformed
            limparCampos();
    }//GEN-LAST:event_lblLimparActionPerformed

    private void lblEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblEditarActionPerformed
try {
            Connection con;
            Statement st;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?user=root&password=0204");
            st = con.createStatement();
            st.executeUpdate("update tbfuncionarios set('" + lblFuncionario.getText() + "','" + lblCargo.getText() + "','" + lblSenha.getText() + "','"+ lblCpf.getText()+"')");
            JOptionPane.showMessageDialog(null,"Atualizado");
            limparCampos();;
            lblFuncionario.requestFocus();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_lblEditarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GerenciarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciarFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lblAdicionar;
    private javax.swing.JTextField lblCargo;
    private javax.swing.JTextField lblCpf;
    private javax.swing.JButton lblDeletar;
    private javax.swing.JButton lblEditar;
    private javax.swing.JTextField lblFuncionario;
    private javax.swing.JButton lblLimpar;
    private javax.swing.JPasswordField lblSenha;
    private javax.swing.JButton lblVoltar;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
