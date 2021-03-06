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
public class AgendaEditar extends javax.swing.JFrame {
    int IDPet,IDDono;
    String nomeDono,nomePet,servico;
    String Dia, Hora;
    
    /** Creates new form FornCadastro */
    public AgendaEditar(String dia, String hora, String Dono, String Pet, String Servico) {
        nomeDono = Dono;
        nomePet = Pet;
        Dia = dia;
        Hora = hora;
        servico = Servico;
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
        RG = new javax.swing.JLabel();
        Eml = new javax.swing.JLabel();
        Eml1 = new javax.swing.JLabel();
        Nm1 = new javax.swing.JLabel();
        BExcluir = new javax.swing.JButton();
        BtEditar = new javax.swing.JButton();
        rg = new javax.swing.JTextField();
        serv = new javax.swing.JTextField();
        dia = new javax.swing.JTextField();
        pet = new javax.swing.JTextField();
        horario = new javax.swing.JTextField();
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
        Nm.setText("Dia");
        getContentPane().add(Nm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 60, 30));

        RG.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        RG.setText("RG Dono");
        getContentPane().add(RG, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 80, 30));

        Eml.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Eml.setText("Pet");
        getContentPane().add(Eml, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 40, 30));

        Eml1.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Eml1.setText("Serviço");
        getContentPane().add(Eml1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 60, 30));

        Nm1.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Nm1.setText("Horário");
        getContentPane().add(Nm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 70, 30));

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

        rg.setEditable(false);
        rg.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(rg, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 190, 30));

        serv.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        serv.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(serv, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 190, 30));

        dia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dia.setText("0-0-0");
        getContentPane().add(dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 110, 30));

        pet.setEditable(false);
        pet.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pet.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(pet, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 190, 30));

        horario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        horario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        horario.setText("0:0");
        getContentPane().add(horario, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 130, 30));

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

    private void BtEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEditarActionPerformed
        String novodia = dia.getText();
        String novahr=horario.getText(); 
        String novoserv=serv.getText();
        try{
            Conexao conexao = new Conexao();
            String editar = "UPDATE Inicial.dbo.Agenda SET AgendaDia='"+novodia+"', AgendaHora='"+novahr+"', Servico='"+novoserv+"' WHERE AgendaDia='"+Dia+"' AND AgendaHora='"+Hora+"' AND AgendaCliID="+IDDono+" AND AgendaPetID="+IDPet;
            conexao.Editar(editar);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e); 
        }
        dispose();
    }//GEN-LAST:event_BtEditarActionPerformed

    private void BExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BExcluirActionPerformed
        try{
            Conexao conexao = new Conexao();
            String excluir = "DELETE FROM Inicial.dbo.Agenda  WHERE AgendaDia='"+Dia+"' AND AgendaHora='"+Hora+"' AND AgendaCliID="+IDDono+" AND AgendaPetID="+IDPet;
            conexao.Deletar(excluir);
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
            Conexao conexao = new Conexao();
            String selecionado = "SELECT AgendaCliID, AgendaPetID,AgendaDia,AgendaHora,(SELECT CliRG from Inicial.dbo.Cliente where CliID = AgendaCliID) RG,(SELECT PetNome from Inicial.dbo.Pet WHERE PetID = AgendaPetID) Pet,Servico" +
" from Inicial.dbo.Agenda WHERE AgendaHora = '"+Hora+"' AND AgendaDia = '"+Dia+"' AND Servico= '"+servico+"'";
            ResultSet rs = conexao.Pesquisar(selecionado);
            
            if(rs.next()){
                dia.setText(rs.getString("AgendaDia"));
                horario.setText(rs.getString("AgendaHora"));
                rg.setText(rs.getString("RG"));
                pet.setText(rs.getString("Pet"));
                serv.setText(rs.getString("Servico"));
                IDDono = rs.getInt("AgendaCliID");
                IDPet = rs.getInt("AgendaPetID");
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
            java.util.logging.Logger.getLogger(AgendaEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgendaEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgendaEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgendaEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BExcluir;
    private javax.swing.JButton BtEditar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JLabel Eml;
    private javax.swing.JLabel Eml1;
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel Nm;
    private javax.swing.JLabel Nm1;
    private javax.swing.JLabel RG;
    public static javax.swing.JTextField dia;
    public static javax.swing.JTextField horario;
    private javax.swing.JTextField pet;
    private javax.swing.JTextField rg;
    private javax.swing.JTextField serv;
    // End of variables declaration//GEN-END:variables

}
