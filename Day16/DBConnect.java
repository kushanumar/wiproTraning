package Day16;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnect {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/userdb";
        String username = "root";
        String password = "Nancy@989";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con =
                    DriverManager.getConnection(url, username, password);

            Statement stmt = con.createStatement();

            String query = "SELECT * FROM students";

            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");

                System.out.println(id + " " + name + " " + email);
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

