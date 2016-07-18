package algorithms.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	public static void main(String[] args) {
		List<List<Integer>> result = generate(5);
		for (List<Integer> list : result) {
			list.forEach(i->System.out.print(i+" "));
			System.out.println();
		}
		
	}

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        if(numRows<=  0){
        	return triangle;
        }
        for(int i=0;i<numRows;i++){
        	List<Integer> row = new ArrayList<>();
        	for(int j=0;j<i+1;j++){
        		if(j==0 ||j==i){
        			row.add(1);
        		}else{
        			row.add(triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
        		}
        	}
        	triangle.add(row);
        }
        return triangle;
    }
}
