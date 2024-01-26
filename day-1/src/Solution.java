//3. Longest Substring Without Repeating Characters
//        Solved
//Medium
//        Topics
//Companies
//Given a string s, find the length of the longest
//        substring
//without repeating characters.
//
//
//
//        Example 1:
//
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
//Example 2:
//
//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
//Example 3:
//
//Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
//

//Answer:


import java.util.HashMap;

public class Solution{

    public static int Solution(String s) {
        int n = s.length();
        int maxLength = 0;
        int left = 0;
        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);
            if (charIndexMap.containsKey(currentChar)) {
                left = Math.max(left, charIndexMap.get(currentChar) + 1);
            }
            charIndexMap.put(currentChar, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        // Example usage:
        String input = "abcabcbb";
        int result = Solution(input);

        System.out.println("Input String: " + input);
        System.out.println("Length of Longest Substring: " + result);
    }
}
