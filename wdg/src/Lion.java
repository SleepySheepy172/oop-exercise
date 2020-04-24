import java.util.List;
import java.util.Map;

public class Lion extends Animal{

    private int napsTakenPerDay;

    protected Lion(String name, String gender, int age, int lifespan, List<String> canEat, Map<String, Integer> foodStore, int napsTakenPerDay) {
        super(name, gender, age, lifespan, canEat, foodStore);
        //initialise naps taken per day
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
        //print statements for the number of steps taken per day

    }

    @Override
    void makeSound() {
        //print statement for noise that lion makes

    }

    @Override
    void reproduce() {
        //print statement saying one lion cub has been produced
    }

    //add getter for naps taken per day

    //add setter for naps taken per day

    public void printAverageNumberOfNapsTakenPerDay(){
        //print statement for average number of naps taken per day
    }
}
