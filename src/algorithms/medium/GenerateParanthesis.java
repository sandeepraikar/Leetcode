package algorithms.medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {

	public static void main(String[] args) {
		List<String> result = generateParenthesis(3);
		result.forEach(System.out::println);
	}
	
	 public static List<String> generateParenthesis(int n) {
	        List<String> result = new ArrayList<>();
	        if(n<=0){
	            return result;
	        }
	        helper(0,0,n,"",result);
	        return result;
	    }
	    
	    public static void helper(int left, int right, int n,String sol, List<String> result){
	        if(left+right==2*n){
	            result.add(sol);
	            return ;
	        }
	        if(left<n){
	            helper(left+1,right,n,sol+"(", result);
	        }
	         if(right<left){
	            helper(left,right+1,n,sol+")", result);
	        }
	    }

}
