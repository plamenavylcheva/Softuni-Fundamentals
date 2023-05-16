package Lab;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int totalMinutes = hours*60+minutes +30;
        int newMinutes = totalMinutes%60;
        int newHours = totalMinutes/60;
        if (newHours>23){
            newHours=0;
        }
        if (newMinutes>59){
            newMinutes=0;
            newHours+=1;
        }
        System.out.println(String.format("%d:%02d", newHours, newMinutes));

    }
}
