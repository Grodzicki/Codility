package stacksAndQueues;

import java.util.Stack;

/**
 * A string S consisting of N characters is called properly nested if:
 *         S is empty;
 *         S has the form "(U)" where U is a properly nested string;
 *         S has the form "VW" where V and W are properly nested strings.
 * For example, string "(()(())())" is properly nested but string "())" isn't.
 * Write a function:
 *     class Solution { public int solution(String S); }
 * that, given a string S consisting of N characters, returns 1 if string S is properly nested and 0 otherwise.
 * For example, given S = "(()(())())", the function should return 1 and given S = "())", the function should return 0, as explained above.
 */
public class Nesting {

    public int solution(String S){
        if (S.length()%2 != 0)
            return 0;

        Stack<Character> stack = new Stack<>();
        for (int i=0; i<S.length(); i++){
            switch (S.charAt(i)){
                case ')':
                    if(stack.isEmpty() || stack.pop() != '(')
                        return 0;
                    break;
                default:
                    stack.push(S.charAt(i));
            }
        }
        return stack.isEmpty() ? 1:0;
    }
}
