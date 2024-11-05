import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] == arr[correctIndex]) i++;
            else Helpers.swap(arr, i, correctIndex);
        }
        System.out.println(Arrays.toString(arr));
    }
}
