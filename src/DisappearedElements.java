import java.util.ArrayList;
import java.util.List;

public class DisappearedElements {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappeared(arr));
    }
    static List<Integer> findDisappeared(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] == nums[correctIndex]) i++;
            else Helpers.swap(nums, i, correctIndex);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0; j < nums.length; j++){
            if (nums[j] != j + 1) list.add(j+1);
        }
        return list;
    }
}
