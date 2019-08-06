
import java.util.*;
import java.text.DecimalFormat;

class Box implements Comparable<Box>{
	double length;
	double width;
	double height;
	
	public Box(){
		
	}

	public Box(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}

	@Override
	public int compareTo(Box obj) {
		double volume1 = this.length * this.width * this.height;
		double volume2 = obj.length * obj.width * obj.height;
		
		volume1 = volume1*100;
		volume2 = volume2*100;
		
		int diff = (int)volume1 - (int)volume2;
		
		return diff;
	}
	public boolean equals(Box obj){
		boolean flag = false;
		double volume1 = this.length * this.width * this.height;
		double volume2 = obj.length * obj.width * obj.height;
		if((volume1-volume2) == 0){
			flag = true;
		}
		return flag;}}


public class Problem30 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of Box");
		int num = in.nextInt();
		double length;
		double width;
		double height;
		double volume;
		String str;
		Box box;
		Set<Box> boxSet = new TreeSet<Box>();
		
		for(int i = 1; i<= num; i++){
			System.out.println("Enter the Box "+i+" details");
			System.out.println("Enter Length");
			length = in.nextDouble();
			System.out.println("Enter Width");
			width = in.nextDouble();
			System.out.println("Enter Height");
			height = in.nextDouble();
			
			boxSet.add(new Box(length, width, height));
		}
		
		System.out.println("Unique Boxes in the Set are");
		Iterator<Box> it = boxSet.iterator();
		while(it.hasNext()){
			box = it.next();
			volume = box.length * box.width * box.height;
			//System.out.format("Length =%.1f Width =%.1f Height =%.1f Volume =%.2f\n",box.length,box.width,box.height,volume);
			DecimalFormat df = new DecimalFormat("0.0#");
			DecimalFormat df1 = new DecimalFormat("0.0#");
			String vol = df1.format(volume);
			
			str = "Length ="+df.format(box.length)+" Width ="+df.format(box.width);
			str = str+" Height ="+df.format(box.height)+" Volume ="+vol;
			System.out.println(str);
			
		}
	}
}
