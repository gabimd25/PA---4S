/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Prod;
import dao.Conexao;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gabim
 */
public class TelaCompras extends javax.swing.JFrame {
    ArrayList<Prod> produtos = new ArrayList<>();
    String query;
    int IDProduto=0,quant;
    ArrayList<Prod> prodsSelecionados = new ArrayList<>();
    String nome,forn,descri;
    float preco;
    /**
     * Creates new form TelaFornecedores
     */
    public TelaCompras() {
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
        Quantidade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProdSelecionado = new javax.swing.JTextPane();
        ProcuraProd = new javax.swing.JTextField();
        Finalizar = new javax.swing.JLabel();
        Qtd = new javax.swing.JLabel();
        Adicionar = new javax.swing.JLabel();
        setinha = new javax.swing.JLabel();
        moldura2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        moldura1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabela1 = new javax.swing.JTable();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lupa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lupa.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabim\\OneDrive\\Área de Trabalho\\PA\\PA---4S-master\\AnimalsPalace\\src\\main\\java\\imagens\\lupa2.png")); // NOI18N
        lupa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lupaMousePressed(evt);
            }
        });
        getContentPane().add(lupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, 90, 60));

        Quantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantidadeActionPerformed(evt);
            }
        });
        getContentPane().add(Quantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 90, 50));

        ProdSelecionado.setEditable(false);
        ProdSelecionado.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        ProdSelecionado.setText("Produto Selecionado");
        jScrollPane1.setViewportView(ProdSelecionado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 450, 50));

        ProcuraProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcuraProdActionPerformed(evt);
            }
        });
        getContentPane().add(ProcuraProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 500, 50));

        Finalizar.setFont(new java.awt.Font("Brush Script MT", 0, 39)); // NOI18N
        Finalizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Finalizar.setText("Finalizar Compra");
        Finalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FinalizarMousePressed(evt);
            }
        });
        getContentPane().add(Finalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 550, 240, 70));

        Qtd.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        Qtd.setText("Qtd");
        getContentPane().add(Qtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, -1, -1));

        Adicionar.setFont(new java.awt.Font("Brush Script MT", 0, 48)); // NOI18N
        Adicionar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Adicionar.setText("Comprar");
        Adicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AdicionarMousePressed(evt);
            }
        });
        getContentPane().add(Adicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 240, 70));

        setinha.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabim\\OneDrive\\Área de Trabalho\\PA\\PA---4S-master\\AnimalsPalace\\src\\main\\java\\imagens\\setinha2.png")); // NOI18N
        setinha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                setinhaMousePressed(evt);
            }
        });
        getContentPane().add(setinha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 180, 50));

        moldura2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabim\\OneDrive\\Área de Trabalho\\PA\\PA---4S-master\\AnimalsPalace\\src\\main\\java\\imagens\\botao.png")); // NOI18N
        getContentPane().add(moldura2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabim\\OneDrive\\Área de Trabalho\\PA\\PA---4S-master\\AnimalsPalace\\src\\main\\java\\imagens\\input3.png")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 640, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabim\\OneDrive\\Área de Trabalho\\PA\\PA---4S-master\\AnimalsPalace\\src\\main\\java\\imagens\\input3.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 640, 70));

        moldura1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabim\\OneDrive\\Área de Trabalho\\PA\\PA---4S-master\\AnimalsPalace\\src\\main\\java\\imagens\\botao.png")); // NOI18N
        getContentPane().add(moldura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 540, 270, 100));

        tabela1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tabela1.setModel(new javax.swing.table.DefaultTableModel(
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
        tabela1.setRowHeight(30);
        tabela1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabela1MousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(tabela1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 850, 270));

        Fundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabim\\OneDrive\\Área de Trabalho\\PA\\PA---4S-master\\AnimalsPalace\\src\\main\\java\\imagens\\fundo4.png")); // NOI18N
        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public ArrayList<Prod> prodList(String query1){
        ArrayList<Prod> prodsList = new ArrayList<>();
        try{
            Conexao conexao = new Conexao();
            ResultSet rs = conexao.Pesquisar(query1);
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
        DefaultTableModel model = (DefaultTableModel)tabela1.getModel();
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
    private void ProcuraProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcuraProdActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_ProcuraProdActionPerformed

    private void QuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantidadeActionPerformed

    private void setinhaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setinhaMousePressed
        TelaPrincipal Principal = new TelaPrincipal();
        Principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_setinhaMousePressed

    private void lupaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lupaMousePressed
        System.out.println("clicou");
        query = "SELECT	ProID,ProNome,ProPre,ForNome,ProQuant,ProDesc FROM Inicial.dbo.Produto p inner join Inicial.dbo.Fornecedor f on p.ProForID = f.ForID WHERE ProNome LIKE '%"+ProcuraProd.getText()+"%' order by p.ProID";
       produtos = prodList(query);
       mostra_prod(produtos);
    }//GEN-LAST:event_lupaMousePressed

    private void AdicionarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdicionarMousePressed
        int quantidade = Integer.parseInt(Quantidade.getText());
        if(ProdSelecionado.getText()!="Produto Selecionado" && quantidade<=quant){
            Prod prod;
            prod = new Prod(IDProduto,nome,preco,forn,quantidade,descri);
            prodsSelecionados.add(prod);
            Quantidade.setText("");
            ProdSelecionado.setText("Produto Selecionado");
        }  
    }//GEN-LAST:event_AdicionarMousePressed

    private void FinalizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FinalizarMousePressed
        TelaCarrinho novo = new TelaCarrinho(prodsSelecionados);
        novo.setVisible(true);
        prodsSelecionados.clear();
    }//GEN-LAST:event_FinalizarMousePressed

    private void tabela1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela1MousePressed
        try{
            int row = tabela1.getSelectedRow();
            String Clicar_tabela = (tabela1.getModel().getValueAt(row, 0).toString());
            Conexao conexao = new Conexao();
            String selecionado = "SELECT ProID,ProNome,ProPre,ForNome,ProQuant,ProDesc FROM Inicial.dbo.Produto p inner join Inicial.dbo.Fornecedor f on p.ProForID = f.ForID WHERE ProID ="+Clicar_tabela+" order by p.ProID";
            ResultSet rs = conexao.Pesquisar(selecionado);

            if(rs.next()){
                nome = rs.getString("ProNome");
                ProdSelecionado.setText(nome);
                IDProduto= rs.getInt("ProID");
                preco= rs.getFloat("ProPre");
                forn = rs.getString("ForNome");
                quant=rs.getInt("ProQuant");
                descri=rs.getString("ProDesc");
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_tabela1MousePressed
    
    
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
            java.util.logging.Logger.getLogger(TelaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCompras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Adicionar;
    private javax.swing.JLabel Finalizar;
    private javax.swing.JLabel Fundo;
    private javax.swing.JTextField ProcuraProd;
    private javax.swing.JTextPane ProdSelecionado;
    private javax.swing.JLabel Qtd;
    private javax.swing.JTextField Quantidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lupa;
    private javax.swing.JLabel moldura1;
    private javax.swing.JLabel moldura2;
    private javax.swing.JLabel setinha;
    private javax.swing.JTable tabela1;
    // End of variables declaration//GEN-END:variables
}
