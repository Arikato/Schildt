package example;
// ������� ����� (page 103)
public class Guess {
	public static void main(String args[]) throws java.io.IOException {
		
		char ch, answer = 'K';
		
		System.out.println("�������� ����� �� ��������� A-Z.");
		System.out.print("����������� �� �������: ");
		ch = (char) System.in.read(); // ������ ������� � ����������
		
		if(ch == answer) {
			System.out.println("** ���������! **");
		} else {
			System.out.print("...��������, ������ ����� ��������� ");
			
			// ��������� ���������� if
			if(ch < answer) {
				System.out.println("����� � ����� ��������");
			} else System.out.println("����� � ������ ��������");
		}
	}

}
