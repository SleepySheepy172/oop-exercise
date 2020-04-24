public class Main {

	public static void main(String[] args) {
		List<String> canEat = new ArrayList<>();
		canEat.add("fish");
		canEat.add("meat");

		Map<String, Integer>foodStore = new HashMap<>();
		foodStore.put("fish", 80);
		foodStore.put("meat", 20);


		Lion leo = new Lion("Leo", "m", 2, 5, canEat, foodStore, 25);
		gerald.eat(1, "fish");
	}
}
