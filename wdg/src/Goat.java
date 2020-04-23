import java.util.List;
import java.util.Map;

public class Goat extends Animal{

    private int tinCansEatenPerMinute;

    protected Penguin(String name, String gender, int age, int lifespan, List<String> canEat, Map<String, Integer> foodStore, int tinCansEatenPerMinute) {
        super(name, gender, age, lifespan, canEat, foodStore);
        this.tinCansEatenPerMinute = tinCansEatenPerMinute;
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
        System.out.println("bleat bleat");

    }

    @Override
    void reproduce() {
        System.out.println("One kid made ... (mini bleat)");
    }

    public int getTinCansEatenPerMinute(){
        return runningSpeed;
    }

    public void setTinCansEatenPerMinute(int tinCansEatenPerMinute){
        this.tinCansEatenPerMinute = tinCansEatenPerMinute;
    }

    private void printTinCansEatenPerMinute(){
        System.out.println("The tins eaten per minute by a " + getClass() + " is " + tinCansEatenPerMinute);
    }

    public void printTinCansEatenPerMinute(){
        System.out.println("The tins eaten per minute by a " + getClass() + " is " + tinCansEatenPerMinute);
    }
}
