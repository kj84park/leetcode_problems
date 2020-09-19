package easy;

import java.util.Stack;

public class P0020_ValidParentheses {
    public static void main(String[] args) throws Exception {
        System.out.println(isValid("["));
    }

    public static boolean isValid(String s) {
        s = s.replace(" ","");
        Stack<Character> stack = new Stack<>();

        for (int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' ||s.charAt(i) == '{' ) {
                stack.push(s.charAt(i));
            } else if(s.charAt(i) == ')' && !stack.empty()){
                if(stack.pop() != '('){
                    return false;
                }

            } else if(s.charAt(i) == ']'&& !stack.empty()){
                if(stack.pop() != '['){
                    return false;
                }
            } else if(s.charAt(i) == '}'&& !stack.empty()){
                if(stack.pop() != '{'){
                    return false;
                }
            }
             else {
                 return false;
            }
        }
        return stack.isEmpty();
    }
}
