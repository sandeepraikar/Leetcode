package algorithms.medium;

public class EggDroppingProblem {

	public static void main(String args[]){
		int floors = 100;
		int eggs = 2;
		System.out.println(eggDrop(2,100));
	}
	
public static int calculate(int eggs, int floors){
        
        int T[][] = new int[eggs+1][floors+1];
        int c =0;
        for(int i=0; i <= floors; i++){
            T[1][i] = i;
        }
        
        for(int e = 2; e <= eggs; e++){
            for(int f = 1; f <=floors; f++){
                T[e][f] = Integer.MAX_VALUE;
                for(int k = 1; k <=f ; k++){
                    c = 1 + Math.max(T[e-1][k-1], T[e][f-k]);
                    if(c < T[e][f]){
                        T[e][f] = c;
                    }
                }
            }
        }
        return T[eggs][floors];
    }

	private static int eggDrop(int eggs, int floors) {
		if(floors==0 || floors ==1){
			return floors;
		}
		if(eggs==1){
			return floors;
		}
		
		int min=Integer.MAX_VALUE, result;
		for(int x=1;x<=floors;x++){
			 result = Math.max(eggDrop(eggs-1,x-1),eggDrop(eggs,floors-x));
			if(result<min){
				min=result;
			}
		}
		return min+1;
	}
}
