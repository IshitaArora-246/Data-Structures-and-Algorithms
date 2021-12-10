package com.ishita;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of terms : ");
        int n = input.nextInt();
        int a=0, count=1, b=1;

        if(n==1){
            System.out.print(a);
        }
        else if(n==2) {
            System.out.print(b);
        }
        else{
            System.out.print(a + " ");
            System.out.print(b + " ");
            while (count <= n-2) {
                System.out.print(a + b + " ");
                int temp = a+b;
                a = b;
                b = temp;
                count++;
            }
        }

    }
}
