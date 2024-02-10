//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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

    // Define the main method
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
