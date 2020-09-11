package example; // page 117
// Тело цикла for может быть пустым

public class Empty3 {
	public static void main(String args[]) {
		int i;
		int sum = 0;
		
		// суммируются числа от 1 до 5
		for(i = 1; i <= 5; sum += i++);	// В цикле отсутствует тело!
		
		System.out.println("Сумма: " + sum);
		
	}

}
