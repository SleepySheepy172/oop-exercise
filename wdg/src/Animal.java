import java.util.List;
import java.util.Map;

public abstract class Animal {

	private String name;
	private String gender;
	private int age;
	private int lifespan;
	private List<String> canEat;
	private Map<String, Integer> foodStore;

	protected Animal(String name, String gender, int age, int lifespan, List<String> canEat, Map<String, Integer> foodStore) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.lifespan = lifespan;
		this.canEat = canEat;
		this.foodStore = foodStore;
	}

	abstract void eat(int amount, String food);
	abstract void move(int steps);
	abstract void makeSound();
	abstract void reproduce();

	public String getName() {
		return name;
	}

	public int getLifespan() {
		return lifespan;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public List<String> getCanEat() {
		return canEat;
	}

	public void ageOneYear() {
		this.age++;
	}

	public Map<String, Integer> getFoodStore() {
		return foodStore;
	}

	public void addFoodToDiet(String foodItem) {
		this.canEat.add(foodItem);
	}

}
