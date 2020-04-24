import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		List<String> canEat = new ArrayList<>();
		canEat.add("cod");
		canEat.add("salmon");
		canEat.add("sardine");

		Map<String, Integer> foodStore = new HashMap<>();
		foodStore.put("cod", 8);
		foodStore.put("salmon", 15);


		Penguin petra = new Penguin("Petra", "m", 2, 5, canEat, foodStore, 42);
		petra.eat(1, "cod");
	}
}
