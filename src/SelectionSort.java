import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,1,4,5,2};
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = Helpers.max(arr, 0, last);
            Helpers.swap(arr,maxIndex,last);
        }
        System.out.println(Arrays.toString(arr));
    }

}
