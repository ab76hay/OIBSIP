import java.util.HashMap;

public class Database {

    static class Ticket {
        String name, trainName, classType, date, from, to;
        int trainNo;

        public Ticket(String name, int trainNo, String trainName,
                      String classType, String date, String from, String to) {
            this.name = name;
            this.trainNo = trainNo;
            this.trainName = trainName;
            this.classType = classType;
            this.date = date;
            this.from = from;
            this.to = to;
        }
    }

    static HashMap<Integer, Ticket> db = new HashMap<>();

    public static String getTrainName(int trainNo) {
        return switch (trainNo) {
            case 11001 -> "Mumbai Express";
            case 12045 -> "Shatabdi Express";
            case 12951 -> "Rajdhani Express";
            default -> "Unknown Train";
        };
    }

    public static void storeReservation(int pnr, String name, int trainNo,
                                        String trainName, String classType,
                                        String date, String from, String to) {
        db.put(pnr, new Ticket(name, trainNo, trainName, classType, date, from, to));
    }

    public static boolean checkPNR(int pnr) {
        return db.containsKey(pnr);
    }

    public static void showDetails(int pnr) {
        Ticket t = db.get(pnr);
        System.out.println("\n----- Ticket Details -----");
        System.out.println("Passenger: " + t.name);
        System.out.println("Train: " + t.trainName + " (" + t.trainNo + ")");
        System.out.println("Class: " + t.classType);
        System.out.println("Date: " + t.date);
        System.out.println("From: " + t.from);
        System.out.println("To: " + t.to);
        System.out.println("---------------------------\n");
    }

    public static void cancelTicket(int pnr) {
        db.remove(pnr);
    }
}
