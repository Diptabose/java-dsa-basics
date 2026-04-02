class MSort {

    private int[] merge(int arr1[], int arr2[]) {

        int left = 0;
        int right = 0;
        int result[] = new int[arr1.length + arr2.length];
        int resultIndex = 0;

        while (left < arr1.length && right < arr2.length) {
            if (arr1[left] <= arr2[right]) {
                result[resultIndex++] = arr1[left++];
            } else {
                result[resultIndex++] = arr2[right++];
            }
        }

        // Fill the left and right respectively.
        while (left < arr1.length) {
            result[resultIndex++] = arr1[left++];
        }

        while (right < arr2.length) {
            result[resultIndex++] = arr2[right++];
        }

        return result;
    }

    public int[] sort(int arr[]) {
        return sort(arr, 0, arr.length - 1);
    }

    public int[] sort(int arr[], int l, int h) {
        if (l == h) {
            return new int[] { arr[l] };
        }

        int mid = (l + h) / 2;
        int left[] = sort(arr, l, mid);
        int right[] = sort(arr, mid + 1, h);
        return merge(left, right);
    }

}

public class MergeSort {

    public static void main(String[] args) {
        MSort mergeSort = new MSort();
        int arr[] = { 3, 2, 7, 21, 4 };
        int result[] = mergeSort.sort(arr);

        for (int i : result) {
            System.out.println(i);
        }
    }
}
