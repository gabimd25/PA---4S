/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View.Cadastro;

/**
 *
 * @author Gabim
 */
public class FornCadastro extends javax.swing.JFrame {

    /** Creates new form FornCadastro */
    public FornCadastro() {
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

        Nm = new javax.swing.JLabel();
        Tl = new javax.swing.JLabel();
        Eml = new javax.swing.JLabel();
        BtCancelar = new javax.swing.JButton();
        BtSalvar1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nm.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Nm.setText("Nome");
        getContentPane().add(Nm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 70, 40));

        Tl.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Tl.setText("Telefone");
        getContentPane().add(Tl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 90, 40));

        Eml.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Eml.setText("Email");
        getContentPane().add(Eml, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 80, 40));

        BtCancelar.setBackground(new java.awt.Color(204, 204, 255));
        BtCancelar.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        BtCancelar.setText("Cancelar");
        BtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(BtCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 120, 40));

        BtSalvar1.setBackground(new java.awt.Color(204, 204, 255));
        BtSalvar1.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        BtSalvar1.setText("Salvar");
        BtSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSalvar1ActionPerformed(evt);
            }
        });
        getContentPane().add(BtSalvar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 110, 40));

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 190, 30));

        jTextField2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 390, 30));

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 390, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabim\\Desktop\\PA\\planodefundo3.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 517, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void BtSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalvar1ActionPerformed
        // TODO add your handling code here:
        //
    }//GEN-LAST:event_BtSalvar1ActionPerformed

    private void BtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_BtCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(FornCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FornCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FornCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FornCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FornCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCancelar;
    private javax.swing.JButton BtSalvar1;
    private javax.swing.JLabel Eml;
    private javax.swing.JLabel Nm;
    private javax.swing.JLabel Tl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

}