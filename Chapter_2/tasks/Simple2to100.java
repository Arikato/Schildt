package tasks;

public class Simple2to100 {
	public static void main(String args[]) {
		for(int i = 2; i <= 100; i++) {
			if (i > 10 && i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 && i % 9 != 0) {
				System.out.println(i);
			} else {
				if(i == 2 || i == 3 || i == 5 || i == 7 || i == 9) {
					System.out.println(i);
				}
			}
			
		}
	}

}
