import java.util.Scanner;

public class Reservation {

    public static void reserve() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n----- RESERVATION FORM -----");

        System.out.print("Passenger Name: ");
        String name = sc.nextLine();

        System.out.print("Train Number: ");
        int trainNo = sc.nextInt();
        sc.nextLine();

        String trainName = Database.getTrainName(trainNo);
        System.out.println("Train Name: " + trainName);

        System.out.print("Class Type (1A/2A/3A/SL): ");
        String classType = sc.nextLine();

        System.out.print("Date of Journey: ");
        String date = sc.nextLine();

        System.out.print("From: ");
        String from = sc.nextLine();

        System.out.print("To: ");
        String to = sc.nextLine();

        int pnr = (int) (Math.random() * 1000000);

        Database.storeReservation(pnr, name, trainNo, trainName, classType, date, from, to);

        System.out.println("\nReservation Successful!");
        System.out.println("Your PNR Number: " + pnr);
        System.out.println("-----------------------------\n");
    }
}
