class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        long digits = 1;
        long reverse = 0;
        int reverseDigits = 1;
        int xCopy = x;
        long divisor = 0;

        while (digits*10<=x) {
            digits *= 10;
        }
        while (digits >= 1) {
            divisor = x/digits;
            reverse += reverseDigits * divisor;
            x -= divisor*digits;

            digits /= 10;
            reverseDigits *= 10;
        }

        if (reverse != xCopy) {
            return false;
        }
        return true;
    }
}