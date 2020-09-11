package example;
// ѕрименение инструкции break дл€ выхода из цикла (page 125)

public class BreakDemo {
	public static void main(String args[]) {
		int num;
		
		num = 100;
		
		// ¬ыполнение цикла до тех пор, пока квадрат значени€
		// переменной i меньше значени€ переменной num
		
		for(int i = 0; i < num; i++) {
			if(i*i >= num) {
				break; // прекращение работы цикла, если i*i >= 100
			}
			System.out.print(i + " ");
		}
		System.out.println("÷икл завершен.");
	}

}
