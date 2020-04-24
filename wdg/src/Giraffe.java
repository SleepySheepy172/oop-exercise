import java.util.List;
import java.util.Map;

public class Giraffe extends Animal{

    private int treesBumpedInto;

    protected Giraffe(String name, String gender, int age, int lifespan, List<String> canEat, Map<String, Integer> foodStore, int treesBumpedInto) {
        super(name, gender, age, lifespan, canEat, foodStore);
        //initialise treesbumpedinto
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
        //print statement with how many steps giraffe took
    }

    @Override
    void makeSound() {
        //print statement with the noise a giraffe makes (apparently its a low humming noise)

    }

    @Override
    void reproduce() {
        //print statement that says one baby giraffe has been brought into the world
    }

    //add getter for number of trees bumped into

    //add setter for number of trees bumped into


    public void printTreesBumpedInto(){
        //print statement with number of trees giraffe has bumped into per day
    }

}
