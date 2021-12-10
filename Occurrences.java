package com.ishita;

import java.util.Scanner;

public class Occurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int number = num;
        int count=0;

        while(num>0){
            int unitDigit = num % 10;
            if(unitDigit == 3){
                count++;
            }
            num = num/10;
        }
        System.out.println("Number of occurrences of 3 in " + number + " are : " +count);
    }
}
