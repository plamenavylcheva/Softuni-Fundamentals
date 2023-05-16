package Lab;

import java.util.Scanner;

public class MultiplicationTableTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=multiplier ; i++) {
            System.out.printf("%d X %d = %d\n", number, i, i*number);
        }
    }
}
