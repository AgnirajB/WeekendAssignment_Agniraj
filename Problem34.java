
import java.util.*;

public class Problem34 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String item;
		List<String> list = new ArrayList<String>();
		boolean flag = true;
		boolean flag1;
		while(flag){
			System.out.println("1. Insert");
			System.out.println("2. Search");
			System.out.println("3. Delete");
			System.out.println("4. Display");
			System.out.println("5. Exit");

			System.out.println("Enter your choice :");
			int choice = Integer.parseInt(in.nextLine());

			switch(choice){
			case 1:
				System.out.println("Enter the item to be inserted:");
				item = in.nextLine();
				list.add(item);
				System.out.println("Inserted successfully");
				break;
			case 2:
				System.out.println("Enter the item to search :");
				item = in.nextLine();
				flag1 = listSearch(list,item);
				if(flag1){
					System.out.println("Item found in the list.");
				}else{
					System.out.println("Item not found in the list.");
				}
				break;
			case 3:
				System.out.println("Enter the item to delete :");
				item = in.nextLine();
				flag1 = listDelete(list, item);
				if(flag1){
					System.out.println("Deleted successfully");
				}else{
					System.out.println("Item does not exist.");
				}
				break;
			case 4:
				System.out.println("The Items in the list are :");
				listDisplay(list);
				break;
			case 5:
				flag = false;
				break;
			default:
				flag = false;
			}
		}
	}

	public static boolean listSearch(List<String> list, String item){
		Iterator<String> it = list.iterator();
		boolean flag = false;
		while(it.hasNext()){
			if(item.equalsIgnoreCase(it.next())){
				flag = true;
			}
		}
		return flag;
	}
	public static boolean listDelete(List<String> list, String item){
		List<String> temp = new ArrayList<String>();
		boolean flag;
		temp.add(item);
		flag = listSearch(list, item);
		if(flag){
			list.removeAll(temp);
		}
		return flag;
	}
	public static void listDisplay(List<String> list){
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
