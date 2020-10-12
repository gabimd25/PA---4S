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
public class Funcionarios {
    
    public void SalvarFunc(String nome,String telefone,String endereco,String rg, String ct, String funcao){
        try {
             Connection conexao = new Conexao().getConnection();
             System.out.println("Iniciando comando!!!!");
             String sql = "insert into Inicial.dbo.Funcionario(FunNome,FunTel,FunEnd,FunRG,FunCT,FunFun) values('" + nome + "','" + telefone + "','" + endereco + "','" + rg + "','" + ct + "','" + funcao + "');";
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
    public void EditarFunc(String nome,String telefone,String endereco,String rg, String funcao){
        
        try {
            Connection conexao = new Conexao().getConnection();
            System.out.println("Iniciando comando!!!!");
            String sql = "UPDATE Inicial.dbo.Funcionario SET FunTel="+telefone+", FunEnd ="+endereco+", FunFun="+funcao+"WHERE FunRG="+rg+";";
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
    /*public void TabelaForn(){
        tabela.addRow(new Object[]{
            dbo
        })
    }*/
    
}
