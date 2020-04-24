import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		List<String> canEat = new ArrayList<>();
		canEat.add("worms");
		canEat.add("corn");
		canEat.add("beetles");
		canEat.add("cake");

		Map<String, Integer>foodStore = new HashMap<>();
		foodStore.put("worms", 90);
		foodStore.put("corn", 150);


		Eagle ellie = new Eagle("Ellie", "f", 2, 5, canEat, foodStore, 1);
		ellie.eat(2, "worms");

	}
}
