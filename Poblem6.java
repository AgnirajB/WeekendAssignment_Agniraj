/**
 * 
 */

/**
 * @author abaikani
 *
 */

import java.util.*;

class UserMainCode6{
	
	public static int getAnagram(String s1,String s2){
		int[] a=new int[26];
		if(s1.length()!=s2.length()){
			return -1;
		}
		int y=0;
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)==' '){
				y++;
				
			}
			else{
			int x=(int)(s1.charAt(i))-97;
			a[x]+=1;
			}
		}
		for(int i=0;i<s2.length();i++){
			if(s2.charAt(i)==' '){
				y--;
				
			}
			else{
			int x=(int)(s2.charAt(i))-97;
			a[x]-=1;
			}
		}
		for(int i=0;i<26;i++){
			if(a[i]>0 || y!=0){
				return -1;
				
			}
		}
		return 1;
	}
}

public class Poblem6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		UserMainCode6 UMC=new UserMainCode6();
		int x=UMC.getAnagram(s1, s2);
		if(x==-1){
			System.out.println("Not Anagrams");
		}
		if(x==1){
			System.out.println("Anagrams");

		}
		

	}

}
