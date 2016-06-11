package algorithms.easy;

import java.util.Stack;

class MyStack {

	/** initialize your data structure here. */
	Stack<Integer> stack = new Stack<>();
	int minValue;

	public MyStack() {
		minValue = Integer.MAX_VALUE;
	}

	public void push(int x) {
		if (x < minValue) {
			minValue = x;
		}
		stack.push(x);
	}

	public void pop() {
		stack.pop();
		int newMin = Integer.MAX_VALUE;
		for (int i = 0; i < stack.size(); i++) {
			int element = stack.get(i);
			if (element < newMin) {
				newMin = stack.get(i);
			}
		}
		minValue = newMin;
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return minValue;
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