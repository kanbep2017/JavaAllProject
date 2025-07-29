import com.sample.Item;

public class ItemTest {

	public static void main(String[] args) {
		Item.save(item -> {
			item.id("A100")
					.name("LX100G")
					.description("sample")
					.price(10000);
		});
	}

}
