package testpingjava;

import java.util.Scanner;

public class LabWhileLoop4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int number = 1;
        while(number <= n){
            System.out.println(number);
            number = 2*number + 1;
        }
    }
}
