package testpingjava;

import java.util.Scanner;

public class LabWhileLoop5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double deposit = 0.0;

        while(!input.equals("NoMoreMoney")){
            double debit = Double.parseDouble(input);
            if(debit<0){
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f%n", debit);
            deposit += debit;
            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", deposit);
    }
}
