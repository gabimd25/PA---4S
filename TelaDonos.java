/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import View.Cadastro.DonoCadastro;
import View.Cadastro.FornEditar;
import dao.Conexao;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gabim
 */
public class TelaDonos extends javax.swing.JFrame {

    /**
     * Creates new form TelaFornecedores
     */
    public TelaDonos() {
        initComponents();
        mostra_clientes();
    }
    
    public ArrayList<Cli> clienteList(){
        ArrayList<Cli> clientesList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Inicial;user=pets;password=123");
            //String query1 = "SELECT * FROM Cliente, Pet";
            String query4 = "SELECT Cliente.CliID, Cliente.CliNome, Cliente.CliTel, Cliente.CliEmail, Cliente.CliRG, Pet.PetCliID, Pet.PetNome FROM Cliente, Pet WHERE Cliente.CliID = Pet.PetCliID";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query4);
            Cli cliente;
            while(rs.next()){
                cliente = new Cli(rs.getInt("CliID"), rs.getString("CliNome"), rs.getString("CliTel"), rs.getString("CliEmail"), rs.getString("PetNome"), rs.getString("CliRG"));
                clientesList.add(cliente);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return clientesList;
        
    }
    
    public void mostra_clientes(){
        ArrayList<Cli> list = clienteList();
        DefaultTableModel model = (DefaultTableModel)jTabela_Mostra_Clientes.getModel();
        Object[] row = new Object[6];
        for(int i=0; i<list.size(); i++){
            row[0] = list.get(i).getCliID();
            row[1] = list.get(i).getCliNome();
            row[2] = list.get(i).getCliTel();
            row[3] = list.get(i).getCliEmail();
            row[4] = list.get(i).getPetNome();
            row[5] = list.get(i).getCliRG();
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lupa = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        FornSelecionado = new javax.swing.JTextPane();
        ProcuraDono = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabela_Mostra_Clientes = new javax.swing.JTable();
        Editar = new javax.swing.JLabel();
        Novo = new javax.swing.JLabel();
        setinha = new javax.swing.JLabel();
        moldura2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Contatar = new javax.swing.JLabel();
        moldura3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        moldura1 = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lupa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lupa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lupaMouseClicked(evt);
            }
        });
        getContentPane().add(lupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, 90, 60));

        FornSelecionado.setEditable(false);
        FornSelecionado.setText("Dono Selecionado");
        jScrollPane1.setViewportView(FornSelecionado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 430, 40));

        ProcuraDono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcuraDonoActionPerformed(evt);
            }
        });
        getContentPane().add(ProcuraDono, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 500, 50));

        jTabela_Mostra_Clientes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTabela_Mostra_Clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Telefone", "Email", "Nome do Pet", "RG"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTabela_Mostra_Clientes.setRowHeight(30);
        jTabela_Mostra_Clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabela_Mostra_ClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTabela_Mostra_Clientes);
        if (jTabela_Mostra_Clientes.getColumnModel().getColumnCount() > 0) {
            jTabela_Mostra_Clientes.getColumnModel().getColumn(0).setMinWidth(30);
            jTabela_Mostra_Clientes.getColumnModel().getColumn(0).setMaxWidth(40);
            jTabela_Mostra_Clientes.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTabela_Mostra_Clientes.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 277, 880, 270));

        Editar.setFont(new java.awt.Font("Brush Script MT", 0, 36)); // NOI18N
        Editar.setText("Editar");
        Editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditarMouseClicked(evt);
            }
        });
        getContentPane().add(Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 100, 40));

        Novo.setFont(new java.awt.Font("Brush Script MT", 0, 42)); // NOI18N
        Novo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Novo.setText("Novo");
        Novo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NovoMouseClicked(evt);
            }
        });
        getContentPane().add(Novo, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 190, 110, 40));

        setinha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setinhaMouseClicked(evt);
            }
        });
        getContentPane().add(setinha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 180, 50));
        getContentPane().add(moldura2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 170, -1, -1));

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 640, 70));

        Contatar.setFont(new java.awt.Font("Brush Script MT", 0, 36)); // NOI18N
        Contatar.setText("Contatar");
        Contatar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContatarMouseClicked(evt);
            }
        });
        getContentPane().add(Contatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 110, 40));
        getContentPane().add(moldura3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, -1, -1));

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 470, 60));
        getContentPane().add(moldura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, -1, -1));
        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lupaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lupaMouseClicked
        String dono;
        dono = ProcuraDono.getText();
        System.out.println(dono);
       // TabelaForn();
    }//GEN-LAST:event_lupaMouseClicked

    private void setinhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setinhaMouseClicked
        TelaPrincipal Principal = new TelaPrincipal();
        Principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_setinhaMouseClicked

    private void ContatarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContatarMouseClicked
     //comando para enviar email para o fornecedor
    }//GEN-LAST:event_ContatarMouseClicked

    private void EditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditarMouseClicked
        FornEditar novo = new FornEditar();
        novo.setVisible(true);
    }//GEN-LAST:event_EditarMouseClicked

    private void NovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NovoMouseClicked
        DonoCadastro novo = new DonoCadastro();
        novo.setVisible(true);
    }//GEN-LAST:event_NovoMouseClicked

    private void ProcuraDonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcuraDonoActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_ProcuraDonoActionPerformed

    private void jTabela_Mostra_ClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabela_Mostra_ClientesMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTabela_Mostra_ClientesMouseClicked
    
    
    private void Transparente(){
        /*jTextField1.setBackground(new Color(0,0,0,0));
        jTextPane1.setBackground(new Color(0,0,0,0));*/
    }
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
            java.util.logging.Logger.getLogger(TelaDonos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDonos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDonos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDonos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDonos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contatar;
    private javax.swing.JLabel Editar;
    private javax.swing.JTextPane FornSelecionado;
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel Novo;
    private javax.swing.JTextField ProcuraDono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabela_Mostra_Clientes;
    private javax.swing.JLabel lupa;
    private javax.swing.JLabel moldura1;
    private javax.swing.JLabel moldura2;
    private javax.swing.JLabel moldura3;
    private javax.swing.JLabel setinha;
    // End of variables declaration//GEN-END:variables
}
