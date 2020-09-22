import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import org.*;
import com.mysql.jdbc.Driver;


//Conectando com o Banco de Dados
public class ConexaoBancoDeDados {

    static String driverJDBC = "org.gjt.mm;mysql.Drive";
    static String url = "jdbc:mysql://localhost:3306/Teste";
    static String user = "root";
    static String senha = "root";

    public static void main(String[] args) {

        try {
            System.out.println("Carregando o driver JDBC...");
            Class.forName(driverJDBC);
            System.out.println("Driver carregado com sucesso.");
        } catch (Exception e) {
            System.out.println("Falha no carregamento.");
        }

        try {
            System.out.println("Conectando ao banco...");
            conexao = DriverManager.getConnection(url, user, senha);
            System.out.println("Conexão efetuada com sucesso.");
        } catch (Exception e) {
            System.out.println("Falha na conexão.");
        }
    }
}

//Criando a Tabela dos Donos
public class ConexaoBancoDeDados {

    static String driverJDBC = "org.gjt.mm;mysql.Drive";
    static String url = "jdbc:mysql://localhost:3306/Teste";
    static String user = "root";
    static String senha = "root";

    public static void main(String[] args) {

        Connection conexao = null;
        Connection con = conexao;
        Statement st = null;
        String instrucaoSQL = "Create Table PetShopDB.dbo.dono ( DonoID int primary key, DonoNome varchar(80), DonoTel varchar(11), DonoEmail varchar(80), DonoRG varchar(9))";

        try {
            Class.forName(driverJDBC);
            conexao = DriverManager.getConnection(url, usuario, senha);

            System.out.println("Criando a tabela...");
            st = conexao.createStatement();
            st.executeUpdate(instrucaoSQL);
            System.out.println("Tabela craida com sucesso.");
            st.close();
            conexao.close();
        } catch (Exception e) {
            System.out.println("Erro.");
            e.printStackTrace();
        }
    }
}

//Inserindo dados na Tabela dos Donos
public class ConexaoBancoDeDados {

    static String driverJDBC = "org.gjt.mm;mysql.Drive";
    static String url = "jdbc:mysql://localhost:3306/Teste";
    static String user = "root";
    static String senha = "root";

    public static void main(String[] args) {

        Connection conexao = null;
        Connection con = conexao;
        Statement st = null;
        String instrucaoSQL = "Insert Into PetShopDB.dbo.dono ( DonoID, DonoNome, DonoTel, DonoEmail, DonoRG) values (1, 'Higor', '12345678998', 'higordeni@hotmail.com', '123456789')";

        try {
            Class.forName(driverJDBC);
            conexao = DriverManager.getConnection(url, usuario, senha);

            System.out.println("Inserindo dados na tabela...");
            st = conexao.createStatement();
            st.executeUpdate(instrucaoSQL);
            System.out.println("Dados inseridos com sucesso.");
            st.close();
            conexao.close();
        } catch (Exception e) {
            System.out.println("Erro.");
            e.printStackTrace();
        }
    }
}

//Consultando dados na Tabela dos Donos
public class ConexaoBancoDeDados {

    static String driverJDBC = "org.gjt.mm;mysql.Drive";
    static String url = "jdbc:mysql://localhost:3306/Teste";
    static String user = "root";
    static String senha = "root";

    public static void main(String[] args) {

        Connection conexao = null;
        Connection con = conexao;
        Statement st = null;
        ResultSet result = null;
        String instrucaoSQL = "Select * from PetShopDB.dbo.dono";

        //A busca para mostrar o nome dos pets.
        //String instrucaoSQL = "select c.CliNome as Nome, c.CliTel as Telefone, c.CliEmail as 'E-mail', p.PetNome as 'Nome do Pet', c.CliRG as RG from Inicial.dbo.Cliente c inner join Inicial.dbo.Pet p on p.PetCliID = c.CliID order by CliNome";

        try {
            Class.forName(driverJDBC);
            conexao = DriverManager.getConnection(url, usuario, senha);

            System.out.println("Consultando os dados na tabela...");
            st = conexao.createStatement();
            result = st.executeQuery(instrucaoSQL);
            while(result.next()) {
                System.out.println("+------------------------------------------+");
                System.out.println("Id.......: " + result.getInt(1));
                System.out.println("Nome.....: " + result.getString(2));
                System.out.println("Telefone.: " + result.getString(3));
                System.out.println("E-mail...: " + result.getString(4));
                System.out.println("RG.......: " + result.getString(5));
            }
            result.close();
            st.close();
            conexao.close();
        } catch (Exception e) {
            System.out.println("Erro.");
            e.printStackTrace();
        }
    }
}

//Atualizando dados na Tabela dos Donos
public class ConexaoBancoDeDados {

    static String driverJDBC = "org.gjt.mm;mysql.Drive";
    static String url = "jdbc:mysql://localhost:3306/Teste";
    static String user = "root";
    static String senha = "root";

    public static void main(String[] args) {

        Connection conexao = null;
        Connection con = conexao;
        Statement st = null;
        ResultSet result = null;
        String instrucaoSQL = "Update PetShopDB.dbo.dono set DonoTel = '99865329865'";

        try {
            Class.forName(driverJDBC);
            conexao = DriverManager.getConnection(url, usuario, senha);

            System.out.println("Atualizando os dados na tabela...");
            st = conexao.createStatement();
            st.executeUpdate(instrucaoSQL);
            System.out.println("Dados atualizados com sucesso.");
            st.close();
            conexao.close();
        } catch (Exception e) {
            System.out.println("Erro.");
            e.printStackTrace();
        }
    }
}

//Excluindo dados na Tabela dos Donos
public class ConexaoBancoDeDados {

    static String driverJDBC = "org.gjt.mm;mysql.Drive";
    static String url = "jdbc:mysql://localhost:3306/Teste";
    static String user = "root";
    static String senha = "root";

    public static void main(String[] args) {

        Connection conexao = null;
        Connection con = conexao;
        Statement st = null;
        ResultSet result = null;
        String instrucaoSQL = "Delete from PetShopDB.dbo.dono";

        try {
            Class.forName(driverJDBC);
            conexao = DriverManager.getConnection(url, usuario, senha);

            System.out.println("Excluindo os dados na tabela...");
            st = conexao.createStatement();
            st.executeUpdate(instrucaoSQL);
            System.out.println("Dados excluidos com sucesso.");
            st.close();
            conexao.close();
        } catch (Exception e) {
            System.out.println("Erro.");
            e.printStackTrace();
        }
    }
}