/**
 * 
 */

/**
 * @author abaikani
 *
 */

import java.util.*;


public class Problem22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		HashMap<Integer,String> hm=new HashMap<>();
		for(int i=0;i<n;i++){
			int x=Integer.parseInt(sc.nextLine());
			String s=sc.nextLine();
			hm.put(x,s);
			
		}
		for(Integer m: hm.keySet()){
			String s1=hm.get(m);
			int ls1=s1.length();
			boolean b=true,d=false;
			char ch=s1.charAt(0);
			b=b&&Character.isLowerCase(ch);
			ch=s1.charAt(ls1-1);
			b=b&&Character.isUpperCase(ch);
			for(int i=0;i<ls1;i++){
				ch=s1.charAt(i);
				if(Character.isDigit(ch)){
					d=true;
					break;
				}
			}
			b=b&&d;
			ArrayList<String> nls=new ArrayList<>();
			if(b==true){
				nls.add(s1);
				System.out.println(s1);
			}
			

			
			
		}
		
		
		

	}

}
