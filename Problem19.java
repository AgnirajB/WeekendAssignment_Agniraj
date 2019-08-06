/**
 * 
 */

/**
 * @author abaikani
 *
 */

import java.util.*;


class UMC19{
	
	public String getLastLetter(String s){
		
		String[] as=s.split(" ");
		String result="";
		for(int i=0;i<as.length;i++){
			String word=as[i];
			int x=word.length();
			String ll=Character.toString(word.charAt(x-1));
			ll=ll.toUpperCase();
			result=result+ll;
			if(i!=as.length){
				result=result+"$";
			}
			
		}
		return result;
	}
}

public class Problem19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		UMC19 umc=new UMC19();
		System.out.println(umc.getLastLetter(s));
	}

}
