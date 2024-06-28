import java.util.Scanner;

public class DataEntryProgram {
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

        sc.close(); // Close the scanner
    }
}