import java.util.Scanner;

public class DataEntryProgram {
    static final int DRIVERS_NUM = 2; // Constant variable for 2 drivers each team

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the FIA F1 Data Entry Program");
        System.out.println("=====================");

        int teamNum;

        // Ask user to enter again if user entered number of teams < 2
        do {
            System.out.println("How many teams are there you want to enter?");
            System.out.print("> Enter: ");
            teamNum = sc.nextInt();

            if (teamNum < 2) {
                System.out.println("Number of teams have to be greater than 2.\nPlease re-enter below");
                System.out.println("-----");
            }
        } while (teamNum < 2);
        sc.nextLine();// Consume integer token

        String grandPrix = "", teamName = "", carCode = "", driverName = "";
        int driverPosition = 0;
        double driverFastestLap = 0.0;

        // Loop to let user enter details for each team
        for (int i = 0; i < teamNum; i++) {
            System.out.println("-----");
            System.out.println("Enter details for team " + (i + 1));

            System.out.print("> Grand Prix: ");
            grandPrix = sc.nextLine();
            System.out.print("> Team Name: ");
            teamName = sc.nextLine();
            System.out.print("> Car Code: ");
            carCode = sc.nextLine();
            System.out.print("> Driver Name: ");
            driverName = sc.nextLine();
            System.out.print("> Driver Position: ");
            driverPosition = sc.nextInt();
            System.out.print("> Driver Fastest Lap: ");
            driverFastestLap = sc.nextDouble();
            sc.nextLine();// Consume integer token
        }

        sc.close(); // Close the scanner
    }
}