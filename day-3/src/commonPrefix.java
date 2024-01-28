import java.util.Arrays;

public class commonPrefix {
        public String longestCommonPrefix(String[] strs) {
            Arrays.sort(strs);
            String s1 = strs[0];
            String s2 = strs[strs.length-1];
            int idx = 0;
            while(idx < s1.length() && idx < s2.length()){
                if(s1.charAt(idx) == s2.charAt(idx)){
                    idx++;
                } else {
                    break;
                }
            }
            return s1.substring(0, idx);
        }
    public static void main(String[] args) {
        commonPrefix solution = new commonPrefix();
        String[] words = {"flower", "flow", "flight"};
        String commonPrefix = solution.longestCommonPrefix(words);
        System.out.println("Longest Common Prefix: " + commonPrefix);
    }

}
