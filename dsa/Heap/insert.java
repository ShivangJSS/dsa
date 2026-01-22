package Heap;
import java.util.*;

public class insert {
    public static void main(String[] args) {

ArrayList<Integer> heap=new ArrayList<>();

heap.add(10);   
heap.add(20);
heap.add(15);
heap.add(30);
heap.add(40);


Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
heap.add(n);
int i=heap.size()-1;
while(i>0)
{
    if(heap.get(i)<heap.get((i-1)/2))
    {
         swap(heap,i,(i-1)/2);
         i=(i-1)/2;        
    }
    else{
        break;
    }
}
    }
public static void swap(ArrayList<Integer> heap,int i,int j)
{
    int temp=heap.get(i);
    heap.set(i,heap.get(j));
    heap.set(j,temp);

}
}