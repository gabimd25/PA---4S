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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gabim
 */
public class Pets {
    int idDono;
    public void SalvarPet(String Petnome,String esp,String raca,char sexo,String doenca,char cast,String rgDono){
        
        try {
             Connection conexao = new Conexao().getConnection();
             System.out.println("Iniciando comando!!!!");
             //No banco de dados precisa mandar o ID do Dono junto com o cadastro do Pet
             String procuraId = "select CliID from Inicial.dbo.Cliente WHERE CliRG='123634789'";
             PreparedStatement pesquisa = conexao.prepareStatement(procuraId);
             ResultSet resultado = pesquisa.executeQuery(procuraId);
             idDono = resultado.getInt("CliId");
             System.out.println(idDono+"IDDONO!!!");
             String sql = "insert into Inicial.dbo.Pet(PetCliID,PetNome,PetEsp,Petraca,PetSexo,PetDoen,PetCast) values('"+ idDono+ "'," + Petnome + "','" + esp + "','" + raca + "','" + sexo + "','" + doenca + "','" + cast + "')";
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
    public void EditarCli(String nome,String telefone,String email,String rg){
        
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
