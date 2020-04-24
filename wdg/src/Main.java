import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		List<String> canEat = new ArrayList<>();
		canEat.add("tin cans");
		canEat.add("hay");
		canEat.add("corn");

		Map<String, Integer> foodStore = new HashMap<>();
		foodStore.put("hay", 1000);
		foodStore.put("corn", 150);


		Goat geraldine = new Goat("Geraldine", "m", 2, 5, canEat, foodStore, 1536);
		geraldine.eat(3, "corn");

	}
}
