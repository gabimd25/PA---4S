/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import View.TelaFornecedores;
import dao.Conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gabim
 */
public class Pets {
    int idDono;
    public void SalvarPet(String Petnome,String esp,String raca,char sexo,String data,String doenca,char cast,String rgDono){
        try {
            String sql = "insert into Inicial.dbo.Pet(PetCliID,PetNome,PetEsp,Petraca,PetSexo,PetData,PetDoen,PetCast) values((SELECT CliID from Inicial.dbo.Cliente WHERE CliRG='"+rgDono+"'),'" + Petnome + "','" + esp + "','" + raca + "','" + sexo + "','" + data + "','" + doenca + "','" + cast + "')";
            Connection conexao = new Conexao().getConnection();
            System.out.println("Iniciando comando!!!!");
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
    public void EditarPet(int IDPet,String raca,char sexo,String data,String doenca,char cast){
        
        try {
            Connection conexao = new Conexao().getConnection();
            System.out.println("Iniciando comando!!!!");
            String sql = "UPDATE Inicial.dbo.Pet SET PetSexo ='"+sexo+"', PetCast='"+cast+"', Petraca='"+raca+"', PetDoen='"+doenca+"', PetData='"+data+"' WHERE PetID="+IDPet;
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
