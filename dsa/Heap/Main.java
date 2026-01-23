
import java.util.*;

public class Main{
    public static void main(String[] args) {

        ArrayList<Integer> heap = new ArrayList<>();

        heap.add(10);
        heap.add(20);
        heap.add(15);
        heap.add(30);
        heap.add(40);

        int i = heap.size() - 1;

        heap.set(0, heap.get(i));
        heap.remove(i);

        i = 0;

        while (2 * i + 1 < heap.size()) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int smallest = left;

            if (right < heap.size() && heap.get(right) < heap.get(left)) {
                smallest = right;
            }

            if (heap.get(i) > heap.get(smallest)) {
                swap(heap, i, smallest);
                i = smallest;
            } else {
                break;
            }
        }

        System.out.println(heap);
    }

    public static void swap(ArrayList<Integer> heap, int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
}
