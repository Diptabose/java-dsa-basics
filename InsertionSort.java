class InsertSort {

    public void sort(int arr[]) {
        // Need to maintain a window.
        // Assume the first element is always sorted.
        for (int i = 0; i < arr.length; i++) {
            // 1, 4, 2, 6, 5
            /**
             * 2<4
             * Inner loop should check for elements towards the left of the window.
             * If item is less, then shift the element and then compare.
             */
            int item = arr[i];
            int j = i - 1;
            for (; j >= 0 && arr[j] > item; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = item;
        }
    }
}

public class InsertionSort {

    public static void main(String[] args) {
        InsertSort is = new InsertSort();
        int arr[] = { 1, 4, 2, 6, 5 };
        is.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

}
