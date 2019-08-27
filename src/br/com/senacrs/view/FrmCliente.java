/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senacrs.view;

import br.com.senacrs.Dao.ClienteDao;
import br.com.senacrs.model.Cliente;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author 181810082
 */
public final class FrmCliente extends javax.swing.JFrame {

    /**
     * Creates new form FrmCliente
     */
    public FrmCliente() {
        initComponents();
        setLocationRelativeTo(null);
        DefaultTableModel modelo = (DefaultTableModel) tbPesquisar.getModel();
        tbPesquisar.setRowSorter(new TableRowSorter(modelo));
        readJTable();
    }

    public void readJTable() {
        DefaultTableModel modelo = (DefaultTableModel) tbPesquisar.getModel();
        modelo.setNumRows(0);
        ClienteDao udao = new ClienteDao();

        for (Cliente u : udao.read()) {

            modelo.addRow(new Object[]{
                u.getId(),
                u.getNome(),
                u.getEmail(),
                u.getSenha(),
                u.getCelular(),
                u.getTelefone(),
                u.getNumero(),
                u.getCep(),
                u.getData(),
                u.getRua(),
                u.getBairro()});

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNome = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbSenha = new javax.swing.JLabel();
        lbCelular = new javax.swing.JLabel();
        lbTelefone = new javax.swing.JLabel();
        lbNumero = new javax.swing.JLabel();
        lbCep = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        lbRua = new javax.swing.JLabel();
        lbBairro = new javax.swing.JLabel();
        edNome = new javax.swing.JTextField();
        edRua = new javax.swing.JTextField();
        edNumero = new javax.swing.JTextField();
        edBairro = new javax.swing.JTextField();
        edCep = new javax.swing.JTextField();
        edTelefone = new javax.swing.JTextField();
        edCelular = new javax.swing.JTextField();
        edEmail = new javax.swing.JTextField();
        edSenha = new javax.swing.JTextField();
        edData = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPesquisar = new javax.swing.JTable();
        lbId = new javax.swing.JLabel();
        edIdCli = new javax.swing.JTextField();
        btExcluir = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        edPesquisa = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        Fundo = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Cliente");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbNome.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lbNome.setText("Nome");
        getContentPane().add(lbNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 51, 28));

        lbEmail.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lbEmail.setText("Email");
        getContentPane().add(lbEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        lbSenha.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lbSenha.setText("Senha");
        getContentPane().add(lbSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, -1, -1));

        lbCelular.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lbCelular.setText("Celular");
        getContentPane().add(lbCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, -1, -1));

        lbTelefone.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lbTelefone.setText("Tel");
        getContentPane().add(lbTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        lbNumero.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lbNumero.setText("Numero");
        getContentPane().add(lbNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, -1, 14));

