package com.example.leetcodeanswers.ArraysAnswers;

public class Container {
    public static void main(String[] args) {

        /*
        #11. Container With Most Water MEDIUM
        You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
        Find two lines that together with the x-axis form a container, such that the container contains the most water.
        Return the maximum amount of water a container can store.


        Notice that you may not slant the container.
        Input: height = [1,8,6,2,5,4,8,3,7]
        Output: 49
        Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
        In this case, the max area of water (blue section) the container can contain is 49.
        Solution 👇👇👇👇
        */


        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            int area = h * w;
            max = Math.max(max, area);
            if (height[left] < height[right]) left++;
            else if (height[left] > height[right]) right--;
            else {
                left++;
                right--;
            }
        }
        System.out.println(max);
    }
}