package algorithms.medium;

import java.util.HashMap;
import java.util.Map;

class Trie {

	private class TrieNode{
		Map<Character, TrieNode> children;
		boolean endOfWord;
		TrieNode(){
			children = new HashMap<>();
			endOfWord = false;
		}
	}
	
	private final TrieNode root;
	Trie(){
		root = new TrieNode();
	}
	public void insert(String word){
		TrieNode current = root;
		for(char c : word.toCharArray()){
			TrieNode node = current.children.get(c);
			if(node==null){
				node = new TrieNode();
				current.children.put(c, node);
			}
			current = node;
		}
		current.endOfWord=true;
	}
	public void insertRecursive(String word){
		insertRecursive(root, word, 0);
	}
	public void insertRecursive(TrieNode current,String word, int index){
		if(index == word.length()){
			current.endOfWord=true;
			return;
		}
		char ch = word.charAt(index);
		TrieNode node = current.children.get(ch);
		if(node == null){
			node = new TrieNode();
			current.children.put(ch, node);
		}
		insertRecursive(node,word,index+1);
	}
	
	public boolean search(String word){
		TrieNode current = root;
		for(char c: word.toCharArray()){
			TrieNode node = current.children.get(c);
			if(node==null){
				return false;
			}
			current = node;
		}
		return current.endOfWord;
	}
	
	public int find(String word){
		TrieNode current = root;
		int count=1;
		for(char c: word.toCharArray()){
			TrieNode node = current.children.get(c);
			count++;
			if(node==null){
				break;
			}
			
		}
		return count+1;
	}
	
	public boolean searchRecursive(String word){
		return searchRecursive(root, word, 0);
	}
	private boolean searchRecursive(TrieNode current, String word, int index) {
		if(index==word.length()){
			return current.endOfWord;
		}
		char ch = word.charAt(index);
		TrieNode node = current.children.get(ch);
		if(node==null){
			return false;
		}
		
		return searchRecursive(node, word, index+1);
	}
	
	public boolean delete(TrieNode current, String word, int index){
		if(index == word.length()){
			if(!current.endOfWord){
				return false;
			}
			current.endOfWord=false;
			return current.children.size()==0;
		}
		char ch = word.charAt(index);
		TrieNode node = current.children.get(ch);
		if(node==null){
			return false;
		}
		boolean shouldDeleteCurrentNode = delete(node, word, index+1);
		if(shouldDeleteCurrentNode){
			current.children.remove(ch);
			return current.children.size()==0;
		}
		return false;
	}
	
}

public class TrieDS{
	public static void main(String args[]){
		Trie root = new Trie();
		root.insert("hello");
		root.insert("world");
		root.insert("hello2");
		root.insert("hello3");
		root.insert("hello4");
		System.out.println(root.search("hello"));
		System.out.println(root.search("bye"));
		System.out.println(root.find("hel"));
	}
}
