/**
 * 
 */

/**
 * @author abaikani
 *
 */

import java.util.*;

public class Problem31 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int x=Integer.parseInt(sc.nextLine());
		int y=Integer.parseInt(sc.nextLine());
		int z=Integer.parseInt(sc.nextLine());
		double cp=y/12.0;
		double profit=(z-cp)/cp;
		profit=profit*100.0;
		double res=Math.round(profit*100.0)/100.0;
		float res1=(float)res;
		System.out.printf("%.2f",res1);
		
		
		

	}

}
