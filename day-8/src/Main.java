//Container With Most Water


//Companies
//Hint
//You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
//
//Find two lines that together with the x-axis form a container, such that the container contains the most water.
//
//Return the maximum amount of water a container can store.
//
//Notice that you may not slant the container.
//
//
//
//Example 1:
//
//
//Input: height = [1,8,6,2,5,4,8,3,7]
//Output: 49
//Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
//Example 2:
//
//Input: height = [1,1]
//Output: 1
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = solution.maxArea(height);
        System.out.println("Maximum amount of water the container can store: " + result);
    }

    static class Solution {
        public int maxArea(int[] height) {
            if (height == null || height.length < 2) {
                return 0;
            }
            int max = 0;
            int left = 0;
            int right = height.length - 1;
            while (left < right) {
                max = Math.max(max, (right - left) * Math.min(height[left], height[right]));
                if (height[left] < height[right])
                    left++;
                else
                    right--;
            }
            return max;
        }
    }
}
