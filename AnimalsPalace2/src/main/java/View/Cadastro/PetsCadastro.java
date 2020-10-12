/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View.Cadastro;
import Model.Pets;
/**
 *
 * @author Gabim
 */
public class PetsCadastro extends javax.swing.JFrame {

    /** Creates new form FornCadastro */
    public PetsCadastro() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        Sucesso = new javax.swing.JLabel();
        sim = new javax.swing.JRadioButton();
        nao = new javax.swing.JRadioButton();
        Esp = new javax.swing.JLabel();
        Nm = new javax.swing.JLabel();
        raca = new javax.swing.JLabel();
        Raca1 = new javax.swing.JLabel();
        BtCancelar = new javax.swing.JButton();
        BtSalvar1 = new javax.swing.JButton();
        Especie = new javax.swing.JTextField();
        Raca = new javax.swing.JTextField();
        NomePet = new javax.swing.JTextField();
        Doenca = new javax.swing.JTextField();
        RG = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dia = new javax.swing.JComboBox<>();
        mes = new javax.swing.JComboBox<>();
        ano = new javax.swing.JComboBox<>();
        Sexo = new javax.swing.JComboBox<>();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Sucesso.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        getContentPane().add(Sucesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 160, 30));

        buttonGroup1.add(sim);
        sim.setText("Sim");
        getContentPane().add(sim, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        buttonGroup1.add(nao);
        nao.setSelected(true);
        nao.setText("Não");
        getContentPane().add(nao, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, -1, -1));

        Esp.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Esp.setText("Espécie");
        getContentPane().add(Esp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 60, 30));

        Nm.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Nm.setText("Nome");
        getContentPane().add(Nm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 40));

        raca.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        raca.setText("Doença");
        getContentPane().add(raca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 60, 30));

        Raca1.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Raca1.setText("Raça");
        getContentPane().add(Raca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 50, 30));

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
        BtSalvar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtSalvar1MouseClicked(evt);
            }
        });
        BtSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSalvar1ActionPerformed(evt);
            }
        });
        getContentPane().add(BtSalvar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 110, 40));

        Especie.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Especie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EspecieActionPerformed(evt);
            }
        });
        getContentPane().add(Especie, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 190, 30));

        Raca.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Raca.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(Raca, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 140, 30));

        NomePet.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(NomePet, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 200, 30));
        getContentPane().add(Doenca, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 210, 30));
        getContentPane().add(RG, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 140, 30));

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel3.setText("Sexo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 40, 30));

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel4.setText("Data do Nascimento");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel5.setText("Castrado");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, 30));

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel6.setText("RG do Dono");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 100, 30));

        dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia" }));
        getContentPane().add(dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 60, -1));

        mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mês" }));
        getContentPane().add(mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 80, -1));

        ano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ano" }));
        getContentPane().add(ano, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 70, -1));

        Sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fêmea", "Macho" }));
        getContentPane().add(Sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 60, 30));

        Fundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabim\\Desktop\\PA\\planodefundo3.png")); // NOI18N
        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 517, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspecieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EspecieActionPerformed

    private void BtSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalvar1ActionPerformed
        // TODO add your handling code here:
        //
    }//GEN-LAST:event_BtSalvar1ActionPerformed

    private void BtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_BtCancelarActionPerformed

    private void BtSalvar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtSalvar1MouseClicked
        // TODO add your handling code here:
        String nome = NomePet.getText();
        String especie = Especie.getText();
        String raca = Raca.getText();
        String doenca = Doenca.getText();
        String sexoselect = Sexo.getSelectedItem()+"";
        String rgDono=RG.getText();
        char sexo;
        char castrado;
        if(sexoselect=="Macho"){
            sexo='M';
        }
        else{
            sexo='F';
        }
        if(nao.isSelected()){
            castrado='N';
        }
        else{
            castrado='S';
        }                
        if(nome!=null && nome!=""){
          new Pets().SalvarPet(nome,especie,raca,sexo,doenca,castrado,rgDono);
          Sucesso.setText("Salvo com Sucesso!");
        }        
    }//GEN-LAST:event_BtSalvar1MouseClicked

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
            java.util.logging.Logger.getLogger(PetsCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PetsCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PetsCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PetsCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PetsCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCancelar;
    private javax.swing.JButton BtSalvar1;
    private javax.swing.JTextField Doenca;
    private javax.swing.JLabel Esp;
    private javax.swing.JTextField Especie;
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel Nm;
    private javax.swing.JTextField NomePet;
    private javax.swing.JTextField RG;
    private javax.swing.JTextField Raca;
    private javax.swing.JLabel Raca1;
    private javax.swing.JComboBox<String> Sexo;
    private javax.swing.JLabel Sucesso;
    private javax.swing.JComboBox<String> ano;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> dia;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> mes;
    private javax.swing.JRadioButton nao;
    private javax.swing.JLabel raca;
    private javax.swing.JRadioButton sim;
    // End of variables declaration//GEN-END:variables

}