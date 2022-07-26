import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] array, int low, int high) {
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        int pivot = array[middle];
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);

    }

    public static void main(String[] args) {
        int[] arr = { 9, 2, 0, 8, 4, 5, 7};
        System.out.println("Unsorted Array");
        System.out.println(Arrays.toString(arr));

        int low = 0;
        int high = arr.length - 1;

        quickSort(arr, low, high);
        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(arr));
    }
}