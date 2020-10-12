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
public class Donos {
    
    public void SalvarDono(String nome,String telefone,String email,String rg){
        try {
             Connection conexao = new Conexao().getConnection();
             System.out.println("Iniciando comando!!!!");
             //INSERT INTO Inicial.dbo.Cliente VALUES ('Cláudia Silva', '15999345162','ClaudiaSilva45@outlook.com','123634789')
             String sql = "insert into Inicial.dbo.Cliente(CliNome,CliTel,CliEmail,CliRG) values('" + nome + "','" + telefone + "','" + email + "','"+ rg +"')";
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
    public void EditarDono(String nome,String telefone,String email,String rg){        
        try {
            Connection conexao = new Conexao().getConnection();
            System.out.println("Iniciando comando!!!!");
            String sql = "UPDATE Inicial.dbo.Fornecedor SET ForTel="+telefone+", ForEmail ="+email+"WHERE ForNome="+nome+";";
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
