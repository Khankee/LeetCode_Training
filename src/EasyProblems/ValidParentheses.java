package EasyProblems;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("(()){}"));
    }

    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            if(a == '(' || a == '[' || a == '{') stack.push(a);
            else if(stack.isEmpty()) return false;
            else if(a == ')' && stack.pop() != '(') { return false;}
            else if(a == '}' && stack.pop() != '{') return false;
            else if(a == ']' && stack.pop() != '[') return false;
        }
        return stack.empty();
    }
}
