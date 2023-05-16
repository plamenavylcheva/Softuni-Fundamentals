package Exercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //headset -> second lost
        //mouse -> third lost
        //keyboard -> headset and mouse both - > trash
        //display -> every second time trash keyboard -> display
        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        int headCounter = 0;
        int mouseCounter = 0;
        int keyBoardCounter = 0;
        int displayCounter = 0;
        int keyForDisplay = 0;
        for (int i = 1; i <= lostGames; i++) {
            if (i % 2 == 0) {
                headCounter++;
            }
            if (i % 3 == 0) {
                mouseCounter++;
            }
            if (i % 2 == 0 && i % 3 == 0) {
                keyBoardCounter++;
                keyForDisplay++;
            }
            if (keyForDisplay % 2 == 0 && keyForDisplay != 0) {
                displayCounter++;
                keyForDisplay = 0;
            }
        }
        double total = headCounter * headsetPrice + mouseCounter * mousePrice + keyboardPrice * keyBoardCounter + displayCounter * displayPrice;
        System.out.println(String.format("Rage expenses: %.2f lv.", total));

    }
}
