public class MergeSort {

    public static void divide(int[] arr, int si, int ed) {
        if (si >= ed) {
            return;
        }
        int mid = si + (ed - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ed);
        conquer(arr, si, mid, ed);

    }

    public static void conquer(int[] arr, int si, int mid, int ed) {
        int merged[] = new int[ed - si + 1];

        int indx1 = si;
        int indx2 = mid + 1;
        int x = 0;
        while (indx1 <= mid && indx2 <= ed) {
            if (arr[indx1] <= arr[indx2]) {
                merged[x] = arr[indx1];
                x++;
                indx1++;
            } else {
                merged[x] = arr[indx2];
                x++;
                indx2++;
            }
        }
        while (indx1 <= mid) {
            merged[x] = arr[indx1];
            x++;
            indx1++;
        }
        while (indx2 <= ed) {
            merged[x] = arr[indx2];
            x++;
            indx2++;
        }
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
            System.out.println(j + " " + i);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 7, 3, 0, 2, 9, 6 };
        divide(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
