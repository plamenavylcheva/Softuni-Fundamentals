package Exercise;

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int column = 1; column <=number ; column++) {
            for (int row = 1; row <=column ; row++) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
