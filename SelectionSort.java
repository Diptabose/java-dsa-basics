class SelectSort {

    public void sort(int arr[]) {
        // We need to find the min and then swap it with the begining.
        for (int i = 0; i < arr.length; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            // Swap the min index with the i.
            if (min_index != i) {
                int temp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = temp;
            }
        }

    }
}

public class SelectionSort {
    public static void main(String[] args) {
        SelectSort ss = new SelectSort();
        int arr[] = { 2, 1, 8, 4, 3 };
        ss.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
