/**
 * 
 */

/**
 * @author abaikani
 *
 */

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

import java.util.Locale;

class UMC21{
	
	public String getDay(String s){
		SimpleDateFormat sdf=new SimpleDateFormat("MM-dd-yyyy");
		Date d=null;

		try {
			d=sdf.parse(s);
			
		} catch (ParseException e) {
			
		}

		Calendar c1= new GregorianCalendar();
		c1.setTime(d);
		c1.add(Calendar.YEAR, 1);
		SimpleDateFormat sdf1=new SimpleDateFormat("EEEE");
		return sdf1.format(c1.getTime()).toLowerCase();
		
		
	}
}

public class Problem21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		UMC21 umc=new UMC21();
		System.out.println(umc.getDay(s));
		
		

	}

}
