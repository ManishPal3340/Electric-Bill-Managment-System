package electricBillManagment;




import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class CustomerService {

    public static void addCustomer() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Address: ");
            String address = sc.nextLine();

            Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO customers(name, address) VALUES (?,?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, address);

            ps.executeUpdate();
            System.out.println("✅ Customer Added Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
