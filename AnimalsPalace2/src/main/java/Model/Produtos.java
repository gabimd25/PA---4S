/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import View.TelaFornecedores;
import dao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gabim
 */
public class Produtos {
    public void SalvarProd(int id,String nome,String descricao,float preco,int quanti){
        try {
             Connection conexao = new Conexao().getConnection();
             System.out.println("Iniciando comando!!!!");
             String sql = "insert into dbo.Produto(ProForID,ProNome,ProDesc,ProPre,ProQuant) values('" + id + "','" + nome + "','" + descricao +"','"+ preco + "','"+ quanti +"');";
             PreparedStatement statement = conexao.prepareStatement(sql);
             statement.execute();

             statement.close();
             conexao.close();
         } catch (SQLException ex) {
             Logger.getLogger(TelaFornecedores.class.getName()).log(Level.SEVERE, null, ex);
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(TelaFornecedores.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }
    public void EditarProd(String nome,String telefone,String email){
        
        try {
            Connection conexao = new Conexao().getConnection();
            System.out.println("Iniciando comando!!!!");
            String sql = "UPDATE Inicial.dbo.Fornecedor SET ForTel="+telefone+", ForEmail ="+email+"WHERE ForNome='+nome+';";
            //insert into dbo.Fornecedor(ForNome,ForTel,Foremail) values('LuArtes','323287898','lulu@hotmail.com');
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.execute();
            
            statement.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(TelaFornecedores.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaFornecedores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void ExcluirForn(int id){
        //Encontrar o ID do Fornecedor selecionado para realizar o delete
        //String sql = "Delete from Inicial.dbo.Fornecedor where ForID=";
    }
    /*public void TabelaForn(){
        tabela.addRow(new Object[]{
            dbo
        })
    }*/
    
}
