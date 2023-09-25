class Solution {
    public int compress(char[] chars) {
        StringBuilder output = new StringBuilder();
        // String output = "";
        char currentChar = chars[0];
        int charCounter = 0;
        if (chars.length == 1) {
            return 1;
        }
        for (char character: chars) {
            if (character == currentChar) {
                charCounter++;
            } else {
                output.append(currentChar);
                if (charCounter != 1) {
                    output.append(charCounter);
                }
                currentChar = character;
                charCounter = 1;

            }

        }
        output.append(currentChar);
        if (charCounter != 1) {
            output.append(charCounter);
        }
        System.out.println(chars);
        for (int i=0;i<output.length();i++) {
            chars[i] = output.charAt(i);
        }
        // chars = output.toCharArray();
        System.out.println(chars);
        return output.length();
    }
}