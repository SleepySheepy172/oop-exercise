import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		List<String> canEat = new ArrayList<>();
		canEat.add("fish");
		canEat.add("meat");

		Map<String, Integer> foodStore = new HashMap<>();
		foodStore.put("fish", 80);
		foodStore.put("meat", 20);


		Lion leo = new Lion("Leo", "m", 2, 5, canEat, foodStore, 25);
		leo.eat(1, "fish");
	}
}
