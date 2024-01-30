//The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
//
//P   A   H   N
//A P L S I I G
//Y   I   R
//And then read line by line: "PAHNAPLSIIGYIR"
//
//Write the code that will take a string and make this conversion given a number of rows:
//
//string convert(string s, int numRows);
//
//
//Example 1:
//
//Input: s = "PAYPALISHIRING", numRows = 3
//Output: "PAHNAPLSIIGYIR"
//Example 2:
//
//Input: s = "PAYPALISHIRING", numRows = 4
//Output: "PINALSIGYAHRPI"
//Explanation:
//P     I    N
//A   L S  I G
//Y A   H R
//P     I
//Answer:

public class zigzag {
    public static void main(String[] args) {
        // Example usage
        String input = "PAYPALISHIRING";
        int numRows = 3;
        zigzag zigzag = new zigzag();
        String result = zigzag.convert(input, numRows);
        System.out.println(result);
    }

    public String convert(String s, int numRows) {
        int col = 0;
        int l = s.length();

        while (l > 0) {
            l -= numRows;
            col++;
            for (int i = 0; i < numRows - 2; i++) {
                if (l > 0) {
                    l--;
                    col++;
                }
            }
        }

        Character m[][] = new Character[numRows][col];
        l = s.length();
        int c = 0;
        int p = 0;

        while (l > 0) {
            for (int i = 0; i < numRows; i++) {
                if (l > 0) {
                    l--;
                    m[i][c] = s.charAt(p++);
                }
            }

            c++;

            for (int i = numRows - 2; i > 0; i--) {
                if (l > 0) {
                    l--;
                    m[i][c++] = s.charAt(p++);
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < col; j++) {
                if (m[i][j] != null) {
                    result.append(m[i][j]);
                }
            }
        }

        return result.toString();
    }
}
