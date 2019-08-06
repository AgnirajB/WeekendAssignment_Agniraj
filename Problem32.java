/**
 * 
 */

/**
 * @author abaikani
 *
 */
import java.util.*;

class UMC32{
	
	public static int equals(int n,int m){
		int an=Math.abs(n);
		int am=Math.abs(m);
		if(an==am){
			return 1;
		}
		else{
			return -1;
		}
	}
}

public class Problem32 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		int m=Integer.parseInt(sc.nextLine());
		
		UMC32 umc=new UMC32();
		int x=umc.equals(n,m);
		if(x==1){
			System.out.println(n+"="+m);
		}
		else{
			System.out.println(n+"!="+m);
		}
		

	}

}
