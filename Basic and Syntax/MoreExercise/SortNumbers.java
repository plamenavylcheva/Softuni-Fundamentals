package MoreExercise;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        int maxNum=0;
        int minNum=0;
        int avNum=0;

       if (n1>n2 && n1>n3){
           maxNum=n1;
       } else if ( n2>n1 && n2>n3){
           maxNum=n2;
       } else if (n3>n1 && n3>n2){
           maxNum=n3;
       }
        if (n1<n2 && n1<n3){
            minNum=n1;
        } else if ( n2<n1 && n2<n3){
            minNum=n2;
        } else if (n3<n1 && n3<n2){
            minNum=n3;
        }
        if (n1==maxNum  && n2==minNum){
            avNum=n3;
        } else if (n1==maxNum &&n3==minNum){
            avNum=n2;
        } else if (n2==maxNum && n3==minNum){
            avNum=n1;
        } else if (n3==maxNum && n2==minNum){
            avNum=n1;
        } else if (n2==maxNum && n1==minNum){
            avNum=n3;
        } else if (n3==maxNum &&n1==minNum){
            avNum=n2;
        }
        System.out.println(maxNum);
        System.out.println(avNum);
        System.out.println(minNum);
    }


}
