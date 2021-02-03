import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Box<T extends Fruit> {




    private List<T> boxes;

    public Box(T... fruits) {
        this.boxes = new ArrayList<>(Arrays.asList(fruits));
    }

    public float getWeight() {
        float weight = 0.0f;
        for (T fruits : boxes) {
            weight += fruits.getWeight();
        }
        System.out.println(weight);
        return weight;
    }


    public boolean compare(Box<T> box) {
        boolean result;
        result = Math.abs(this.getWeight() - box.getWeight()) < 0.00001f;
        System.out.println(result);
        return result;
    }

    public void pourOver(Box<T> box) {

        if (box.boxes == this.boxes) {
            return;
        }

        box.boxes.addAll(this.boxes);
        box.boxes.clear();


    }

    public void addMethod(T fruit) {
        boxes.add(fruit);

    }
}
