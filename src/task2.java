import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double gallons = 0, mpg = 0, price = 0;


        do {
            System.out.print("Enter number of gallons in the tank: ");
            if (scan.hasNextDouble()) {
                gallons = scan.nextDouble();
                if (gallons >= 0) break;
                else System.out.println("Gallons must be >= 0.");
            } else {
                System.out.println("Invalid input. Enter a number.");
                scan.next();
            }
        } while (true);


        do {
            System.out.print("Enter fuel efficiency (MPG): ");
            if (scan.hasNextDouble()) {
                mpg = scan.nextDouble();
                if (mpg > 0) break;
                else System.out.println("Fuel efficiency must be > 0.");
            } else {
                System.out.println("Invalid input. Enter a number.");
                scan.next();
            }
        } while (true);


        do {
            System.out.print("Enter price per gallon: ");
            if (scan.hasNextDouble()) {
                price = scan.nextDouble();
                if (price > 0) break;
                else System.out.println("Price must be > 0.");
            } else {
                System.out.println("Invalid input. Enter a number.");
                scan.next();
            }
        } while (true);

        double costPer100Miles = (100 / mpg) * price;
        double distancePossible = gallons * mpg;

        System.out.printf("Cost per 100 miles: $%.2f\n", costPer100Miles);
        System.out.printf("Distance possible: %.2f miles\n", distancePossible);

        scan.close();
    }
}
