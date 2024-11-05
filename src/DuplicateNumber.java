public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
    static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                if (nums[nums[i] - 1] != nums[i]) {
                    Helpers.swap(nums, i, nums[i] - 1);
                } else {
                    break;
                }
            } else i++;
        }
        return nums[i];
    }
    static int findDuplicateWithoutModifyingArray (int[] nums) {
        boolean[] check = new boolean[nums.length];
        for (int num : nums) {
            if (check[num]) {
                return num;
            }
            check[num] = true;
        }
        return -1;
    }
}
