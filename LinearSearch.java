package com.ishita;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={23, 45, 27, 49, 57, 83, 95, 84};
        boolean ans=linearSearchUsingForEach(arr, 98);
        System.out.println(ans);
    }

    //For Each loop is used when we don't have to use "INDEX"(iterator) anywhere in the loop
    static boolean linearSearchUsingForEach(int[] array, int target){
        if(array.length==0)
            return false;
        for (int element:array) {
            if(element==target)
                return true;

        }
        return false;

    }

    static int linearSearch(int[] array, int target){
        //Edge Case
        if(array.length==0){
            return -1;
        }

        for(int index=0;index<array.length;index++){
            if(array[index]==target)
                return index;
        }

        //if target not found in array, loop will end and -1 will be returned
        return -1;
    }
}
