class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        int count = 0;
        StringBuilder curr = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                count = count * 10 + (ch - '0');
            }
            else if (ch == '[') {
                countStack.push(count);
                stringStack.push(curr);
                curr = new StringBuilder();   
                count = 0;
            } else if (ch == ']') {
                int repeat = countStack.pop();
                StringBuilder previous = stringStack.pop();

                while (repeat > 0) {
                    previous.append(curr);
                    repeat--;
                }

                curr = previous;
            } else {
                curr.append(ch);
            }
        }
        return curr.toString();
    }
}
