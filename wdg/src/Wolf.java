import java.util.List;
import java.util.Map;

public class Wolf extends Animal{

    private int runningSpeed;

    protected Wolf(String name, String gender, int age, int lifespan, List<String> canEat, Map<String, Integer> foodStore, int runningSpeed) {
        super(name, gender, age, lifespan, canEat, foodStore);
        //initialise running speed
    }

    @Override
    void eat(int amount, String food) {
        if(getCanEat().contains(food)){
            int numFoodItem = getFoodStore().get(food);
            getFoodStore().put(food, numFoodItem-amount);
        } else {
            System.out.println(getName() + " can't eat " + food + "! They're a " + getClass());
        }
    }
    @Override
    void move(int steps) {
        //print statement for number of steps wolf takes

    }

    @Override
    void makeSound() {
        //print statement for noise wolf makes

    }

    @Override
    void reproduce() {
        //print statement saying one baby wolf has been made
    }

    //add getter for running speed

    //add setter for running speed

    public void printRunningSpeed(){
        //print statement for average running speed
    }
}
