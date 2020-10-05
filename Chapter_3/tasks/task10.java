package tasks; // page 138

import java.io.IOException;

public class task10 {
	public static void main(String args[]) throws IOException {
		int count = 0;
		int asc;
		char ch;
		for(;;) {
			asc = (int) System.in.read();
			if(asc == 46) {
				System.out.println(count);
				break;
			}
			if(asc >= 65 && asc <= 90 || asc >= 144 && asc <= 175) {
				System.out.print(ch = (char) (asc+32));
				count++;
			} else if(asc >= 97 && asc <= 122 || asc >= 176 && asc <= 255) {
				System.out.print(ch = (char) (asc-32));
				count++;
			}
			System.out.println("");
		}
		
				
	}

}
