import java.util.Scanner;

public class Task3 {
    static void main(String[] args) {
        //Vars
        String party;
        Scanner scan = new Scanner(System.in);

        //Inputs
        System.out.println("What is your party affiliation. (R, D, or I)");
        party = scan.nextLine();

        //Outputs
        if (party.equals("R")) {
            System.out.println("You get a republican elephant.");
        } else if (party.equals("D")) {
            System.out.println("You get a democratic donkey.");
        } else if (party.equals("I")) {
            System.out.println("You get an independent person.");
        } else {
            System.out.println("Error. Invalid input.");
            System.exit(0);
        }
    }
}
