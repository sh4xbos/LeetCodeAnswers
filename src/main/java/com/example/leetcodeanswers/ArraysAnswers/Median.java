package com.example.leetcodeanswers.ArraysAnswers;

import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
         /*
        #4. Median of Two Sorted Arrays HARD
        Given two sorted arrays nums1 and nums2 of size m and n respectively,
        return the median of the two sorted arrays.
        The overall run time complexity should be O(log (m+n)).

        Example 1:
        Input: nums1 = [1,3], nums2 = [2]
        Output: 2.00000
        Explanation: merged array = [1,2,3] and median is 2.
        Solution 👇👇👇👇
        */

        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        int[] arr = new int[nums1.length + nums2.length];
        int k = 0;
        for (int i = 0; i < nums1.length; i++) {
            arr[k++] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            arr[k++] = nums2[i];
        }
        Arrays.sort(arr);
        int mid = arr.length / 2;
        if (arr.length % 2 == 0) {
            double a = (arr[mid - 1] + arr[mid]) / 2;
            System.out.println(a);
        }
        double answer = arr[mid];
        System.out.println(answer);

    }
}
