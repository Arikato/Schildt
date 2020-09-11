package example;

// ƒемонстраци€ времени жизни переменной

public class VatInitDemo {
	public static void main(String[]args) {
		int x;
		
		for(x = 0; x < 3; x++) {
			int y = -1;	// переменна€ y инициализируетс€
						// при каждом входе в блок
			System.out.println("y: " + y);	// всегда выводитс€
											// значение -1
			y = 100;
			System.out.println("»змененное значение y: " + y);
		}
	}
}