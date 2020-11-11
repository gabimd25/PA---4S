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
public class TelaFuncionarios extends javax.swing.JFrame {

    /**
     * Creates new form TelaFornecedores
     */
    public TelaFuncionarios() {
        initComponents();
        mostra_func();
    }

    public ArrayList<Func> funcList(){
        ArrayList<Func> funcsList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Inicial;user=pets;password=123");
            String query2 = "SELECT * FROM Funcionario";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query2);
            Func func;
            while(rs.next()){
                func = new Func(rs.getInt("FunID"), rs.getString("FunNome"), rs.getString("FunTel"), rs.getString("FunRG"), rs.getString("FunEnd"), rs.getString("FunCT"), rs.getString("FunFun"));
                funcsList.add(func);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return funcsList;
    }
    
    public void mostra_func(){
        ArrayList<Func> list = funcList();
        DefaultTableModel model = (DefaultTableModel)jTabela_Mostra_Func.getModel();
        Object[] row = new Object[7];
        for(int i=0; i<list.size(); i++){
            row[0] = list.get(i).getFunID();
            row[1] = list.get(i).getFunNome();
            row[2] = list.get(i).getFunTel();
            row[3] = list.get(i).getFunRG();
            row[4] = list.get(i).getFunEnd();
            row[5] = list.get(i).getFunCT();
            row[6] = list.get(i).getFunFun();
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
        ProcuraForn = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabela_Mostra_Func = new javax.swing.JTable();
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
        FornSelecionado.setText("Funcionário Selecionado");
        jScrollPane1.setViewportView(FornSelecionado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 430, 40));

        ProcuraForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcuraFornActionPerformed(evt);
            }
        });
        getContentPane().add(ProcuraForn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 500, 50));

        jTabela_Mostra_Func.setFont(new java.awt.Font("Baskerville Old Face", 0, 20)); // NOI18N
        jTabela_Mostra_Func.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Telefone", "RG", "Endereço", "CT", "Função"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTabela_Mostra_Func.setRowHeight(30);
        jTabela_Mostra_Func.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabela_Mostra_FuncMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTabela_Mostra_Func);
        if (jTabela_Mostra_Func.getColumnModel().getColumnCount() > 0) {
            jTabela_Mostra_Func.getColumnModel().getColumn(0).setMinWidth(30);
            jTabela_Mostra_Func.getColumnModel().getColumn(0).setMaxWidth(40);
            jTabela_Mostra_Func.getColumnModel().getColumn(2).setMinWidth(130);
            jTabela_Mostra_Func.getColumnModel().getColumn(2).setMaxWidth(140);
            jTabela_Mostra_Func.getColumnModel().getColumn(3).setMinWidth(100);
            jTabela_Mostra_Func.getColumnModel().getColumn(3).setMaxWidth(110);
            jTabela_Mostra_Func.getColumnModel().getColumn(5).setMinWidth(100);
            jTabela_Mostra_Func.getColumnModel().getColumn(5).setMaxWidth(110);
            jTabela_Mostra_Func.getColumnModel().getColumn(6).setMinWidth(100);
            jTabela_Mostra_Func.getColumnModel().getColumn(6).setMaxWidth(110);
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
        String fornecedor;
        fornecedor = ProcuraForn.getText();
        System.out.println(fornecedor);
       // TabelaForn();
    }//GEN-LAST:event_lupaMouseClicked

    private void setinhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setinhaMouseClicked
        TelaPrincipal Principal = new TelaPrincipal();
        Principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_setinhaMouseClicked

    private void ContatarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContatarMouseClicked
        try {
            Connection conexao = new Conexao().getConnection();
            System.out.println("Iniciando comando!!!!");
            String sql = "insert into dbo.Fornecedor(ForNome,ForTel,Foremail) values('LuArtes','323287898','lulu@hotmail.com');";
            //insert into dbo.Fornecedor(ForNome,ForTel,Foremail) values('LuArtes','323287898','lulu@hotmail.com');
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.execute();
            
            statement.close();
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("Fornecedores1");
            Logger.getLogger(TelaFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Fornecedores2");
        }
    }//GEN-LAST:event_ContatarMouseClicked

    private void EditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditarMouseClicked
        FornEditar novo = new FornEditar();
        novo.setVisible(true);
    }//GEN-LAST:event_EditarMouseClicked

    private void NovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NovoMouseClicked
        DonoCadastro novo = new DonoCadastro();
        novo.setVisible(true);
    }//GEN-LAST:event_NovoMouseClicked

    private void ProcuraFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcuraFornActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_ProcuraFornActionPerformed

    private void jTabela_Mostra_FuncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabela_Mostra_FuncMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTabela_Mostra_FuncMouseClicked
    
    
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
            java.util.logging.Logger.getLogger(TelaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contatar;
    private javax.swing.JLabel Editar;
    private javax.swing.JTextPane FornSelecionado;
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel Novo;
    private javax.swing.JTextField ProcuraForn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabela_Mostra_Func;
    private javax.swing.JLabel lupa;
    private javax.swing.JLabel moldura1;
    private javax.swing.JLabel moldura2;
    private javax.swing.JLabel moldura3;
    private javax.swing.JLabel setinha;
    // End of variables declaration//GEN-END:variables
}