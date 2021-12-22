package com.ishita;

public class OrderOrientedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {98, 76, 65, 43, 21, 8, 5, 2};
        int target = 65;
        orderOrientedBinarySearch(arr, target, 0, arr.length - 1);
    }

    private static int orderOrientedBinarySearch(int[] arr, int target, int start, int end) {
        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
