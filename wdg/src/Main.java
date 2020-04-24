public class Main {

	public static void main(String[] args) {
		List<String> canEat = new ArrayList<>();
		canEat.add("cod");
		canEat.add("salmon");
		canEat.add("sardine")

		Map<String, Integer>foodStore = new HashMap<>();
		foodStore.put("cod", 8);
		foodStore.put("salmon", 15);


		Giraffe gerald = new Giraffe("Giraffe", "m", 2, 5, canEat, foodStore, 42);
		gerald.eat(1, "cod");
	}
}
