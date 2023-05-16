package Exercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        int counter = 0;
        boolean isValid = false;
        while (counter != -1) {
            String input = scanner.nextLine();
            String reversed = "";
            for (int i = input.length() - 1; i >= 0; i--) {
                reversed += input.charAt(i);
            }
            if (reversed.equals(password)) {
                isValid=true;
                break;
            } else {
                counter++;
                System.out.println("Incorrect password. Try again.");
            }
            if (counter == 4) {
                System.out.printf("User %s blocked!", password);
                break;
            }
        }
        if (isValid){
            System.out.println(String.format("User %s logged in.", password));
        }
    }
}
