/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabim
 */
public class Conexao{
    public Connection getConnection() throws SQLException, ClassNotFoundException{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection conexao = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Inicial;user=pets;password=123");
        //databaseName=Inicial;user=pets;password=123    
        //user=root;password=null;
        //DESKTOP-DD1SG1R\Gabim
        return conexao;
    }
    public void Salvar(String query){
        try {
             Connection conexao = getConnection();
             PreparedStatement statement = conexao.prepareStatement(query);
             statement.execute();
             statement.close();
             conexao.close();
         } catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    public void Editar(String query){
        
        try {
            Connection conexao = getConnection();
            PreparedStatement statement = conexao.prepareStatement(query);
            statement.execute();            
            statement.close();
            conexao.close();
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    public ResultSet Pesquisar(String query){
        System.out.println("pesquisar!\n");
        try {
            Connection conexao = getConnection();
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery(query);
            return rs;
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }        
    }
    public void Deletar(String query){
        try{
            Connection conexao = getConnection();
            PreparedStatement statement = conexao.prepareStatement(query);
            statement.execute();
            conexao.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e); 
        }
    }
}