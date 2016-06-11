package algorithms.easy;

import java.util.Stack;

public class ImplementQueueUsingStacks_v1 {

	public static void main(String[] args) {
		MyQueue q = new MyQueue();
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

class MyQueue {

	Stack<Integer> stack = new Stack<>();

	// Push element x to the back of queue.
	public void push(int x) {
		stack.add(x);
	}

	// Removes the element from in front of queue.
	public int pop() {
		int front = stack.firstElement().intValue();
		stack.remove(0);
		return front;
	}

	// Get the front element.
	public int peek() {
		return stack.firstElement().intValue();
	}

	// Return whether the queue is empty.
	public boolean empty() {
		return stack.size() == 0 ? true : false;
	}
}
