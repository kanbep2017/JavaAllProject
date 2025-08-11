package chapter12.q53;

public class Main {

	public static void main(String[] args) {
		byte x = 5, y = 2;
		float a = Math.round((float) x / y * 100) / (float) 100;
		// Math.round((float) x / y * 100) は、x / y の結果を100倍してから四捨五入します。
		// つまり、 (5 / 2) * 100 = 250.0 となり、これを四捨五入すると250になります。
		// その後、250を100で割ると、2.5になります。
		System.out.println(a);
	}
}
