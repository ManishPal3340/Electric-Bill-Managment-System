package electricBillManagment;



import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n⚡ Electricity Bill Management System ⚡");
            System.out.println("1. Add Customer");
            System.out.println("2. Generate Bill");
            System.out.println("3. View Bills");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    CustomerService.addCustomer();
                    break;
                case 2:
                    BillService.generateBill();
                    break;
                case 3:
                    BillService.viewBills();
                    break;
                case 4:
                    System.out.println("🙏 Thank You");
                    break;
                default:
                    System.out.println("❌ Invalid Choice");
            }

        } while (choice != 4);
    }
}
