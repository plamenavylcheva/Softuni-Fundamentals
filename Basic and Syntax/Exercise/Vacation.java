package Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        String typePeople = scanner.nextLine();
        String weekDay = scanner.nextLine();
        double price = 0;
        switch (typePeople) {
            case "Students":
                price = getStudentsPrice(numberOfPeople, typePeople, weekDay);
                break;
            case "Business":
                price = getBusinessPrice(numberOfPeople, typePeople, weekDay);
                break;
            case "Regular":
                price = getRegularPrice(numberOfPeople, typePeople, weekDay);
                break;
            default:
                break;
        }
        System.out.printf("Total price: %.2f", price);
    }

    public static double getStudentsPrice
            (int numberOfPeople, String typePeople, String weekDay) {
        double price = 0;
        switch (weekDay) {
            case "Friday":
                price = numberOfPeople * 8.45;
                break;
            case "Saturday":
                price = numberOfPeople * 9.8;
                break;
            case "Sunday":
                price = numberOfPeople * 10.46;
                break;
            default:
                break;

        }
        if (numberOfPeople >= 30) {
            price = 0.85 * price;
        }
        return price;
    }

    public static double getBusinessPrice
            (int numberOfPeople, String typePeople, String weekDay) {
        double price = 0;
        if (numberOfPeople >= 100) {
            numberOfPeople = numberOfPeople - 10;
        }
        switch (weekDay) {
            case "Friday":
                price = numberOfPeople * 10.9;
                break;
            case "Saturday":
                price = numberOfPeople * 15.6;
                break;
            case "Sunday":
                price = numberOfPeople * 16;
                break;
            default:
                break;

        }
        return price;
    }

    public static double getRegularPrice
            (int numberOfPeople, String typePeople, String weekDay) {
        double price = 0;
        switch (weekDay) {
            case "Friday":
                price = numberOfPeople * 15;
                break;
            case "Saturday":
                price = numberOfPeople * 20;
                break;
            case "Sunday":
                price = numberOfPeople * 22.5;
                break;
            default:
                break;

        }
        if (numberOfPeople >= 10 && numberOfPeople <= 20) {
            price = 0.95 * price;
        }
        return price;
    }

}

