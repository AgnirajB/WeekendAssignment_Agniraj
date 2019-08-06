/**
 * 
 */

/**
 * @author abaikani
 *
 */

import java.util.*;

class UMC23{
	
	public String convertDateFormat(String s){
		String[] as=s.split("/");
		int x=Integer.parseInt(as[2]);
		x=x%100;
		String s1=Integer.toString(x);
		String res=as[0]+"-"+as[1]+"-"+s1;
		return res;
		
	}
}

public class Problem23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		UMC23 umc=new UMC23();
		System.out.println(umc.convertDateFormat(s));
		
		

	}

}
