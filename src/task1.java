import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double celsius = 0;
        boolean valid = false;

        do {
            System.out.print("Enter temperature in Celsius: ");
            if (scan.hasNextDouble()) {
                celsius = scan.nextDouble();
                valid = true;
            } else {
                System.out.println("Invalid input. Try again.");
                scan.next();
            }
        } while (!valid);

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.printf("%-12s%10.2f\n", "Degrees C:", celsius);
        System.out.printf("%-12s%10.2f\n", "Degrees F:", fahrenheit);
    }
}
