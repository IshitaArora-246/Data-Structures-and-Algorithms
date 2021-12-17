package com.ishita;

//? Find no. of numbers that has even no. of digits
//? input = [234, 4567, 67, 0]
//? output = 2
//? explanation = 4567 and 67 have 4 and 2 digits respectively.

public class EvenDigitsNum {
    public static void main(String[] args) {
        int[] arr={2345, 67, 89, 90, 70, 124};
        int ans=evenDigitsInNum(arr);
        System.out.println(ans);
    }

//! Much faster than log10 method
    public int findNumbers(int[] nums) {
        int i , count = 0 ;
        for( i = 0 ; i < nums.length ; i++ )
        {
            if( nums[i] > 9 && nums[i] < 100 || nums[i] > 999 && nums[i] < 10000 || nums[i] > 99999 && nums[i] < 1000000 )
            {
                count++ ;
            }
        }
        return count ;
    }

    static int evenDigitsInNum(int[] arr){
        int count =0;
        for (int element:arr) {
            if(even(digits2(element))){
                count++;
            }
        }
        return count;
    }

    private static boolean even(int digits) {
        return digits%2==0;
    }

    //! Optimised solution for counting number of digits in any number
    static int digits2(int num){
        if(num<0){
            num=num*-1;
        }
        return (int)(Math.log10(num))+1;
    }

    static int digits(int num) {
        int digitCount=0;
        if(num<0){
            num=num*-1;
        }
        //Edge Case
        if(num==0){
            return 1;
        }
        while(num>0){
            digitCount++;
            num=num/10;
        }

        return digitCount;
    }
}
