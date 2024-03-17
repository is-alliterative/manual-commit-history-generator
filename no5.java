//longest palindromic substring
//expand around center of s.charAt(i), checking matching charAt(i-1),(i+1)
//time complexity: O(n^2) -- suboptimal
    //for loop iterates over string s, calls eAC twice 
        //(which means s is iterated twice at worst)

class Solution {
    public String longestPalindrome(String s) {

    int startingIndex = 0;
    int longestLength = 0;

        for (int i = 0; i < s.length(); i++) {
            int lengthOdd = expandAroundCenter(s, i, i);
            if (lengthOdd > longestLength) {
                longestLength = lengthOdd;
                startingIndex = i - (lengthOdd - 1) / 2;
            }

            int lengthEven = expandAroundCenter(s, i, i + 1);
            if (lengthEven > longestLength) {
                longestLength = lengthEven;
                startingIndex = i - (lengthEven - 2) / 2;
            }
        }

        return s.substring(startingIndex, startingIndex + longestLength);
    }

    private int expandAroundCenter(String s, int left, int right) {
        
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        
        return right - left - 1;

    }
}
