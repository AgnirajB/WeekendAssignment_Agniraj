/**
 * 
 */

/**
 * @author abaikani
 *
 */

import java.util.*;
class UMC13{
	public static String swapPairs(String s){
		int n=s.length();
		char[] sa=s.toCharArray();
		for(int i=0;i<n && i<n-1;i+=2){
			char temp=sa[i];
			sa[i]=sa[i+1];
			sa[i+1]=temp;
			
		}
		String result=String.valueOf(sa);
		return result;
	}
}

public class Problem13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		UMC13 umc=new UMC13();
		String res=umc.swapPairs(s);
		System.out.println(res);
		
		

	}

}
