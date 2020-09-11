package example; // page 118
// ќбъ€вление переменной цикла  в самом цикле for

public class ForVar {
	public static void main(String args[]) {
		int sum = 0;
		int fact = 1;
		
		// вычисление  факториала чисел от 1 до 5
		for(int i = 1; i <= 5; i++) {	// переменна€ i объ€вл€етс€ в цикле for
			sum += i;		// переменна€ i доступна во всем цикле
			fact *= i;
		}
		
		// тут переменна€ i недоступна
		
		System.out.println("—умма: " + sum);
		System.out.println("‘акториал: " + fact);
	}

}
