/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Gabim
 */
public class Conexao{
    public Connection getConnection() throws SQLException, ClassNotFoundException{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        //DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
        System.out.println("Driver Conectado!!");
        Connection conexao = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Inicial;user=pets;password=123");
        //databaseName=Inicial;user=pets;password=123    
        //user=root;password=null;
        //DESKTOP-DD1SG1R\Gabim
        System.out.println("Banco Conectado!!");
        return conexao;
    }
}
    
    
    
    
    /*
    static String driverJDBC = "com.microsoft.sqlserver.jdbc.SQLServerDriver ";
    static String url = "jdbc:microsoft:sqlserver://localhost"; 
    //"jdbc:sqlserver://localhost:1433;" +  
   //"databaseName=AdventureWorks;user=MyUserName;password=*****;";
    public static void main(String args[]) {           
        try{
            //DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Carregado!!!!!");
        }catch (ClassNotFoundException e){
            System.out.println("Falha no carregamento");
            System.out.println(e);
        }
    }    
}*/
