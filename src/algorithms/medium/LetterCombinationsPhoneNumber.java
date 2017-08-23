package algorithms.medium;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsPhoneNumber {

    public List<String> letterCombinations(String digits) {
        String[] keys = {"","", "abc", "def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> result = new ArrayList<>();
        if(digits.length()==0){
            return result;
        }
        helper(keys,digits, "", 0, result);
        return result;
    }
    
    public void helper(String[] keys, String digits, String sol, int offset, List<String> result){
        if(offset>=digits.length()){
            result.add(sol);
            return;
        }
        String letters = keys[digits.charAt(offset)-'0'];
        for(int i=0;i<letters.length();i++){
            helper(keys,digits,sol+letters.charAt(i),offset+1,result);
        }
    }
}
