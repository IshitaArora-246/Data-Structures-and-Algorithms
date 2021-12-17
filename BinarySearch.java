package com.ishita;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 15, 19, 27, 47, 63, 74, 95};
        int target = 49;
        System.out.println("Your target " + target +" is present at index "+binarySearch(arr, target));

    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
