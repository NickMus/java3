import java.util.ArrayList;
import java.util.Arrays;

public class Array <T extends Object> {
    private T[] arr;

    public Array(T... arr) {
        this.arr = arr;
    }

    public void elementsChange(int a, int b) {
        T c;
        c = arr[a];
        arr[a] = arr[b];
        arr[b] = c;
        System.out.println(Arrays.toString(arr));
    }
    public T[] arrToArrList(T[] arr) {
        new ArrayList<>(Arrays.asList(arr));
        return arr;
    }
}
