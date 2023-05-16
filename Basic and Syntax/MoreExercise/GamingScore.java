package MoreExercise;

import java.util.Scanner;

public class GamingScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstSum = Double.parseDouble(scanner.nextLine());
        double balance = firstSum;

        double totalSpend = 0;
        boolean isOut = false;
        while (balance>0) {
           String game = scanner.nextLine();
            double price = 0;
            if (game.equals("OutFall 4")) {
                price = 39.99;
            } else if (game.equals("CS: OG")) {
                price = 15.99;
            } else if (game.equals("Zplinter Zell")) {
                price = 19.99;
            } else if (game.equals("Honored 2")) {
                price = 59.99;
            } else if (game.equals("RoverWatch")) {
                price = 29.99;
            } else if (game.equals("RoverWatch Origins Edition")) {
                price = 39.99;
            } else if (game.equals("Game Time")) {
                break;
            } else {
                System.out.println("Not found");
                continue;
            }
            if (balance < price) {
                System.out.println("Too Expensive");
                continue;
            }
            balance -= price;
            totalSpend += price;


            if (balance >= 0) {
                System.out.printf("Bought %s%n", game);
            }
        }

        if (balance<=0) {
            System.out.println("Out of money!");
        }else{
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpend, balance);
        }
    }
}
