package com.ishita;

public class SearchInRange {
        public static void main(String[] args) {
            int[] arr={23, 45, 27, 49, 57, 83, 95, 84};
            int ans=linearSearchInRange(arr,2,6, 230);
            System.out.println(ans);
        }



        static int linearSearchInRange(int[] array,int start, int end, int target){
            //Edge Case
            if(array.length==0){
                return -1;
            }

            for(int index=start;index<end;index++){
                if(array[index]==target)
                    return index;
            }

            //if target not found in array, loop will end and -1 will be returned
            return -1;
        }
    }

