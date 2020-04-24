import java.util.List;
import java.util.Map;

public class Lion extends Animal{

    private int napsTakenPerDay;

    protected Lion(String name, String gender, int age, int lifespan, List<String> canEat, Map<String, Integer> foodStore, int napsTakenPerDay) {
        super(name, gender, age, lifespan, canEat, foodStore);
        this.napsTakenPerDay = napsTakenPerDay;
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
        System.out.println("rawr");

    }

    @Override
    void reproduce() {
        System.out.println("One baby lion cub made ... (mini rawr)");
    }

    public int getNapsTakenPerDay(){
        return napsTakenPerDay;
    }

    public void setNapsTakenPerDay(int napsTakenPerDay){
        this.napsTakenPerDay = napsTakenPerDay;
    }

    public void printAverageBeakSize(){
        System.out.println("The average number of naps taken per day by a " + getClass() + " is " + getNapsTakenPerDay());
    }
}
