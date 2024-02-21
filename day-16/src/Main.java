/*34. Find First and Last Position of Element in Sorted Array
Solved
Medium
Topics
Companies
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]


Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109
*/
//Answer

public class Main {

    // Define the searchRange method outside the main method
    public static int[] searchRange(int[] nums, int target) {
        int index1 = -1;
        int index2 = -1;

        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                index2 = i;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (target == nums[i]) {
                index1 = i;
            }
        }

        int[] arr1 = {index1, index2};
        return arr1;
    }

    //main method
    public static void main(String[] args) {
        // Test input array
        int[] nums = {5, 7, 7, 8, 8, 10};
        // Test target
        int target = 8;

        // Call the searchRange method
        int[] result = searchRange(nums, target);

        // Print the result
        System.out.println("The target range is [" + result[0] + ", " + result[1] + "]");
    }
}
