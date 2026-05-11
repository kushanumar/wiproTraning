package Day16;
import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/userdb";
        String username = "root";
        String password = "Nancy@989";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con =
                    DriverManager.getConnection(url, username, password);

            System.out.println("Driver Connected Successfully!");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
