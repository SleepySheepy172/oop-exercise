import java.util.List;

public abstract class Animal {

	private String gender;
	private int age;
	private int weight;
	private List<String> canEat;

	protected Animal(String gender, int age, int weight, List<String> canEat) {
		this.gender = gender;
		this.age = age;
		this.weight = weight;
		this.canEat = canEat;
	}

	protected abstract void eat(int amount, String food);
}
