package sorting;

public class mergeSort {

    public static void merge(int arr[], int s, int e) {
        if (s < e) {
            int mid = s + (e - s) / 2;

            merge(arr, s, mid);       // left half
            merge(arr, mid + 1, e);   // right half
            mergeSort(arr, s, mid, e);
        }
    }

    public static void mergeSort(int arr[], int s, int mid, int e) {
        int temp[] = new int[e - s + 1];

        int i = s;        // left pointer
        int j = mid + 1;  // right pointer
        int k = 0;

        while (i <= mid && j <= e) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // remaining elements
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= e) {
            temp[k++] = arr[j++];
        }

        // copy back to original array
        for (int p = 0; p < temp.length; p++) {
            arr[s + p] = temp[p];
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        int n = arr.length;

        merge(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
