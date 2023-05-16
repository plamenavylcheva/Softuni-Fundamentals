package MoreExercise;

import java.util.Scanner;

public class EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int lastDigit = number%10;
        System.out.println(getName(number, lastDigit));
    }
    public static String getName(int number, int lastDigit){
        if (lastDigit==1){
            return "one";
        } else if (lastDigit==2){
            return "two";
        }else if (lastDigit==3){
            return "three";

        }else if (lastDigit==4){
            return "four";
        } else if (lastDigit==5){
            return "five";
        } else if (lastDigit==6){
            return  "six";
        }else if (lastDigit==7){
            return "seven";
        }else if (lastDigit==8){
            return "eight";
        }else if (lastDigit==9){
            return "nine";
        }else {
            return "zero";
        }
    }
}
