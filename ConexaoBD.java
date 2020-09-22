package Produtos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
//import org.*;
//import com.mysql.jdbc.Driver;

public class ConexaoBD {
    
    static String driverJDBC = "ord.gjt.mm;mysql.Driver";
    static String url = "jdbc:mysql://localhost:3306/produtos";
	static String user = "root";
    static String senha = "root";

    //static String DriverJDBC = "org.gjt.mm.mysql.Driver";
    public static void main (String[] args){	
		//carregar o driver MySQL
		try {
	
            Class.forName("DriverJDBC");
            System.out.println("Driver carregado com sucesso");
		} catch (Exception e) {
			System.out.println("Falha no carregamento D:");
		}
	
		try {
		//Conexão com banco de dados
		Connection conexao = DriverManager.getConnection(url, user, senha);
	}catch(Exception e){
	System.out.println("Falha na conexão D:");
    }
}

public class ConexaoBD{

    static String driverJDBC = "org.gjt.mm.mysql.Driver";
    static String url = "jdbc:mysql://localhost:3306/produtos";
    static String user = "root";
    static String senha = "root";

    public static void main (String[] args){	
    Connection conexao = null;
    Connection conn = conexao;
    Statement st = null;
    String instrucaoSQL = "CREATE TABLE Produtos( + Nome varchar(80), Peso decimal(2,1), Preco decimal(5,2), Quantidade int)";

    try {

        Class.forName("DriverJDBC");
        conexao = DriverManager.getConnection(url,usuario,senha);
        //cria tabela
        st = conexao.createSatement();
        st.executeUpdate(instrucaoSQL);
        st.close();
        conexao.close();
    } catch (Exception e) {
            System.out.println("Falha no carregamento D:");
            e.printStackTrace();
        }
    }
    
}

public class ConexaoBD{

    static String driverJDBC = "org.gjt.mm.mysql.Driver";
    static String url = "jdbc:mysql://localhost:3306/funcionarios";
    static String user = "root";
    static String senha = "root";

    public static void main (String[] args){	
    Connection conexao = null;
    Connection conn = conexao;
    Statement st = null;
    String instrucaoSQL = "Insert Into Produtos(Nome, Peso, Preco, Quantidade) VALUES (1, 'Ração de gato', '5,9','30,00', '100')";

    try {

        Class.forName("DriverJDBC");
        conexao = DriverManager.getConnection(url,usuario,senha);
        //inseri dados na tabela
        st = conexao.createSatement();
        st.executeUpdate(instrucaoSQL);
        st.close();
        conexao.close();
    } catch (Exception e) {
        System.out.println("Falha no carregamento D:");
        e.printStackTrace();
    }
}

  public class ConexaoBD{

		static String driverJDBC = "org.gjt.mm.mysql.Driver";
		static String url = "jdbc:mysql://localhost:3306/funcionarios";
		static String user = "root";
		static String senha = "root";

		public static void main (String[] args){	
		Connection conexao = null;
		Connection conn = conexao;
		Statement st = null;
		String instrucaoSQL = "Select * from Produtos";

		try{
		Class.forName(driverJDBC);
		conexao = DriverManager.getConnection(url,usuario,senha); 
		//Consulta de dados da tabela
		st = conexao.createStatement();
		result = st.executeQuery(instrucaoSQL);
		while(result.next()){
			System.out.println("Nome = " + result.getString(1));
			System.out.println("Peso = " + result.getfloat(2));
			System.out.println("Preco = " + result.getfloat(3));
			System.out.println("Quantidade = " + result.getInt(4));
			System.out.println("Carteira de trabalho = " + result.getInt(5));
			System.out.println("Funcao = " + result.getString(6));
	}
			result.close();
			st.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println("Falha no carregamento D:");
			e.printStackTrace();
        }
    }
 }

    
public boolean incluir(Object o) {
    String sInstrucaoSQL;
    sMensagemErro = "";
    Produto Produto = (Produto) o;
    try {
    objConexaoBD.conecta();
    sInstrucaoSQL = "insert into " + produtos+ nome + "values('Ração Gato')";
    sInstrucaoSQL = "insert into " + produtos+ Peso + "values('10.0')";
    sInstrucaoSQL = "insert into " + produtos+ Preco + "values('30.00')";
    sInstrucaoSQL = "insert into " + produtos+ Quantidade + "values('100')"; 
    PreparedStatement stmt = objConexaoBD.con.prepareStatement(sInstrucaoSQL);
    stmt.setString(1, Produto.getNome());
    stmt.setInt(2, Produto.getPeso());
    stmt.setString(3, Produto.getPreco());
    stmt.setString(1, Produto.getQuantidade());
     stmt.execute();
    stmt.close();
    objConexaoBD.desconecta();
    }
    catch(SQLException ex) { 
        sMensagemErro = "SQLException: " + ex.getMessage();
    }
    if (sMensagemErro.equals("")) 
        return true;
    else return false;
}
}
}
