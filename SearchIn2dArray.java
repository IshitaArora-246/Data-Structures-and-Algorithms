package com.ishita;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr={
                {2,6,8,9},
                {23, 28},
                {15, 19, 12, 11, 17},
                {40, 43, 46}
        };

        int target=99;
        System.out.println(searchIn2d(arr, target));

    }

    static boolean searchIn2d(int[][] arr, int target) {
        for (int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return true;
                }
            }
        }
        return false;
    }
}
