//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*49. Group Anagrams
Solved
Medium
Topics
Companies
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.



Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:

Input: strs = [""]
Output: [[""]]
Example 3:

Input: strs = ["a"]
Output: [["a"]]*/


import java.util.*;

 class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagramMap = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            // Sort the characters in the string
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            // Add the sorted string to the map and group anagrams
            if (!anagramMap.containsKey(sortedStr)) {
                anagramMap.put(sortedStr, new ArrayList<>());
            }
            anagramMap.get(sortedStr).add(str);
        }

        return new ArrayList<>(anagramMap.values());
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example input
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};

        // Group anagrams
        List<List<String>> groupedAnagrams = solution.groupAnagrams(input);

        // Display the grouped anagrams
        for (List<String> group : groupedAnagrams) {
            System.out.println(group);
        }
    }
}
