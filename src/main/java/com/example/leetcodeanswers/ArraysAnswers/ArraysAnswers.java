package com.example.leetcodeanswers.ArraysAnswers;

import java.util.Arrays;

import java.util.Arrays;

public class ArraysAnswers {


    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '*';
            }
        }
        // i - array, j - element
        //System.out.println(Arrays.deepToString(board));
        char[][] board1 = new char[3][3];
        board1[0][0] = '0';
        board1[0][1] = '1';
        board1[0][2] = '1';
        board1[1][0] = '1';
        board1[1][1] = '0';
        board1[1][2] = '1';
        board1[2][0] = '1';
        board1[2][1] = '1';
        board1[2][2] = '0';

        //System.out.println(Arrays.deepToString(board1));

        String[][] board2 = {{"ismoil", "islom"}, {"doston", "sherzod"}, {"shaxbos", "bekzod"}};
        //System.out.println(Arrays.deepToString(board2));

        char[][] board3 = new char[][]{
                new char[]{'0', '1', '1'},
                new char[]{'1', '0', '1'},
                new char[]{'1', '1', '0'}
        };
        for (int i = 0; i < 3; i++) {
            // System.out.println();
            for (int j = 0; j < 3; j++) {
                // System.out.print(board3[i][j]);
            }
        }
        //  System.out.println(board3[0][0]);


        //LEET-CODE exercises about Arrays and 2D Arrays

        /*#1 leet-code exercise --> Two Sum --> easy
        Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
        You may assume that each input would have exactly one solution, and you may not use the same element twice.
        You can return the answer in any order.

        Example 1:

        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

        Solution 👇👇👇👇
        */

        int[] numbs = {4, 4, 2, 6};
        int[] answer = new int[2];
        int target = 6;

        for (int i = 0; i < numbs.length - 1; i++) {
            for (int j = 0; j < numbs.length; j++) {
                if (numbs[i] + numbs[j] == target && i != j) {
                    answer[0] = i;
                    answer[1] = j;
                    System.out.println(Arrays.toString(answer));

                }
            }
        }

/* #11. Container With Most Water
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.


Notice that you may not slant the container.
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
In this case, the max area of water (blue section) the container can contain is 49.
Solution 👇👇👇👇*/


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


        int[] nums = {-1, 0, 1, 2, -1, -4};
        int n = nums.length;
        int count = 0;
        int minSolutions = n * (n - 1) * (n - 2) / 6; // Calculate the maximum number of solutions
        int[][] answer1 = new int[minSolutions][3]; // Initialize answer1 with the maximum number of solutions

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { // Start j from i+1 to avoid duplicates
                for (int k = j + 1; k < n; k++) { // Start k from j+1 to avoid duplicates
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        answer1[count][0] = nums[i];
                        answer1[count][1] = nums[j];
                        answer1[count][2] = nums[k];
                        count++;
                    }
                }
            }
            break;
        }
        System.out.println(Arrays.deepToString(answer1));

//new chnages 12 and someyhaodiajdsajdadj
    }
}

