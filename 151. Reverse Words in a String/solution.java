class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        System.out.println(s);
        Stack<String> reverseOrder = new Stack<String>();
        int wordStart = 0;

        for (int i=0;i<s.length();i++){
            if (s.substring(i,i+1).contains(" ") && !s.substring(i+1,i+2).contains(" ")) {
                reverseOrder.push(s.substring(wordStart,i).trim());
                wordStart = i+1;
            }
        }
        reverseOrder.push(s.substring(wordStart,s.length()));
        System.out.println(reverseOrder);
        StringBuilder returnString = new StringBuilder();
        while (!reverseOrder.empty()) {
            returnString.append(" ");
            returnString.append(reverseOrder.pop());
        }
        return returnString.toString().trim();
    }
}