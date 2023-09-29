class Solution {
    public int maxVowels(String s, int k) {
        int left = 0;
        int right = k-1;
        int currentVowels = 0;
        int max = 0;
        for (int i=0;i<right+1;i++) {
            if (isVowel(s.charAt(i))) {
                currentVowels++;
            }
        }
        max = currentVowels;


        while (right+1<s.length()) {

            if (isVowel(s.charAt(left))) {
                currentVowels--;
            }
            if (isVowel(s.charAt(right+1))) {
                currentVowels++;
            }
            max = Math.max(max,currentVowels);
            left++;
            right++;
        }

        return max;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}