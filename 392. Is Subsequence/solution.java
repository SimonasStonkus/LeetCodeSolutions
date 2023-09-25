class Solution {
    public boolean isSubsequence(String s, String t) {
        // if (s.length() > t.length()) {
        //     return false;
        // }

        if (s.length() == 0) {
            return true;
        }
        int charCounter = 0;
        char currentChar = s.charAt(charCounter);
        for (int i=0;i<t.length();i++) {

            if (t.charAt(i) == currentChar ) {
                charCounter++;
                if (charCounter < s.length()) {
                    currentChar = s.charAt(charCounter);
                }
            }
        }
        if (charCounter != s.length()) {
            return false;

        }
        return true;
    }
}