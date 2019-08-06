/**
 * 
 */

/**
 * @author abaikani
 *
 */

import java.util.*;


public class Problem20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		HashMap<Integer,String> hm=new HashMap<>();
		for(int i=0;i<n;i++){
			int x=Integer.parseInt(sc.nextLine());
			String s=sc.nextLine();
			hm.put(x,s);
			
		}
		int max=Integer.MIN_VALUE;
		for(Integer m: hm.keySet()){
			if(m>max){
				max=m;
			}
		}
		System.out.println(hm.get(max));
		
		

	}

}
