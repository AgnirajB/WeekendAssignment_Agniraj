/**
 * 
 */

/**
 * @author abaikani
 *
 */

import java.time.YearMonth;
import java.util.*;


class UMC25{
	
	public int getAge(String s){
		String[] as=s.split("/");
		int y= Integer.parseInt(as[2]);
		int m= Integer.parseInt(as[1]);
		int d= Integer.parseInt(as[0]);
		int diff=0;
		diff+=2015-y-1;
		if(m==1&&d==1){
			diff+=1;
		}
		return diff;
		
	}
}
public class Problem25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		UMC25 umc =new UMC25();
		
		int x= umc.getAge(s);
		if(x>18){
			System.out.println("eligible");
			
		}
		else{
			System.out.println("not-eligible");

		}


	}

}
