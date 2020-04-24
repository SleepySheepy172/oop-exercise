import java.util.List;
import java.util.Map;

public class Penguin extends Animal{

    private int beakSize;

    protected Penguin(String name, String gender, int age, int lifespan, List<String> canEat, Map<String, Integer> foodStore, int beakSize) {
        super(name, gender, age, lifespan, canEat, foodStore);
        //initialise beak size
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
        //print statement for number of steps taken
    }

    @Override
    void makeSound() {
        //print statement for sound penguin makes (apparently its noot noot)

    }

    @Override
    void reproduce() {
        //print statement for one baby penguine chick made
    }

    //add getter for beaksize

    //add setter for beaksize

    public void printAverageBeakSize(){
        //print statement for average beaksize
    }
}
