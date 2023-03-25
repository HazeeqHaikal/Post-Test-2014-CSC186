import java.util.Scanner;

public class TransTown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int status;
        System.out.print("1. Standard\n2. Concession\n3. School Student\n\nEnter your status (1-3): ");
        status = input.nextInt();

        int zoneNumber;
        System.out.println("Enter your zone number (1-2): ");
        zoneNumber = input.nextInt();

        int paymentMethod;
        System.out.println("1. Cash\n2. Smart Rider\n\nEnter your payment method (1-2): ");
        paymentMethod = input.nextInt();

        double discount = 0;

        if (paymentMethod == 2) {
            discount = 0.15;
        }

        
    }
}
