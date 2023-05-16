package Exercise;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int divisibleNum = 0;
        if (number % 10 == 0) {
            divisibleNum = 10;
        } else if (number % 7 == 0) {
            divisibleNum = 7;
        } else if (number % 6 == 0) {
            divisibleNum = 6;
        } else if (number % 3 == 0) {
            divisibleNum = 3;
        } else if (number % 2 == 0) {
            divisibleNum = 2;
        } else {
            System.out.println("Not divisible");
        }
        if (divisibleNum != 0) {
            System.out.printf("The number is divisible by %d", divisibleNum);
        }
    }
}
