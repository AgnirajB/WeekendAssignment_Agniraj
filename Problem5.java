/**
 * 
 */

/**
 * @author abaikani
 *
 */
import java.util.*;


class UMC5{
	
	public int getAverageOfOdd(HashMap<Integer,Integer> hm){
		int sum=0;
		int c=0;
		for(Integer m: hm.keySet()){
			if(m%2!=0){
				c++;
				sum+=hm.get(m);
			}
		}
		sum=sum/c;
		return sum;
	}
}
public class Problem5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<n;i++){
			hm.put(sc.nextInt(),sc.nextInt());
			
		}
		UMC5 umc =new UMC5();
		System.out.println(umc.getAverageOfOdd(hm));
		
		
		

	}

}
