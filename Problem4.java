/**
 * 
 */

/**
 * @author abaikani

 *
 */


import java.util.*;

class UserMainCode4{
	
	public static ArrayList<Integer> generateOddEvenList (ArrayList<Integer> al1,ArrayList<Integer> al2){
		int n=al1.size();
		ArrayList<Integer> result=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			if(i%2==0){
				result.add(al2.get(i));
			}
			else{
				result.add(al1.get(i));
			}
		}
		return result;
	}
}

public class Problem4 {

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
		UserMainCode4 UMC=new UserMainCode4();
		result =UMC.generateOddEvenList(al1,al2);
		

		for(int i=0;i<result.size();i++){
			System.out.println(result.get(i));
		}
		

	}

}
