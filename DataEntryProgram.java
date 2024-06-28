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

        String grandPrix = "", teamName = "", carCode = "", driverName = "";
        int driverPosition = 0;
        double driverFastestLap = 0.0;

        // Loop to let user enter details for each team
        for (int i = 0; i < teamNum; i++) {
            System.out.println("Enter details for team " + (i + 1));

            System.out.println("> Grand Prix: ");
            grandPrix = sc.nextLine();
            System.out.println("> Team Name: ");
            teamName = sc.nextLine();
            System.out.println("> Car Code: ");
            carCode = sc.nextLine();
            System.out.println("> Driver Name: ");
            driverName = sc.nextLine();
            System.out.println("> Driver Position: ");
            driverPosition = sc.nextInt();
            System.out.println("> Driver Fastest Lap: ");
            driverFastestLap = sc.nextDouble();
        }

        sc.close(); // Close the scanner
    }
}