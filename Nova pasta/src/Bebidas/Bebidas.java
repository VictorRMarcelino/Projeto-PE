/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bebidas;
import javax.swing.*;
import java.sql.*;
//import javax.swing.text.Document;
import javax.swing.JOptionPane;




/**
 *
 * @author victor.marcelino
 */
public class Bebidas extends javax.swing.JFrame {

    /**
     * Creates new form Bebidas
     */
     
    // Aviso serve como um alerta caso haja bebidas em quantidade abaixo de 30 no banco de dados//
    final void Aviso() {
        try {
            String url = "jdbc:mysql://localhost:3306/bebidas";
            String user = "root"; 
            String pass = "";

            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();
            String Query = "SELECT `Nome`, `Lote` , `Categoria` , `Quantidade`, `Validade`FROM bebidas where `Quantidade` < 30";
            ResultSet Result = stmt.executeQuery(Query);
            DefaultListModel list = new DefaultListModel();
            if (Result.next()) {
                JOptionPane.showMessageDialog(null, "Existem bebidas em baixa quantidade ou totalmente zeradas!", "Alert", JOptionPane.WARNING_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha ao executar aviso! \n "
                    + "Erro: "+e.toString());
        }
    }
    
    
    
    
    // Janela da Baixa quantidade com base no Banco de dados //
     final void Baixo() {
         try {
             String url = "jdbc:mysql://localhost:3306/bebidas";
             String user = "root";
             String pass = "";

             Connection conn = DriverManager.getConnection(url, user, pass);
             Statement stmt = conn.createStatement();
             String Query = "SELECT `Nome`, `Lote` , `Categoria` , `Quantidade`, `Validade` FROM bebidas where `Quantidade` < 30 AND Quantidade > 1";
             ResultSet Result = stmt.executeQuery(Query);
             DefaultListModel list = new DefaultListModel();
             while (Result.next()) {
                 list.addElement("");
                 list.addElement("Nome: " + Result.getString(1));
                 list.addElement(Result.getString(2));
                 list.addElement("Categoria: " + Result.getString(3));
                 list.addElement("Quantidade: " + Result.getString(4));
                 list.addElement("Validade: " + Result.getString(5));
                 list.addElement("");
                 list.addElement("");
                 list.addElement("");
                 list.addElement("");
                 list.addElement("");
             }
             ListaB.setModel(list);

         } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Falha ao carregar tabela de bebidas em baixa! \n"
             + "Erro: "+e.toString());
         }
    }
     // Caso o total de bebidas chegue a zero ela vai aparecer nessa janela//
    final void Zerados() {
        try {
            String url = "jdbc:mysql://localhost:3306/bebidas";
            String user = "root";
            String pass = "";

            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();
            String Query = "SELECT `Nome`, `Lote` , `Categoria` , `Quantidade`, `Validade` FROM bebidas where `Quantidade` = 0";
            ResultSet Result = stmt.executeQuery(Query);
            DefaultListModel list = new DefaultListModel();
            while (Result.next()) {
                list.addElement("");
                list.addElement("Nome: " + Result.getString(1));
                list.addElement("Lote: " + Result.getString(2));
                list.addElement("Categoria: " + Result.getString(3));
                list.addElement("Quantidade: " + Result.getString(4));
                list.addElement("Validade: " + Result.getString(5));
                list.addElement("");
                list.addElement("");
                list.addElement("");
                list.addElement("");
                list.addElement("");
            }
            BebidasZeradas.setModel(list);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: "+e.toString());
        }
    }
    // listagem das bebidas em estoque com a quantidade e a data de validade//
    final void Bebidas() {
        try {
            String url = "jdbc:mysql://localhost:3306/bebidas";
            String user = "root";
            String pass = "";

            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();
            String Query = "SELECT `Nome`, `Lote` , `Categoria` , `Quantidade`, `Validade` FROM bebidas where `Quantidade` > 29";
            ResultSet Result = stmt.executeQuery(Query);
            DefaultListModel list = new DefaultListModel();
            while (Result.next()) {
                list.addElement("");
                list.addElement("Nome: " + Result.getString(1));
                list.addElement(Result.getString(2));
                list.addElement("Categoria: " + Result.getString(3));
                list.addElement("Quantidade: " + Result.getString(4));
                list.addElement("Validade: " + Result.getString(5));
                list.addElement("");
                list.addElement("");
                list.addElement("");
                list.addElement("");
                list.addElement("");
            }
            ListaBebidas.setModel(list);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: "+e.toString());
        }
    }
    
    public Bebidas() {
        initComponents();
        this.setTitle("Bebidas");
        Bebidas();
        Zerados();
        Baixo();
        Aviso();
        
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
        ListaBebidas = new javax.swing.JList<>();
        VoltarBebidas = new javax.swing.JButton();
        QuantidadeCerveja = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        AtualizarBebidas = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        LoteBebidas = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Todos = new javax.swing.JCheckBox();
        Cervejas = new javax.swing.JCheckBox();
        Destilados = new javax.swing.JCheckBox();
        Energéticos = new javax.swing.JCheckBox();
        NaoAlcoolicos = new javax.swing.JCheckBox();
        Vinhos = new javax.swing.JCheckBox();
        Menor = new javax.swing.JCheckBox();
        Maior = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        SenhaG = new javax.swing.JTextField();
        ExcluirBebidas = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        VoltarBaixaQuantidade = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        ListaB = new javax.swing.JList<>();
        QuantidadeB = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        AtualizarBaixaQuantidade = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        LoteB = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        MenorB = new javax.swing.JCheckBox();
        MaiorB = new javax.swing.JCheckBox();
        TodosB = new javax.swing.JCheckBox();
        CervejasB = new javax.swing.JCheckBox();
        DestiladosB = new javax.swing.JCheckBox();
        EnergéticosB = new javax.swing.JCheckBox();
        NaoAlcoolicosB = new javax.swing.JCheckBox();
        VinhosB = new javax.swing.JCheckBox();
        ExcluirBaixaQuantidade = new javax.swing.JButton();
        SenhaGE = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        VoltarZerados = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        BebidasZeradas = new javax.swing.JList<>();
        ApagarTudo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jTabbedPane1.setMinimumSize(new java.awt.Dimension(100, 350));

        jPanel1.setLayout(null);

        ListaBebidas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaBebidasValueChanged(evt);
            }
        });
        jScrollPane6.setViewportView(ListaBebidas);

        jPanel1.add(jScrollPane6);
        jScrollPane6.setBounds(10, 10, 260, 220);

        VoltarBebidas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        VoltarBebidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosenac/Imagens/curve-arrow (1).png"))); // NOI18N
        VoltarBebidas.setText("Voltar");
        VoltarBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarBebidasActionPerformed(evt);
            }
        });
        jPanel1.add(VoltarBebidas);
        VoltarBebidas.setBounds(390, 280, 100, 30);

        QuantidadeCerveja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantidadeCervejaActionPerformed(evt);
            }
        });
        jPanel1.add(QuantidadeCerveja);
        QuantidadeCerveja.setBounds(130, 240, 120, 30);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setText("Alterar Quantidade:");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(20, 240, 110, 30);

        AtualizarBebidas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AtualizarBebidas.setText("Atualizar");
        AtualizarBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarBebidasActionPerformed(evt);
            }
        });
        jPanel1.add(AtualizarBebidas);
        AtualizarBebidas.setBounds(10, 280, 80, 30);

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Lote:");
        jPanel1.add(jLabel26);
        jLabel26.setBounds(300, 240, 60, 30);

        LoteBebidas.setEditable(false);
        LoteBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoteBebidasActionPerformed(evt);
            }
        });
        jPanel1.add(LoteBebidas);
        LoteBebidas.setBounds(350, 240, 100, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Categoria:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(280, 10, 60, 15);

        Todos.setSelected(true);
        Todos.setText("Todos");
        Todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodosActionPerformed(evt);
            }
        });
        jPanel1.add(Todos);
        Todos.setBounds(280, 30, 100, 23);

        Cervejas.setText("Cervejas");
        Cervejas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CervejasActionPerformed(evt);
            }
        });
        jPanel1.add(Cervejas);
        Cervejas.setBounds(280, 50, 110, 20);

        Destilados.setText("Destilados");
        Destilados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DestiladosActionPerformed(evt);
            }
        });
        jPanel1.add(Destilados);
        Destilados.setBounds(280, 70, 100, 23);

        Energéticos.setText("Energéticos");
        Energéticos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnergéticosActionPerformed(evt);
            }
        });
        jPanel1.add(Energéticos);
        Energéticos.setBounds(280, 90, 100, 23);

        NaoAlcoolicos.setText("Não Alcoólicos");
        NaoAlcoolicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NaoAlcoolicosActionPerformed(evt);
            }
        });
        jPanel1.add(NaoAlcoolicos);
        NaoAlcoolicos.setBounds(280, 110, 110, 23);

        Vinhos.setText("Vinhos");
        Vinhos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VinhosActionPerformed(evt);
            }
        });
        jPanel1.add(Vinhos);
        Vinhos.setBounds(280, 130, 110, 23);

        Menor.setText("Menor Lote");
        Menor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenorActionPerformed(evt);
            }
        });
        jPanel1.add(Menor);
        Menor.setBounds(280, 180, 110, 23);

        Maior.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Maior.setText("Maior Lote");
        Maior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaiorActionPerformed(evt);
            }
        });
        jPanel1.add(Maior);
        Maior.setBounds(280, 200, 90, 23);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Lote:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(280, 160, 50, 15);

        SenhaG.setForeground(new java.awt.Color(153, 153, 153));
        SenhaG.setText("Confirme a senha do gerente");
        jPanel1.add(SenhaG);
        SenhaG.setBounds(210, 280, 170, 30);

        ExcluirBebidas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ExcluirBebidas.setText("Excluir");
        ExcluirBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirBebidasActionPerformed(evt);
            }
        });
        jPanel1.add(ExcluirBebidas);
        ExcluirBebidas.setBounds(120, 280, 80, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosenac/Imagens/design-de-plano-de-fundo-texturizado-simples-cinza_53876-63604.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(-16, 0, 500, 390);

        jTabbedPane1.addTab("Bebidas", jPanel1);

        jPanel2.setLayout(null);

        VoltarBaixaQuantidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        VoltarBaixaQuantidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosenac/Imagens/curve-arrow (1).png"))); // NOI18N
        VoltarBaixaQuantidade.setText("Voltar");
        VoltarBaixaQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarBaixaQuantidadeActionPerformed(evt);
            }
        });
        jPanel2.add(VoltarBaixaQuantidade);
        VoltarBaixaQuantidade.setBounds(385, 280, 100, 30);

        ListaB.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaBValueChanged(evt);
            }
        });
        jScrollPane7.setViewportView(ListaB);

        jPanel2.add(jScrollPane7);
        jScrollPane7.setBounds(10, 10, 260, 220);

        QuantidadeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantidadeBActionPerformed(evt);
            }
        });
        jPanel2.add(QuantidadeB);
        QuantidadeB.setBounds(130, 240, 120, 30);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("Alterar Quantidade:");
        jPanel2.add(jLabel23);
        jLabel23.setBounds(20, 234, 120, 40);

        AtualizarBaixaQuantidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AtualizarBaixaQuantidade.setText("Atualizar");
        AtualizarBaixaQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarBaixaQuantidadeActionPerformed(evt);
            }
        });
        jPanel2.add(AtualizarBaixaQuantidade);
        AtualizarBaixaQuantidade.setBounds(10, 280, 80, 30);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Lote:");
        jPanel2.add(jLabel24);
        jLabel24.setBounds(300, 240, 40, 30);

        LoteB.setEditable(false);
        jPanel2.add(LoteB);
        LoteB.setBounds(350, 240, 100, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Categoria:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(280, 10, 60, 15);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Lote:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(280, 160, 50, 15);

        MenorB.setText("Menor Lote");
        MenorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenorBActionPerformed(evt);
            }
        });
        jPanel2.add(MenorB);
        MenorB.setBounds(280, 180, 110, 23);

        MaiorB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MaiorB.setText("Maior Lote");
        MaiorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaiorBActionPerformed(evt);
            }
        });
        jPanel2.add(MaiorB);
        MaiorB.setBounds(280, 200, 90, 23);

        TodosB.setSelected(true);
        TodosB.setText("Todos");
        TodosB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodosBActionPerformed(evt);
            }
        });
        jPanel2.add(TodosB);
        TodosB.setBounds(280, 30, 110, 23);

        CervejasB.setText("Cervejas");
        CervejasB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CervejasBActionPerformed(evt);
            }
        });
        jPanel2.add(CervejasB);
        CervejasB.setBounds(280, 50, 110, 23);

        DestiladosB.setText("Destilados");
        DestiladosB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DestiladosBActionPerformed(evt);
            }
        });
        jPanel2.add(DestiladosB);
        DestiladosB.setBounds(280, 70, 110, 23);

        EnergéticosB.setText("Energéticos");
        EnergéticosB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnergéticosBActionPerformed(evt);
            }
        });
        jPanel2.add(EnergéticosB);
        EnergéticosB.setBounds(280, 90, 110, 23);

        NaoAlcoolicosB.setText("Não Alcoólicos");
        NaoAlcoolicosB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NaoAlcoolicosBActionPerformed(evt);
            }
        });
        jPanel2.add(NaoAlcoolicosB);
        NaoAlcoolicosB.setBounds(280, 110, 110, 23);

        VinhosB.setText("Vinhos");
        VinhosB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VinhosBActionPerformed(evt);
            }
        });
        jPanel2.add(VinhosB);
        VinhosB.setBounds(280, 130, 110, 23);

        ExcluirBaixaQuantidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ExcluirBaixaQuantidade.setText("Excluir");
        ExcluirBaixaQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirBaixaQuantidadeActionPerformed(evt);
            }
        });
        jPanel2.add(ExcluirBaixaQuantidade);
        ExcluirBaixaQuantidade.setBounds(120, 280, 80, 30);

        SenhaGE.setForeground(new java.awt.Color(153, 153, 153));
        SenhaGE.setText("Confirme a senha do gerente");
        jPanel2.add(SenhaGE);
        SenhaGE.setBounds(210, 280, 170, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosenac/Imagens/design-de-plano-de-fundo-texturizado-simples-cinza_53876-63604.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(-6, 0, 490, 330);

        jTabbedPane1.addTab("Baixa Quantidade", jPanel2);

        jPanel3.setLayout(null);

        VoltarZerados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosenac/Imagens/curve-arrow (1).png"))); // NOI18N
        VoltarZerados.setText("Voltar");
        VoltarZerados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarZeradosActionPerformed(evt);
            }
        });
        jPanel3.add(VoltarZerados);
        VoltarZerados.setBounds(380, 280, 81, 25);

        BebidasZeradas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                BebidasZeradasValueChanged(evt);
            }
        });
        jScrollPane8.setViewportView(BebidasZeradas);

        jPanel3.add(jScrollPane8);
        jScrollPane8.setBounds(20, 30, 434, 220);

        ApagarTudo.setText("Apagar Tudo");
        ApagarTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApagarTudoActionPerformed(evt);
            }
        });
        jPanel3.add(ApagarTudo);
        ApagarTudo.setBounds(180, 270, 130, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosenac/Imagens/design-de-plano-de-fundo-texturizado-simples-cinza_53876-63604.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(0, 0, 520, 390);

        jTabbedPane1.addTab("Slot Vazio", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
// caso uma ou mais bebida não tenha quantidade e nem mais demanda todas na lista serão apagadas//
    private void ApagarTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApagarTudoActionPerformed
        try {
            String url = "jdbc:mysql://localhost:3306/bebidas";
            String user = "root";
            String pass = "";

            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();
            String Query = "DELETE from bebidas where `Quantidade` = 0";
            stmt.execute(Query);
            JOptionPane.showMessageDialog(null, "Lista de bebidas vazias limpada com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: "+e.toString());
        }
        Zerados();
    }//GEN-LAST:event_ApagarTudoActionPerformed

    private void BebidasZeradasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_BebidasZeradasValueChanged

    }//GEN-LAST:event_BebidasZeradasValueChanged

    private void VoltarZeradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarZeradosActionPerformed
        setVisible(false);
    }//GEN-LAST:event_VoltarZeradosActionPerformed

    private void ExcluirBaixaQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirBaixaQuantidadeActionPerformed
        if (LoteB.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lote Vazios,Complete as Informações, Por Favor!", "Alert", JOptionPane.WARNING_MESSAGE);
        } else {
            if (SenhaGE.getText().equals("2307")) {
                try {
                    String url = "jdbc:mysql://localhost:3306/bebidas";
                    String user = "root";
                    String pass = "";

                    Connection conn = DriverManager.getConnection(url, user, pass);
                    Statement stmt = conn.createStatement();
                    String Query = "DELETE FROM `bebidas` WHERE Lote = '" + LoteB.getText() + "'";
                    stmt.execute(Query);

                    JOptionPane.showMessageDialog(null, "Bebida Deletada Com Sucesso!");

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Erro ao excluir bebida! \n"
                            + "Erro: "+e.toString());
                }

            } else {
                JOptionPane.showMessageDialog(null, "Erro: Senha do gerente está errada!");
            }
        }
        Baixo();
    }//GEN-LAST:event_ExcluirBaixaQuantidadeActionPerformed
    // Escolha de categoria//
    private void VinhosBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VinhosBActionPerformed
        if (VinhosB.isSelected()) {
            TodosB.setSelected(false);
            CervejasB.setSelected(false);
            DestiladosB.setSelected(false);
            EnergéticosB.setSelected(false);
            NaoAlcoolicosB.setSelected(false);
            MenorB.setSelected(false);
            MaiorB.setSelected(false);
            try {
                String url = "jdbc:mysql://localhost:3306/bebidas";
                String user = "root";
                String pass = "";

                Connection conn = DriverManager.getConnection(url, user, pass);
                Statement stmt = conn.createStatement();
                String Query = "SELECT `Nome`, `Lote`, `Categoria` , `Quantidade`, `Validade` FROM bebidas where Categoria = 'Vinhos' AND Quantidade > 1 AND Quantidade < 30";
                ResultSet Result = stmt.executeQuery(Query);
                DefaultListModel list = new DefaultListModel();
                while (Result.next()) {
                    list.addElement("");
                    list.addElement("Nome: " + Result.getString(1));
                    list.addElement(Result.getString(2));
                    list.addElement("Categoria: " + Result.getString(3));
                    list.addElement("Quantidade: " + Result.getString(4));
                    list.addElement("Validade: " + Result.getString(5));
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                }
                ListaB.setModel(list);

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Falha ao selecionar filtro! \n"
                    + "Erro: "+e.toString());
            }

        } else {
            VinhosB.setSelected(true);   
        }
    }//GEN-LAST:event_VinhosBActionPerformed

    private void NaoAlcoolicosBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NaoAlcoolicosBActionPerformed
        if (NaoAlcoolicosB.isSelected()) {
            TodosB.setSelected(false);
            CervejasB.setSelected(false);
            DestiladosB.setSelected(false);
            EnergéticosB.setSelected(false);
            VinhosB.setSelected(false);
            MenorB.setSelected(false);
            MaiorB.setSelected(false);
            try {
                String url = "jdbc:mysql://localhost:3306/bebidas";
                String user = "root";
                String pass = "";

                Connection conn = DriverManager.getConnection(url, user, pass);
                Statement stmt = conn.createStatement();
                String Query = "SELECT `Nome`, `Lote`, `Categoria` , `Quantidade`, `Validade` FROM bebidas where Categoria = 'Nãoalcoólicos' AND `Quantidade` > 29 AND `Quantidade` < 30";
                ResultSet Result = stmt.executeQuery(Query);
                DefaultListModel list = new DefaultListModel();
                while (Result.next()) {
                    list.addElement("");
                    list.addElement("Nome: " + Result.getString(1));
                    list.addElement(Result.getString(2));
                    list.addElement("Categoria: " + Result.getString(3));
                    list.addElement("Quantidade: " + Result.getString(4));
                    list.addElement("Validade: " + Result.getString(5));
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                }
                ListaB.setModel(list);

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Falha ao selecionar filtro! \n"
                    + "Erro: "+e.toString());
            }

        } else {
            NaoAlcoolicosB.setSelected(true);
        }
    }//GEN-LAST:event_NaoAlcoolicosBActionPerformed

    private void EnergéticosBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnergéticosBActionPerformed
        if (EnergéticosB.isSelected()) {
            TodosB.setSelected(false);
            CervejasB.setSelected(false);
            DestiladosB.setSelected(false);
            NaoAlcoolicosB.setSelected(false);
            VinhosB.setSelected(false);
            MenorB.setSelected(false);
            MaiorB.setSelected(false);
            try {
                String url = "jdbc:mysql://localhost:3306/bebidas";
                String user = "root";
                String pass = "";

                Connection conn = DriverManager.getConnection(url, user, pass);
                Statement stmt = conn.createStatement();
                String Query = "SELECT `Nome`, `Lote`, `Categoria` , `Quantidade`, `Validade` FROM bebidas where Categoria = 'Energéticos' AND `Quantidade` > 1 AND `Quantidade` < 30";
                ResultSet Result = stmt.executeQuery(Query);
                DefaultListModel list = new DefaultListModel();
                while (Result.next()) {
                    list.addElement("");
                    list.addElement("Nome: " + Result.getString(1));
                    list.addElement(Result.getString(2));
                    list.addElement("Categoria: " + Result.getString(3));
                    list.addElement("Quantidade: " + Result.getString(4));
                    list.addElement("Validade: " + Result.getString(5));
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                }
                ListaB.setModel(list);

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Falha ao selecionar filtro! \n"
                    + "Erro: "+e.toString());
            }

        } else {
            EnergéticosB.setSelected(true);
        }
    }//GEN-LAST:event_EnergéticosBActionPerformed

    private void DestiladosBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DestiladosBActionPerformed
        if (DestiladosB.isSelected()) {
            TodosB.setSelected(false);
            CervejasB.setSelected(false);
            EnergéticosB.setSelected(false);
            NaoAlcoolicosB.setSelected(false);
            VinhosB.setSelected(false);
            MenorB.setSelected(false);
            MaiorB.setSelected(false);
            try {
                String url = "jdbc:mysql://localhost:3306/bebidas";
                String user = "root";
                String pass = "";

                Connection conn = DriverManager.getConnection(url, user, pass);
                Statement stmt = conn.createStatement();
                String Query = "SELECT `Nome`, `Lote`, `Categoria` , `Quantidade`, `Validade` FROM bebidas where Categoria = 'Destilados' AND `Quantidade` > 1 AND `Quantidade` < 30";
                ResultSet Result = stmt.executeQuery(Query);
                DefaultListModel list = new DefaultListModel();
                while (Result.next()) {
                    list.addElement("");
                    list.addElement("Nome: " + Result.getString(1));
                    list.addElement(Result.getString(2));
                    list.addElement("Categoria: " + Result.getString(3));
                    list.addElement("Quantidade: " + Result.getString(4));
                    list.addElement("Validade: " + Result.getString(5));
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                }
                ListaB.setModel(list);

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Falha ao selecionar filtro! \n"
                    + "Erro: "+e.toString());
            }

        } else {
            DestiladosB.setSelected(true);
        }
    }//GEN-LAST:event_DestiladosBActionPerformed

    private void CervejasBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CervejasBActionPerformed
        if (CervejasB.isSelected()) {
            TodosB.setSelected(false);
            DestiladosB.setSelected(false);
            EnergéticosB.setSelected(false);
            NaoAlcoolicosB.setSelected(false);
            VinhosB.setSelected(false);
            MenorB.setSelected(false);
            MaiorB.setSelected(false);
            try {
                String url = "jdbc:mysql://localhost:3306/bebidas";
                String user = "root";
                String pass = "";

                Connection conn = DriverManager.getConnection(url, user, pass);
                Statement stmt = conn.createStatement();
                String Query = "SELECT `Nome`, `Lote`, `Categoria` , `Quantidade`, `Validade` FROM bebidas where Categoria = 'Cervejas' AND `Quantidade` > 1 AND `Quantidade` < 30";
                ResultSet Result = stmt.executeQuery(Query);
                DefaultListModel list = new DefaultListModel();
                while (Result.next()) {
                    list.addElement("");
                    list.addElement("Nome: " + Result.getString(1));
                    list.addElement(Result.getString(2));
                    list.addElement("Categoria: " + Result.getString(3));
                    list.addElement("Quantidade: " + Result.getString(4));
                    list.addElement("Validade: " + Result.getString(5));
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                }
                ListaB.setModel(list);

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Falha ao selecionar filtro! \n"
                    + "Erro: "+e.toString());
            }

        } else {
            CervejasB.setSelected(true);
        }
    }//GEN-LAST:event_CervejasBActionPerformed

    private void TodosBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodosBActionPerformed
        if (TodosB.isSelected()) {
            CervejasB.setSelected(false);
            DestiladosB.setSelected(false);
            EnergéticosB.setSelected(false);
            NaoAlcoolicosB.setSelected(false);
            VinhosB.setSelected(false);
            MenorB.setSelected(false);
            MaiorB.setSelected(false);
            try {
                String url = "jdbc:mysql://localhost:3306/bebidas";
                String user = "root";
                String pass = "";

                Connection conn = DriverManager.getConnection(url, user, pass);
                Statement stmt = conn.createStatement();
                String Query = "SELECT `Nome`, `Lote` , `Categoria` , `Quantidade`, `Validade` FROM bebidas where `Quantidade` < 30 AND `Quantidade` > 1";
                ResultSet Result = stmt.executeQuery(Query);
                DefaultListModel list = new DefaultListModel();
                while (Result.next()) {
                    list.addElement("");
                    list.addElement("Nome: " + Result.getString(1));
                    list.addElement(Result.getString(2));
                    list.addElement("Categoria: " + Result.getString(3));
                    list.addElement("Quantidade: " + Result.getString(4));
                    list.addElement("Validade: " + Result.getString(5));
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                }
                ListaB.setModel(list);

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Falha ao selecionar filtro! \n"
                    + "Erro: "+e.toString());
            }

        } else {
            TodosB.setSelected(true);
        }
    }//GEN-LAST:event_TodosBActionPerformed

    private void MaiorBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaiorBActionPerformed
        if (MaiorB.isSelected()) {
            MenorB.setSelected(false);
            TodosB.setSelected(false);
            CervejasB.setSelected(false);
            DestiladosB.setSelected(false);
            EnergéticosB.setSelected(false);
            NaoAlcoolicosB.setSelected(false);
            VinhosB.setSelected(false);
            try {
                String url = "jdbc:mysql://localhost:3306/bebidas";
                String user = "root";
                String pass = "";

                Connection conn = DriverManager.getConnection(url, user, pass);
                Statement stmt = conn.createStatement();
                String Query = "SELECT `Nome`, `Lote`, `Categoria` , `Quantidade`, `Validade` FROM bebidas where `Quantidade` > 1 AND `Quantidade` < 30 ORDER BY Lote DESC";
                ResultSet Result = stmt.executeQuery(Query);
                DefaultListModel list = new DefaultListModel();
                while (Result.next()) {
                    list.addElement("");
                    list.addElement("Nome: " + Result.getString(1));
                    list.addElement(Result.getString(2));
                    list.addElement("Categoria: " + Result.getString(3));
                    list.addElement("Quantidade: " + Result.getString(4));
                    list.addElement("Validade: " + Result.getString(5));
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                }
                ListaB.setModel(list);

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Falha ao selecionar filtro! \n"
                    + "Erro: "+e.toString());
            }

        } else {
            MaiorB.setSelected(true);
        }
    }//GEN-LAST:event_MaiorBActionPerformed

    private void MenorBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenorBActionPerformed
        if (MenorB.isSelected()) {
            MaiorB.setSelected(false);
            TodosB.setSelected(false);
            CervejasB.setSelected(false);
            DestiladosB.setSelected(false);
            EnergéticosB.setSelected(false);
            NaoAlcoolicosB.setSelected(false);
            VinhosB.setSelected(false);
            try {
                String url = "jdbc:mysql://localhost:3306/bebidas";
                String user = "root";
                String pass = "";

                Connection conn = DriverManager.getConnection(url, user, pass);
                Statement stmt = conn.createStatement();
                String Query = "SELECT `Nome`, `Lote`, `Categoria` , `Quantidade`, `Validade` FROM bebidas where `Quantidade` > 1 AND `Quantidade` < 30 ORDER BY Lote ASC";
                ResultSet Result = stmt.executeQuery(Query);
                DefaultListModel list = new DefaultListModel();
                while (Result.next()) {
                    list.addElement("");
                    list.addElement("Nome: " + Result.getString(1));
                    list.addElement(Result.getString(2));
                    list.addElement("Categoria: " + Result.getString(3));
                    list.addElement("Quantidade: " + Result.getString(4));
                    list.addElement("Validade: " + Result.getString(5));
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                }
                ListaB.setModel(list);

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Falha ao selecionar filtro! \n"
                    + "Erro: "+e.toString());
            }

        } else {
            MenorB.setSelected(true);    
        }
    }//GEN-LAST:event_MenorBActionPerformed

    private void AtualizarBaixaQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarBaixaQuantidadeActionPerformed
        if (QuantidadeB.getText().isEmpty() || LoteB.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Um ou mais campos estão vazios, Complete as Informações, Por Favor!", "Alert", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                String url = "jdbc:mysql://localhost:3306/bebidas";
                String user = "root";
                String pass = "";

                Connection conn = DriverManager.getConnection(url, user, pass);
                Statement stmt = conn.createStatement();
                String Query = "UPDATE bebidas SET Quantidade = '" + QuantidadeB.getText() + "' WHERE Lote = '" + LoteB.getText() + "'";
                stmt.execute(Query);

                JOptionPane.showMessageDialog(null, "Atualizado!");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar bebida!: \n"
                        +"Erro: "+e.toString());
            }
        }
        Baixo();
        Zerados();
        Bebidas();
    }//GEN-LAST:event_AtualizarBaixaQuantidadeActionPerformed

    private void QuantidadeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantidadeBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantidadeBActionPerformed

    private void ListaBValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaBValueChanged
        try {
            String url = "jdbc:mysql://localhost:3306/bebidas";
            String user = "root";
            String pass = "";

            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();
            String Query = "SELECT * FROM bebidas WHERE Lote = '" + ListaB.getSelectedValue() + "';";
            ResultSet Result = stmt.executeQuery(Query);
            DefaultListModel list = new DefaultListModel();
            while (Result.next()) {
                LoteB.setText(Result.getString(1));
                QuantidadeB.setText(Result.getString(4));

            }
            ListaB.setModel(list);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: "+e.toString());
        }
        Baixo();
    }//GEN-LAST:event_ListaBValueChanged

    private void VoltarBaixaQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarBaixaQuantidadeActionPerformed
        setVisible(false);
    }//GEN-LAST:event_VoltarBaixaQuantidadeActionPerformed

    private void ExcluirBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirBebidasActionPerformed
        if (LoteBebidas.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Usuário e/ou Senha do Gerente Vazios,Complete as Informações, Por Favor!", "Alert", JOptionPane.WARNING_MESSAGE);
        } else {
            if (SenhaG.getText().equals("2307")) {
                try {
                    String url = "jdbc:mysql://localhost:3306/bebidas";
                    String user = "root";
                    String pass = "";

                    Connection conn = DriverManager.getConnection(url, user, pass);
                    Statement stmt = conn.createStatement();
                    String Query = "DELETE FROM `bebidas` WHERE Lote = '" + LoteBebidas.getText() + "'";
                    stmt.execute(Query);

                    JOptionPane.showMessageDialog(null, "Bebida Deletada Com Sucesso!");

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Erro ao deletar bebidas! \n: "
                            + "Erro: "+e.toString());
                }

            } else {
                JOptionPane.showMessageDialog(null, "Senha do gerente está incorreta! ");
            }
        }
        Bebidas();
    }//GEN-LAST:event_ExcluirBebidasActionPerformed

    private void MaiorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaiorActionPerformed
        if (Maior.isSelected()) {
            Menor.setSelected(false);
            Todos.setSelected(false);
            Cervejas.setSelected(false);
            Destilados.setSelected(false);
            Energéticos.setSelected(false);
            NaoAlcoolicos.setSelected(false);
            Vinhos.setSelected(false);
            try {
                String url = "jdbc:mysql://localhost:3306/bebidas";
                String user = "root";
                String pass = "";

                Connection conn = DriverManager.getConnection(url, user, pass);
                Statement stmt = conn.createStatement();
                String Query = "SELECT `Nome`, `Lote`, `Categoria` , `Quantidade`, `Validade` FROM bebidas where `Quantidade` > 29 ORDER BY Lote DESC";
                ResultSet Result = stmt.executeQuery(Query);
                DefaultListModel list = new DefaultListModel();
                while(Result.next()){
                    list.addElement("");
                    list.addElement("Nome: "+Result.getString(1));
                    list.addElement(Result.getString(2));
                    list.addElement("Categoria: "+Result.getString(3));
                    list.addElement("Quantidade: "+Result.getString(4));
                    list.addElement("Validade: "+Result.getString(5));
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                }
                ListaBebidas.setModel(list);

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Falha ao selecionar filtro! \n"
                    + "Erro: "+e.toString());
            }

        }else{
            Maior.setSelected(true);
        }
    }//GEN-LAST:event_MaiorActionPerformed

    private void MenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenorActionPerformed
        if (Menor.isSelected()) {
            Maior.setSelected(false);
            Todos.setSelected(false);
            Cervejas.setSelected(false);
            Destilados.setSelected(false);
            Energéticos.setSelected(false);
            NaoAlcoolicos.setSelected(false);
            Vinhos.setSelected(false);
            try {
                String url = "jdbc:mysql://localhost:3306/bebidas";
                String user = "root";
                String pass = "";

                Connection conn = DriverManager.getConnection(url, user, pass);
                Statement stmt = conn.createStatement();
                String Query = "SELECT `Nome`, `Lote`, `Categoria` , `Quantidade`, `Validade` FROM bebidas where `Quantidade` > 29 ORDER BY Lote ASC";
                ResultSet Result = stmt.executeQuery(Query);
                DefaultListModel list = new DefaultListModel();
                while(Result.next()){
                    list.addElement("");
                    list.addElement("Nome: "+Result.getString(1));
                    list.addElement(Result.getString(2));
                    list.addElement("Categoria: "+Result.getString(3));
                    list.addElement("Quantidade: "+Result.getString(4));
                    list.addElement("Validade: "+Result.getString(5));
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                }
                ListaBebidas.setModel(list);

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Falha ao selecionar filtro! \n"
                    + "Erro: "+e.toString());
            }

        }else{
            Menor.setSelected(true);
        }
    }//GEN-LAST:event_MenorActionPerformed

    private void VinhosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VinhosActionPerformed
        if (Vinhos.isSelected()) {
            Todos.setSelected(false);
            Cervejas.setSelected(false);
            Destilados.setSelected(false);
            Energéticos.setSelected(false);
            NaoAlcoolicos.setSelected(false);
            Menor.setSelected(false);
            Maior.setSelected(false);
            try {
                String url = "jdbc:mysql://localhost:3306/bebidas";
                String user = "root";
                String pass = "";

                Connection conn = DriverManager.getConnection(url, user, pass);
                Statement stmt = conn.createStatement();
                String Query = "SELECT `Nome`, `Lote`, `Categoria` , `Quantidade`, `Validade` FROM bebidas where Categoria = 'Vinhos' AND Quantidade > 29";
                ResultSet Result = stmt.executeQuery(Query);
                DefaultListModel list = new DefaultListModel();
                while(Result.next()){
                    list.addElement("");
                    list.addElement("Nome: "+Result.getString(1));
                    list.addElement(Result.getString(2));
                    list.addElement("Categoria: "+Result.getString(3));
                    list.addElement("Quantidade: "+Result.getString(4));
                    list.addElement("Validade: "+Result.getString(5));
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                }
                ListaBebidas.setModel(list);

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Falha ao selecionar filtro! \n"
                    + "Erro: "+e.toString());
            }

        }else{
            Vinhos.setSelected(true);
        }
    }//GEN-LAST:event_VinhosActionPerformed

    private void NaoAlcoolicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NaoAlcoolicosActionPerformed
        if (NaoAlcoolicos.isSelected()) {
            Todos.setSelected(false);
            Cervejas.setSelected(false);
            Destilados.setSelected(false);
            Energéticos.setSelected(false);
            Vinhos.setSelected(false);
            Menor.setSelected(false);
            Maior.setSelected(false);
            try {
                String url = "jdbc:mysql://localhost:3306/bebidas";
                String user = "root";
                String pass = "";

                Connection conn = DriverManager.getConnection(url, user, pass);
                Statement stmt = conn.createStatement();
                String Query = "SELECT `Nome`, `Lote`, `Categoria` , `Quantidade`, `Validade` FROM bebidas where Categoria = 'Nãoalcoólicos' AND `Quantidade` > 29";
                ResultSet Result = stmt.executeQuery(Query);
                DefaultListModel list = new DefaultListModel();
                while(Result.next()){
                    list.addElement("");
                    list.addElement("Nome: "+Result.getString(1));
                    list.addElement(Result.getString(2));
                    list.addElement("Categoria: "+Result.getString(3));
                    list.addElement("Quantidade: "+Result.getString(4));
                    list.addElement("Validade: "+Result.getString(5));
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                }
                ListaBebidas.setModel(list);

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Falha ao selecionar filtro! \n"
                    + "Erro: "+e.toString());
            }

        }else{
            NaoAlcoolicos.setSelected(true);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_NaoAlcoolicosActionPerformed

    private void EnergéticosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnergéticosActionPerformed
        if (Energéticos.isSelected()) {
            Todos.setSelected(false);
            Cervejas.setSelected(false);
            Destilados.setSelected(false);
            NaoAlcoolicos.setSelected(false);
            Vinhos.setSelected(false);
            Menor.setSelected(false);
            Maior.setSelected(false);
            try {
                String url = "jdbc:mysql://localhost:3306/bebidas";
                String user = "root";
                String pass = "";

                Connection conn = DriverManager.getConnection(url, user, pass);
                Statement stmt = conn.createStatement();
                String Query = "SELECT `Nome`, `Lote`, `Categoria` , `Quantidade`, `Validade` FROM bebidas where Categoria = 'Energéticos' AND `Quantidade` > 29";
                ResultSet Result = stmt.executeQuery(Query);
                DefaultListModel list = new DefaultListModel();
                while(Result.next()){
                    list.addElement("");
                    list.addElement("Nome: "+Result.getString(1));
                    list.addElement(Result.getString(2));
                    list.addElement("Categoria: "+Result.getString(3));
                    list.addElement("Quantidade: "+Result.getString(4));
                    list.addElement("Validade: "+Result.getString(5));
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                }
                ListaBebidas.setModel(list);

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Falha ao selecionar filtro! \n"
                    + "Erro: "+e.toString());
            }

        }else{
            Energéticos.setSelected(true);
        }
    }//GEN-LAST:event_EnergéticosActionPerformed

    private void DestiladosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DestiladosActionPerformed
        if (Destilados.isSelected()) {
            Todos.setSelected(false);
            Cervejas.setSelected(false);
            Energéticos.setSelected(false);
            NaoAlcoolicos.setSelected(false);
            Vinhos.setSelected(false);
            Menor.setSelected(false);
            Maior.setSelected(false);
            try {
                String url = "jdbc:mysql://localhost:3306/bebidas";
                String user = "root";
                String pass = "";

                Connection conn = DriverManager.getConnection(url, user, pass);
                Statement stmt = conn.createStatement();
                String Query = "SELECT `Nome`, `Lote`, `Categoria` , `Quantidade`, `Validade` FROM bebidas where Categoria = 'Destilados' AND `Quantidade` > 29";
                ResultSet Result = stmt.executeQuery(Query);
                DefaultListModel list = new DefaultListModel();
                while(Result.next()){
                    list.addElement("");
                    list.addElement("Nome: "+Result.getString(1));
                    list.addElement(Result.getString(2));
                    list.addElement("Categoria: "+Result.getString(3));
                    list.addElement("Quantidade: "+Result.getString(4));
                    list.addElement("Validade: "+Result.getString(5));
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                }
                ListaBebidas.setModel(list);

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Falha ao selecionar filtro! \n"
                    + "Erro: "+e.toString());
            }

        }else{
            Destilados.setSelected(true);
        }
    }//GEN-LAST:event_DestiladosActionPerformed

    private void CervejasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CervejasActionPerformed
        if (Cervejas.isSelected()) {
            Todos.setSelected(false);
            Destilados.setSelected(false);
            Energéticos.setSelected(false);
            NaoAlcoolicos.setSelected(false);
            Vinhos.setSelected(false);
            Menor.setSelected(false);
            Maior.setSelected(false);
            try {
                String url = "jdbc:mysql://localhost:3306/bebidas";
                String user = "root";
                String pass = "";

                Connection conn = DriverManager.getConnection(url, user, pass);
                Statement stmt = conn.createStatement();
                String Query = "SELECT `Nome`, `Lote`, `Categoria` , `Quantidade`, `Validade` FROM bebidas where Categoria = 'Cervejas' AND `Quantidade` > 29";
                ResultSet Result = stmt.executeQuery(Query);
                DefaultListModel list = new DefaultListModel();
                while(Result.next()){
                    list.addElement("");
                    list.addElement("Nome: "+Result.getString(1));
                    list.addElement(Result.getString(2));
                    list.addElement("Categoria: "+Result.getString(3));
                    list.addElement("Quantidade: "+Result.getString(4));
                    list.addElement("Validade: "+Result.getString(5));
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                }
                ListaBebidas.setModel(list);

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Falha ao selecionar filtro! \n"
                    + "Erro: "+e.toString());
            }

        }else{
            Cervejas.setSelected(true);
        }
    }//GEN-LAST:event_CervejasActionPerformed

    private void TodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodosActionPerformed
        if (Todos.isSelected()) {
            Cervejas.setSelected(false);
            Destilados.setSelected(false);
            Energéticos.setSelected(false);
            NaoAlcoolicos.setSelected(false);
            Vinhos.setSelected(false);
            Menor.setSelected(false);
            Maior.setSelected(false);
            try {
                String url = "jdbc:mysql://localhost:3306/bebidas";
                String user = "root";
                String pass = "";

                Connection conn = DriverManager.getConnection(url, user, pass);
                Statement stmt = conn.createStatement();
                String Query = "SELECT `Nome`, `Lote` , `Categoria` , `Quantidade`, `Validade` FROM bebidas where `Quantidade` > 29";
                ResultSet Result = stmt.executeQuery(Query);
                DefaultListModel list = new DefaultListModel();
                while(Result.next()){
                    list.addElement("");
                    list.addElement("Nome: "+Result.getString(1));
                    list.addElement(Result.getString(2));
                    list.addElement("Categoria: "+Result.getString(3));
                    list.addElement("Quantidade: "+Result.getString(4));
                    list.addElement("Validade: "+Result.getString(5));
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                    list.addElement("");
                }
                ListaBebidas.setModel(list);

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Falha ao selecionar filtro! \n"
                    + "Erro: "+e.toString());
            }

        }else{
            Todos.setSelected(true);
        }
    }//GEN-LAST:event_TodosActionPerformed

    private void LoteBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoteBebidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoteBebidasActionPerformed

    private void AtualizarBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarBebidasActionPerformed
        if (QuantidadeCerveja.getText().isEmpty() || LoteBebidas.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Um ou mais campos estão vazios, Complete as Informações, Por Favor!", "Alert", JOptionPane.WARNING_MESSAGE);
        } else {
            try{
                String url = "jdbc:mysql://localhost:3306/bebidas";
                String user = "root";
                String pass = "";

                Connection conn = DriverManager.getConnection(url, user, pass);
                Statement stmt = conn.createStatement();
                String Query = "UPDATE bebidas SET Quantidade = '"+QuantidadeCerveja.getText()+"' WHERE Lote = '"+LoteBebidas.getText()+"'";
                stmt.execute(Query);

                JOptionPane.showMessageDialog(null, "Atualizado!");

            }catch(SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar bebidas! \n: "
                        + "Erro: "+e.toString());
            }
        }
        Baixo();
        Zerados();
        Bebidas();
    }//GEN-LAST:event_AtualizarBebidasActionPerformed

    private void QuantidadeCervejaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantidadeCervejaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantidadeCervejaActionPerformed

    private void VoltarBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarBebidasActionPerformed
        setVisible(false);
    }//GEN-LAST:event_VoltarBebidasActionPerformed

    private void ListaBebidasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaBebidasValueChanged

        try {
            String url = "jdbc:mysql://localhost:3306/bebidas";
            String user = "root";
            String pass = "";

            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();
            String Query = "SELECT * FROM bebidas WHERE Lote = '"+ListaBebidas.getSelectedValue()+"'";
            ResultSet Result = stmt.executeQuery(Query);
            DefaultListModel list = new DefaultListModel();
            while(Result.next()){
                LoteBebidas.setText(Result.getString(1));
                QuantidadeCerveja.setText(Result.getString(4));

            }
            ListaBebidas.setModel(list);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: "+e.toString());
        }
        Bebidas();
    }//GEN-LAST:event_ListaBebidasValueChanged

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
    private javax.swing.JButton ApagarTudo;
    private javax.swing.JButton AtualizarBaixaQuantidade;
    private javax.swing.JButton AtualizarBebidas;
    private javax.swing.JList<String> BebidasZeradas;
    private javax.swing.JCheckBox Cervejas;
    private javax.swing.JCheckBox CervejasB;
    private javax.swing.JCheckBox Destilados;
    private javax.swing.JCheckBox DestiladosB;
    private javax.swing.JCheckBox Energéticos;
    private javax.swing.JCheckBox EnergéticosB;
    private javax.swing.JButton ExcluirBaixaQuantidade;
    private javax.swing.JButton ExcluirBebidas;
    private javax.swing.JList<String> ListaB;
    private javax.swing.JList<String> ListaBebidas;
    private javax.swing.JTextField LoteB;
    private javax.swing.JTextField LoteBebidas;
    private javax.swing.JCheckBox Maior;
    private javax.swing.JCheckBox MaiorB;
    private javax.swing.JCheckBox Menor;
    private javax.swing.JCheckBox MenorB;
    private javax.swing.JCheckBox NaoAlcoolicos;
    private javax.swing.JCheckBox NaoAlcoolicosB;
    private javax.swing.JTextField QuantidadeB;
    private javax.swing.JTextField QuantidadeCerveja;
    private javax.swing.JTextField SenhaG;
    private javax.swing.JTextField SenhaGE;
    private javax.swing.JCheckBox Todos;
    private javax.swing.JCheckBox TodosB;
    private javax.swing.JCheckBox Vinhos;
    private javax.swing.JCheckBox VinhosB;
    private javax.swing.JButton VoltarBaixaQuantidade;
    private javax.swing.JButton VoltarBebidas;
    private javax.swing.JButton VoltarZerados;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
