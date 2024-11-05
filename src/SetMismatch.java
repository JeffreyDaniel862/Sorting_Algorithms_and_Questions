import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(Arrays.toString(cyclicSort(nums)));
    }
    static int[] cyclicSort (int[] nums) {
        int i = 0;
        int[] result = new int[2];
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) Helpers.swap(nums, i, correctIndex);
            else {
                if (nums[i] != i + 1) {
                    result[0] = nums[i];
                    result[1] = i + 1;
                }
                i++;
            }
        }
        return result;
    }
}
