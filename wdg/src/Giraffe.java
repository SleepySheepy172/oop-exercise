import java.util.List;
import java.util.Map;

public class Giraffe extends Animal{

    private int treesBumpedInto;

    protected Penguin(String name, String gender, int age, int lifespan, List<String> canEat, Map<String, Integer> foodStore, int treesBumpedInto) {
        super(name, gender, age, lifespan, canEat, foodStore);
        this.treesBumpedInto = treesBumpedInto;
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
        System.out.println("hummm");

    }

    @Override
    void reproduce() {
        System.out.println("One baby giraffe calf made ... (*sleeping*)");
    }

    public int getTreesBumpedInto(){
        return treesBumpedInto;
    }

    public void setTreesBumpedInto(int treesBumpedInto){
        this.treesBumpedInto = treesBumpedInto;
    }

    public void printTreesBumpedInto(){
        System.out.println("The average number trees bumped into every day by a " + getClass() + " is " + napsTakenPerDay);
    }

}
