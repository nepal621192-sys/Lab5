import java.util.Scanner;

public class Task1 {
    static void main(String[] args) {
        //Vars
        double price;
        Scanner scan = new Scanner(System.in);

        //Inputs
        System.out.println("Enter price of item.");
        price = scan.nextDouble();

        //Outputs
        if (price >= 100) {
            System.out.println("Free shipping! Total cost: $" + price);
        } else if (price < 100 && price >= 0) {
            System.out.println("Shipping cost: $" + (price * 0.02) + " Total cost: $" + (price * 1.02));
        } else {
            System.out.println("Error. Invalid Input.");
            System.exit(0);
        }
    }
}