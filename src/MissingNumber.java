public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0,1,3,4,5};
        System.out.println(missingNumber(arr));
        System.out.println(missingNumberUsingXOR(arr));
    }
    static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] < nums.length && nums[i] != i) Helpers.swap(nums, i, nums[i]);
            else i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) return j;
        }
        return nums.length;
    }
    static int missingNumberUsingXOR (int[] nums) {
        int xor = nums.length;
        for (int i = 0; i < nums.length; i++) {
            xor ^= i ^ nums[i];
        }
        return xor;
    }
}
