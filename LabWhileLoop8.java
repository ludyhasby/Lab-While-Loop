package testpingjava;

import java.util.Scanner;

public class LabWhileLoop8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double sum = 0.0;
        int unlulus_grade = Integer.MAX_VALUE;
        int unlulus = 0;

        for(int i = 1; i<=12; i++){
            double angrade = Double.parseDouble(scanner.nextLine());
            if(angrade>=4.00){
                sum += angrade;
            } else{
                unlulus += 1;
                if(i<unlulus_grade){
                    unlulus_grade = i;
                }
                if(unlulus>1){
                    break;
                }
            }
        }
        if(unlulus>1){
            System.out.printf("%s has been excluded at %d grade", name, unlulus_grade);
        } else{
            System.out.printf("%s graduated. Average grade: %.2f", name, sum/12);
        }
    }
}
