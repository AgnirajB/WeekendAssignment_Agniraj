/**
 * 
 */

/**
 * @author abaikani
 *
 */
import java.util.*;
import java.time.YearMonth;

class UMC24{
	
	public int getLastDayOfMonth(String s){
		String[] as=s.split("-");
		int y= Integer.parseInt(as[2]);
		int m= Integer.parseInt(as[1]);
		YearMonth ymo = YearMonth.of(y, m);
		int days = ymo.lengthOfMonth();
		return days;
		
	}
}

public class Problem24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		UMC24 umc =new UMC24();
		
		System.out.println(umc.getLastDayOfMonth(s));

	}

}
