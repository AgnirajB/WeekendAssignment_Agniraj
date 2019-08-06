import java.util.*;

class Card{
	String symbol;
	int number;

	Card(String s,int n){
		this.symbol = s;
		this.number = n;
	}
	public String toString(){
		String str = symbol+" "+number;
		return str;
	}

	
}

class Problem29{
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Set<String> hs = new TreeSet<>();
		Set<String> chs=new TreeSet<>();
		int count = 0;
		do{
			System.out.println("Enter a card:");
			String s=sc.next();
			//char c = s.charAt(0);
			int i = sc.nextInt();
			chs.add(s);
			hs.add(new Card(s,i).toString());
			count++;
		}while(chs.size()!=4);

		System.out.println("Four symbols gathered in"+ count+" cards\n");
		for(String card : hs){
			System.out.println(card);
		}
	}
}