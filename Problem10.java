/**
 * 
 */

/**
 * @author abaikani

 *
 */


import java.util.*;

class UserMainCode10{
	
	public static ArrayList<Integer> performSetOp (ArrayList<Integer> al1,ArrayList<Integer> al2,char ch){
		int n=al1.size();
		ArrayList<Integer> result=new ArrayList<Integer>();
		if(ch=='+'){
			al1.removeAll(al2);
			al1.addAll(al2);
			result=al1;
			
		}
		else if(ch=='*'){
			al1.retainAll(al2);
			result=al1;
			
		}
		else{
				for(int i=0;i<al1.size();i++){
					int k=0;
					for(int j=0;j<al2.size();j++){
						if(al1.get(i)==al2.get(j)){
							k=1;
						}
					}
					if(k==0){
						result.add(al1.get(i));
					}
				}
		}
		
		
		return result;
	}
}

public class Problem10 {

	/**
	 * @param args
	 */
	public static void main (String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> al1=new ArrayList<Integer>();
		ArrayList<Integer> al2=new ArrayList<Integer>();
		ArrayList<Integer> result=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			al1.add(sc.nextInt());
			
		}
		for(int i=0;i<n;i++){
			al2.add(sc.nextInt());
			
		}
		sc.nextLine();
		//System.out.println(al1+" "+al2);

		String s=sc.nextLine();
		//System.out.println(s);

		char ch=s.charAt(0);
		//System.out.println(ch);
		UserMainCode10 UMC=new UserMainCode10();
		result =UMC.performSetOp(al1,al2,ch);
		

		for(int i=0;i<result.size();i++){
			System.out.println(result.get(i));
		}
		

	}

}
