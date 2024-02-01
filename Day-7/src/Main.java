//
//
//
//
//
//
//
//9. Palindrome Number
//Topics
//        Companies
//Hint
//Given an integer x, return true if x is a
//        palindrome
//, and false otherwise.
//
//
//
//        Example 1:
//
//Input: x = 121
//Output: true
//Explanation: 121 reads as 121 from left to right and from right to left.
//        Example 2:
//
//Input: x = -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
//Example 3:
//
//Input: x = 10
//Output: false
//Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Solution {
    public boolean isPalindrome(int x) {
        int y = x;
        int sum = 0;

        if (y < 0) {
            return false;
        }

        while (x > 0) {
            int rem = x % 10;
            sum = sum * 10 + rem;
            x = x / 10;
        }

        return sum == y;
    }
}

public class Main {
    public static void main(String[] args) {
        // Example input: Check if 121 is a palindrome
        int inputNumber = 121;

        Solution solution = new Solution();
        boolean isPalindromeResult = solution.isPalindrome(inputNumber);

        System.out.println("Is " + inputNumber + " a palindrome? " + isPalindromeResult);
    }
}
