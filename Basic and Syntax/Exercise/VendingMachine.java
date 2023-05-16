package Exercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double totalSum = 0;
        while (!input.equals("Start")) {
            double coin = Double.parseDouble(input);
            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2) {
                totalSum += coin;
            } else {
                System.out.printf("Cannot accept %.2f\n", coin);
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        boolean isInvalid = false;
        while (!input.equals("End")) {

            double currentPrice = 0;
            if (input.equals("Nuts")) {
                currentPrice = 2;
            } else if (input.equals("Water")) {
                currentPrice = 0.7;
            } else if (input.equals("Crisps")) {
                currentPrice = 1.5;
            } else if (input.equals("Soda")) {
                currentPrice = 0.8;
            } else if (input.equals("Coke")) {
                currentPrice = 1.0;
            } else {
                System.out.println("Invalid product");
                isInvalid = true;

            }
            if (!isInvalid) {
                if (totalSum >= currentPrice) {
                    totalSum -= currentPrice;
                    System.out.printf("Purchased %s\n", input);
                } else {

                    System.out.println("Sorry, not enough money");
                }
            }

            input = scanner.nextLine();
        }
        if (totalSum < 0) {
            totalSum = 0;
            System.out.println("Change: 0.00");
        } else {
            System.out.printf("Change: %.2f", totalSum);
        }


    }
}
