package example;
// �������� 91
public class CastDemo {
	public static void main(String args[]) {
		double x, y;
		byte b;
		int i;
		char ch;
		
		x = 10.0;
		y = 3.0;
		
		i = (int) (x / y); // �������� ��� double � ���� int
		System.out.println("������������� ��������� ������� x / y: " + i);
		
		i = 100;
		b = (byte) i;	// � ���� ������ ���������� �� ��������. 
						// ��� byte ����� ��������� �������� 100
		System.out.println("�������� b: " + b);
		
		i = 257;
		b = (byte) i;	// �� ���� ��� ���������� ��������.
						// ��� byte �� ����� ��������� �������� 257
		System.out.println("�������� b: " + b);
		
		b = 88;	// ������������� ������� � � ���� ASCII
		ch = (char) b;	// ����� ���������� ������������� �����
		System.out.println("ch: " + ch);
	}

}
