/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bebidas;

import TelasPrincipais.TelaPrincipalG;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo.heusser
 */
public class AdicionarBebida extends javax.swing.JFrame {

    /**
     * Creates new form AdicionarBebidas
     */
    public AdicionarBebida() {
        initComponents();
        this.setTitle("Adicionar Bebiba");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AdicionarNomeBebida = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        AdicionarQuantidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        AdicionarValidade = new javax.swing.JTextField();
        AdicionarBebidas = new javax.swing.JButton();
        AdicionarComboBox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 380));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Bebida:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 40, 70, 30);
        getContentPane().add(AdicionarNomeBebida);
        AdicionarNomeBebida.setBounds(110, 40, 240, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Quantidade:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 100, 100, 30);
        getContentPane().add(AdicionarQuantidade);
        AdicionarQuantidade.setBounds(140, 100, 210, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Validade:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 160, 80, 30);
        getContentPane().add(AdicionarValidade);
        AdicionarValidade.setBounds(120, 160, 230, 30);

        AdicionarBebidas.setText("Adicionar");
        AdicionarBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarBebidasActionPerformed(evt);
            }
        });
        getContentPane().add(AdicionarBebidas);
        AdicionarBebidas.setBounds(140, 300, 90, 30);

        AdicionarComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cervejas", "Destilados", "Vinhos", "Energéticos", "Nãoalcoólicos" }));
        AdicionarComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(AdicionarComboBox);
        AdicionarComboBox.setBounds(220, 230, 120, 20);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosenac/Imagens/curve-arrow (1).png"))); // NOI18N
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(290, 300, 80, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Selecione a Categoria:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 220, 180, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosenac/Imagens/design-de-plano-de-fundo-texturizado-simples-cinza_53876-63604.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 540, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AdicionarBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarBebidasActionPerformed
       if(AdicionarNomeBebida.getText().isEmpty() || AdicionarQuantidade.getText().isEmpty() || AdicionarValidade.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Bebida, Quantidade ou Validade Vazios,Complete as Informações, Por Favor!","Alert",JOptionPane.WARNING_MESSAGE);
        }else{
            try{
                String url = "jdbc:mysql://localhost:3306/Bebidas";
                String user = "root";
                String pass = "";

                Connection conn = DriverManager.getConnection(url, user, pass);
                Statement stmt = conn.createStatement(); 
                String Query = "INSERT INTO `"+AdicionarComboBox.getSelectedItem()+"`(`Nome`,`Quantidade`, `Validade`) VALUES ('"+AdicionarNomeBebida.getText()+"','"+AdicionarQuantidade.getText()+"','"+AdicionarValidade.getText()+"')";
                stmt.execute(Query);
                JOptionPane.showMessageDialog(null, "Bebida adicionada com sucesso!");

                AdicionarNomeBebida.setText(null);
                AdicionarQuantidade.setText(null);
                AdicionarValidade.setText(null);

            }catch(SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }//GEN-LAST:event_AdicionarBebidasActionPerformed

    private void AdicionarComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarComboBoxActionPerformed
       
    }//GEN-LAST:event_AdicionarComboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new TelaPrincipalG().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AdicionarBebida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarBebida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarBebida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarBebida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarBebida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarBebidas;
    private javax.swing.JComboBox<String> AdicionarComboBox;
    private javax.swing.JTextField AdicionarNomeBebida;
    private javax.swing.JTextField AdicionarQuantidade;
    private javax.swing.JTextField AdicionarValidade;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
