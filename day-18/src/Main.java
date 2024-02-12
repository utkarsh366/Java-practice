/*46. Permutations
Solved
Medium
Topics
Companies
Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.



Example 1:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
Example 2:

Input: nums = [0,1]
Output: [[0,1],[1,0]]
Example 3:

Input: nums = [1]
Output: [[1]]*/

import java.util.*;

class Solution {
    List<List<Integer>> result;

    public List<List<Integer>> permute(int[] nums) {
        result = new ArrayList<>();
        helper(new ArrayList<>(), nums);
        return result;
    }

    public void helper(List<Integer> curr, int[] nums) {
        if (curr.size() == nums.length) {
            result.add(new ArrayList<>(curr));
            return;
        }

        for (int num: nums) {
            if (!curr.contains(num)) {
                curr.add(num);
                helper(curr, nums);
                curr.remove(curr.size() - 1);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test input array
        int[] nums = {1, 2, 3};

        List<List<Integer>> permutations = solution.permute(nums);

        // Print permutations
        for (List<Integer> permutation : permutations) {
            System.out.println(permutation);
        }
    }
}
