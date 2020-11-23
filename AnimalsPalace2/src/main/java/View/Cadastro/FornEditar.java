/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View.Cadastro;
import View.TelaFornecedores;
//import View.TelaFornecedores.FornSelecionado;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabim
 */
public class FornEditar extends javax.swing.JFrame {

    int IDFornecedor;
    /** Creates new form FornCadastro */
    public FornEditar() {
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
        BExcluir = new javax.swing.JButton();
        BtEditar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        Cancelar = new javax.swing.JButton();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
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

        BExcluir.setBackground(new java.awt.Color(204, 204, 255));
        BExcluir.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        BExcluir.setText("Excluir");
        BExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(BExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 120, 40));

        BtEditar.setBackground(new java.awt.Color(204, 204, 255));
        BtEditar.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        BtEditar.setText("Editar");
        BtEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEditarActionPerformed(evt);
            }
        });
        getContentPane().add(BtEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 110, 40));

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
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 390, 30));

        Cancelar.setBackground(new java.awt.Color(204, 204, 255));
        Cancelar.setFont(new java.awt.Font("Baskerville Old Face", 0, 22)); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 110, 40));

        Fundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabim\\OneDrive\\Área de Trabalho\\PA\\PA---4S-master\\AnimalsPalace\\src\\main\\java\\imagens\\planodefundo3.png")); // NOI18N
        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 517, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void BtEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEditarActionPerformed
        String nome = jTextField3.getText();
        String tel=jTextField1.getText(); 
        String email=jTextField2.getText();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Inicial;user=pets;password=123");
            String editar = "UPDATE Fornecedor SET ForNome = '"+nome+"', ForTel = '"+tel+"', Foremail = '"+email+"' WHERE ForID = '"+IDFornecedor+"'  ";
            PreparedStatement statement = con.prepareStatement(editar);
            statement.execute();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e); 
        }
        dispose();
    }//GEN-LAST:event_BtEditarActionPerformed

    private void BExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BExcluirActionPerformed
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Inicial;user=pets;password=123");
            String excluir = "Delete from Inicial.dbo.Produto where ProForID="+IDFornecedor+"\nDelete from Inicial.dbo.Fornecedor where ForID="+IDFornecedor;
            PreparedStatement statement = con.prepareStatement(excluir);
            statement.execute();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e); 
        }
        dispose();
    }//GEN-LAST:event_BExcluirActionPerformed

   
    
    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
         try{
            String Nome = jTextField3.getText();
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Inicial;user=pets;password=123");
            String selecionado = "SELECT * FROM Fornecedor WHERE ForNome = '"+Nome+"'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(selecionado);
            
            if(rs.next()){
                String tel = rs.getString("ForTel");
                jTextField1.setText(tel);
                String email = rs.getString("Foremail");
                jTextField2.setText(email);
                int id = rs.getInt("ForID");
                IDFornecedor = id;
            }
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e); 
        }
    
    }//GEN-LAST:event_formWindowOpened

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
            java.util.logging.Logger.getLogger(FornEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FornEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FornEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FornEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FornEditar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BExcluir;
    private javax.swing.JButton BtEditar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JLabel Eml;
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel Nm;
    private javax.swing.JLabel Tl;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    public static javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

}
