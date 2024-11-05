import java.util.ArrayList;
import java.util.List;

public class DuplicateNumbers {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }
    static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (i < nums.length) {
            if (nums[nums[i] - 1] != nums[i]) Helpers.swap(nums, i, nums[i] - 1);
            else i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1){
                list.add(nums[j]);
            }
        }
        return list;
    }
}
