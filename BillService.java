package electricBillManagment;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.Scanner;

public class BillService {

    public static void generateBill() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Customer ID: ");
            int cid = sc.nextInt();

            System.out.print("Enter Units Consumed: ");
            int units = sc.nextInt();

            double amount = calculateAmount(units);

            Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO bills(customer_id, units, amount, bill_date) VALUES (?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cid);
            ps.setInt(2, units);
            ps.setDouble(3, amount);
            ps.setDate(4, java.sql.Date.valueOf(LocalDate.now()));

            ps.executeUpdate();
            System.out.println("✅ Bill Generated");
            System.out.println("💰 Total Amount = ₹" + amount);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static double calculateAmount(int units) {
        if (units <= 100)
            return units * 2;
        else if (units <= 200)
            return units * 3;
        else
            return units * 5;
    }

    public static void viewBills() {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "SELECT * FROM bills";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            System.out.println("\n--- Bill Records ---");
            while (rs.next()) {
                System.out.println(
                    "Bill ID: " + rs.getInt("bill_id") +
                    ", Customer ID: " + rs.getInt("customer_id") +
                    ", Units: " + rs.getInt("units") +
                    ", Amount: ₹" + rs.getDouble("amount") +
                    ", Date: " + rs.getDate("bill_date")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
