package GeekBrains.Java3.Lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Box <T extends Fruit> implements Comparable<Box>{
    private ArrayList<T> fruits;

    public Box(T... fruits) {
        this.fruits = new ArrayList<T>(Arrays.asList(fruits));
    }

    public float getWeight() {
        float boxWeight = 0;
        if (fruits.size() == 0) return 0;
        for (T fruit: fruits) {
            boxWeight += fruit.getWeight();
        }
        return boxWeight;
    }

    public void addFruit (T fruit) {
        fruits.add(fruit);
    }

    @Override
    public int compareTo(Box o) {
        return (int) (this.getWeight() - o.getWeight());
    }

    public void changeBox (Box<? super T> anotherBox) {
        anotherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}
