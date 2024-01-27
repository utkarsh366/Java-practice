
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




// Solution:






class isPalincrome_day2 {
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

    public static void main(String[] args) {
        isPalincrome_day2 solution = new isPalincrome_day2();

        // Example usage
        int number = 121;
        System.out.println(number + " is a palindrome: " + solution.isPalindrome(number));

        int anotherNumber = -121;
        System.out.println(anotherNumber + " is a palindrome: " + solution.isPalindrome(anotherNumber));
    }
}

