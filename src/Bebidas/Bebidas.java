/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bebidas;
import javax.swing.*;
import java.sql.*;
import TelasPrincipais.*;
//import javax.swing.text.Document;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.FileOutputStream;



/**
 *
 * @author victor.marcelino
 */
public class Bebidas extends javax.swing.JFrame {

    /**
     * Creates new form Bebidas
     */
     
     final void vinhos() {
        try {
            String url = "jdbc:mysql://localhost:3306/bebidas";
            String user = "root";
            String pass = "";

            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();
            String Query = "SELECT * FROM Vinhos";
            ResultSet Result = stmt.executeQuery(Query);
            DefaultListModel list = new DefaultListModel();
            while(Result.next()){
                 list.addElement("");
                list.addElement(Result.getString(1));
                list.addElement("Quantidade: "+Result.getString(2));
                list.addElement("Validade: "+Result.getString(3));
                list.addElement("");
                list.addElement("");
                list.addElement("");
                list.addElement("");
                list.addElement("");
            }
            ListaVinhos.setModel(list);
            
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
     final void nãoalcoólicos() {
        try {
            String url = "jdbc:mysql://localhost:3306/bebidas";
            String user = "root";
            String pass = "";

            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();
            String Query = "SELECT * FROM Nãoalcoólicos";
            ResultSet Result = stmt.executeQuery(Query);
            DefaultListModel list = new DefaultListModel();
            while(Result.next()){
                list.addElement("");
                list.addElement(Result.getString(1));
                list.addElement("Quantidade: "+Result.getString(2));
                list.addElement("Validade: "+Result.getString(3));
                list.addElement("");
                list.addElement("");
                list.addElement("");
                list.addElement("");
                list.addElement("");
            }
            ListaNaoA.setModel(list);
            
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
     final void destilados() {
        try {
            String url = "jdbc:mysql://localhost:3306/bebidas";
            String user = "root";
            String pass = "";

            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();
            String Query = "SELECT * FROM Destilados";
            ResultSet Result = stmt.executeQuery(Query);
            DefaultListModel list = new DefaultListModel();
            while(Result.next()){
                 list.addElement("");
                list.addElement(Result.getString(1));
                list.addElement("Quantidade: "+Result.getString(2));
                list.addElement("Validade: "+Result.getString(3));
                list.addElement("");
                list.addElement("");
                list.addElement("");
                list.addElement("");
                list.addElement("");
            }
            ListaDestilados.setModel(list);
            
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    final void energéticos() {
        try {
            String url = "jdbc:mysql://localhost:3306/bebidas";
            String user = "root";
            String pass = "";

            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();
            String Query = "SELECT * FROM Energéticos";
            ResultSet Result = stmt.executeQuery(Query);
            DefaultListModel list = new DefaultListModel();
            while(Result.next()){
                list.addElement("");
                list.addElement(Result.getString(1));
                list.addElement("Quantidade: "+Result.getString(2));
                list.addElement("Validade: "+Result.getString(3));
                list.addElement("");
                list.addElement("");
                list.addElement("");
                list.addElement("");
                list.addElement("");
            }
            ListaEnergeticos.setModel(list);
            
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    final void cervejas() {
        try {
            String url = "jdbc:mysql://localhost:3306/bebidas";
            String user = "root";
            String pass = "";

            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();
            String Query = "SELECT * FROM Cervejas";
            ResultSet Result = stmt.executeQuery(Query);
            DefaultListModel list = new DefaultListModel();
            while(Result.next()){
                list.addElement("");
                list.addElement(Result.getString(1));
                list.addElement("Quantidade: "+Result.getString(2));
                list.addElement("Validade: "+Result.getString(3));
                list.addElement("");
                list.addElement("");
                list.addElement("");
                list.addElement("");
                list.addElement("");
            }
            ListaCervejas.setModel(list);
            
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    public Bebidas() {
        initComponents();
        this.setTitle("Bebidas");
        cervejas();
        energéticos();
        destilados();
        vinhos();
        nãoalcoólicos();
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        ListaCervejas = new javax.swing.JList<>();
        VoltarCervejas = new javax.swing.JButton();
        QuantidadeCerveja = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        AtualizarCervejas = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        NomeCerveja = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        VoltarDestilados = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        ListaDestilados = new javax.swing.JList<>();
        QuantidadeDestilado = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        AtualizarDestilados = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        NomeDestilado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        VoltarEnergeticos = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        ListaEnergeticos = new javax.swing.JList<>();
        QuantidadeEnergetico = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        AtualizarEnergeticos = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        NomeEnergetico = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        VoltarNaoA = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        ListaNaoA = new javax.swing.JList<>();
        QuantidadeNaoA = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        AtualizarNaoA = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        NomeNaoA = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        VoltarVinhos = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        ListaVinhos = new javax.swing.JList<>();
        QuantidadeVinho = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        AtualizarVinhos = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        NomeVinho = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTabbedPane1.setMinimumSize(new java.awt.Dimension(100, 350));

        jPanel1.setLayout(null);

        ListaCervejas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaCervejasValueChanged(evt);
            }
        });
        jScrollPane6.setViewportView(ListaCervejas);

        jPanel1.add(jScrollPane6);
        jScrollPane6.setBounds(20, 30, 434, 200);

        VoltarCervejas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosenac/Imagens/curve-arrow (1).png"))); // NOI18N
        VoltarCervejas.setText("Voltar");
        VoltarCervejas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarCervejasActionPerformed(evt);
            }
        });
        jPanel1.add(VoltarCervejas);
        VoltarCervejas.setBounds(380, 280, 81, 25);

        QuantidadeCerveja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantidadeCervejaActionPerformed(evt);
            }
        });
        jPanel1.add(QuantidadeCerveja);
        QuantidadeCerveja.setBounds(140, 240, 100, 30);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setText("Alterar Quantidade:");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(20, 240, 110, 30);

        AtualizarCervejas.setText("Atualizar");
        AtualizarCervejas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarCervejasActionPerformed(evt);
            }
        });
        jPanel1.add(AtualizarCervejas);
        AtualizarCervejas.setBounds(190, 280, 75, 23);

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Nome:");
        jPanel1.add(jLabel26);
        jLabel26.setBounds(300, 240, 60, 30);

        NomeCerveja.setEditable(false);
        jPanel1.add(NomeCerveja);
        NomeCerveja.setBounds(350, 240, 100, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosenac/Imagens/design-de-plano-de-fundo-texturizado-simples-cinza_53876-63604.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 520, 370);

        jTabbedPane1.addTab("Cervejas", jPanel1);

        jPanel2.setLayout(null);

        VoltarDestilados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosenac/Imagens/curve-arrow (1).png"))); // NOI18N
        VoltarDestilados.setText("Voltar");
        VoltarDestilados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarDestiladosActionPerformed(evt);
            }
        });
        jPanel2.add(VoltarDestilados);
        VoltarDestilados.setBounds(380, 280, 81, 25);

        ListaDestilados.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaDestiladosValueChanged(evt);
            }
        });
        jScrollPane7.setViewportView(ListaDestilados);

        jPanel2.add(jScrollPane7);
        jScrollPane7.setBounds(20, 30, 434, 200);

        QuantidadeDestilado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantidadeDestiladoActionPerformed(evt);
            }
        });
        jPanel2.add(QuantidadeDestilado);
        QuantidadeDestilado.setBounds(80, 240, 94, 30);

        jLabel23.setText("Quantidade");
        jPanel2.add(jLabel23);
        jLabel23.setBounds(10, 240, 70, 14);

        AtualizarDestilados.setText("Atualizar");
        AtualizarDestilados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarDestiladosActionPerformed(evt);
            }
        });
        jPanel2.add(AtualizarDestilados);
        AtualizarDestilados.setBounds(190, 280, 75, 23);

        jLabel24.setText("Nome");
        jPanel2.add(jLabel24);
        jLabel24.setBounds(240, 240, 40, 14);

        NomeDestilado.setEditable(false);
        jPanel2.add(NomeDestilado);
        NomeDestilado.setBounds(280, 240, 100, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosenac/Imagens/design-de-plano-de-fundo-texturizado-simples-cinza_53876-63604.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(0, 0, 490, 340);

        jTabbedPane1.addTab("Destilados", jPanel2);

        jPanel3.setLayout(null);

        VoltarEnergeticos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosenac/Imagens/curve-arrow (1).png"))); // NOI18N
        VoltarEnergeticos.setText("Voltar");
        VoltarEnergeticos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarEnergeticosActionPerformed(evt);
            }
        });
        jPanel3.add(VoltarEnergeticos);
        VoltarEnergeticos.setBounds(380, 280, 81, 25);

        ListaEnergeticos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaEnergeticosValueChanged(evt);
            }
        });
        jScrollPane8.setViewportView(ListaEnergeticos);

        jPanel3.add(jScrollPane8);
        jScrollPane8.setBounds(20, 30, 434, 200);

        QuantidadeEnergetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantidadeEnergeticoActionPerformed(evt);
            }
        });
        jPanel3.add(QuantidadeEnergetico);
        QuantidadeEnergetico.setBounds(80, 240, 94, 30);

        jLabel21.setText("Quantidade");
        jPanel3.add(jLabel21);
        jLabel21.setBounds(10, 240, 70, 14);

        AtualizarEnergeticos.setText("Atualizar");
        AtualizarEnergeticos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarEnergeticosActionPerformed(evt);
            }
        });
        jPanel3.add(AtualizarEnergeticos);
        AtualizarEnergeticos.setBounds(190, 280, 75, 23);

        jLabel22.setText("Nome");
        jPanel3.add(jLabel22);
        jLabel22.setBounds(240, 240, 40, 14);

        NomeEnergetico.setEditable(false);
        jPanel3.add(NomeEnergetico);
        NomeEnergetico.setBounds(280, 240, 100, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosenac/Imagens/design-de-plano-de-fundo-texturizado-simples-cinza_53876-63604.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(0, 0, 490, 340);

        jTabbedPane1.addTab("Energéticos", jPanel3);

        jPanel4.setLayout(null);

        VoltarNaoA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosenac/Imagens/curve-arrow (1).png"))); // NOI18N
        VoltarNaoA.setText("Voltar");
        VoltarNaoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarNaoAActionPerformed(evt);
            }
        });
        jPanel4.add(VoltarNaoA);
        VoltarNaoA.setBounds(380, 280, 81, 25);

        ListaNaoA.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaNaoAValueChanged(evt);
            }
        });
        jScrollPane9.setViewportView(ListaNaoA);

        jPanel4.add(jScrollPane9);
        jScrollPane9.setBounds(20, 30, 434, 200);

        QuantidadeNaoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantidadeNaoAActionPerformed(evt);
            }
        });
        jPanel4.add(QuantidadeNaoA);
        QuantidadeNaoA.setBounds(80, 240, 94, 30);

        jLabel19.setText("Quantidade");
        jPanel4.add(jLabel19);
        jLabel19.setBounds(10, 240, 70, 14);

        AtualizarNaoA.setText("Atualizar");
        AtualizarNaoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarNaoAActionPerformed(evt);
            }
        });
        jPanel4.add(AtualizarNaoA);
        AtualizarNaoA.setBounds(190, 280, 75, 23);

        jLabel20.setText("Nome");
        jPanel4.add(jLabel20);
        jLabel20.setBounds(240, 240, 40, 14);

        NomeNaoA.setEditable(false);
        jPanel4.add(NomeNaoA);
        NomeNaoA.setBounds(280, 240, 100, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosenac/Imagens/design-de-plano-de-fundo-texturizado-simples-cinza_53876-63604.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(0, 0, 510, 340);

        jTabbedPane1.addTab("Não Alcoólicos", jPanel4);

        jPanel5.setLayout(null);

        VoltarVinhos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosenac/Imagens/curve-arrow (1).png"))); // NOI18N
        VoltarVinhos.setText("Voltar");
        VoltarVinhos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarVinhosActionPerformed(evt);
            }
        });
        jPanel5.add(VoltarVinhos);
        VoltarVinhos.setBounds(380, 280, 81, 25);

        ListaVinhos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaVinhosValueChanged(evt);
            }
        });
        jScrollPane10.setViewportView(ListaVinhos);

        jPanel5.add(jScrollPane10);
        jScrollPane10.setBounds(20, 30, 434, 200);

        QuantidadeVinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantidadeVinhoActionPerformed(evt);
            }
        });
        jPanel5.add(QuantidadeVinho);
        QuantidadeVinho.setBounds(80, 240, 94, 30);

        jLabel2.setText("Quantidade");
        jPanel5.add(jLabel2);
        jLabel2.setBounds(10, 240, 70, 14);

        AtualizarVinhos.setText("Atualizar");
        AtualizarVinhos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarVinhosActionPerformed(evt);
            }
        });
        jPanel5.add(AtualizarVinhos);
        AtualizarVinhos.setBounds(190, 280, 75, 23);

        jLabel17.setText("Nome");
        jPanel5.add(jLabel17);
        jLabel17.setBounds(240, 240, 40, 14);

        NomeVinho.setEditable(false);
        jPanel5.add(NomeVinho);
        NomeVinho.setBounds(280, 240, 100, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosenac/Imagens/design-de-plano-de-fundo-texturizado-simples-cinza_53876-63604.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel5.add(jLabel1);
        jLabel1.setBounds(0, 0, 480, 320);

        jTabbedPane1.addTab("Vinhos", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void QuantidadeVinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantidadeVinhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantidadeVinhoActionPerformed

    private void ListaVinhosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaVinhosValueChanged
        try {
            String url = "jdbc:mysql://localhost:3306/bebidas";
            String user = "root";
            String pass = "";

            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();
            String Query = "SELECT * FROM Vinhos WHERE Nome = '"+ListaVinhos.getSelectedValue()+"';";
            ResultSet Result = stmt.executeQuery(Query);
            DefaultListModel list = new DefaultListModel();
            while(Result.next()){
                NomeVinho.setText(Result.getString(1));
                QuantidadeVinho.setText(Result.getString(2));

            }
            ListaVinhos.setModel(list);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        vinhos();
    }//GEN-LAST:event_ListaVinhosValueChanged

    private void VoltarVinhosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarVinhosActionPerformed
        setVisible(false);
        new TelaPrincipalG().setVisible(true);
    }//GEN-LAST:event_VoltarVinhosActionPerformed

    private void ListaNaoAValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaNaoAValueChanged
        try {
            String url = "jdbc:mysql://localhost:3306/bebidas";
            String user = "root";
            String pass = "";

            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();
            String Query = "SELECT * FROM Nãoalcoólicos WHERE Nome = '"+ListaNaoA.getSelectedValue()+"';";
            ResultSet Result = stmt.executeQuery(Query);
            DefaultListModel list = new DefaultListModel();
            while(Result.next()){
                NomeNaoA.setText(Result.getString(1));
                QuantidadeNaoA.setText(Result.getString(2));

            }
            ListaNaoA.setModel(list);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        nãoalcoólicos();
    }//GEN-LAST:event_ListaNaoAValueChanged

    private void VoltarNaoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarNaoAActionPerformed
        setVisible(false);
        new TelaPrincipalG().setVisible(true);
    }//GEN-LAST:event_VoltarNaoAActionPerformed

    private void ListaEnergeticosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaEnergeticosValueChanged
        try {
            String url = "jdbc:mysql://localhost:3306/bebidas";
            String user = "root";
            String pass = "";

            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();
            String Query = "SELECT * FROM Energéticos WHERE Nome = '"+ListaEnergeticos.getSelectedValue()+"';";
            ResultSet Result = stmt.executeQuery(Query);
            DefaultListModel list = new DefaultListModel();
            while(Result.next()){
                NomeEnergetico.setText(Result.getString(1)); 
                QuantidadeEnergetico.setText(Result.getString(2));

            }
            ListaEnergeticos.setModel(list);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        energéticos();

    }//GEN-LAST:event_ListaEnergeticosValueChanged

    private void VoltarEnergeticosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarEnergeticosActionPerformed
        setVisible(false);
        new TelaPrincipalG().setVisible(true);
    }//GEN-LAST:event_VoltarEnergeticosActionPerformed

    private void ListaDestiladosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaDestiladosValueChanged
        try {
            String url = "jdbc:mysql://localhost:3306/bebidas";
            String user = "root";
            String pass = "";

            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();
            String Query = "SELECT * FROM Destilados WHERE Nome = '"+ListaDestilados.getSelectedValue()+"';";
            ResultSet Result = stmt.executeQuery(Query);
            DefaultListModel list = new DefaultListModel();
            while(Result.next()){
                NomeDestilado.setText(Result.getString(1)); 
                QuantidadeDestilado.setText(Result.getString(2));

            }
            ListaDestilados.setModel(list);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        destilados();
    }//GEN-LAST:event_ListaDestiladosValueChanged

    private void VoltarDestiladosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarDestiladosActionPerformed
        setVisible(false);
        new TelaPrincipalG().setVisible(true);
    }//GEN-LAST:event_VoltarDestiladosActionPerformed

    private void VoltarCervejasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarCervejasActionPerformed
        setVisible(false);
        new TelaPrincipalG().setVisible(true);
    }//GEN-LAST:event_VoltarCervejasActionPerformed

    private void ListaCervejasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaCervejasValueChanged
        try {
            String url = "jdbc:mysql://localhost:3306/bebidas";
            String user = "root";
            String pass = "";

            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();
            String Query = "SELECT * FROM Cervejas WHERE Nome = '"+ListaCervejas.getSelectedValue()+"'";
            ResultSet Result = stmt.executeQuery(Query);
            DefaultListModel list = new DefaultListModel();
            while(Result.next()){
                NomeCerveja.setText(Result.getString(1)); 
                QuantidadeCerveja.setText(Result.getString(2));

            }
            ListaCervejas.setModel(list);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        cervejas();
    }//GEN-LAST:event_ListaCervejasValueChanged

    private void AtualizarVinhosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarVinhosActionPerformed
        try{
            String url = "jdbc:mysql://localhost:3306/bebidas";
            String user = "root";
            String pass = "";

            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();
            String Query = "UPDATE Vinhos SET Quantidade = '"+QuantidadeVinho.getText()+"' WHERE Nome = '"+NomeVinho.getText()+"'";
            stmt.execute(Query);
            
            JOptionPane.showMessageDialog(null, "Atualizado!");

        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_AtualizarVinhosActionPerformed

    private void QuantidadeNaoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantidadeNaoAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantidadeNaoAActionPerformed

    private void AtualizarNaoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarNaoAActionPerformed
        try{
            String url = "jdbc:mysql://localhost:3306/bebidas";
            String user = "root";
            String pass = "";

            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();
            String Query = "UPDATE NãoAlcoólicos SET Quantidade = '"+QuantidadeNaoA.getText()+"' WHERE Nome = '"+NomeNaoA.getText()+"'";
            stmt.execute(Query);
            
            JOptionPane.showMessageDialog(null, "Atualizado!");

        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_AtualizarNaoAActionPerformed

    private void QuantidadeEnergeticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantidadeEnergeticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantidadeEnergeticoActionPerformed

    private void AtualizarEnergeticosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarEnergeticosActionPerformed
        try{
            String url = "jdbc:mysql://localhost:3306/bebidas";
            String user = "root";
            String pass = "";

            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();
            String Query = "UPDATE Energéticos SET Quantidade = '"+QuantidadeEnergetico.getText()+"' WHERE Nome = '"+NomeEnergetico.getText()+"'";
            stmt.execute(Query);
            
            JOptionPane.showMessageDialog(null, "Atualizado!");

        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_AtualizarEnergeticosActionPerformed

    private void QuantidadeDestiladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantidadeDestiladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantidadeDestiladoActionPerformed

    private void AtualizarDestiladosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarDestiladosActionPerformed
        try{
            String url = "jdbc:mysql://localhost:3306/bebidas";
            String user = "root";
            String pass = "";

            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();
            String Query = "UPDATE Destilados SET Quantidade = '"+QuantidadeDestilado.getText()+"' WHERE Nome = '"+NomeDestilado.getText()+"'";
            stmt.execute(Query);
            
            JOptionPane.showMessageDialog(null, "Atualizado!");

        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_AtualizarDestiladosActionPerformed

    private void QuantidadeCervejaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantidadeCervejaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantidadeCervejaActionPerformed

    private void AtualizarCervejasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarCervejasActionPerformed
        try{
            String url = "jdbc:mysql://localhost:3306/bebidas";
            String user = "root";
            String pass = "";

            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();
            String Query = "UPDATE Cervejas SET Quantidade = '"+QuantidadeCerveja.getText()+"' WHERE Nome = '"+NomeCerveja.getText()+"'";
            stmt.execute(Query);
            
            JOptionPane.showMessageDialog(null, "Atualizado!");

        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_AtualizarCervejasActionPerformed

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
            java.util.logging.Logger.getLogger(Bebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bebidas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtualizarCervejas;
    private javax.swing.JButton AtualizarDestilados;
    private javax.swing.JButton AtualizarEnergeticos;
    private javax.swing.JButton AtualizarNaoA;
    private javax.swing.JButton AtualizarVinhos;
    private javax.swing.JList<String> ListaCervejas;
    private javax.swing.JList<String> ListaDestilados;
    private javax.swing.JList<String> ListaEnergeticos;
    private javax.swing.JList<String> ListaNaoA;
    private javax.swing.JList<String> ListaVinhos;
    private javax.swing.JTextField NomeCerveja;
    private javax.swing.JTextField NomeDestilado;
    private javax.swing.JTextField NomeEnergetico;
    private javax.swing.JTextField NomeNaoA;
    private javax.swing.JTextField NomeVinho;
    private javax.swing.JTextField QuantidadeCerveja;
    private javax.swing.JTextField QuantidadeDestilado;
    private javax.swing.JTextField QuantidadeEnergetico;
    private javax.swing.JTextField QuantidadeNaoA;
    private javax.swing.JTextField QuantidadeVinho;
    private javax.swing.JButton VoltarCervejas;
    private javax.swing.JButton VoltarDestilados;
    private javax.swing.JButton VoltarEnergeticos;
    private javax.swing.JButton VoltarNaoA;
    private javax.swing.JButton VoltarVinhos;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
