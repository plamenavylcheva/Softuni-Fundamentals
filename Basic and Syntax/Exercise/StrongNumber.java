package Exercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int firstNum = number;
        int totalSum = 0;
        while (number > 0) {
            int currentDigit = number % 10;
            int sum = 1;
            for (int i = 1; i <= currentDigit; i++) {
                sum *= i;
            }
            totalSum += sum;
            number = number / 10;
        }
        if (totalSum == firstNum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
