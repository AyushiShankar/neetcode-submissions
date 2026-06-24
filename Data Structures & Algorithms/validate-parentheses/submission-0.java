class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int right = 0;
        while (right < s.length()) {
            char ch = s.charAt(right);
            switch (ch) {
                case '{':
                    stack.push(ch);
                    break;
                case '[':
                    stack.push(ch);
                    break;
                case '(':
                    stack.push(ch);
                    break;
                default:
                    if (stack.isEmpty()) return false;
                    if (ch == ']') {
                      char getLast=  stack.pop();
                      if(getLast != '[')
                      return false;
                    }
                    else if (ch == '}') {
                      char getLast=  stack.pop();
                      if(getLast != '{')
                      return false;
                    }
                    else if (ch == ')') {
                      char getLast=  stack.pop();
                      if(getLast != '(')
                      return false;
                    }
            }

            right++;
        }

        return stack.isEmpty();
    }
}
