import java.util.Scanner;

public class Task4 {
    static void main(String[] args) {
        //Vars
        int age;
        Scanner scan = new Scanner(System.in);

        //Inputs
        System.out.println("Enter your age.");
        age = scan.nextInt();

        //Outputs
        if (age >= 21) {
            System.out.println("You get a wristband.");
        } else if (age <= 0) {
            System.out.println("Invalid input.");
            System.exit(0);
        } else {
            System.exit(0);
        }
    }
}
