import com.sample.Test;

public class Main {
	public static void main(String[] args) {
		Test test = new Test();
		test.process(() -> {
			System.out.println("Hello with Lambda");
		});
	}
}
