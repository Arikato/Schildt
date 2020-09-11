package tasks;

/*
 * Вычисления расстояния до крупного объекта по времени прихода эхо
 * с учетом температуры воздуха
 */

public class Echo {
	public static void main(String[]args) {
		int timeToEcho;	// время в секундах
		double dist;	// расстояние до объекта
		int temp; 		// температура воздуха
		
		timeToEcho = 25;
		temp = 16;
		
		dist = timeToEcho / 2 * (331.4 + 0.6 * temp);
		
		System.out.println("Расстояние до объекта равно " + dist + " метров");
		
	}

}
