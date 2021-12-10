package com.ishita;

import java.util.Scanner;

public class Primitives {
    public static void main(String[] args) {
        //? Primitive Datatype
        int roll_no = 15;               //4 bytes
        float percentage=87.2f;         //4 bytes
        char letter = 'i';              //2 bytes
        double largeDecimalNumber=567586.97857;     //8 bytes
        long largeIntegerNumber=56758697857L;       //8 bytes
        boolean check=true;                         //2 bytes

        //?Inputs
        Scanner input = new Scanner(System.in);
//        float numf= input.nextFloat();
//        int numi= input.nextInt();

        //? For automatic type conversion following conditions should meet
        //? 1. source type should be smaller than destination type
        //? 2. Both types should be compatible with each other(string can't be type cast into float)
        //? For Manual type casting, just add the type on brackets'
//        int num = (int)(56.78f);
//        System.out.println(num);

        //? Automatic type promotion
        byte num= (byte)(-130);
        System.out.println(num);
    }
}
