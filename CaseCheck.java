package com.ishita;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);

        if(ch>='a' && ch <='z'){
            System.out.println("Lowercase Character");

        }
        else{
            System.out.println("Uppercase Character");
        }
    }
}
