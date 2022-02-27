
import java.util.Arrays;

class Ex2 {

    /*Rewrite the application to implement the binary search
algorithm and compute the search running time.*/
    static int binary_search(int arr[], int left, int right, int item) {

        if (right >= left) {
            int mid = left + (right - left) / 2;
            System.out.println("Ex2.binary_search()" + mid);

            if (arr[mid] == item) {
                return mid;
            }

            if (arr[mid] > item) {
                return binary_search(arr, left, mid - 1, item);
            } else {
                return binary_search(arr, mid + 1, right, item);
            }

        }
        return -1;
    }

    public static void main(String args[]) {

        int[] arr = new int[1000];
        for (int i = 0; i < 1000; i++) {

            arr[i] = (int) Math.floor(Math.random() * 100 + 1);

        }

        arr[99] = 15;

        Arrays.sort(arr);
        long c = System.nanoTime();
        int x = binary_search(arr, 0, 999, 15);

        System.out.println("index = " + x + " \n time is :" + (System.nanoTime() - c));

    }

}
