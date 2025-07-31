package chapter9.q4;

public class Main {

	public static void main(String[] args) {
		char a = '0';
		int num = 0;
		if (Character.isAlphabetic(a)) {
			num++;
		}
		if (Character.isDigit(a)) {
			num++;
		}
		if (Character.isLowerCase(a)) {
			num++;
		}
		System.out.println(num);
	}
}
