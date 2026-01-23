package sorting;

import java.util.*;
public class heapsort {
 

    public static void main(String[] args) {

        ArrayList<Integer> heap = new ArrayList<>();

        heap.add(00);
        heap.add(20);
        heap.add(1);
        heap.add(30);
        heap.add(4);

int arr[]=new int[heap.size()+2];
int k=0;
while(!heap.isEmpty()) {

        int i = heap.size() - 1;
arr[k]=heap.get(0);
k++;
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

    }
    for(int j=0;j<arr.length;j++)
    System.out.print(arr[j]+" ");
    }
    public static void swap(ArrayList<Integer> heap, int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }



}
