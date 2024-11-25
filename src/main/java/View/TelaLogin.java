package View;

import Controllers.LoginController;
import DTOs.AlunoDTO;
import Entities.Admin;
import Entities.Aluno;
import Entities.Instituicao;
import Entities.User;
import Enums.UserTypes;
import javax.swing.JOptionPane;
import java.awt.*; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.awt.event.MouseAdapter; 
import java.awt.event.MouseEvent; 

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author pedro
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
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
        BTcadastro = new javax.swing.JButton();
        BTlogin = new javax.swing.JButton();
        PSWsenha = new javax.swing.JPasswordField();
        TXTFemail = new javax.swing.JTextField();
        LBsenha = new javax.swing.JLabel();
        LBEmail = new javax.swing.JLabel();
        LBBemvindo1 = new javax.swing.JLabel();
        LBBemvindo = new javax.swing.JLabel();
        LBimagem = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1160, 720));
        jPanel1.setLayout(null);

        BTcadastro.setBackground(new java.awt.Color(123, 150, 212));
        BTcadastro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BTcadastro.setForeground(new java.awt.Color(255, 255, 255));
        BTcadastro.setText("Cadastre-se");
        BTcadastro.setBorder(null);
        BTcadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTcadastroActionPerformed(evt);
            }
        });
        jPanel1.add(BTcadastro);
        BTcadastro.setBounds(730, 620, 330, 60);

        BTlogin.setBackground(new java.awt.Color(123, 150, 212));
        BTlogin.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BTlogin.setForeground(new java.awt.Color(255, 255, 255));
        BTlogin.setText("Login");
        BTlogin.setBorder(null);
        BTlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTloginActionPerformed(evt);
            }
        });
        jPanel1.add(BTlogin);
        BTlogin.setBounds(730, 550, 330, 60);

        PSWsenha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        PSWsenha.setText("jPasswordField1");
        jPanel1.add(PSWsenha);
        PSWsenha.setBounds(720, 400, 340, 70);

        TXTFemail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TXTFemail.setText("E-mail");
        TXTFemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXTFemailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXTFemailFocusLost(evt);
            }
        });
        TXTFemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTFemailActionPerformed(evt);
            }
        });
        jPanel1.add(TXTFemail);
        TXTFemail.setBounds(720, 300, 340, 60);

        LBsenha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LBsenha.setForeground(new java.awt.Color(255, 255, 255));
        LBsenha.setText("Senha");
        jPanel1.add(LBsenha);
        LBsenha.setBounds(730, 370, 80, 22);

        LBEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LBEmail.setForeground(new java.awt.Color(255, 255, 255));
        LBEmail.setText("E-mail");
        jPanel1.add(LBEmail);
        LBEmail.setBounds(730, 270, 60, 20);

        LBBemvindo1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        LBBemvindo1.setForeground(new java.awt.Color(255, 255, 255));
        LBBemvindo1.setText("Faça o seu Login");
        jPanel1.add(LBBemvindo1);
        LBBemvindo1.setBounds(760, 160, 300, 40);

        LBBemvindo.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        LBBemvindo.setForeground(new java.awt.Color(255, 255, 255));
        LBBemvindo.setText("Bem - vindo!!");
        jPanel1.add(LBBemvindo);
        LBBemvindo.setBounds(750, 100, 320, 56);

        LBimagem.setIcon(new javax.swing.ImageIcon("C:\\Users\\pedro\\Downloads\\Blue Flat Color Ui Login Page Desktop Prototype (4).png")); // NOI18N
        jPanel1.add(LBimagem);
        LBimagem.setBounds(40, 110, 620, 500);

        jPanel2.setBackground(new java.awt.Color(76, 111, 191));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Esqueceu a Senha?");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(322, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(96, 96, 96))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(487, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(211, 211, 211))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(580, 0, 580, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTloginActionPerformed
        AlunoDTO alunoDTO = new AlunoDTO();
        LoginController loginController = new LoginController();

        String email = TXTFemail.getText();
        String senha = PSWsenha.getText();

        alunoDTO.setEmail(email);
        alunoDTO.setSenha(senha);
      
        User user = loginController.login(alunoDTO);
        
        if (user instanceof Admin admin) {
                TelaDashboard telaDashboard = new TelaDashboard();
                telaDashboard.pack();
                dispose();
                telaDashboard.setVisible(true);
                return;
        }
        
        if (user instanceof Aluno aluno) {
            TelaConsultaBolsas telaConsultaBolsas = new TelaConsultaBolsas();
            telaConsultaBolsas.pack();
            dispose();
            telaConsultaBolsas.setVisible(true);
            return;
        }
        if (user instanceof Instituicao instituicao) {
            TelaGerenciamentoBolsas telaGerenciamentoBolsas = new TelaGerenciamentoBolsas(instituicao);
            telaGerenciamentoBolsas.pack();
            dispose();
            telaGerenciamentoBolsas.setVisible(true);
        }
        
    }//GEN-LAST:event_BTloginActionPerformed

    private void BTcadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTcadastroActionPerformed
        TelaCadastroalunos telaCadastroalunos = new TelaCadastroalunos();
        telaCadastroalunos.pack();
        dispose();
        telaCadastroalunos.setVisible(true);
    }//GEN-LAST:event_BTcadastroActionPerformed

    private void TXTFemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTFemailActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TXTFemailActionPerformed

    private void TXTFemailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTFemailFocusGained
        // TODO add your handling code here:
       
    }//GEN-LAST:event_TXTFemailFocusGained

    private void TXTFemailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTFemailFocusLost
        // TODO add your handling code here:
        if(TXTFemail.getText().isEmpty()){
            TXTFemail.setForeground(Color.GRAY);
            
            TXTFemail.setText("E-MAIL");
        }
    }//GEN-LAST:event_TXTFemailFocusLost

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTcadastro;
    private javax.swing.JButton BTlogin;
    private javax.swing.JLabel LBBemvindo;
    private javax.swing.JLabel LBBemvindo1;
    private javax.swing.JLabel LBEmail;
    private javax.swing.JLabel LBimagem;
    private javax.swing.JLabel LBsenha;
    private javax.swing.JPasswordField PSWsenha;
    private javax.swing.JTextField TXTFemail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
