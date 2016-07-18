package algorithms.easy;



public class IsomorphicStrings {

	public static void main(String args[]) {
		System.out.println(isIsomorphic("paper", "title"));
	}

	public static boolean isIsomorphic(String s, String t) {
		if(s.length()!=t.length()){
			return false;
		}
		char sArray[] = s.toCharArray();
		char tArray[] = t.toCharArray();
		
		int arrS[] = new int[256];
		int arrT[] = new int[256];
		int count=1;
		int poS,poT;
		for(int i=0;i<s.length();i++){
			poS =  sArray[i];
			poT =  tArray[i];
			if(arrS[poS]!=arrT[poT]){
				return false;
			}else if(arrS[poS]==0){
				poS=poT=count++;
			}
		}
		return true;
	}
}
