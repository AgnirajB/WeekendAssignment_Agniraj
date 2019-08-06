/**
 * 
 */

/**
 * @author abaikani
 *
 */

import java.util.*;

class UserMainCode2{
	
	public static int addUniqueEven(int[] a){
		int n=a.length;
		
		int[] temp=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++){
			if(a[i]!=a[i+1]){
				temp[j++]=a[i];
			}
		}
		temp[j++]=a[n-1];
		int sum=0,ne=0;
		for(int i=0;i<j;i++){
			System.out.println(temp[i]);
			if(temp[i]%2==0){
				sum=sum+temp[i];
				ne=1;
			}
		}
		System.out.println(ne);

		if(ne==1){
			return sum;
		}
		else{
			return -1;
		}
		
		
		
	}
}

public class Problem2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		UserMainCode2 UMC=new UserMainCode2();
		int result =UMC.addUniqueEven(a);
		if(result==-1){
			System.out.println("No Even Numbers");
			
		}
		else{
			System.out.println(result);

		}
		
		
		
		
		
		

	}

}
