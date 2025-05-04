public class MergeShort {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeShort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        // kam

        int mid = si + (ei - si) / 2;
        mergeShort(arr, si, mid);
        mergeShort(arr, mid + 1, ei);

        merge(arr, si, mid, ei);

    }

    public static void merge(int arr[], int si, int mid, int ei) {
        // left (0,3) right(4,6)---->6-0+1
        int temp[] = new int[ei - si + 1];

        int i = si; // left iterator
        int j = mid + 1; // right iterator
        int k = 0; // iterator for temp arr

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];

                i++;

            } else {
                temp[k] = arr[j];

                j++;

            }
            k++;
        }
        // left part if remaing
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // right part if remaing
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original arr

        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        mergeShort(arr, 0, arr.length - 1);
        printArr(arr);

    }
}
