/**
 * 
 */

/**
 * @author abaikani
 *
 */
import java.util.*;


class UserMainCode{
	public static String replacePlus(String s1,String s2){
		String result=s1;
		StringBuilder sb = new StringBuilder(s1);

		int[] a=new int[26];
		int i,j,k;
       // System.out.println("You entered string "+a[0]);
		

		int n=s2.length();
		for(i=0;i<n;i++){
			int x=(int)s2.charAt(i);
			if(x>=65 && x<=90){
				a[x-65]=1;
			}
			if(x>=97 && x<=122){
				a[x-97]=1;
			}
		}
		
		for(i=0;i<s1.length();i++){
			int x=(int)s1.charAt(i);
			if(x>=65 && x<=90){
				if(a[x-65]==0){
					sb.setCharAt(i,'+');

				}
			}
			if(x>=97 && x<=122){
				if(a[x-97]==0){
					sb.setCharAt(i,'+');
				}
			}

		}
		result = sb.toString();

		return result;
	}
}

public class Problem1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1,s2,result;
		
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextLine();
        s2=sc.nextLine();
       // System.out.println("You entered string "+s1);
       // System.out.println("You entered string "+s2);
        UserMainCode UMC= new UserMainCode();
        result=UMC.replacePlus(s1,s2);
        System.out.println(result);




		

	}

}
