/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TelasPrincipais;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author victor.marcelino
 */
public class Historico extends javax.swing.JFrame {

    /**
     * Creates new form Historico
     */
    
    final void filtro() {
        try {
            String url = "jdbc:mysql://localhost:3306/historico";
            String user = "root";
            String pass = "";

            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();
            String Query = "SELECT * FROM historico";
            ResultSet Result = stmt.executeQuery(Query);
            DefaultListModel list = new DefaultListModel();
            while(Result.next()){
                list.addElement("");
                list.addElement("Usuário: "+Result.getString(1));
                list.addElement("Data/Hora:"); 
                list.addElement(Result.getString(2));
                list.addElement(""); 
            }
            List.setModel(list);
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha ao carregar lista! \n"
                    + "Erro: "+e.toString());
        }
    }
    public Historico() {
        initComponents();
        filtro();
        this.setTitle("Histórico");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        List = new javax.swing.JList<>();
        Voltar = new javax.swing.JButton();
        LimparH = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        Menos = new javax.swing.JCheckBox();
        Mais = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(355, 335));
        setResizable(false);
        getContentPane().setLayout(null);

        List.setAlignmentX(3.5F);
        List.setAlignmentY(3.0F);
        jScrollPane1.setViewportView(List);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 20, 210, 230);

        Voltar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosenac/Imagens/curve-arrow (1).png"))); // NOI18N
        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(Voltar);
        Voltar.setBounds(249, 260, 90, 30);

        LimparH.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LimparH.setText("Limpar Histórico");
        LimparH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparHActionPerformed(evt);
            }
        });
        getContentPane().add(LimparH);
        LimparH.setBounds(110, 260, 130, 30);

        Excluir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Excluir.setText("Excluir");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(Excluir);
        Excluir.setBounds(10, 260, 90, 30);

        Menos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Menos.setText("Menos Recente");
        Menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenosActionPerformed(evt);
            }
        });
        getContentPane().add(Menos);
        Menos.setBounds(230, 90, 110, 23);

        Mais.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Mais.setSelected(true);
        Mais.setText("Mais Recente");
        Mais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaisActionPerformed(evt);
            }
        });
        getContentPane().add(Mais);
        Mais.setBounds(230, 110, 100, 23);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Filtragem");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(260, 64, 80, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosenac/Imagens/design-de-plano-de-fundo-texturizado-simples-cinza_53876-63604.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 380, 350);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        setVisible(false);
        new TelaPrincipalG().setVisible(true);
    }//GEN-LAST:event_VoltarActionPerformed

    private void LimparHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparHActionPerformed
 try {
                    String url = "jdbc:mysql://localhost:3306/historico";
                    String user = "root";
                    String pass = "";

                    Connection conn = DriverManager.getConnection(url, user, pass);
                    Statement stmt = conn.createStatement();
                    String Query = "TRUNCATE TABLE historico.historico;";
                    stmt.execute(Query);

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Falha ao limpar o histórico! \n"
                            +"Erro: "+e.toString());
                }
        JOptionPane.showMessageDialog(null,"Histórico limpado com sucesso");
        filtro();
    }//GEN-LAST:event_LimparHActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
         if(List.getSelectedValue().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Nenhum Valor Selecionado!","Alert",JOptionPane.WARNING_MESSAGE);
        }else{
            try{
                String url = "jdbc:mysql://localhost:3306/historico";
                String user = "root";
                String pass = "";

                Connection conn = DriverManager.getConnection(url, user, pass);
                Statement stmt = conn.createStatement(); 
                String Query = "DELETE FROM historico WHERE Data = '"+List.getSelectedValue()+"'";
                stmt.execute(Query);
                JOptionPane.showMessageDialog(null, "Valor do histórico removido com sucesso!");

        
            }catch(SQLException e) {
                JOptionPane.showMessageDialog(null, "Valor selecionado não é válido para exclusão!");
            }
        }
         filtro();
    }//GEN-LAST:event_ExcluirActionPerformed

    private void MaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaisActionPerformed
        if (Mais.isSelected()) {
            Menos.setSelected(false);
            try {
            String url = "jdbc:mysql://localhost:3306/historico";
            String user = "root";
            String pass = "";

            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();
            String Query = "SELECT `Nome` , `Data` FROM historico ORDER BY Data DESC";
            ResultSet Result = stmt.executeQuery(Query);
            DefaultListModel list = new DefaultListModel();
            while(Result.next()){
                list.addElement("");
                list.addElement("Usuário: "+Result.getString(1));
                list.addElement("Data/Hora:"); 
                list.addElement(Result.getString(2));
                list.addElement(""); 
            }
            List.setModel(list);
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha ao selecionar filtro!\n"
                    + "Erro: "+e.toString());
        }
        }else{
        Mais.setSelected(true);
        
        }
    }//GEN-LAST:event_MaisActionPerformed

    private void MenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenosActionPerformed
        if (Menos.isSelected()) {
            Mais.setSelected(false);
            try {
            String url = "jdbc:mysql://localhost:3306/historico";
            String user = "root";
            String pass = "";

            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();
            String Query = "SELECT `Nome` , `Data` FROM historico ORDER BY Data ASC";
            ResultSet Result = stmt.executeQuery(Query);
            DefaultListModel list = new DefaultListModel();
            while(Result.next()){
                list.addElement("");
                list.addElement("Usuário: "+Result.getString(1));
                list.addElement("Data/Hora:"); 
                list.addElement(Result.getString(2));
                list.addElement(""); 
            }
            List.setModel(list);
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha ao selecionar filtro!\n"
                    +"Erro: "+e.toString());
        }
            }else{
        Menos.setSelected(true);
        }
    }//GEN-LAST:event_MenosActionPerformed

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
            java.util.logging.Logger.getLogger(Historico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Historico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Historico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Historico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Historico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Excluir;
    private javax.swing.JButton LimparH;
    private javax.swing.JList<String> List;
    private javax.swing.JCheckBox Mais;
    private javax.swing.JCheckBox Menos;
    private javax.swing.JButton Voltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
