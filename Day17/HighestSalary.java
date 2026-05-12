package Day17;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class HighestSalary {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/day17";
        String user = "root";
        String password = "Nancy@989";

        String sql = "SELECT * FROM Employee ORDER BY salary DESC LIMIT 1";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Employee with Highest Salary:");
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Salary: " + rs.getDouble("salary"));
            } else {
                System.out.println("No employee records found!");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
