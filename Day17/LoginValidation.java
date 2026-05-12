package Day17;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class LoginValidation {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/day17";
        String user = "root";
        String password = "Nancy@989";

        String sql = "SELECT * FROM Users WHERE username = ? AND password = ?";

        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);

            System.out.print("Enter Username: ");
            String username = sc.nextLine();

            System.out.print("Enter Password: ");
            String pass = sc.nextLine();

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, pass);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Login Successful! Welcome " + username);
            } else {
                System.out.println("Invalid Username or Password!");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
