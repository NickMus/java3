import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Array<Object> arr = new Array<>(1, "java", 3, 4, 5, 6, 7, 8, 9);
        arr.elementsChange(0, 1);


        Fruit Apple = new Apple();
        Fruit Orange = new Orange();


        Box box1 = new Box(Apple, Apple);
        Box box2 = new Box(Orange, Orange);

        box1.getWeight();

        box1.addMethod(Apple);

        box1.getWeight();


    }

}
