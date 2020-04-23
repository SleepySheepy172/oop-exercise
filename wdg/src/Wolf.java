import java.util.List;
import java.util.Map;

public class Wolf extends Animal{

    private int runningSpeed;

    protected Penguin(String name, String gender, int age, int lifespan, List<String> canEat, Map<String, Integer> foodStore, int runningSpeed) {
        super(name, gender, age, lifespan, canEat, foodStore);
        this.runningSpeed = runningSpeed;
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
        System.out.println("awooooo");

    }

    @Override
    void reproduce() {
        System.out.println("One wolf pup made ... (mini awoo)");
    }

    public int getRunningSpeed(){
        return runningSpeed;
    }

    public void setRunningSpeed(int runningSpeed){
        this.runningSpeed = runningSpeed;
    }

    private void printRunningSpeed(){
        System.out.println("The average running speed of a " + getClass() + " is " + runningSpeed);
    }

    public void printRunningSpeed(){
        System.out.println("The average running speed of a " + getClass() + " is " + runningSpeed);
    }
}
