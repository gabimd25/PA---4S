/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View.Cadastro;
import View.TelaFuncionarios;
/**
 *
 * @author Gabim
 */
public class Login_Func extends javax.swing.JFrame {

    /** Creates new form FornCadastro */
    public Login_Func() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Erro = new javax.swing.JLabel();
        Nm = new javax.swing.JLabel();
        Eml = new javax.swing.JLabel();
        BtSalvar = new javax.swing.JButton();
        Senha = new javax.swing.JTextField();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Erro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(Erro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 240, 40));

        Nm.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        Nm.setText("Acesso Restrito ao Gerente");
        getContentPane().add(Nm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 410, 60));

        Eml.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        Eml.setText("Senha");
        getContentPane().add(Eml, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 100, 40));

        BtSalvar.setBackground(new java.awt.Color(204, 204, 255));
        BtSalvar.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        BtSalvar.setText("Acessar");
        BtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(BtSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 140, 50));

        Senha.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Senha.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 280, 40));

        Fundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabim\\OneDrive\\Área de Trabalho\\PA\\PA---4S-master\\AnimalsPalace\\src\\main\\java\\imagens\\planodefundo3.png")); // NOI18N
        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 517, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalvarActionPerformed
        String senha = Senha.getText();
        String SenhaCorreta="gerente";
        if(senha.compareTo(SenhaCorreta)==0)
        {
            Erro.setText("Senha Correta!");
            TelaFuncionarios Func = new TelaFuncionarios();
            Func.setVisible(true);
            dispose();        
        }
        else
        {
            Erro.setText("Senha Incorreta!");
        }
    }//GEN-LAST:event_BtSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(Login_Func.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Func.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Func.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Func.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Func().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtSalvar;
    private javax.swing.JLabel Eml;
    private javax.swing.JLabel Erro;
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel Nm;
    private javax.swing.JTextField Senha;
    // End of variables declaration//GEN-END:variables

}
