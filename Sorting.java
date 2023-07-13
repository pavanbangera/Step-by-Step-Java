public class Sorting {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
            printArray(arr);
        }
        printArray(arr);

    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int tmp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = tmp;
            printArray(arr);
        }
        printArray(arr);
    }

    public static void main(String[] args) {
        int arr[] = { 7, 5, 1, 3, 0, 2, 0 };
        printArray(arr);
        // bubbleSort(arr);
        selectionSort(arr);

    }
}
