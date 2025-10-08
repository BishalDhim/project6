import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double side1 = 0, side2 = 0;

        do {
            System.out.print("Enter length of side 1: ");
            if (scan.hasNextDouble()) {
                side1 = scan.nextDouble();
                if (side1 > 0) break;
                else System.out.println("Side length must be > 0.");
            } else {
                System.out.println("Invalid input. Enter a number.");
                scan.next();
            }
        } while (true);

        do {
            System.out.print("Enter length of side 2: ");
            if (scan.hasNextDouble()) {
                side2 = scan.nextDouble();
                if (side2 > 0) break;
                else System.out.println("Side length must be > 0.");
            } else {
                System.out.println("Invalid input. Enter a number.");
                scan.next();
            }
        } while (true);

        double area = side1 * side2;
        double perimeter = 2 * (side1 + side2);
        double diagonal = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));

        System.out.printf("Area: %.2f\n", area);
        System.out.printf("Perimeter: %.2f\n", perimeter);
        System.out.printf("Diagonal: %.2f\n", diagonal);

        scan.close();
    }
}

