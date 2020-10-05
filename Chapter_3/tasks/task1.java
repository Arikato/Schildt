package tasks;

import java.io.IOException;

// считывает символы пока не встретится точка
// считает пробелы и выводит информацию в конце работы
public class task1 {
	public static void main(String args[]) throws IOException {
		char ch, ignore;
		int count = 0;
		do {
			System.out.print("Введите символ: ");
			ch = (char) System.in.read();
			if(ch == ' ') {
				count++;
			}
			do {
				ignore = (char) System.in.read();
			} while(ignore != '\n');
		} while (ch != '.');
		System.out.print("Количество введенных пробелов равно " + count);
	}

}
