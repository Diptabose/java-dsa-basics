class QSort {

    private int partition(int arr[], int l, int h) {

        int pivot = arr[l];

        int i = l;
        int j = h;

        while (i < j) {

            // Find out elements strictly greater to pivot
            while (arr[i] <= pivot && i <= h) {
                i++;
            }

            // Find elements strictly less to pivot
            while (arr[j] > pivot && j >= l) {
                j--;
            }

            // Swap i, j

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        // Swap j and pivot.
        arr[l] = arr[j];
        arr[j] = pivot;

        return j;

    }

    public void sort(int arr[]) {
        sort(arr, 0, arr.length - 1);
    }

    public void sort(int arr[], int l, int h) {
        if (l < h) {
            int partitionIndex = partition(arr, l, h);
            sort(arr, l, partitionIndex);
            sort(arr, partitionIndex + 1, h);
        }
    }
}

public class QuickSort {

    public static void main(String[] args) {

        int arr[] = { 2, 7, 3, 9 };

        QSort quickSort = new QSort();
        quickSort.sort(arr);

        for (int num : arr) {
            System.out.println(num);
        }

    }

}