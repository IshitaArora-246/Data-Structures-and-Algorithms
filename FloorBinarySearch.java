package com.ishita;

public class FloorBinarySearch {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,12,14,16,19};
        int target=15;
        int resultantIndex = floorSearch(arr, target);
        System.out.println(resultantIndex);
    }

    public static int floorSearch(int[] arr, int target){
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
        return end;
    }
}
