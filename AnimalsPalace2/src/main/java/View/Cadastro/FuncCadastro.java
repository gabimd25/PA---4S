/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View.Cadastro;
import dao.Conexao;
/**
 *
 * @author Gabim
 */
public class FuncCadastro extends javax.swing.JFrame {

    /** Creates new form FornCadastro */
    public FuncCadastro() {
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

        Sucesso = new javax.swing.JLabel();
        Tl = new javax.swing.JLabel();
        Nm = new javax.swing.JLabel();
        RG = new javax.swing.JLabel();
        Endereco = new javax.swing.JLabel();
        BtCancelar = new javax.swing.JButton();
        BtSalvar1 = new javax.swing.JButton();
        tel = new javax.swing.JTextField();
        end = new javax.swing.JTextField();
        nome = new javax.swing.JTextField();
        rg = new javax.swing.JTextField();
        ct = new javax.swing.JTextField();
        funcao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Sucesso.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        getContentPane().add(Sucesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 140, 30));

        Tl.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Tl.setText("Telefone");
        getContentPane().add(Tl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 90, 30));

        Nm.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Nm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nm.setText("Nome");
        getContentPane().add(Nm, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 70, 30));

        RG.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        RG.setText("RG");
        getContentPane().add(RG, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 30, 30));

        Endereco.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Endereco.setText("Endereço");
        getContentPane().add(Endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 80, 30));

        BtCancelar.setBackground(new java.awt.Color(204, 204, 255));
        BtCancelar.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        BtCancelar.setText("Sair");
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

        tel.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 190, 30));

        end.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        end.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(end, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 390, 30));

        nome.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 390, 30));
        getContentPane().add(rg, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 160, 30));
        getContentPane().add(ct, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 280, 30));
        getContentPane().add(funcao, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 320, 30));

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel3.setText("CT");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 189, -1, 30));

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel4.setText("Função");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        Fundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabim\\OneDrive\\Área de Trabalho\\PA\\PA---4S-master\\AnimalsPalace\\src\\main\\java\\imagens\\planodefundo3.png")); // NOI18N
        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 517, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalvar1ActionPerformed
        String nomeFunc = nome.getText();
        String telefone = tel.getText();
        String endereco = end.getText();
        String carteirat = ct.getText();
        String rgeral = rg.getText();
        String fun = funcao.getText();
        String query="INSERT INTO Inicial.dbo.Funcionario VALUES('"+nomeFunc+"','"+telefone+"','"+rgeral+"','"+endereco+"','"+carteirat+"','"+fun+"')";
        if(nomeFunc!=""){
            Conexao conexao = new Conexao();
            conexao.Salvar(query);
            dispose();
        }
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
            java.util.logging.Logger.getLogger(FuncCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCancelar;
    private javax.swing.JButton BtSalvar1;
    private javax.swing.JLabel Endereco;
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel Nm;
    private javax.swing.JLabel RG;
    private javax.swing.JLabel Sucesso;
    private javax.swing.JLabel Tl;
    private javax.swing.JTextField ct;
    private javax.swing.JTextField end;
    private javax.swing.JTextField funcao;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField rg;
    private javax.swing.JTextField tel;
    // End of variables declaration//GEN-END:variables

}
