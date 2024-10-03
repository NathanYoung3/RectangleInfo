import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean validValue = false;
        double side1 = 0;
        double side2 = 0;
        double area = 0;
        double perimeter = 0;
        double diagonal = 0;

        do {
            System.out.println("Enter a length for side 1:");
            if (scan.hasNextDouble()) {
                side1 = scan.nextDouble();
                if (side1 > 0) {
                    validValue = true;
                } else {
                    System.out.println("You have entered an invalid value.");
                }
            } else {
                System.out.println("You have entered an invalid value. Please try again.");
            }
            scan.nextLine();
        } while (!validValue);

        validValue = false;
        do {
            System.out.println("Enter a length for side 2:");
            if (scan.hasNextDouble()) {
                side2 = scan.nextDouble();
                if (side2 > 0) {
                    validValue = true;
                } else {
                    System.out.println("You have entered an invalid value.");
                }
            } else {
                System.out.println("You have entered an invalid value. Please try again.");
            }
            scan.nextLine();
        } while (!validValue);

        area = side1 * side2;
        perimeter = (side1 * 2) + (side2 * 2);
        diagonal = Math.sqrt((Math.pow(side1,2) + Math.pow(side2,2)));

        System.out.printf("%-15s %10.2f", "Side 1:", side1);
        System.out.printf("\n%-15s %10.2f", "Side 2:", side1);
        System.out.printf("\n%-15s %10.2f", "Area:", area);
        System.out.printf("\n%-15s %10.2f", "Perimeter:", perimeter);
        System.out.printf("\n%-15s %10.2f", "Diagonal:", diagonal);
    }
}