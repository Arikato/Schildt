package tasks;

import java.io.IOException;

// ��������� ������� ���� �� ���������� �����
// ������� ������� � ������� ���������� � ����� ������
public class task1 {
	public static void main(String args[]) throws IOException {
		char ch, ignore;
		int count = 0;
		do {
			System.out.print("������� ������: ");
			ch = (char) System.in.read();
			if(ch == ' ') {
				count++;
			}
			do {
				ignore = (char) System.in.read();
			} while(ignore != '\n');
		} while (ch != '.');
		System.out.print("���������� ��������� �������� ����� " + count);
	}

}
