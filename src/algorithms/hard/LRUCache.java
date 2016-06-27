package algorithms.hard;

import java.util.HashMap;

/**
 * @author Sandeep
 *
 *         Design and implement a data structure for Least Recently Used (LRU)
 *         cache. It should support the following operations: get and set.
 * 
 *         get(key) - Get the value (will always be positive) of the key if the
 *         key exists in the cache, otherwise return -1. set(key, value) - Set
 *         or insert the value if the key is not already present. When the cache
 *         reached its capacity, it should invalidate the least recently used
 *         item before inserting a new item.
 */
public class LRUCache {
	int capacity;
	HashMap<Integer, Node> mapper = new HashMap<>();
	Node head = null;
	Node end = null;

	public LRUCache(int capacity) {
		this.capacity = capacity;
	}

	public int get(int key) {
		if (mapper.containsKey(key)) {
			Node n = mapper.get(key);
			remove(n);
			setHead(n);
			return n.value;
		}
		return -1;
	}

	public void set(int key, int value) {
		if (mapper.containsKey(key)) {
			Node old = mapper.get(key);
			old.value = value;
			remove(old);
			setHead(old);
		} else {
			Node created = new Node(key, value);
			if (mapper.size() >= capacity) {
				mapper.remove(end.key);
				remove(end);
				setHead(created);
			} else {
				setHead(created);
			}
			mapper.put(key, created);
		}
	}

	public void remove(Node n) {
		if (n.pre != null) {
			n.pre.next = n.next;
		} else {
			head = n.next;
		}
		if (n.next != null) {
			n.next.pre = n.pre;
		} else {
			end = n.pre;
		}
	}

	public void setHead(Node n) {
		n.next = head;
		n.pre = null;
		if (head != null) {
			head.pre = n;
		}
		head = n;
		if (end == null) {
			end = head;
		}
	}
}

class Node {
	int key;
	int value;
	Node pre;
	Node next;

	public Node(int key, int value) {
		this.key = key;
		this.value = value;

	}
}