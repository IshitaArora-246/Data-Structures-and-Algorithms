package com.ishita;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int num=n;
        int reverseNumber=0;
        while(n>0){
            int digit = n % 10;
            reverseNumber = reverseNumber * 10 + digit;
            n = n / 10;
        }
        System.out.println("Reverse number for given input is : " + reverseNumber);
    }
}
