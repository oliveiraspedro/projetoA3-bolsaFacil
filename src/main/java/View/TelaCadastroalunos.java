package View;

import Controllers.AlunoController;
import DTOs.AlunoDTO;
import javax.swing.JOptionPane;

public class TelaCadastroalunos extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroalunos
     */
    public TelaCadastroalunos() {
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
        BTvoltarLogin = new javax.swing.JButton();
        TXTFsenha = new javax.swing.JTextField();
        TXTFemail = new javax.swing.JTextField();
        TXTFnomecompleto = new javax.swing.JTextField();
        TXTFdata = new javax.swing.JTextField();
        LBcadastro = new javax.swing.JLabel();
        LBnomecompleto = new javax.swing.JLabel();
        LBdata = new javax.swing.JLabel();
        LBemail = new javax.swing.JLabel();
        LBemail1 = new javax.swing.JLabel();
        CBMostrarsenha = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        LBimagem = new javax.swing.JLabel();
        BTcadastrar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1160, 720));
        jPanel1.setLayout(null);

        BTvoltarLogin.setBackground(new java.awt.Color(75, 109, 190));
        BTvoltarLogin.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BTvoltarLogin.setForeground(new java.awt.Color(255, 255, 255));
        BTvoltarLogin.setText("LOGIN");
        BTvoltarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTvoltarLoginActionPerformed(evt);
            }
        });
        jPanel1.add(BTvoltarLogin);
        BTvoltarLogin.setBounds(770, 640, 180, 50);

        TXTFsenha.setBackground(new java.awt.Color(193, 204, 229));
        TXTFsenha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TXTFsenha.setText("Senha");
        TXTFsenha.setPreferredSize(new java.awt.Dimension(492, 56));
        jPanel1.add(TXTFsenha);
        TXTFsenha.setBounds(630, 450, 450, 50);

        TXTFemail.setBackground(new java.awt.Color(193, 204, 229));
        TXTFemail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TXTFemail.setText("E-mail");
        TXTFemail.setPreferredSize(new java.awt.Dimension(492, 56));
        jPanel1.add(TXTFemail);
        TXTFemail.setBounds(630, 350, 450, 50);

        TXTFnomecompleto.setBackground(new java.awt.Color(193, 204, 229));
        TXTFnomecompleto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TXTFnomecompleto.setText("Nome Completo");
        TXTFnomecompleto.setPreferredSize(new java.awt.Dimension(492, 56));
        jPanel1.add(TXTFnomecompleto);
        TXTFnomecompleto.setBounds(630, 152, 450, 50);

        TXTFdata.setBackground(new java.awt.Color(193, 204, 229));
        TXTFdata.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TXTFdata.setText("Data de Nascimento");
        TXTFdata.setPreferredSize(new java.awt.Dimension(492, 56));
        jPanel1.add(TXTFdata);
        TXTFdata.setBounds(630, 250, 450, 50);

        LBcadastro.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        LBcadastro.setText("Faça seu Cadastro");
        jPanel1.add(LBcadastro);
        LBcadastro.setBounds(620, 50, 470, 60);

        LBnomecompleto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LBnomecompleto.setText("Nome Completo");
        jPanel1.add(LBnomecompleto);
        LBnomecompleto.setBounds(630, 120, 140, 30);

        LBdata.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LBdata.setText("Data de Nascimento");
        jPanel1.add(LBdata);
        LBdata.setBounds(630, 220, 170, 22);

        LBemail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LBemail.setText("E-mail");
        jPanel1.add(LBemail);
        LBemail.setBounds(630, 320, 60, 20);

        LBemail1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LBemail1.setText("Senha");
        jPanel1.add(LBemail1);
        LBemail1.setBounds(630, 420, 60, 20);

        CBMostrarsenha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CBMostrarsenha.setText("Mostrar Senha");
        jPanel1.add(CBMostrarsenha);
        CBMostrarsenha.setBounds(630, 530, 190, 26);

        jPanel2.setBackground(new java.awt.Color(75, 109, 190));

        LBimagem.setIcon(new javax.swing.ImageIcon("C:\\Users\\pedro\\Downloads\\Blue Flat Color Ui Login Page Desktop Prototype (6).png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LBimagem, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addComponent(LBimagem, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 580, 720);

        BTcadastrar1.setBackground(new java.awt.Color(75, 109, 190));
        BTcadastrar1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BTcadastrar1.setForeground(new java.awt.Color(255, 255, 255));
        BTcadastrar1.setText("CADASTRAR");
        BTcadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTcadastrar1ActionPerformed(evt);
            }
        });
        jPanel1.add(BTcadastrar1);
        BTcadastrar1.setBounds(770, 583, 180, 50);

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

    private void BTvoltarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTvoltarLoginActionPerformed
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.pack();
        dispose();
        telaLogin.setVisible(true);
    }//GEN-LAST:event_BTvoltarLoginActionPerformed

    private void BTcadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTcadastrar1ActionPerformed
        AlunoDTO alunoDTO = new AlunoDTO();
        AlunoController alunoController = new AlunoController();

        String nome = TXTFnomecompleto.getText();
        String dataDeNascimentoText = TXTFdata.getText();
        String email = TXTFemail.getText();
        String senha = TXTFsenha.getText();

        alunoDTO.setNome(nome);
        alunoDTO.setData_nascimento(dataDeNascimentoText);
        alunoDTO.setEmail(email);
        alunoDTO.setSenha(senha);

        if (alunoController.cadastrarAluno(alunoDTO) != null){
            JOptionPane.showMessageDialog(null, "Aluno cadastrado!");
        }
    }//GEN-LAST:event_BTcadastrar1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroalunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroalunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroalunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroalunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroalunos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTcadastrar1;
    private javax.swing.JButton BTvoltarLogin;
    private javax.swing.JCheckBox CBMostrarsenha;
    private javax.swing.JLabel LBcadastro;
    private javax.swing.JLabel LBdata;
    private javax.swing.JLabel LBemail;
    private javax.swing.JLabel LBemail1;
    private javax.swing.JLabel LBimagem;
    private javax.swing.JLabel LBnomecompleto;
    private javax.swing.JTextField TXTFdata;
    private javax.swing.JTextField TXTFemail;
    private javax.swing.JTextField TXTFnomecompleto;
    private javax.swing.JTextField TXTFsenha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
