/**
 * 
 */

/**
 * @author abaikani
 *
 */

import java.util.*;


class UMC16{
	
	public String findOldDate(String s1,String s2){
		String[] as1=s1.split("-");
		String[] as2=s2.split("-");
		int y=Integer.parseInt(as1[2]);
		int x=0;
		if(Integer.parseInt(as1[2])< Integer.parseInt(as2[2])){
			x=1;
		}
		else if(Integer.parseInt(as1[2]) > Integer.parseInt(as2[2])){
			x=2;
		}
		else{
			if(Integer.parseInt(as1[1])< Integer.parseInt(as2[1])){
				x=1;
			}
			else if(Integer.parseInt(as1[1]) > Integer.parseInt(as2[1])){
				x=2;
			}
			else{
				if(Integer.parseInt(as1[0])< Integer.parseInt(as2[0])){
					x=1;
				}
				else if(Integer.parseInt(as1[0]) > Integer.parseInt(as2[0])){
					x=2;
				}
				
			}
			
		}
		if(x==1){
			return as1[1]+"/"+as1[0]+"/"+as1[2];
		}
		else{
			return as2[1]+"/"+as2[0]+"/"+as2[2];
		}
		
	}
}

public class Problem16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		UMC16 umc=new UMC16();
		System.out.println(umc.findOldDate(s1, s2));
		

	}

}
