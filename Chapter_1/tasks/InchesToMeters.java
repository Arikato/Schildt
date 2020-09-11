package tasks;

public class InchesToMeters {
	public static void main(String[]args) {
		int inch;
		//float meter;
		int foot = 12;
		inch = foot * 12;
		//meter = (float) (inch / 39.37);
		//System.out.println(meter);
		
		for(int i = 1; i <= inch; i++) {
			System.out.println(i + " ה‏ילמג נאגםמ " + (double) (i / 39.37) + " לוענמג");
			
			if(i % foot == 0) System.out.println();
		}
		
		
		
		
	}

}
