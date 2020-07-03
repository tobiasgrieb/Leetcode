// Challange
// https://leetcode.com/problems/running-sum-of-1d-array/

package Algorithms.Easy;

import java.util.Arrays;


public class RunningSumOf1dArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.println("Before: " + Arrays.toString(nums));
        System.out.println("After:  " + Arrays.toString(runningSum(nums)));

    }

    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            result[i] = (sum += nums[i]);
        }
        return result;
    }

}
