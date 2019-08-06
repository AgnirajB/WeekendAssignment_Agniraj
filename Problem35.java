/**
 * 
 */

/**
 * @author abaikani
 *
 */


import java.util.*;


public class Problem35 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		Map<String, List<Integer>> acm = new HashMap<String, List<Integer>>();
		Set<String> ss = new TreeSet<String>();
		
		String symbol;
		int number;
		int i;
		int sum = 0;
		
		System.out.println("Enter Number of Cards : ");
		int num = sc.nextInt();
		for(i =1;i<=num;i++){
			System.out.println("Enter card "+i+":");
			String s= sc.next();
			int n= sc.nextInt();
		
			ss.add(s);
			if(acm.containsKey(s)){
				acm.get(s).add(n);
			}
			else{
				List<Integer> list = new ArrayList<Integer>();
				list.add(n);
				acm.put(s, list);
			}
			
			}
		
		System.out.println("Distinct Symbols are : ");
		for(String s : ss){
			System.out.println(s);
		}
		Iterator<String> itSet = ss.iterator();
		
		System.out.println();
		itSet = ss.iterator();
		Iterator<Integer> itList;
		while(itSet.hasNext()){
			String str = itSet.next();
			itList = acm.get(str).iterator();
			System.out.println("Cards in "+str+" Symbol");
			while(itList.hasNext()){
				i = itList.next();
				System.out.println(str+" "+i);
				sum = sum + i;
			}
			System.out.println("Number of cards : "+acm.get(str).size());
			System.out.println("Sum of Numbers : "+sum);
			sum = 0;
		}


	}

}
