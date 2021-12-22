package com.ishita;

public class PeakInMountainArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 3, 2, 0};
        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if(start==end){
                //? both pointers will point to largest element
                //?loop breaking condition
                return start;
            }

            if (arr[mid] > arr[mid + 1]) {
                //?This maybe be a possible answer but no proof is there
                //?We are in descending part of array
                end = mid;
            } else {
                //?We are in ascending part of array
                start = mid + 1; //because we know arr[mid+1] > arr[mid]
            }
        }
        return -1;
    }
}
