public class QuickSort {
    public static int pivot(int arr[], int low, int high) {
        int pidx = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pidx) {
                i++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        i++;
        int tmp = arr[i];
        arr[i] = pidx;
        arr[high] = tmp;
        return i;
    }

    public static void sorting(int arr[], int low, int high) {
        if (low < high) {
            int pidx = pivot(arr, low, high);

            sorting(arr, low, pidx - 1);
            sorting(arr, pidx + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sorting(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
