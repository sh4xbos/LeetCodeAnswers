package com.example.leetcodeanswers.ArraysAnswers;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {


        /*
        #1 Two Sum EASY
        Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
        You may assume that each input would have exactly one solution, and you may not use the same element twice.
        You can return the answer in any order.

        Example 1:

        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

        Solution 👇👇👇👇
        */

        int[] numbs = {2, 7, 11, 15};
        int[] answer = new int[2];
        int target = 9;

        for (int i = 0; i < numbs.length - 1; i++) {
            for (int j = 0; j < numbs.length; j++) {
                if (numbs[i] + numbs[j] == target && i != j) {
                    answer[0] = i;
                    answer[1] = j;
                    System.out.println(Arrays.toString(answer));

                }
                break;
            }
        }
    }
}
