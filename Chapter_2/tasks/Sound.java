package tasks;

/*
 * 	Вычисление расстояния до места вспышки молнии, звук от которого
 * 	доходит до наблюдателя через 7,2 секунды.
 */

public class Sound {
	public static void main(String[]args) {
		double dist;
		
		dist = 330 * 7.2;
		
		System.out.println("Расстояние до места вспышки молнии " + 
							"составляет " + dist + " метров");
	}

}
