/**
 * 
 */

/**
 * @author abaikani
 *
 */

import java.util.*;

class UMC18{
	
	public static String validPAN(String s){
		int n=s.length();
		if(n==8){
			boolean b=true;
			for(int i=0;i<3;i++){
				char ch=s.charAt(i);
				b=b&&Character.isUpperCase(ch);
				
			}
			for(int i=3;i<7;i++){
				char ch=s.charAt(i);
				b=b&&Character.isDigit(ch);
				
			}
			char ch=s.charAt(7);

			b=b&&Character.isUpperCase(ch);
			if(b){
				return "Valid";
			}
			else{
				return "Invalid";
			}
			
			
		}
		else{
			return "Invalid";
		}
		
		
	}
}

public class Problem18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		UMC18 umc=new UMC18();
		System.out.println(umc.validPAN(s));
		
	}

}
