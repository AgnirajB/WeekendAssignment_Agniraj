/**
 * 
 */

/**
 * @author abaikani
 *
 */

import java.util.*;


class UMC17{
	
	public int findMaxDiff(int[] a){
		int n= a.length;
		int maxi=0,maxd=0;
		for(int i=0;i<n-1;i++){
			if(Math.abs(a[i]-a[i+1])>maxd){
				maxd=Math.abs(a[i]-a[i+1]);
				if(a[i]<a[i+1]){
					maxi=i+1;
				}
				else{
					maxi=i;
				}
			}
		}
		return maxi;
		
		}
}

public class Problem17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			
		}
		UMC17 umc=new UMC17();
		System.out.println(umc.findMaxDiff(a));
		

	}

}
