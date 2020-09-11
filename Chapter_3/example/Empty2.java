package example; // page 116

//пропуск отдельных составл€ющих в определении цикла for

public class Empty2 {
	public static void main(String args[]) {
		int i;
		
		i = 0; // ¬ыносим инициализацию за пределы цикла
		for(; i < 10; ) {
			System.out.println("ѕроход є" + i);
			i++; // инкрементирование переменной цикла
		}
	}

}
