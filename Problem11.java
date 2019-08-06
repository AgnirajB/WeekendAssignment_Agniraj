/**
 * 
 */

/**
 * @author abaikani
 *
 */

import java.util.*;

class UserMainCode11{
	public static String highScorer(ArrayList<String> al){
		int n= al.size();
		int max=0;
		String maxs=null;
		for(int i=0;i<n;i++){
			String s=al.get(i);
			String[] als=s.split("-");
			//for(String word: als){
			int sum=Integer.parseInt(als[1])+Integer.parseInt(als[2])+Integer.parseInt(als[3]);
			//}
			if(max<sum){
				max=sum;
				maxs=als[0];
			}
		}
		return maxs;
	}
	
}

public class Problem11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		ArrayList<String> al=new ArrayList<String>();
		
		for(int i=0;i<n;i++){
			al.add(sc.nextLine());
			
		}
		UserMainCode11 UMC=new UserMainCode11();
		String s=UMC.highScorer(al);
		System.out.println(s);
		
	}

}
