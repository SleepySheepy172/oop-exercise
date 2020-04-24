import java.util.List;
import java.util.Map;

public class Eagle extends Animal {

	private int wingSpan;

	protected Eagle(String name, String gender, int age, int lifespan, List<String> canEat, Map<String, Integer> foodStore, int wingSpan) {
		super(name, gender, age, lifespan, canEat, foodStore);
		this.wingSpan = wingSpan;
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
		System.out.println(getName() + " has taken " + steps + " steps!");
	}

	@Override
	void makeSound() {
		System.out.println("eeeeeeeee");
	}

	@Override
	void reproduce() {
		System.out.println("One baby eaglet made ... (*sleeping*)");
	}

	public int getWingSpan(){
		return wingSpan;
	}

	public void setWingSpan(int treesBumpedInto){
		this.wingSpan = wingSpan;
	}

	public void printWingSpan(){
		System.out.println("The average number trees bumped into every day by a " + getClass() + " is " + getWingSpan());
	}
}
