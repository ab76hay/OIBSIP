import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Login login = new Login();

        System.out.println("===== ONLINE RESERVATION SYSTEM =====");

        System.out.print("Enter Login ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if (login.checkLogin(id, pass)) {
            System.out.println("Login Successful!\n");

            while (true) {
                System.out.println("1. Reservation Form");
                System.out.println("2. Cancellation Form");
                System.out.println("3. Exit");
                System.out.print("Choose Option: ");

                int choice = sc.nextInt();

                switch (choice) {
                    case 1 -> Reservation.reserve();
                    case 2 -> Cancellation.cancel();
                    case 3 -> {
                        System.out.println("Thank you for using Online Reservation System!");
                        System.exit(0);
                    }
                    default -> System.out.println("Invalid Choice!");
                }
            }

        } else {
            System.out.println("Invalid Login. Try Again!");
        }
    }
}
