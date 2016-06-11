package algorithms.easy;

import java.util.Stack;

public class ImplementQueueUsingStacks_v2 {

	public static void main(String[] args) {
		MyQueue1 q = new MyQueue1();
		q.push(10);
		q.push(20);
		q.push(30);
		System.out.println(q.pop());
		//q.push(10);
		System.out.println(q.peek());
		//q.push(10);
		System.out.println(q.empty());
	}

}

class MyQueue1 {

	Stack<Integer> stack1 = new Stack<>();
	Stack<Integer> stack2 = new Stack<>();

	// Push element x to the back of queue.
	public void push(int x) {
		if(stack1.isEmpty()){
			while(!stack2.isEmpty()){
				stack1.push(stack2.pop());
			}
		}
		stack1.push(x);
			
	}

	// Removes the element from in front of queue.
	public int pop() {
		if(stack2.isEmpty()){
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}

	// Get the front element.
	public int peek() {
		if(stack2.isEmpty()){
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
		}
		return stack2.peek();
	}

	// Return whether the queue is empty.
	public boolean empty() {
		return stack2.isEmpty() && stack1.isEmpty();
	}
}
