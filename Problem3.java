import java.util.Scanner;

/**
 * 
 */

/**
 * @author abaikani
 *
 */

class UserMainCode3{
	public static int countNoWords(String s1,String s2){
		int c=0,li=0;
		while(li!=-1){
			li=s1.indexOf(s2,li);
			if(li!=-1){
				c++;
				li+=s2.length();
				
			}
		}
		return c;
		
	}
}
public class Problem3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String s1,s2;
int result;
		
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextLine();
        s2=sc.nextLine();
       // System.out.println("You entered string "+s1);
       // System.out.println("You entered string "+s2);
        UserMainCode3 UMC= new UserMainCode3();
        result=UMC.countNoWords(s1,s2);
        System.out.println(result);

	}

}
