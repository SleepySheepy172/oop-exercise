import java.util.List;
import java.util.Map;

public class Goat extends Animal{

    private int tinCansEatenPerMinute;

    protected Goat(String name, String gender, int age, int lifespan, List<String> canEat, Map<String, Integer> foodStore, int tinCansEatenPerMinute) {
        super(name, gender, age, lifespan, canEat, foodStore);
        //initialise tin cans eaten per minute
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
        //add print statement for number of steps goat has taken

    }

    @Override
    void makeSound() {
        //add print statement with the sound a goat makes (apparently it bleats)

    }

    @Override
    void reproduce() {
        //add print statement saying one baby goat kid produced
    }

    //add getter for tin cans eaten per minute

    //add setter for tin cans eaten per minute

    public void printTinCansEatenPerMinute(){
        //add print statement for the number of tin cans eaten per day
    }
}
