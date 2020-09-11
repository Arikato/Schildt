package example; // page 115
// пропуск отдельных составляющих в определении цикла for
public class ForTest {
	public static void main(String args[]) {
		int i;
		
		for(i = 0; i < 10; ) { // отсутствует итерационное выражение
			System.out.println("Проход #" + i);
			i++; // инкрементирование переменной цикла
		}
		
	}

}
