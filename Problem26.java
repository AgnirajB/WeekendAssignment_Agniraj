/**
 * 
 */

/**
 * @author abaikani
 *
 */

import java.util.*;

class Product{
	private long id;
	private String productName;
	private String supplierName;
	Product(){
		
	}
	Product(long id,String pn){
		this.id=id;
		this.productName=pn;
		this.supplierName="Nivas";
	}
	Product(long id,String pn,String sn){
		this.id=id;
		this.productName=pn;
		this.supplierName="Nivas";
	}
	void Display(){
		System.out.println(this.id);
		System.out.println(this.productName);
		System.out.println(this.supplierName);

		
	}
	
}
public class Problem26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Product obj=new Product();
		long id=Long.parseLong(sc.nextLine());
		String pn=sc.nextLine();
		String s=sc.nextLine();
		if(s.equals("Yes")){
			Product obj1=new Product(id,pn);
			obj1.Display();
		}
		else{
			String cn=sc.nextLine();
			Product obj2=new Product(id,pn,cn);
			obj2.Display();

		}
	}

}
