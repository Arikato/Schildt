package example;

public class SideEffects {
	public static void main(String args[]) {
		int i;
		
		i = 0;
		
		// �������� ���������� i ���������������� �������� �� ��,
		// ��� ����������� ������� � ���������� if �����
		if(false & (++i < 100)) {
			System.out.println("��� ������ �� ����� ������������");
		}
		System.out.println("���������� if �����������: " + i);
		// ������������ 1
		
		// � ������ ������ �������� ���������� i �� ����������������,
		// ��������� ������ ������� ������������ ����������� ���������
		// �� �����������, � �������������, ��������� ������������
		if(false && (++i < 100)) {
			System.out.println("��� ������ �� ����� ������������");
		}
		System.out.println("���������� if �����������: " + i);
			// �� �������� ������������ 1!!
	}
}
