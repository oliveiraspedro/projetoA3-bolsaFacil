/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Repositories.AdminRepository;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Blackmage
 */
public class TelaGerenciamentoInst extends javax.swing.JFrame {

    /**
     * Creates new form TelaGerenciamentoInst
     */
    public TelaGerenciamentoInst() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnPesquisa = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInst = new javax.swing.JTable();
        labelInst = new javax.swing.JLabel();
        btnShow = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        AdminRepository adminRepository = new AdminRepository();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1160, 720));
        setSize(new java.awt.Dimension(1160, 720));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(75, 109, 190));
        jPanel1.setLayout(null);

        btnPesquisa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tool_16205471.png"))); // NOI18N
        btnPesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });
        jPanel1.add(btnPesquisa);
        btnPesquisa.setBounds(320, 110, 40, 40);

        txtPesquisa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPesquisa.setText("Clique para pesquisar");
        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });
        jPanel1.add(txtPesquisa);
        txtPesquisa.setBounds(80, 110, 230, 40);

        tblInst.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        // Definição do modelo da tabela
        DefaultTableModel model = new DefaultTableModel(
                new Object[][] {},
                new String[] { "ID", "NOME", "E-MAIL", "SIGLA", "CNPJ", "CEP" }
        );

        // Criação da tabela com o modelo
        tblInst = new JTable(model);

        jScrollPane1.setViewportView(tblInst);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(80, 212, 1000, 430);

        labelInst.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        labelInst.setForeground(new java.awt.Color(255, 255, 255));
        labelInst.setText("Instituições");
        labelInst.setToolTipText("");
        labelInst.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(labelInst);
        labelInst.setBounds(80, 60, 240, 40);

        btnShow.setText("Mostrar Instituições");
        btnShow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminRepository.getAllInstituicoes(tblInst);
            }
        });
        jPanel1.add(btnShow);
        btnShow.setBounds(710, 110, 160, 40);

        btnClear.setText("Limpar Instituições");
        btnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnClear);
        btnClear.setBounds(920, 110, 160, 40);

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adminRepository.limparInstituicao(model);
            }
        });

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1160, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnShowActionPerformed

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
            java.util.logging.Logger.getLogger(TelaGerenciamentoInst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciamentoInst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciamentoInst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciamentoInst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaGerenciamentoInst tela = new TelaGerenciamentoInst();
            tela.setVisible(true);

            tela.txtPesquisa.addFocusListener(new java.awt.event.FocusListener() {
                public void focusGained(java.awt.event.FocusEvent evt) {
                    // Quando o campo ganha o foco, remove o texto padrão
                    if (tela.txtPesquisa.getText().equals("Clique para pesquisar")) {
                        tela.txtPesquisa.setText("");
                        tela.txtPesquisa.setForeground(java.awt.Color.BLACK); // Texto visível
                    }
                }

                public void focusLost(java.awt.event.FocusEvent evt) {
                    // Quando o campo perde o foco, se o texto estiver vazio, restaura o texto inicial
                    if (tela.txtPesquisa.getText().isEmpty()) {
                        tela.txtPesquisa.setText("Clique para pesquisar");
                        tela.txtPesquisa.setForeground(java.awt.Color.GRAY); // Texto cinza
                    }
                }
            });
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnShow;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelInst;
    private javax.swing.JTable tblInst;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}