import java.util.List;
import java.util.Map;

public class Eagle extends Animal {

	protected Eagle(String name, String gender, int age, int lifespan, List<String> canEat, Map<String, Integer> foodStore) {
		super(name, gender, age, lifespan, canEat, foodStore);
	}

	@Override
	void eat(int amount, String food) {
		if(getCanEat().contains(food)){
			int numFoodItem = getFoodStore().get(food);
			getFoodStore().put(food, numFoodItem-amount);
		} else {
			System.out.println(getName() + " can't eat " + food + "! They're an " + getClass());
		}
	}

	@Override
	void move(int steps) {

	}

	@Override
	void makeSound() {

	}

	@Override
	void reproduce() {

	}
}
