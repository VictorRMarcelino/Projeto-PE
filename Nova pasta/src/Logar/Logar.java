/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logar;

import TelasPrincipais.*;
import javax.swing.JOptionPane;
import Funcionários.*;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author victor.marcelino
 */
public class Logar extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Logar() {
        initComponents();
        this.setTitle("Gerenciamento de bebidas");
    }
    
    // colocar o 'Esqueci a senha' para EXIT_ON_CLOSE

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Usuario = new javax.swing.JTextField();
        Confirmar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        HideShow = new javax.swing.JCheckBox();
        password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(760, 400));
        setMinimumSize(new java.awt.Dimension(331, 245));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Usuário:");
        jLabel1.setAutoscrolls(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 70, 90, 22);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Senha:");
        jLabel2.setAutoscrolls(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 110, 100, 22);

        Usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });
        Usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(Usuario);
        Usuario.setBounds(90, 70, 210, 30);

        Confirmar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Confirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosenac/Imagens/check.png"))); // NOI18N
        Confirmar.setText("Acessar");
        Confirmar.setAutoscrolls(true);
        Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarActionPerformed(evt);
            }
        });
        Confirmar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ConfirmarKeyPressed(evt);
            }
        });
        getContentPane().add(Confirmar);
        Confirmar.setBounds(10, 180, 110, 25);

        jLabel3.setBackground(new java.awt.Color(0, 0, 51));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Bem Vindo");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 10, 170, 44);

        HideShow.setForeground(new java.awt.Color(240, 240, 240));
        HideShow.setText("Ocultar/Revelar Senha");
        HideShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HideShowActionPerformed(evt);
            }
        });
        HideShow.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                HideShowKeyPressed(evt);
            }
        });
        getContentPane().add(HideShow);
        HideShow.setBounds(90, 150, 160, 23);

        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });
        getContentPane().add(password);
        password.setBounds(90, 110, 210, 30);

        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setText("Esqueceu a senha?");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(150, 180, 160, 25);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosenac/Imagens/WhatsApp-Image-2021-09-08-at-9.33.42-PM.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, -60, 350, 320);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
        if (Usuario.getText().isEmpty() || password.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Usuário ou Senha Vazios,Complete as Informações, Por Favor!", "Alert", JOptionPane.WARNING_MESSAGE);
        } else {
            if (Usuario.getText().equals("Gerente") && password.getText().equals("2307")) {
                try {
                    String url = "jdbc:mysql://localhost:3306/historico";
                    String user = "root";
                    String pass = "";

                    Connection conn = DriverManager.getConnection(url, user, pass);
                    Statement stmt = conn.createStatement();
                    String Query = "INSERT INTO `historico` (`Nome`, `Data`) VALUES ('Gerente' , NOW());";
                    stmt.execute(Query);
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Falha ao inserir dados no histórico! \n"
                            + "Erro: " +e.toString());
                }
                setVisible(false);
                new TelaPrincipalG().setVisible(true);
            } else {
                Connection connection;
                PreparedStatement ps;
                try {
                    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/funcionários", "root", "");
                    ps = connection.prepareStatement("SELECT `Usuário`, `Senha` FROM `funcionários` WHERE `Usuário` = '" + Usuario.getText() + "' AND `Senha` = '" + password.getText() + "'");
                    ResultSet result = ps.executeQuery();
                    if (result.next()) {
                        setVisible(false);
                        new TelaPrincipalC().setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuário ou senha incorreto!");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Logar.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    String url = "jdbc:mysql://localhost:3306/historico";
                    String user = "root";
                    String pass = "";

                    Connection conn = DriverManager.getConnection(url, user, pass);
                    Statement stmt = conn.createStatement();
                    String Query = "INSERT INTO `historico` (`Nome`, `Data`) VALUES ('" + Usuario.getText() + "' , NOW());";
                    stmt.execute(Query);

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Falha ao inserir dados no histórico! \n"
                            + "Erro: " +e.toString());
                    // se souber a tradução do #0001, #0002, #0003... tudo bem, caso contrario e recomendavel explicar o erro para o usuario procurar possiveis solucões
                }
            }
            Connection connection;
            PreparedStatement ps;
        }
    }//GEN-LAST:event_ConfirmarActionPerformed

    private void HideShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HideShowActionPerformed
        if (HideShow.isSelected()) {
            password.setEchoChar((char) 0); //password = JPasswordField
        } else {
            password.setEchoChar('*'); 
        }
    }//GEN-LAST:event_HideShowActionPerformed

    private void UsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsuarioKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
        password.requestFocus();
        }
    }//GEN-LAST:event_UsuarioKeyPressed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            Confirmar.requestFocus();
        }
    }//GEN-LAST:event_passwordKeyPressed

    private void HideShowKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HideShowKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            Confirmar.requestFocus();
        }
    }//GEN-LAST:event_HideShowKeyPressed

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new EsqueceuSenha().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ConfirmarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ConfirmarKeyPressed
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (Usuario.getText().isEmpty() || password.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Usuário ou Senha Vazios,Complete as Informações, Por Favor!", "Alert", JOptionPane.WARNING_MESSAGE);
            } else {
                if (Usuario.getText().equals("Lucas") && password.getText().equals("2307")) {
                    setVisible(false);
                    new TelaPrincipalG().setVisible(true);
                } else {
                    Connection connection;
                    PreparedStatement ps;
                    try {
                        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/funcionários", "root", "");
                        ps = connection.prepareStatement("SELECT `Usuário`, `Senha` FROM `funcionários` WHERE `Usuário` = '" + Usuario.getText() + "' AND `Senha` = '" + password.getText() + "'");
                        ps.setString(1, Usuario.getText());
                        ps.setString(2, String.valueOf(password.getPassword()));
                        ResultSet result = ps.executeQuery();
                        if (result.next()) {
                            setVisible(false);
                            new TelaPrincipalC().setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "Usuário ou senha incorreto!");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Logar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        String url = "jdbc:mysql://localhost:3306/historico";
                        String user = "root";
                        String pass = "";

                        Connection conn = DriverManager.getConnection(url, user, pass);
                        Statement stmt = conn.createStatement();
                        String Query = "INSERT INTO `historico` (`Nome`, `Data`) VALUES ('" + Usuario.getText() + "', NOW());";
                        stmt.execute(Query);

                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Falha ao inserir dados no histórico! \n"
                        +"Erro: " +e.toString());
                    }
                }
                Connection connection;
                PreparedStatement ps;
            }

        } // 100% jesus
    }//GEN-LAST:event_ConfirmarKeyPressed

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
            java.util.logging.Logger.getLogger(Logar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Logar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Logar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Logar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Logar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confirmar;
    private javax.swing.JCheckBox HideShow;
    private javax.swing.JTextField Usuario;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
