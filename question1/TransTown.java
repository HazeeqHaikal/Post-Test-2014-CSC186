import java.util.Scanner;

public class TransTown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int status;
        System.out.print("1. Standard\n2. Concession\n3. School Student\n\nEnter your status (1-3): ");
        status = input.nextInt();

        int zoneNumber;
        System.out.print("Enter your zone number (1-2): ");
        zoneNumber = input.nextInt();

        int paymentMethod;
        System.out.print("1. Cash\n2. Smart Rider\n\nEnter your payment method (1-2): ");
        paymentMethod = input.nextInt();

        double fare = calculateFare(status, zoneNumber, paymentMethod);
        System.out.println("Your fare is RM" + fare);

        input.close();
    }

    static double calculateFare(int status, int zoneNumber, int paymentMethod) {
        double discount = 0;

        if (paymentMethod == 2) {
            discount = 0.15;
        }

        double price = 0;

        if (status == 1) {
            if (zoneNumber == 1) {
                price = 2.50;
            } else if (zoneNumber == 2) {
                price = 3.7;
            }
        } else if (status == 2) {
            if (zoneNumber == 1) {
                price = 1.00;
            } else if (zoneNumber == 2) {
                price = 1.50;
            }
        } else if (status == 3) {
            if (paymentMethod == 2) {
                price = 0.50;
            } else {
                if (zoneNumber == 1) {
                    price = 2.50;
                } else if (zoneNumber == 2) {
                    price = 3.70;
                }

            }
        }

        double finalPrice = price - (price * discount);

        return finalPrice;
    }
}
