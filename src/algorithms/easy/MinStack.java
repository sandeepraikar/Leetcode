package algorithms.easy;

import java.util.Stack;

class MyStack {

	/** initialize your data structure here. */
	Stack<Integer> stack; 
	Stack<Integer> stack2; 

	public MyStack() {
		stack= new Stack<>();
		stack2= new Stack<>();
	}

	public void push(int x) {
		if(x<getMin()){
			stack2.push(x);
			stack.push(x);
		}else{
			stack.push(x);
		}
	}

	public void pop() {
		if(stack.peek()==stack2.peek()){
			stack.pop();
			stack2.pop();
		}else{
			stack.pop();
		}
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		if(stack2.isEmpty()){
			return Integer.MAX_VALUE;
		}
		return stack2.peek();
	}
}

public class MinStack {
	public static void main(String args[]) {
		MyStack minStack = new MyStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		System.out.println(minStack.getMin());   //--> Returns -3.
		minStack.pop();
		System.out.println(minStack.top());      //--> Returns 0.
		System.out.println(minStack.getMin());   //--> Returns -2.

	}
}