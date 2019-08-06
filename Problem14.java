/**
 * 
 */

/**
 * @author abaikani
 *
 */

import java.util.*;

class UMC14{
	
	public static String validPassword(String s){
		int n=s.length();
		int cletter=0,cnum=0,cspec=0;
		
		if(n>=8){
		for(int i=0;i<n;i++){
			char ch=s.charAt(i);
			int x=(int)ch;
			if(Character.isLetter(ch)){
				cletter++;
			}
			if(Character.isDigit(ch)){
				cnum++;
			}
			if(x>=33 && x<=46 || x==64 ){
				cspec++;
			}
		}
		if(cletter>0 && cnum>0 && cspec>0){
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

public class Problem14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		UMC14 umc=new UMC14();
		System.out.println(umc.validPassword(s));
		
	}

}
