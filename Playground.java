package com.ishita;

import java.util.Arrays;
import java.util.Scanner;

public class Playground {
    public static void main(String[] args) {
       int[] arr={-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(arr));
    }

    static int largestAltitude(int[] gain) {
//        int[] arr = new int[gain.length+1];
        int sum = 0;

        int max = gain[0];


        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
            max=Math.max(sum, max);
        }

        return max<0?0:max;
    }
}
