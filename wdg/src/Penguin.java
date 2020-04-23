import java.util.List;
import java.util.Map;

public class Penguin extends Animal{

    private int beakSize;

    protected Penguin(String name, String gender, int age, int lifespan, List<String> canEat, Map<String, Integer> foodStore, int beakSize) {
        super(name, gender, age, lifespan, canEat, foodStore);
        this.beakSize = beakSize;
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
        System.out.println(getName() + " has taken " + steps + " steps!");

    }

    @Override
    void makeSound() {
        System.out.println("noot noot");

    }

    @Override
    void reproduce() {
        System.out.println("One baby penguin chick made ... squawk sqawk noot noot");
    }

    public int getBeakSize(){
        return beakSize;
    }

    public void setBeakSize(int beakSize){
        this.beakSize = beakSize;
    }

    public void printAverageBeakSize(){
        System.out.println("The average beaksize of a " + getClass() + " is " + beakSize);
    }
}
