/**
 * 
 */

/**
 * @author abaikani
 *
 */

import java.util.*;

class UserMainCode9{
	public static String storeMaxVowel(String s){
		String[] as=s.split(" ");
		//int n=as.size();
		//HashMap<String,Integer> map=new HashMap<>();
		int max=0;
		String maxs=null; 
		for(String word: as){
			int x=0;
			word=word.toLowerCase();
			for(int j=0;j<word.length();j++){
				if(word.charAt(j)=='a' || word.charAt(j)=='e' || word.charAt(j)=='i' || word.charAt(j)=='o' || word.charAt(j)=='u'  ){
					x++;
				}
				
			}
			if(max<x){
				max=x;
				maxs=word;
				
			}
			//map.put(as[i], x);
			
			
			
		}
		return maxs;
		
	}
}

public class Problem9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);

		String s=sc.nextLine();
		UserMainCode9 UMC=new UserMainCode9();
		String result=UMC.storeMaxVowel(s);
		System.out.println(result);
		
		

	}

}
