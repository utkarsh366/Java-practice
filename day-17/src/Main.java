//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Test input array
        int[] nums = {1, 3, 5, 6};
        // Test target
        int target = 5;

        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Call the searchInsert method
        int result = solution.searchInsert(nums, target);

        // Print the result
        System.out.println("The target should be inserted at index: " + result);
    }
}

class Solution {
    public static int searchInsert(int[] nums, int target) {
        int ans = 0;
        for(int i = 0 ; i < nums.length; i++){
            if(target <= nums[i]){
                ans = i;
                break;
            }
            if(target > nums[nums.length -1]){
                ans = nums.length;
            }
        }
        return ans;
    }
}
