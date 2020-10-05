package example;	// page 126
// Чтение данных до тех пор, пока не будет получена буква q

public class Break2 {
	public static void main(String args[]) throws java.io.IOException {
		
		char ch;
		
		for(;;) { // бесконечный цикл, завершаемый инструкцией break
			ch = (char) System.in.read(); // Получение символа с клавиатуры
			if(ch == 'q') {
				break;
			}
		}
		System.out.println("Вы нажали клавишу q!");
	}

}
