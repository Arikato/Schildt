package tasks;

/*
 * ���������� ���������� �� �������� ������� �� ������� ������� ���
 * � ������ ����������� �������
 */

public class Echo {
	public static void main(String[]args) {
		int timeToEcho;	// ����� � ��������
		double dist;	// ���������� �� �������
		int temp; 		// ����������� �������
		
		timeToEcho = 25;
		temp = 16;
		
		dist = timeToEcho / 2 * (331.4 + 0.6 * temp);
		
		System.out.println("���������� �� ������� ����� " + dist + " ������");
		
	}

}
