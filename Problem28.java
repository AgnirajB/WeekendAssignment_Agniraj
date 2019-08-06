/**
 * 
 */

/**
 * @author abaikani
 *
 */

import java.util.*;
class employee{
	String firstname,lastname,mobileno,email,address;
	employee(String firstname, String lastname, String mobileno, String email, String address){
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobileno = mobileno;
		this.email = email;
		this.address = address;
	}
}
public class Problem28 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		ArrayList<employee> al = new ArrayList<>();
		System.out.println("Enter The Number of Employees");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0;i<n;i++)
		{
			System.out.println("Enter Employee"+(i+1)+" Details:\n");
			System.out.println("Enter the Firstname");
			String firstname = sc.nextLine();
			System.out.println("Enter the Lastname");
			String lastname = sc.nextLine();
			System.out.println("Enter the Mobile");
			String mobileno = sc.nextLine();
			System.out.println("Enter the Email");
			String email = sc.nextLine();
			System.out.println("Enter the Address");
			String address = sc.nextLine();
			al.add(new employee(firstname,lastname,mobileno,email,address));

		}
		
		System.out.format("%-15s %-15s %-15s %-30s %-15s\n","Firstname","Lastname","Mobile","Email","Address");
		for(employee e : al)
			System.out.format("%-15s %-15s %-15s %-30s %-15s\n",e.firstname,e.lastname,e.mobileno,e.email,e.address);
	}
	

}
