import java.util.Scanner;

public class Cancellation {

    public static void cancel() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n----- CANCELLATION FORM -----");

        System.out.print("Enter PNR Number: ");
        int pnr = sc.nextInt();

        if (Database.checkPNR(pnr)) {
            Database.showDetails(pnr);

            System.out.print("Confirm Cancellation (yes/no): ");
            String confirm = sc.next();

            if (confirm.equalsIgnoreCase("yes")) {
                Database.cancelTicket(pnr);
                System.out.println("Ticket Cancelled Successfully!");
            }
        } else {
            System.out.println("Invalid PNR Number!");
        }
    }
}
