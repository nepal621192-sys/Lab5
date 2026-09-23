import java.util.Scanner;

public class Task2 {
    static void main(String[] args) {
        //Vars
        int month;
        Scanner scan = new Scanner(System.in);

        //Inputs
        System.out.println("Enter your birth month number (1-12).");
        month = scan.nextInt();

        //Outputs
        if (month >= 1 && month <= 12) {
            System.out.println("Your birth month is " + month);
        } else {
            System.out.println("You entered an incorrect month value:" + month);
            System.exit(0);
        }
    }
}