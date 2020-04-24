public class Main {

	public static void main(String[] args) {
		List<String> canEat = new ArrayList<>();
		canEat.add("seal");
		canEat.add("grass");
		canEat.add("cake")

		Map<String, Integer>foodStore = new HashMap<>();
		foodStore.put("seal", 4);
		foodStore.put("cake", 150);


		Wolf walter = new Giraffe("walter", "m", 2, 5, canEat, foodStore, 96);
		walter.eat(3, "cake");
	}
}
