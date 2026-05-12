package Day17;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertEmployees {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/day17";
        String user = "root";
        String password = "Nancy@989";

        String sql = "INSERT INTO Employee (id, name, salary) VALUES (?, ?, ?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, 1);
            ps.setString(2, "Amit");
            ps.setDouble(3, 45000);
            ps.executeUpdate();

            ps.setInt(1, 2);
            ps.setString(2, "aman");
            ps.setDouble(3, 50000);
            ps.executeUpdate();

            ps.setInt(1, 3);
            ps.setString(2, "aryan");
            ps.setDouble(3, 55000);
            ps.executeUpdate();

            ps.setInt(1, 4);
            ps.setString(2, "shanu");
            ps.setDouble(3, 60000);
            ps.executeUpdate();

            ps.setInt(1, 5);
            ps.setString(2, "sri");
            ps.setDouble(3, 48000);
            ps.executeUpdate();

            System.out.println("5 Employee records inserted successfully!");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
