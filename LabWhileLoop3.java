package testpingjava;

import java.util.Scanner;

public class LabWhileLoop3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n1 = Integer.parseInt(scan.nextLine());
        int sum = 0;

        while(sum<n1){
            sum += Integer.parseInt(scan.nextLine());
        }
        System.out.println(sum);
    }
}
