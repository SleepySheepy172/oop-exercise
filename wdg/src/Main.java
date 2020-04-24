import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		List<String> canEat = new ArrayList<>();
		canEat.add("eucalyptus");
		canEat.add("leaves");
		canEat.add("corn");

		Map<String, Integer> foodStore = new HashMap<>();
		foodStore.put("eucalyptus", 800);
		foodStore.put("corn", 150);


		Giraffe gerald = new Giraffe("Giraffe", "m", 2, 5, canEat, foodStore, 42);
		gerald.eat(3, "corn");
	}
}
