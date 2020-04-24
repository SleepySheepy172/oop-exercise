import java.util.List;
import java.util.Map;

public class Eagle extends Animal {

	private int wingSpan;

	protected Eagle(String name, String gender, int age, int lifespan, List<String> canEat, Map<String, Integer> foodStore, int wingSpan) {
		super(name, gender, age, lifespan, canEat, foodStore);
		//initialise wingspan in constructor
	}

	@Override
	void eat(int amount, String food) {
		if(getCanEat().contains(food)){
			int numFoodItem = getFoodStore().get(food);
			getFoodStore().put(food, numFoodItem-amount);
			System.out.println(getName() + " has eaten " + food);
		} else {
			System.out.println(getName() + " can't eat " + food + "! They're an " + getClass());
		}
	}

	@Override
	void move(int steps) {
		//add print statement for number of steps eagle takes
	}

	@Override
	void makeSound() {
		//add print statement for sound that eagle makes (apparently its a high pitched sound like eeeee)
	}

	@Override
	void reproduce() {
		//add print statment showing that a baby eagle(eaglet has been made)
	}

	//add getter for wingspan

	//add setter for wingspan

	public void printWingSpan(){
		//add print statement for eagle wingspan
	}
}
