package Exercise;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age=Integer.parseInt(scanner.nextLine());
        System.out.println(getAgeClass(age));
    }
    public static String getAgeClass(int age){
        String ageClass="";
        if (age>=0 && age<=2){
            ageClass="baby";
        } else if (age<=13){
            ageClass="child";
        } else if (age<=19) {
            ageClass="teenager";
        }else if (age<=65){
            ageClass="adult";
        }else if (age>=66){
            ageClass="elder";
        }
        return ageClass;
    }
}
