import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {
        Connection conn = null;
        String db = "dbhoteltransilvania";
        String url = "jdbc:mysql://localhost:3306/" + db;
        String user = "root";
        String pwd = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pwd);
            System.out.println("Conectado com sucesso!");
            
        } catch (ClassNotFoundException e) {
            System.out.println("Driver do banco de dados não localizado!");
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}
