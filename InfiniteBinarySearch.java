package com.ishita;

public class InfiniteBinarySearch {
    public static void main(String[] args) {
        int[] arr={2,3,4,6,8,9,14,17,18,28,40,59,67,78,92,94,96,99};
        int target=67;
        System.out.println(findStartAndEnd(arr,99));
    }

    static int findStartAndEnd(int[] arr, int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int newStart=end+1;
            int newEnd=end + (( end - start +1) * 2);
            start=newStart;
            end=newEnd;
        }


        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
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
