package example;

public class IfDemo {
	public static void main(String args[]) {
		int a, b, c;
		
		a = 2;
		b = 3;
		
		if(a < b) System.out.println("a ������ b");
		
		// ��������� ������ ������� �� ����� ��������
		if(a == b) System.out.println("�� �� ������ ������� ���� �����");
		
		System.out.println();
		
		c = a - b; // ���������� "�" �������� �������� -1
		
		System.out.println("c �������� -1");
		if(c >= 0) System.out.println("c - �� ������������� �����");
		if(c < 0) System.out.println("c - ������������� �����");
		
		System.out.println();
		
		c = b - a; // ���������� "�" ������ �������� �������� 1
		
		System.out.println("c �������� 1");
		if(c >= 0) System.out.println("� - �� ������������� �����");
		if(c < 0) System.out.println("c - ������������� �����");
	
	}

}
