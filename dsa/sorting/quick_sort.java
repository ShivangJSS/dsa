package sorting;
class quick_sort{

    public static void quickSort(int[] arr, int low, int high)
     {
        if(low<high)
        {
            int i=helper(arr,low,high );
            quickSort(arr,low,i-1);
            quickSort(arr,i+1,high);
        }
        } 





        public static int helper(int[]arr,int s,int e)
        {
            int pivot=arr[e];
            int i=s-1;
            int j=s;
            while(j<e)
            {
                if(arr[j]<pivot)
                {
                    i++;
                    
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;  

                
                }
                        j++;

            }
            i++;
            int temp=pivot;
            arr[e]=arr[i];
            arr[i]=temp;  
            return i;  

           
        }
        public static void main(String[] args) {
            int arr[]={5,4,3,2,1};
            int n=arr.length;
            quickSort(arr,0,n-1);
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }
        } 
}