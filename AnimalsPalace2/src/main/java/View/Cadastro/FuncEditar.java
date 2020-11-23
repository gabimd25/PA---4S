/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View.Cadastro;
import Model.Funcionarios;
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
public class FuncEditar extends javax.swing.JFrame {
    
    int IDFuncionario;
    /** Creates new form FornCadastro */
    public FuncEditar() {
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
        BtExcluir = new javax.swing.JButton();
        BtCancelar = new javax.swing.JButton();
        BtEditar = new javax.swing.JButton();
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
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Sucesso.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        getContentPane().add(Sucesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 140, 30));

        Tl.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Tl.setText("Telefone");
        getContentPane().add(Tl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 90, 30));

        Nm.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Nm.setText("Nome");
        getContentPane().add(Nm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 30));

        RG.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        RG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RG.setText("RG");
        getContentPane().add(RG, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 40, 30));

        Endereco.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Endereco.setText("Endereço");
        getContentPane().add(Endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 80, 30));

        BtExcluir.setBackground(new java.awt.Color(204, 204, 255));
        BtExcluir.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        BtExcluir.setText("Excluir");
        BtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(BtExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 120, 40));

        BtCancelar.setBackground(new java.awt.Color(204, 204, 255));
        BtCancelar.setFont(new java.awt.Font("Baskerville Old Face", 0, 22)); // NOI18N
        BtCancelar.setText("Cancelar");
        BtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(BtCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 110, 40));

        BtEditar.setBackground(new java.awt.Color(204, 204, 255));
        BtEditar.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        BtEditar.setText("Editar");
        BtEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEditarActionPerformed(evt);
            }
        });
        getContentPane().add(BtEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 110, 40));

        tel.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telActionPerformed(evt);
            }
        });
        getContentPane().add(tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 190, 30));

        end.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        end.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(end, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 390, 30));

        nome.setEditable(false);
        nome.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 390, 30));

        rg.setEditable(false);
        getContentPane().add(rg, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 160, 30));

        ct.setEditable(false);
        getContentPane().add(ct, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 280, 30));
        getContentPane().add(funcao, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 320, 30));

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel3.setText("CT");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 169, -1, 30));

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel4.setText("Função");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 219, -1, 30));

        Fundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabim\\OneDrive\\Área de Trabalho\\PA\\PA---4S-master\\AnimalsPalace\\src\\main\\java\\imagens\\planodefundo3.png")); // NOI18N
        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 517, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telActionPerformed

    private void BtEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEditarActionPerformed
        String telefone = tel.getText();
        String endereco = end.getText();
        String rgeral = rg.getText();
        String fun = funcao.getText();
        new Funcionarios().EditarFunc(telefone,endereco,rgeral,fun);
        Sucesso.setText("Salvo com Sucesso!");
        dispose();
    }//GEN-LAST:event_BtEditarActionPerformed

    private void BtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtExcluirActionPerformed
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Inicial;user=pets;password=123");
            String excluir = "Delete from Inicial.dbo.Funcionario where FunID="+IDFuncionario;
            PreparedStatement statement = con.prepareStatement(excluir);
            statement.execute();
            dispose();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e); 
        }
        Sucesso.setText("Deletado com Sucesso!");
       
    }//GEN-LAST:event_BtExcluirActionPerformed

    private void BtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_BtCancelarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try{
            String Nome = nome.getText();
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Inicial;user=pets;password=123");
            String selecionado = "SELECT * FROM Funcionario WHERE FunNome = '"+Nome+"'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(selecionado);
            
            if(rs.next()){
                String telefone = rs.getString("FunTel");
                tel.setText(telefone);
                String RG = rs.getString("FunRG");
                rg.setText(RG);
                String endereco = rs.getString("FunEnd");
                end.setText(endereco);
                String CT = rs.getString("FunCT");
                ct.setText(CT);
                String Fun = rs.getString("FunFun");
                funcao.setText(Fun);
                int id = rs.getInt("FunID");
                IDFuncionario = id;
            }
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e); 
        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(FuncEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncEditar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCancelar;
    private javax.swing.JButton BtEditar;
    private javax.swing.JButton BtExcluir;
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
    public static javax.swing.JTextField nome;
    private javax.swing.JTextField rg;
    private javax.swing.JTextField tel;
    // End of variables declaration//GEN-END:variables

}
