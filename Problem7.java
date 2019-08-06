/**
 * 
 */

/**
 * @author abaikani
 *
 */

import java.util.*;


class UMC7{
	
	public ArrayList<String> retirementEmployeeList(HashMap<String,String> hm){
		ArrayList<String> al=new ArrayList<>();
		
		for(String key: hm.keySet()){
			String s=hm.get(key);
		String[] as=s.split("/");
		int y= Integer.parseInt(as[2]);
		int m= Integer.parseInt(as[1]);
		int d= Integer.parseInt(as[0]);
		int diff=0;
		diff+=2014-y-1;
		if(m==1&&d==1){
			diff+=1;
		}
		//System.out.println(diff);
		//return diff;
		if(diff>=60){
			al.add(key);
			
		}
		}
		return al;
		
	}
}
public class Problem7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		HashMap<String,String> hm=new HashMap<>();
		for(int i=0;i<n;i++){
		hm.put(sc.nextLine(),sc.nextLine());
		}
		ArrayList<String> al=new ArrayList<>();
		
		UMC7 umc =new UMC7();
		
		al= umc.retirementEmployeeList(hm);
		Collections.sort(al);
		System.out.println(al);
		
		
		


	}

}
