package sorting;
public class insertion_sort {
    public static void main(String []args)
   {
int arr[]={5,78,1,90,50,61};
for(int i=1;i<arr.length;i++)
{    int temp=arr[i];
    int curr=i;
    int pre=i-1;
while (pre >= 0 && arr[pre] > temp)

    {




        arr[curr]=arr[pre];
       
        curr--;
        pre--;
    }
    arr[curr]=temp;
}
for (int x : arr) {
    System.out.print(x + " ");
}


   }
    
}
