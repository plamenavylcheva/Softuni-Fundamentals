package Exercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        double lightsabersCostOne = Double.parseDouble(scanner.nextLine());
        double ropeOne = Double.parseDouble(scanner.nextLine());
        double beltOne = Double.parseDouble(scanner.nextLine());
        double lightsabersPrice = Math.ceil(numberOfStudents * 1.1) * lightsabersCostOne;
        double ropePrice = numberOfStudents * ropeOne;
        int freeBeltCount=0;
       if (numberOfStudents>=6) {
         freeBeltCount = numberOfStudents/6;
       }
        double beltPrice = (numberOfStudents-freeBeltCount) * beltOne;
        double total = lightsabersPrice + ropePrice + beltPrice;
        if (total <= amountOfMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", total);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", total-amountOfMoney);
        }
    }
}
