class Solution {
    public String gcdOfStrings(String str1, String str2) {

        if (!(str1+str2).equals(str2+str1)) {
            return "";
        }
        if (str1.length() < str2.length()) {
            return gcdOfStrings(str2,str1);
        }

        int gcdLength = gcd(str1.length(),str2.length());

        String returnString = str1.substring(0,gcdLength);


        return returnString;
    }
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }
}