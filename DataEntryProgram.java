import java.util.Scanner;

public class DataEntryProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the FIA F1 Data Entry Program");
        System.out.println("=====================");

        int teamNum = 0;
        System.out.println("How many teams are there you want to enter?");
        System.out.print("> Enter: ");
        teamNum = sc.nextInt();

        sc.close(); // Close the scanner
    }
}