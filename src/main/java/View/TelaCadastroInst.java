package View;

import Controllers.InstituicaoController;
import DTOs.InstituicaoDTO;
import DTOs.UserInstituicaoDTO;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author pedro
 */
public class TelaCadastroInst extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroInst
     */
    public TelaCadastroInst() {
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

        TxtPassaordSenha = new javax.swing.JPanel();
        PanelAzul = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        LBTEmailCtt = new javax.swing.JLabel();
        LBsigla = new javax.swing.JLabel();
        LBtextomenor = new javax.swing.JLabel();
        LBInstitucional = new javax.swing.JLabel();
        LBcadastro = new javax.swing.JLabel();
        BTconfirmar = new javax.swing.JButton();
        TXTTemailCtt = new javax.swing.JTextField();
        TXTUnidade = new javax.swing.JTextField();
        LBUnidade1 = new javax.swing.JLabel();
        LBTelInst1 = new javax.swing.JLabel();
        TXTTelefoneInst1 = new javax.swing.JTextField();
        LBnameinst1 = new javax.swing.JLabel();
        TXTNomInst1 = new javax.swing.JTextField();
        LBsigla1 = new javax.swing.JLabel();
        TXTSigla1 = new javax.swing.JTextField();
        LBsigla2 = new javax.swing.JLabel();
        TXTCNPJ1 = new javax.swing.JTextField();
        LBsigla3 = new javax.swing.JLabel();
        TXTpassowordConf = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        TxtPassaordSenha.setPreferredSize(new java.awt.Dimension(1160, 720));
        TxtPassaordSenha.setLayout(null);

        PanelAzul.setBackground(new java.awt.Color(75, 109, 190));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cadastro-instituicao-img.png"))); // NOI18N

        javax.swing.GroupLayout PanelAzulLayout = new javax.swing.GroupLayout(PanelAzul);
        PanelAzul.setLayout(PanelAzulLayout);
        PanelAzulLayout.setHorizontalGroup(
            PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAzulLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelAzulLayout.setVerticalGroup(
            PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAzulLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        TxtPassaordSenha.add(PanelAzul);
        PanelAzul.setBounds(0, 0, 430, 720);

        LBTEmailCtt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LBTEmailCtt.setForeground(new java.awt.Color(76, 111, 192));
        LBTEmailCtt.setText("E-mail de Contato");
        TxtPassaordSenha.add(LBTEmailCtt);
        LBTEmailCtt.setBounds(470, 440, 180, 30);

        LBsigla.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LBsigla.setForeground(new java.awt.Color(76, 111, 192));
        LBsigla.setText("Confirmar Senha");
        TxtPassaordSenha.add(LBsigla);
        LBsigla.setBounds(830, 450, 160, 20);

        LBtextomenor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LBtextomenor.setForeground(new java.awt.Color(76, 111, 191));
        LBtextomenor.setText("Cadastre sua instituição em nosso sistema");
        TxtPassaordSenha.add(LBtextomenor);
        LBtextomenor.setBounds(630, 90, 340, 22);

        LBInstitucional.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        LBInstitucional.setForeground(new java.awt.Color(76, 111, 191));
        LBInstitucional.setText("institucional");
        TxtPassaordSenha.add(LBInstitucional);
        LBInstitucional.setBounds(700, 30, 210, 70);

        LBcadastro.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        LBcadastro.setForeground(new java.awt.Color(76, 111, 191));
        LBcadastro.setText("Cadastro");
        TxtPassaordSenha.add(LBcadastro);
        LBcadastro.setBounds(720, 0, 150, 70);

        BTconfirmar.setBackground(new java.awt.Color(75, 109, 190));
        BTconfirmar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        BTconfirmar.setForeground(new java.awt.Color(255, 255, 255));
        BTconfirmar.setText("CONFIRMAR");
        BTconfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTconfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTconfirmarActionPerformed(evt);
            }
        });
        TxtPassaordSenha.add(BTconfirmar);
        BTconfirmar.setBounds(655, 600, 280, 50);

        TXTTemailCtt.setBackground(new java.awt.Color(242, 242, 242));
        TXTTemailCtt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TXTTemailCtt.setForeground(new java.awt.Color(75, 109, 190));
        TXTTemailCtt.setText("representante@gmail.com");
        TXTTemailCtt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(75, 109, 190)));
        TxtPassaordSenha.add(TXTTemailCtt);
        TXTTemailCtt.setBounds(470, 480, 280, 40);

        TXTUnidade.setBackground(new java.awt.Color(242, 242, 242));
        TXTUnidade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TXTUnidade.setForeground(new java.awt.Color(75, 109, 190));
        TXTUnidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(75, 109, 190)));
        TxtPassaordSenha.add(TXTUnidade);
        TXTUnidade.setBounds(470, 300, 280, 40);

        LBUnidade1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LBUnidade1.setForeground(new java.awt.Color(76, 111, 192));
        LBUnidade1.setText("Unidade");
        TxtPassaordSenha.add(LBUnidade1);
        LBUnidade1.setBounds(470, 270, 80, 30);

        LBTelInst1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LBTelInst1.setForeground(new java.awt.Color(76, 111, 192));
        LBTelInst1.setText("Telefone Institucional");
        TxtPassaordSenha.add(LBTelInst1);
        LBTelInst1.setBounds(470, 350, 180, 30);

        TXTTelefoneInst1.setBackground(new java.awt.Color(242, 242, 242));
        TXTTelefoneInst1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TXTTelefoneInst1.setForeground(new java.awt.Color(75, 109, 190));
        TXTTelefoneInst1.setText("+551190002222");
        TXTTelefoneInst1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(75, 109, 190)));
        TxtPassaordSenha.add(TXTTelefoneInst1);
        TXTTelefoneInst1.setBounds(470, 390, 280, 40);

        LBnameinst1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LBnameinst1.setForeground(new java.awt.Color(76, 111, 192));
        LBnameinst1.setText("Nome da instituição");
        TxtPassaordSenha.add(LBnameinst1);
        LBnameinst1.setBounds(470, 190, 160, 20);

        TXTNomInst1.setBackground(new java.awt.Color(242, 242, 242));
        TXTNomInst1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TXTNomInst1.setForeground(new java.awt.Color(75, 109, 190));
        TXTNomInst1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(75, 109, 190)));
        TXTNomInst1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTNomInst1ActionPerformed(evt);
            }
        });
        TxtPassaordSenha.add(TXTNomInst1);
        TXTNomInst1.setBounds(470, 220, 280, 40);

        LBsigla1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LBsigla1.setForeground(new java.awt.Color(76, 111, 192));
        LBsigla1.setText("Sigla");
        TxtPassaordSenha.add(LBsigla1);
        LBsigla1.setBounds(830, 190, 160, 20);

        TXTSigla1.setBackground(new java.awt.Color(242, 242, 242));
        TXTSigla1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TXTSigla1.setForeground(new java.awt.Color(75, 109, 190));
        TXTSigla1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(75, 109, 190)));
        TxtPassaordSenha.add(TXTSigla1);
        TXTSigla1.setBounds(830, 220, 280, 40);

        LBsigla2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LBsigla2.setForeground(new java.awt.Color(76, 111, 192));
        LBsigla2.setText("CNPJ");
        TxtPassaordSenha.add(LBsigla2);
        LBsigla2.setBounds(830, 270, 160, 20);

        TXTCNPJ1.setBackground(new java.awt.Color(242, 242, 242));
        TXTCNPJ1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TXTCNPJ1.setForeground(new java.awt.Color(75, 109, 190));
        TXTCNPJ1.setText(" XX. XXX. XXX/0001-ZZ");
        TXTCNPJ1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(75, 109, 190)));
        TXTCNPJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTCNPJ1ActionPerformed(evt);
            }
        });
        TxtPassaordSenha.add(TXTCNPJ1);
        TXTCNPJ1.setBounds(830, 300, 280, 40);

        LBsigla3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LBsigla3.setForeground(new java.awt.Color(76, 111, 192));
        LBsigla3.setText("Senha");
        TxtPassaordSenha.add(LBsigla3);
        LBsigla3.setBounds(830, 360, 160, 20);

        TXTpassowordConf.setBackground(new java.awt.Color(242, 242, 242));
        TXTpassowordConf.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TXTpassowordConf.setForeground(new java.awt.Color(72, 109, 190));
        TXTpassowordConf.setText("jPasswordField1");
        TXTpassowordConf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(72, 109, 190)));
        TxtPassaordSenha.add(TXTpassowordConf);
        TXTpassowordConf.setBounds(830, 480, 280, 40);

        jPasswordField2.setBackground(new java.awt.Color(242, 242, 242));
        jPasswordField2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPasswordField2.setForeground(new java.awt.Color(72, 109, 190));
        jPasswordField2.setText("jPasswordField1");
        jPasswordField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(72, 109, 190)));
        TxtPassaordSenha.add(jPasswordField2);
        jPasswordField2.setBounds(830, 392, 280, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TxtPassaordSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TxtPassaordSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTconfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTconfirmarActionPerformed
        
        InstituicaoDTO instituicaoDTO = new InstituicaoDTO();
        UserInstituicaoDTO userInstituicaoDTO = new UserInstituicaoDTO();
        InstituicaoController instituicaoController = new InstituicaoController();
        
        String nomeInst = TXTNomInst1.getText();
        String sigla = TXTSigla1.getText();
        String cnpj = TXTCNPJ1.getText();
        String telefoneInst = TXTTelefoneInst1.getText();
        String unidade = TXTUnidade.getText();
        
        String email = TXTTemailCtt.getText();
        String password = jPasswordField2.getText();
        String passwordConf = TXTpassowordConf.getText();
        
        if (password == null ? passwordConf != null : !password.equals(passwordConf)) {
            JOptionPane.showMessageDialog(null, "As senhas não combinam!");
        } else {
            instituicaoDTO.setNomeInstituicao(nomeInst);
            instituicaoDTO.setSigla(sigla);
            instituicaoDTO.setCnpj(cnpj);
            instituicaoDTO.setNumeroTelefone(telefoneInst);
            instituicaoDTO.setNomeUnidade(unidade);
            
            userInstituicaoDTO.setEmailInstitucional(email);
            userInstituicaoDTO.setSenha(password);
            
            if (instituicaoController.cadastrarInstituicao(userInstituicaoDTO, instituicaoDTO) != null) {
                JOptionPane.showMessageDialog(null, "Instituição cadastrada");
            }
        }
        
        
    }//GEN-LAST:event_BTconfirmarActionPerformed

    private void TXTNomInst1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTNomInst1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTNomInst1ActionPerformed

    private void TXTCNPJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTCNPJ1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTCNPJ1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroInst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroInst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroInst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroInst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroInst().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTconfirmar;
    private javax.swing.JLabel LBInstitucional;
    private javax.swing.JLabel LBTEmailCtt;
    private javax.swing.JLabel LBTelInst1;
    private javax.swing.JLabel LBUnidade1;
    private javax.swing.JLabel LBcadastro;
    private javax.swing.JLabel LBnameinst1;
    private javax.swing.JLabel LBsigla;
    private javax.swing.JLabel LBsigla1;
    private javax.swing.JLabel LBsigla2;
    private javax.swing.JLabel LBsigla3;
    private javax.swing.JLabel LBtextomenor;
    private javax.swing.JPanel PanelAzul;
    private javax.swing.JTextField TXTCNPJ1;
    private javax.swing.JTextField TXTNomInst1;
    private javax.swing.JTextField TXTSigla1;
    private javax.swing.JTextField TXTTelefoneInst1;
    private javax.swing.JTextField TXTTemailCtt;
    private javax.swing.JTextField TXTUnidade;
    private javax.swing.JPasswordField TXTpassowordConf;
    private javax.swing.JPanel TxtPassaordSenha;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField2;
    // End of variables declaration//GEN-END:variables
}
