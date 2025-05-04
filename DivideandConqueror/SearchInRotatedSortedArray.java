public class SearchInRotatedSortedArray {

    public static int search(int arr[], int tar, int si, int ei) {
        if (si > ei) {
            return -1;
        }

        // work

        int mid = si + (ei - si) / 2;

        // case found
        if (arr[mid] == tar) {
            return mid;
        }

        // mid on L1
        if (arr[si] <= arr[mid]) {

            // case 1 Left
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid - 1);
            }
            // case 2 Right
            else {
                return search(arr, tar, mid, ei);
            }

        }
        // mid on L2

        else {
            // case 3 Right
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            }
            // case 4 left
            else {
                return search(arr, tar, si, mid + 1);
            }

        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };

        int tar = 0;

        int tarIdx = search(arr, tar, 0, arr.length);
        System.out.println(tarIdx);

    }
}
