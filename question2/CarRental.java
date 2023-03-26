import java.util.Scanner;

public class CarRental {

    static void calcPayment(int userID, int carType, int hour) {
        double price = 0;
        if (carType == 1) {
            if (hour > 12) {
                price = 50;
            } else {
                price = 3;
            }
        } else if (carType == 2) {
            if (hour > 12) {
                price = 60;
            } else {
                price = 4;
            }
        } else if (carType == 3) {
            if (hour > 12) {
                price = 70;
            } else {
                price = 5;
            }
        } else if (carType == 4) {
            if (hour > 12) {
                price = 90;
            } else {
                price = 7;
            }
        }
        double total = price * hour;
        System.out.println("Your total payment is RM" + total);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hours;
        int carType;

        System.out.println("Welcome to Car Rental System");
        System.out.print("Please enter your user ID: ");
        int userID = input.nextInt();

        System.out.print("Do you want to rent a car more than 12 hours? (Y/N): ");
        String moreThan12Hours = input.next();
        // lowercase the input
        moreThan12Hours = moreThan12Hours.toLowerCase();

        if (moreThan12Hours.equals("y")) {
            System.out.print(
                    "1. Kancil (RM 50.00/Day)\n2. MyVi (RM 60.00/Day)\n3. Saga (RM 70.00/Day)\n4. Vios (RM 90.00/Day)\n\nEnter your car type (1-4): ");
            carType = input.nextInt();
            System.out.print("Please enter the number of days you want to rent the car: ");
            int days = input.nextInt();
            hours = days * 24;
        } else {
            System.out.print(
                    "1. Kancil (RM 3.00/Hour)\n2. MyVi (RM 4.00/Hour)\n3. Saga (RM 5.00/Hour)\n4. Vios (RM 7.00/Hour)\n\nEnter your car type (1-4): ");
            carType = input.nextInt();
            System.out.print("Please enter the number of hours you want to rent the car: ");
            hours = input.nextInt();

        }

        calcPayment(userID, carType, hours);
        input.close();
    }
}
