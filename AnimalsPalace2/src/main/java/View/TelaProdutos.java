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
public class TelaProdutos extends javax.swing.JFrame {
    ArrayList<Prod> produtos = new ArrayList<>();
    String query;
    /**
     * Creates new form TelaFornecedores
     */
    public TelaProdutos() {
        initComponents();
        query = "SELECT	ProID,ProNome,ProPre,ForNome,ProQuant,ProDesc FROM Inicial.dbo.Produto p inner join Inicial.dbo.Fornecedor f on p.ProForID = f.ForID order by p.ProID";
        produtos = prodList(query);
        mostra_prod(produtos);
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
        ProcuraProd = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
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
        lupa.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabim\\Desktop\\PA\\lupa2.png")); // NOI18N
        lupa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lupaMouseClicked(evt);
            }
        });
        getContentPane().add(lupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, 90, 60));

        FornSelecionado.setEditable(false);
        FornSelecionado.setText("Produto Selecionado");
        jScrollPane1.setViewportView(FornSelecionado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 430, 40));

        ProcuraProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcuraProdActionPerformed(evt);
            }
        });
        getContentPane().add(ProcuraProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 500, 50));

        tabela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Preço", "Fornecedor", "Quantidade", "Descrição"
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
        tabela.setRowHeight(30);
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setMinWidth(40);
            tabela.getColumnModel().getColumn(0).setMaxWidth(60);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 880, 270));

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

        setinha.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabim\\Desktop\\PA\\setinha2.png")); // NOI18N
        setinha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setinhaMouseClicked(evt);
            }
        });
        getContentPane().add(setinha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 180, 50));

        moldura2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabim\\Desktop\\PA\\botao2.png")); // NOI18N
        getContentPane().add(moldura2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 170, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabim\\Desktop\\PA\\input3.png")); // NOI18N
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

        moldura3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabim\\Desktop\\PA\\botao2.png")); // NOI18N
        getContentPane().add(moldura3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabim\\Desktop\\PA\\input3.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 470, 60));

        moldura1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabim\\Desktop\\PA\\botao2.png")); // NOI18N
        getContentPane().add(moldura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, -1, -1));

        Fundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabim\\Desktop\\PA\\fundo4.png")); // NOI18N
        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public ArrayList<Prod> prodList(String query1){
        ArrayList<Prod> prodsList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Inicial;user=pets;password=123");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Prod prod;
            while(rs.next()){
                prod = new Prod(rs.getInt("ProID"),rs.getString("ProNome"), rs.getFloat("ProPre"), rs.getString("ForNome"),rs.getInt("ProQuant"), rs.getString("ProDesc"));
                prodsList.add(prod);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return prodsList;        
    }
    public void mostra_prod(ArrayList<Prod> produtos){
        ArrayList<Prod> list = produtos;
        DefaultTableModel model = (DefaultTableModel)tabela.getModel();
        model.setRowCount(0);
        Object[] row = new Object[6];
        for(int i=0; i<list.size(); i++){
            row[0] = list.get(i).getProID();
            row[1] = list.get(i).getProNome();
            row[2] = "R$ "+list.get(i).getProPre();
            row[3] = list.get(i).getForNome();
            row[4] = list.get(i).getProQuant();
            row[5] = list.get(i).getProDesc();
            model.addRow(row);
        }
    }
    private void lupaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lupaMouseClicked
       query = "SELECT	ProID,ProNome,ProPre,ForNome,ProQuant,ProDesc FROM Inicial.dbo.Produto p inner join Inicial.dbo.Fornecedor f on p.ProForID = f.ForID WHERE ProNome LIKE '%"+ProcuraProd.getText()+"%' order by p.ProID";
       produtos = prodList(query);
       mostra_prod(produtos);
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
        if(FornSelecionado.getText()!="Fornecedor Selecionado"){
           FornEditar novo = new FornEditar();
            novo.setVisible(true); 
        }
        else{
            System.out.println("Escolha um fornecedor!");
        }  
    }//GEN-LAST:event_EditarMouseClicked

    private void NovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NovoMouseClicked
        DonoCadastro novo = new DonoCadastro();
        novo.setVisible(true);
    }//GEN-LAST:event_NovoMouseClicked

    private void ProcuraProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcuraProdActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_ProcuraProdActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tabelaMouseClicked
    
    
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
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TelaProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contatar;
    private javax.swing.JLabel Editar;
    private javax.swing.JTextPane FornSelecionado;
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel Novo;
    private javax.swing.JTextField ProcuraProd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lupa;
    private javax.swing.JLabel moldura1;
    private javax.swing.JLabel moldura2;
    private javax.swing.JLabel moldura3;
    private javax.swing.JLabel setinha;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
