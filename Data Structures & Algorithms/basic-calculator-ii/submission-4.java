class Solution {
    public int calculate(String s) {
        char[] arr = s.toCharArray();
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        char sign = '+';
        for(int i = 0 ; i < arr.length ; i++){
            char ch = arr[i];
            if(Character.isDigit(ch)){
                result = result * 10 + (ch - '0');
            }

             if(!Character.isDigit(ch) && ch != ' '){

                if (sign == '+') {
    stack.push(result);
} else if (sign == '-') {
    stack.push(-result);
} else if (sign == '*') {
    stack.push(stack.pop() * result);
} else if (sign == '/') {
    stack.push(stack.pop() / result);
}
                 result = 0;
             sign =ch;
            }
            
        }
         int ans = 0;
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }

        return ans;
    }
}
