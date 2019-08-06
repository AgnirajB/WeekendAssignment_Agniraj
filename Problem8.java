import java.util.Scanner;

/**
 * 
 */

/**
 * @author abaikani
 *
 */

import java.util.*;


class UserMainCode8{
	
	public static int getKaprekanNumber(int n){
		if(n==1){
			return 1;
		}
		int nc=0,i,j;
		int tn=n*n;
		while(tn!=0){
			nc++;
			tn=tn/10;
		}
		//System.out.println(nc);
		int sqn=n*n;

		for(i=1;i<nc;i++){
			int split=(int)Math.pow(10, i);
			if(split==n){
				continue;
			}
			int sum=sqn/split+sqn%split;
			//System.out.println(sum);

			if(sum==n){
				return 1;
			}
		}
		return -1;
		
	}
}
public class Problem8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		UserMainCode8 UMC=new UserMainCode8();
		int x=UMC.getKaprekanNumber(n);
		if(x==1){
			System.out.println("Kaprekar Number");
		}
		if(x==-1){
			System.out.println("Not A Kaprekar Number");

		}
		

	}

}
