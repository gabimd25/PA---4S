/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View.Cadastro;
import dao.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author Gabim
 */
public class ProdutoCadastro extends javax.swing.JFrame {

    /** Creates new form FornCadastro */
    public ProdutoCadastro() {
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

        Tl = new javax.swing.JLabel();
        Nm = new javax.swing.JLabel();
        Eml = new javax.swing.JLabel();
        Nm1 = new javax.swing.JLabel();
        BtCancelar = new javax.swing.JButton();
        BtSalvar1 = new javax.swing.JButton();
        Sucesso = new javax.swing.JLabel();
        forn = new javax.swing.JTextField();
        desc = new javax.swing.JTextField();
        preco = new javax.swing.JTextField();
        nome = new javax.swing.JTextField();
        qtd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tl.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Tl.setText("Descrição");
        getContentPane().add(Tl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 80, 30));

        Nm.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Nm.setText("Nome");
        getContentPane().add(Nm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 70, 30));

        Eml.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Eml.setText("Preço");
        getContentPane().add(Eml, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 70, 30));

        Nm1.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Nm1.setText("Fornecedor");
        getContentPane().add(Nm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 90, 40));

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

        Sucesso.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        getContentPane().add(Sucesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 150, 30));

        forn.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(forn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 360, 30));

        desc.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 370, 30));

        preco.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        preco.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        preco.setText("0.00");
        getContentPane().add(preco, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 110, 30));

        nome.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 390, 30));
        getContentPane().add(qtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 100, 30));

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel4.setText("Quantidade");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        Fundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabim\\OneDrive\\Área de Trabalho\\PA\\PA---4S-master\\AnimalsPalace\\src\\main\\java\\imagens\\planodefundo3.png")); // NOI18N
        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 517, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalvar1ActionPerformed
        int IDForn=0;
        try{
            String Nome = forn.getText();
            Conexao conexao = new Conexao();
            String selecionado = "SELECT * FROM Fornecedor WHERE ForNome LIKE '%"+Nome+"%'";
            ResultSet rs = conexao.Pesquisar(selecionado);
            
            if(rs.next()){
                IDForn = rs.getInt("ForID");
            }
            System.out.println("ID="+IDForn+"\n\n");
            String Pnome = nome.getText();
            String Pdesc = desc.getText();
            int Pqtd = Integer.parseInt(qtd.getText());
            float Ppreco = Float.parseFloat(preco.getText());
            String query ="INSERT INTO Inicial.dbo.Produto VALUES ("+IDForn+",'"+Pnome+"','"+Pdesc+"',"+Ppreco+","+Pqtd+")";
            if(!"".equals(Pnome) && IDForn!=0){
               conexao.Salvar(query);
            }
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            System.out.println("\nExcecao!!\n");
        }
        dispose();
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
            java.util.logging.Logger.getLogger(ProdutoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new ProdutoCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCancelar;
    private javax.swing.JButton BtSalvar1;
    private javax.swing.JLabel Eml;
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel Nm;
    private javax.swing.JLabel Nm1;
    private javax.swing.JLabel Sucesso;
    private javax.swing.JLabel Tl;
    private javax.swing.JTextField desc;
    private javax.swing.JTextField forn;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField preco;
    private javax.swing.JTextField qtd;
    // End of variables declaration//GEN-END:variables

}
