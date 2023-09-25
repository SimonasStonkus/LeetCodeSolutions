class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longestSubString = 0;
        Queue<Character> currentLetters = new LinkedList<>();
        for (int i=0;i<s.length();i++) {
            while (currentLetters.contains(s.charAt(i))) {
                currentLetters.remove();
            }
            currentLetters.add(s.charAt(i));
            if (currentLetters.size() > longestSubString) {
                longestSubString = currentLetters.size();
            }

        }


        return longestSubString;
    }
}