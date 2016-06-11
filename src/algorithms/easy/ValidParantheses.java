package algorithms.easy;

import java.util.Stack;

/*
 * 
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * */

/**
 * @author Sandeep
 *
 */
public class ValidParantheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("()"));
	}

	public static boolean isValid(String s) {
		boolean result = true;
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<s.length();i++){
			char curr =s.charAt(i);
			System.out.println(curr);
			if(curr=='[' || curr=='('||curr=='{'){
				stack.push(curr);
			}else{
				if(!stack.isEmpty()){
					if(stack.peek()=='(' && curr==')' 
							|| stack.peek()=='{' && curr=='}'
							|| stack.peek()=='[' && curr==']'){
						stack.pop();
					}else{
						result = false;
						break;
					}
				}else{
					result = false;
					break;
				}
			}
		}
		if(!stack.isEmpty()){
			result=false;
		}
		return result;
	}

}
