import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,1,2};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    Helpers.swap(arr, j-1, j);
                } else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
