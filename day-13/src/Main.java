/*
29. Divide Two Integers
        Solved
Medium
        Topics
Companies
Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.

The integer division should truncate toward zero, which means losing its fractional part. For example, 8.345 would be truncated to 8, and -2.7335 would be truncated to -2.

Return the quotient after dividing dividend by divisor.

Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231, 231 − 1]. For this problem, if the quotient is strictly greater than 231 - 1, then return 231 - 1, and if the quotient is strictly less than -231, then return -231.



Example 1:

Input: dividend = 10, divisor = 3
Output: 3
Explanation: 10/3 = 3.33333.. which is truncated to 3.
Example 2:

Input: dividend = 7, divisor = -3
Output: -2
Explanation: 7/-3 = -2.33333.. which is truncated to -2.


*/




//Answer:
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {5, 3, 2, 1};

        // Value to remove
        int val = 3;

        int result = solution.removeElement(nums, val);
        System.out.println("New length of array after removing " + val + ": " + result);
    }

    static class Solution {
        public int removeElement(int[] nums, int val) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    nums[count] = nums[i];
                    count++;
                }
            }
            return count;
        }
    }
}