        lbCep.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lbCep.setText("Cep");
        getContentPane().add(lbCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, -1, -1));

        lbData.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lbData.setText("Data");
        getContentPane().add(lbData, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, -1, -1));

        lbRua.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lbRua.setText("Rua");
        getContentPane().add(lbRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

        lbBairro.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lbBairro.setText("Bairro");
        getContentPane().add(lbBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));
        getContentPane().add(edNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 268, -1));
        getContentPane().add(edRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 282, -1));
        getContentPane().add(edNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 50, -1));
        getContentPane().add(edBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 96, -1));
        getContentPane().add(edCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 124, -1));
        getContentPane().add(edTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 96, -1));
        getContentPane().add(edCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 97, -1));
        getContentPane().add(edEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 324, -1));
        getContentPane().add(edSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 124, -1));

        edData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edDataActionPerformed(evt);
            }
        });
        getContentPane().add(edData, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 97, -1));

        tbPesquisar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Email", "Senha", "Celular", "Telefone", "Numero", "Cep", "Data", "Rua", "Bairro"
            }
        ));
        tbPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPesquisarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPesquisar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 486, 820, 144));

        lbId.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lbId.setText("Id");
        getContentPane().add(lbId, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 30, -1));
        getContentPane().add(edIdCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 93, -1));

        btExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/iconfinder_trash_100984.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, -1, 30));

        btAlterar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/iconfinder_administrator1_(edit)_16x16_9715.gif"))); // NOI18N
        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, -1, 30));

        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/iconfinder_save_101249.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 415, 111, 30));

        edPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edPesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(edPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 185, 30));

        btPesquisar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/iconfinder_search_4103.png"))); // NOI18N
        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, -1, 30));

        Fundo.setBackground(new java.awt.Color(153, 0, 0));

        lbTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 46)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo.setText("      Cliente");

        javax.swing.GroupLayout FundoLayout = new javax.swing.GroupLayout(Fundo);
        Fundo.setLayout(FundoLayout);
        FundoLayout.setHorizontalGroup(
            FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FundoLayout.createSequentialGroup()
                .addContainerGap(246, Short.MAX_VALUE)
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(235, 235, 235))
        );
        FundoLayout.setVerticalGroup(
            FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FundoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lbTitulo)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edDataActionPerformed

    }//GEN-LAST:event_edDataActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        if (tbPesquisar.getSelectedRow() != -1) {
            Cliente u = new Cliente();
            ClienteDao dao = new ClienteDao();

            u.setId((int) tbPesquisar.getValueAt(tbPesquisar.getSelectedRow(), 0));
            dao.delete(u);

    
            
            edIdCli.setText("");
            edNome.setText("");
            edEmail.setText("");
            edSenha.setText("");
            edCelular.setText("");
            edTelefone.setText("");
            edNumero.setText("");
            edCep.setText("");
            edData.setText("");
            edRua.setText("");
            edBairro.setText("");
           
           
            readJTable();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir.");
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        if (tbPesquisar.getSelectedRow() != -1) {

            Cliente u = new Cliente();
            ClienteDao dao = new ClienteDao();

            u.setNome(edNome.getText());
            u.setEmail(edEmail.getText());
            u.setSenha(edSenha.getText());
            u.setCelular(edCelular.getText());
            u.setTelefone(edTelefone.getText());
            u.setNumero(edNumero.getText());
            u.setCep(edCep.getText());
            u.setData(edData.getText());
            u.setRua(edRua.getText());
            u.setBairro(edBairro.getText());

            u.setId((int) tbPesquisar.getValueAt(tbPesquisar.getSelectedRow(), 0));
            dao.update(u);

            
            edNome.setText("");
            edEmail.setText("");
            edSenha.setText("");
            edCelular.setText("");
            edTelefone.setText("");
            edNumero.setText("");
            edCep.setText("");
            edData.setText("");
            edRua.setText("");
            edBairro.setText("");
           

            readJTable();

        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        Cliente u = new Cliente();
        ClienteDao dao = new ClienteDao();

        // u.setData((int) tbPesquisar.getValueAt(tbPesquisar.getSelectedRow(), 0));
        u.setNome(edNome.getText());
        u.setEmail(edEmail.getText());
        u.setSenha(edSenha.getText());
        u.setCelular(edCelular.getText());
        u.setTelefone(edTelefone.getText());
        u.setNumero(edNumero.getText());
        u.setCep(edCep.getText());
        u.setData(edData.getText());
        u.setRua(edRua.getText());
        u.setBairro(edBairro.getText());

        dao.create(u);

        
        edNome.setText("");
        edEmail.setText("");
        edSenha.setText("");
        edCelular.setText("");
        edTelefone.setText("");
        edNumero.setText("");
        edCep.setText("");
        edRua.setText("");
        edData.setText("");
        edBairro.setText("");
       

        readJTable();
    }//GEN-LAST:event_btSalvarActionPerformed
      
    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        readForDesc(edPesquisa.getText());
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void edPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edPesquisaActionPerformed

    private void tbPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPesquisarMouseClicked
              if (tbPesquisar.getSelectedRow() != -1) {
         
            edIdCli.setText(tbPesquisar.getValueAt(tbPesquisar.getSelectedRow(), 0).toString());
            edNome.setText(tbPesquisar.getValueAt(tbPesquisar.getSelectedRow(), 1).toString());
            edEmail.setText(tbPesquisar.getValueAt(tbPesquisar.getSelectedRow(), 2).toString());
            edSenha.setText(tbPesquisar.getValueAt(tbPesquisar.getSelectedRow(), 3).toString());
            edCelular.setText(tbPesquisar.getValueAt(tbPesquisar.getSelectedRow(), 4).toString());
            edTelefone.setText(tbPesquisar.getValueAt(tbPesquisar.getSelectedRow(), 5).toString());
            edNumero.setText(tbPesquisar.getValueAt(tbPesquisar.getSelectedRow(), 6).toString());
            edCep.setText(tbPesquisar.getValueAt(tbPesquisar.getSelectedRow(), 7).toString());
            edRua.setText(tbPesquisar.getValueAt(tbPesquisar.getSelectedRow(), 9).toString());
            edData.setText(tbPesquisar.getValueAt(tbPesquisar.getSelectedRow(), 8).toString());
            edBairro.setText(tbPesquisar.getValueAt(tbPesquisar.getSelectedRow(), 10).toString());



        }
    }//GEN-LAST:event_tbPesquisarMouseClicked

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
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fundo;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JTextField edBairro;
    private javax.swing.JTextField edCelular;
    private javax.swing.JTextField edCep;
    private javax.swing.JTextField edData;
    private javax.swing.JTextField edEmail;
    private javax.swing.JTextField edIdCli;
    private javax.swing.JTextField edNome;
    private javax.swing.JTextField edNumero;
    private javax.swing.JTextField edPesquisa;
    private javax.swing.JTextField edRua;
    private javax.swing.JTextField edSenha;
    private javax.swing.JTextField edTelefone;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbCelular;
    private javax.swing.JLabel lbCep;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbId;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JLabel lbRua;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTable tbPesquisar;
    // End of variables declaration//GEN-END:variables

    private void readForDesc(String text) {

    }
}
