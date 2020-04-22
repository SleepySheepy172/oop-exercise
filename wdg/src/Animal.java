import java.util.List;

public abstract class Animal {

	private String gender;
	private int age;
	private List<String> canEat;

	protected Animal(String gender, int age, List<String> canEat) {
		this.gender = gender;
		this.age = age;
		this.canEat = canEat;
	}

	abstract void eat(int amount, String food);
	abstract void move(int steps);
	abstract void makeSound();

	protected void getAnimalInfo() {
//		print info about animal
	}

	/* GETTERS */
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

	public void addFoodToDiet(String foodItem) {
		this.canEat.add(foodItem);
	}




}
