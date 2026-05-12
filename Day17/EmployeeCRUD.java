package Day17;
import java.sql.*;
import java.util.Scanner;

public class EmployeeCRUD {

    static String url = "jdbc:mysql://localhost:3306/day17";
    static String user = "root";
    static String password = "Nancy@989";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);

            while (true) {

                System.out.println("\n===== EMPLOYEE CRUD MENU =====");
                System.out.println("1. Insert Employee");
                System.out.println("2. View Employees");
                System.out.println("3. Update Salary");
                System.out.println("4. Delete Employee");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");
                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();

                        System.out.print("Enter Name: ");
                        String name = sc.next();

                        System.out.print("Enter Salary: ");
                        double salary = sc.nextDouble();

                        String insertSQL = "INSERT INTO Employee VALUES (?, ?, ?)";
                        PreparedStatement ps1 = con.prepareStatement(insertSQL);
                        ps1.setInt(1, id);
                        ps1.setString(2, name);
                        ps1.setDouble(3, salary);

                        int insertStatus = ps1.executeUpdate();
                        System.out.println(insertStatus > 0 ? "Inserted Successfully!" : "Insert Failed!");
                        break;

                    case 2:
                        String selectSQL = "SELECT * FROM Employee";
                        PreparedStatement ps2 = con.prepareStatement(selectSQL);
                        ResultSet rs = ps2.executeQuery();

                        System.out.println("\nEmployee Records:");
                        while (rs.next()) {
                            System.out.println("ID: " + rs.getInt("id") +
                                    ", Name: " + rs.getString("name") +
                                    ", Salary: " + rs.getDouble("salary"));
                        }
                        break;

                    case 3:
                        System.out.print("Enter Employee ID: ");
                        int uid = sc.nextInt();

                        System.out.print("Enter New Salary: ");
                        double newSalary = sc.nextDouble();

                        String updateSQL = "UPDATE Employee SET salary=? WHERE id=?";
                        PreparedStatement ps3 = con.prepareStatement(updateSQL);
                        ps3.setDouble(1, newSalary);
                        ps3.setInt(2, uid);

                        int updateStatus = ps3.executeUpdate();
                        System.out.println(updateStatus > 0 ? "Updated Successfully!" : "ID Not Found!");
                        break;

                    case 4:
                        System.out.print("Enter Employee ID to Delete: ");
                        int did = sc.nextInt();

                        String deleteSQL = "DELETE FROM Employee WHERE id=?";
                        PreparedStatement ps4 = con.prepareStatement(deleteSQL);
                        ps4.setInt(1, did);

                        int deleteStatus = ps4.executeUpdate();
                        System.out.println(deleteStatus > 0 ? "Deleted Successfully!" : "ID Not Found!");
                        break;

                    case 5:
                        con.close();
                        System.out.println("Exited Successfully!");
                        System.exit(0);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
