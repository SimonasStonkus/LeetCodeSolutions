class Solution {
    public String reverseVowels(String s) {
        char[] sArray = s.toCharArray();
        int i = 0;
        int j = s.length()-1;
        while (i < j) {
            if (isVowel(sArray[i])) {
                while (!isVowel(sArray[j])) {
                    j--;
                    System.out.println(sArray[j]);
                }
                char temp = sArray[i];
                sArray[i] = sArray[j];
                sArray[j] = temp;
                j--;
            }
            i++;
        }
        return new String(sArray);
    }

    private boolean isVowel(char c) {
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U';
    }
}